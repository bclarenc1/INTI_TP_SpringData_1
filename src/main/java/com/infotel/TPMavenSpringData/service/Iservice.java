package com.infotel.TPMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import com.infotel.TPMavenSpringData.metier.Adresse;
import com.infotel.TPMavenSpringData.metier.Personne;

public interface Iservice {

	public Personne ajouterPersonne(Personne p);
	public void supprimerPersonne(Personne p);
	public Personne getPersonne(int id);
	public Optional<Personne> findPersonne(int id);
	public void modifierPersonne(int id, String prenom, String nom, int age);
	public Iterable<Personne> findAllPeople();
	
	public List<Personne> chercherParPrenom(String pr);
	public List<Personne> rechercherParMC(String nom);
	public List<Personne> rechercherParMC2(String nom, String prenom);
	public void ajouterAdresseAPersonne(int id, Adresse a);
	
	public Adresse ajouterAdresse(Adresse a);
	public void supprimerAdresse(Adresse a);
	public Adresse getAdresse(int idAdresse);
	public Optional<Adresse> findAdresse(int idAdresse);
	public void modifierAdresse(int id, String numRue, String nomRue, String cp, String ville);
	public Iterable<Adresse> findAllAddresses();
	
	public List<Adresse> rechercherParVille(String ville);
	
	

}
