package per.an.service;

import per.an.model.Card;
import per.an.repository.CardRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class CardService {

    private CardRepository cardRepository;

    @Inject
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Transactional
    public void createCard(String cardName) {
        Card card = new Card();
        card.setTitle(cardName);
        cardRepository.persist(card);
    }
}
