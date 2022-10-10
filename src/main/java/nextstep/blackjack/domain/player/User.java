package nextstep.blackjack.domain.player;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Money;
import nextstep.blackjack.domain.card.deck.CardDeck;
import nextstep.fp.Car;

import java.util.List;

public interface User {

    void drawCard(CardDeck cardDeck);
    Integer handsCardCount();
    List<Card> showHandsCard();
    Integer sumHandsCard();
    List<String> showHandsCardString();
    Money revenue();
    ResultType result();
    void initDrawCard(CardDeck cardDeck);
}
