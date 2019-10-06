package per.an.service;

import per.an.model.Card;
import per.an.repository.CardRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class CardService {

    @Inject
    CardRepository cardRepository;

    @Transactional
    public void createCard(String cardName) {
        Card card = new Card();
        card.setName(cardName);
        cardRepository.persist(card);
    }
}
