package fr.jjouenne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.jjouenne.entity.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
	
}
