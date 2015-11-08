package fr.jjouenne.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.jjouenne.jpa.entity.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
	
}
