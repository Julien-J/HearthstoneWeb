package fr.jjouenne.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import fr.jjouenne.entity.Card;
import fr.jjouenne.repository.CardRepository;

@Path("/card")
public class CardResource {
	
	@Autowired
	CardRepository cardRepo;
	
	@GET
	@Produces("application/json")
	public List<Card> getCards(){
		return cardRepo.findAll();
	}
}
