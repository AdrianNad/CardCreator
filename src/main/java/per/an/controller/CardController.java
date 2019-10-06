package per.an.controller;

import per.an.service.CardService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/cards")
public class CardController {

    @Inject
    CardService cardService;

    @GET()
    @Path("/create")
    @Produces(MediaType.TEXT_PLAIN)
    public Response testEndpoint() {
        cardService.createCard("TestCardName");
        return Response.status(201).build();
    }
}