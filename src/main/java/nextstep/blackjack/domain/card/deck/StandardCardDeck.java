package nextstep.blackjack.domain.card.deck;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.enums.CardType;
import nextstep.blackjack.enums.CardValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StandardCardDeck implements CardDeck {

    // 입력된 순서대로 데이터를 관리, stack
    private LinkedList<Card> pack = new LinkedList<>();

    public StandardCardDeck() {
        for (CardType type: CardType.values()) {
            for (CardValue value: CardValue.values()) {
                pack.add(new Card(type, value));
            }
        }
        shuffle();
    }

    private void shuffle() {
        List<Card> toList = new ArrayList<>(this.pack);
        Collections.shuffle(toList);
        this.pack = new LinkedList<>(toList);
    }

    @Override
    public Integer size() {
        return this.pack.size();
    }

    @Override
    public Card draw() {
        return this.pack.pop();
    }
}
