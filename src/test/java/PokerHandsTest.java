import com.techreturners.model.Hand;
import com.techreturners.model.Card;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;


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

    @Test
    public void checkCanCreateHand(){
        //Arrange
        String [] input = {"2H", "3D", "5S", "9C", "KD"};

        //Further Arrange
        Hand hand = new Hand(input);

        //Assert and Act
        Assertions.assertEquals(2, hand.getValue(0));
        Assertions.assertEquals('H', hand.getSuit(0));
        Assertions.assertEquals(3, hand.getValue(1));
        Assertions.assertEquals('D', hand.getSuit(1));
        Assertions.assertEquals(5, hand.getValue(2));
        Assertions.assertEquals('S', hand.getSuit(2));
        Assertions.assertEquals(9, hand.getValue(3));
        Assertions.assertEquals('C', hand.getSuit(3));
        Assertions.assertEquals(13, hand.getValue(4));
        Assertions.assertEquals('D', hand.getSuit(4));
    }

    
}
