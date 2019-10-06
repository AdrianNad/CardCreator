package per.an.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import per.an.model.Card;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class CardRepository implements PanacheRepository<Card> {

    public Optional<Card> findByName(String name) {
        return Optional.ofNullable(find("name", name).firstResult());
    }
}
