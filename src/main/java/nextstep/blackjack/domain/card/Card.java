package nextstep.blackjack.domain.card;

import nextstep.blackjack.enums.CardType;
import nextstep.blackjack.enums.CardValue;

public class Card {
    private CardType type;
    private CardValue value;

    public Card(CardType type, CardValue value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (type != card.type) return false;
        return value == card.value;
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + value.hashCode();
        return result;
    }

    public String showString() {
        return this.value.getNumber() + this.type.name();
    }

    public Integer getNumber() {
        return this.value.getNumber();
    }
}

