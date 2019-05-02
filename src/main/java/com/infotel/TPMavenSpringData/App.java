package com.infotel.TPMavenSpringData;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TPMavenSpringData.metier.Adresse;
import com.infotel.TPMavenSpringData.metier.Personne;
import com.infotel.TPMavenSpringData.service.Iservice;
import com.infotel.TPMavenSpringData.service.ServiceImpl;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Iservice service = context.getBean("serviceImpl", ServiceImpl.class);
		
		// ** AJOUT ** //
//		Personne p1 = context.getBean("personne", Personne.class);
		Personne p2 = context.getBean("personne", Personne.class);
//		Personne p3 = context.getBean("personne", Personne.class);
//		Adresse a1 = context.getBean("adresse", Adresse.class);
//		Adresse a2 = context.getBean("adresse", Adresse.class);
		Adresse a3 = context.getBean("adresse", Adresse.class);
		
//		p1.setPrenom("Lerooooooy");
//		p1.setNom("Jenkins");
//		p1.setAge(555);
//		service.ajouterPersonne(p1);
//		
		p2.setPrenom("Sophie");
		p2.setNom("Fonfec");
		p2.setAge(12);
		service.ajouterPersonne(p2);
//		
//		p3.setPrenom("Bohort");
//		p3.setNom("le Jeune");
//		p3.setAge(54);
//		service.ajouterPersonne(p3);
//		
//		a1.setNumRue("0 quater");
//		a1.setNomRue("jniop");
//		a1.setCp("00000");
//		a1.setVille("Snorkyville");
//		service.ajouterAdresse(a1);
//
//		a2.setNumRue("2.5");
//		a2.setNomRue("Kappa");
//		a2.setCp("00001");
//		a2.setVille("Twitchtown");
//		service.ajouterAdresse(a2);
//
		a3.setNumRue("10");
		a3.setNomRue("rue de la tarte");
		a3.setCp("01010");
		a3.setVille("Circle Village");
		service.ajouterAdresse(a3);
//
//		
//		// ** SUPPR ** //
//		Personne p4 = context.getBean("personne", Personne.class);
//		p4.setId(5);
//		service.supprimerPersonne(p4);
//
//		Adresse a4 = (Adresse) context.getBean("adresse");
//		a4.setIdAdresse(1);
//		service.supprimerAdresse(a4);
//
		// ** MODIF too lame ** //
		// marche pas avec getPersonne ou findPersonne,
		// faute de mieux on ecrase une ID deja connue en repetant ses attributs inchanges
//		Personne p5 = context.getBean("personne", Personne.class);
//		p5.setId(7);
//		p5.setNom("le Vieux en fait");
//		p5.setPrenom("Bohort");
//		p5.setAge(666);
//		service.modifierPersonne(p5);
		
		
		
		// ** LIST ** //
//		System.out.println(service.findAllPeople());
//		System.out.println(service.findAllAddresses());
		
		// ** USER-DEFINED ** //
//		System.out.println(service.chercherParPrenom("Marc"));
//		System.out.println(service.rechercherParMC("assi"));
//		System.out.println(service.rechercherParMC2("assi", "Ma"));
//		service.modifierPersonne(8, "Legolas", "Ticot", 892);
//		service.modifierAdresse(3, "26", "rue de l'Avesnois", "59100", "Uxem");
		
		service.ajouterAdresseAPersonne(18, a3);
		
		context.close();
	}
}
