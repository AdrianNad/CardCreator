package per.an.controller;

import per.an.service.BorderService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/borders")
public class BorderController {

    private BorderService borderService;

    @Inject
    public BorderController(BorderService borderService) {
        this.borderService = borderService;
    }
}
