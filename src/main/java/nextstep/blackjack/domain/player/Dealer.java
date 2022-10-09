package nextstep.blackjack.domain.player;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.deck.CardDeck;

public class Dealer implements User {

    private Hands hands = new Hands();

    @Override
    public void drawCard(CardDeck cardDeck) {
        Card card = cardDeck.draw();
        this.hands.receiveCard(card);
    }

    @Override
    public Integer handsCardCount() {
        return this.hands.count();
    }
}
