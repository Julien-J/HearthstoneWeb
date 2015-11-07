package fr.jjouenne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.jjouenne.bean.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
	
}
