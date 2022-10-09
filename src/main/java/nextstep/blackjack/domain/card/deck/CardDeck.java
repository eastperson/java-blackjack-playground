package nextstep.blackjack.domain.card.deck;

import nextstep.blackjack.domain.card.Card;

public interface CardDeck {
    Integer size();
    Card draw();
}
