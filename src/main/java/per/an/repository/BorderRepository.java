package per.an.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import per.an.model.Border;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BorderRepository implements PanacheRepository<Border> {
}
