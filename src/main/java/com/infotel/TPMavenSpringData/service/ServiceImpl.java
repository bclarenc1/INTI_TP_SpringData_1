package com.infotel.TPMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TPMavenSpringData.dao.AdresseRepository;
import com.infotel.TPMavenSpringData.dao.PersonneRepository;
//import com.infotel.TPMavenSpringData.dao.Idao;
import com.infotel.TPMavenSpringData.metier.Adresse;
import com.infotel.TPMavenSpringData.metier.Personne;

@Service
public class ServiceImpl implements Iservice {

	@Autowired
	private PersonneRepository personneRepository;
	@Autowired
	private AdresseRepository adresseRepository;
	
	public PersonneRepository getPersonneRepository() {
		return personneRepository;
	}
	public void setPersonneRepository(PersonneRepository personneRepository) {
		this.personneRepository = personneRepository;
	}

	public Personne ajouterPersonne(Personne p) {
		return personneRepository.save(p);
	}

	@Override
	public void supprimerPersonne(Personne p) {
		personneRepository.delete(p);
	}

	@Override
	public Personne getPersonne(int id) {
		return personneRepository.getOne(id);
	}

	@Override
	public Optional<Personne> findPersonne(int id) {
		return personneRepository.findById(id);
	}
	
	@Override
	public void modifierPersonne(int id, String prenom, String nom, int age) {
		personneRepository.modifierPersonne(id, prenom, nom, age);
	}

	@Override
	public List<Personne> findAllPeople() {
		return personneRepository.findAll();
	}

	@Override
	public List<Personne> chercherParPrenom(String prenom) {
		return personneRepository.findByPrenom(prenom);
	}

	@Override
	public List<Personne> rechercherParMC(String nom) {
		return personneRepository.rechercherParMC("%"+nom+"%");
	}

	@Override
	public List<Personne> rechercherParMC2(String nom, String prenom) {
		return personneRepository.rechercherParMC2("%"+nom+"%", "%"+prenom+"%");
	}

	@Override
	public void ajouterAdresseAPersonne(int id, Adresse a) {
		personneRepository.ajouterAdresseAPersonne(id, a);
	}
	
//--------------------------------------------

	@Override
	public Adresse ajouterAdresse(Adresse a) {
		return adresseRepository.save(a);
	}

	@Override
	public void supprimerAdresse(Adresse a) {
		adresseRepository.delete(a);
	}

	@Override
	public Adresse getAdresse(int idAdresse) {
		return adresseRepository.getOne(idAdresse);
	}

	@Override
	public Optional<Adresse> findAdresse(int idAdresse) {
		return adresseRepository.findById(idAdresse);
	}

	@Override
	public void modifierAdresse(int id, String numRue, String nomRue, String cp, String ville) {
		adresseRepository.modifierAdresse(id, numRue, nomRue, cp, ville);
	}
	
	@Override
	public List<Adresse> findAllAddresses() {
		return adresseRepository.findAll();
	}
	
	@Override
	public List<Adresse> rechercherParVille(String ville) {
		return adresseRepository.findByVille(ville);
	}
	
	

}
