package per.an.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import per.an.model.Type;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TypeRepository implements PanacheRepository<Type> {
}
