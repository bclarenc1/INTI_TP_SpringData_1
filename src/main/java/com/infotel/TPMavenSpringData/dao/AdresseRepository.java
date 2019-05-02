package com.infotel.TPMavenSpringData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TPMavenSpringData.metier.Adresse;

@Transactional
public interface AdresseRepository extends JpaRepository<Adresse,Integer> {

	public List<Adresse> findByVille(String ville);
	
	@Modifying
	@Query("UPDATE Adresse set numRue=:numrue, nomRue=:nomrue, cp=:cp, ville=:ville where id=:id")
	public void modifierAdresse(@Param("id") int id, @Param("numrue") String numRue, @Param("nomrue") String nomRue,
			@Param("cp") String cp, @Param("ville") String ville);
}