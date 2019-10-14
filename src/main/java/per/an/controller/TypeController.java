package per.an.controller;

import per.an.service.TypeService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/types")
public class TypeController {

    private TypeService typeService;

    @Inject
    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }
}
