package nextstep.blackjack;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.enums.CardType;
import nextstep.blackjack.enums.CardValue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CardTest {


    @Test
    @DisplayName("카드 생성")
    void create_card() {
        Card card = new Card(CardType.DIAMOND, CardValue.ACE);
        assertThat(card).isNotNull();
    }
}
