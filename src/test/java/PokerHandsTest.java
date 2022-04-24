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

}
