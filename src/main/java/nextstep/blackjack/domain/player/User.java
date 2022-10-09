package nextstep.blackjack.domain.player;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.deck.CardDeck;

import java.util.List;

public interface User {

    void drawCard(CardDeck cardDeck);
    Integer handsCardCount();
    List<Card> showHandsCard();
}
