import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.techreturners.model.Card;

public class PokerHandsTest {

    @Test
    public void setUp(){
        Assertions.assertEquals(true, true);
    }

    @Test
    public void checkCanCreateCard(){
        //Arrange
        String input = "2D";
        int valueExpected = 2;
        char suitExpected = 'D';

        //Further Arrange
        Card card = new Card(input);

        //Assert and Act
        Assertions.assertEquals(valueExpected, card.getValue());
        Assertions.assertEquals(suitExpected, card.getSuit());

    }

    @Test
    public void checkCanCreatePictureCardKing(){
        //Arrange
        String input = "KD";
        int valueExpected = 13;
        char suitExpected = 'D';

        //Further Arrange
        Card card = new Card(input);

        //Assert and Act
        Assertions.assertEquals(valueExpected, card.getValue());
        Assertions.assertEquals(suitExpected, card.getSuit());
    }

    @Test
    public void checkCanCreateCardTen(){
        //Arrange
        String input = "TD";
        int valueExpected = 10;
        char suitExpected = 'D';

        //Further Arrange
        Card card = new Card(input);

        //Assert and Act
        Assertions.assertEquals(valueExpected, card.getValue());
        Assertions.assertEquals(suitExpected, card.getSuit());

    }
    @Test
    public void checkCanCreateCardSuitSpade(){
        //Arrange
        String input = "2S";
        int valueExpected = 2;
        char suitExpected = 'S';

        //Further Arrange
        Card card = new Card(input);

        //Assert and Act
        Assertions.assertEquals(valueExpected, card.getValue());
        Assertions.assertEquals(suitExpected, card.getSuit());

    }
}
