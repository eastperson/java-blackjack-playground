package nextstep.blackjack.domain.player;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Money;
import nextstep.blackjack.domain.card.deck.CardDeck;

import java.math.BigDecimal;
import java.util.List;

public class Player implements User {

    private Hands hands = new Hands();
    private Money bet = new Money();

    @Override
    public void drawCard(CardDeck deck) {
        Card card = deck.draw();
        this.hands.receiveCard(card);
    }

    @Override
    public Integer handsCardCount() {
        return this.hands.count();
    }

    public void bet(BigDecimal amount) {
        this.bet.add(amount);
    }

    public BigDecimal betAmount() {
        return this.bet.amount();
    }

    @Override
    public List<Card> showHandsCard() {
        return this.hands.show();
    }
}
