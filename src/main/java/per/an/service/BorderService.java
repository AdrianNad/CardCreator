package per.an.service;

import per.an.repository.BorderRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class BorderService {

    private BorderRepository borderRepository;

    @Inject
    public BorderService(BorderRepository borderRepository) {
        this.borderRepository = borderRepository;
    }
}
