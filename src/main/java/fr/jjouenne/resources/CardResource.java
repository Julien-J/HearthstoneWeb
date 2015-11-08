package fr.jjouenne.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

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
	
	@GET
	@Path("{id}")
	@Produces("application/json")
	public Card getCard(@PathParam("id") Long id){
		return cardRepo.findOne(id);
	}
	
	@POST
	@Consumes("application/json")
	public Response addCard(Card card){
		cardRepo.saveAndFlush(card);
		return Response.ok().build();
	}
}
