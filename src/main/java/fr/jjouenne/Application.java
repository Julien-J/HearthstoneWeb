package fr.jjouenne;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import fr.jjouenne.entity.Card;
import fr.jjouenne.repository.CardRepository;
@Service
public class Application {
	@Autowired 
	private CardRepository repo;
		
	public static void main(String args[]) {
		
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:application-context.xml" })) {
			Application app = context.getBean(Application.class);
			app.testCard();
			
		}
	}
	
	public void testCard(){
		List<Card> cards= repo.findAll();
		for (Card card : cards) {
			System.out.println(card.getLibelle());
			
		}
	}

}
