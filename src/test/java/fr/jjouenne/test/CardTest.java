package fr.jjouenne.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import fr.jjouenne.config.PersistenceContext;
import fr.jjouenne.entity.Card;
import fr.jjouenne.repository.CardRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PersistenceContext.class, loader=AnnotationConfigContextLoader.class)
public class CardTest {

	@Autowired
	CardRepository cardRepo;

	//@Test
	/*public void testFindCards() {
		List<Card> founds = cardRepo.findAll();
		for (Card card : founds) {
			System.out.println(card.getLibelle());
			
		}
		assertTrue(founds.size() > 0);
	}*/
	
	//@Test
	/*public void testFindOneCards() {
		Card found = cardRepo.findOne((long) 1);
		System.out.println(found.getLibelle());
		assertNotNull(found);
	}*/
	
	//@Test
	/*public void testFindOneByLibelle() {
		Card found = cardRepo.findOneByLibelle("carte1");
		System.out.println(found.getLibelle());
		assertNotNull(found);
	}*/
	
	//@Test
	/*public void testCreateOneCard() {
		Card card = new Card();
		card.setLibelle("carte3");
		card.setDescription("description3");
		card.setPv(30);
		Card found = cardRepo.saveAndFlush(card);
		System.out.println(found.getLibelle());
		assertNotNull(found);
	}*/
}
