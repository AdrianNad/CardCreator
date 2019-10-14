package per.an.service;

import per.an.repository.TypeRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class TypeService {

    private TypeRepository typeRepository;

    @Inject
    public TypeService(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }
}
