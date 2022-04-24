import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import model.Card;

public class PokerHandsTest {

    @Test
    public void setUp(){
        Assertions.assertEquals(true, true);
    }

    @Test
    public void checkCanCreateCard(){
        //Arrange
        String input = "2D";
        int value = 2;
        char suit = 'D';
        //Act
        Card card = new Card(input);
        //Assert
        Assertions.assertEquals(2, card.getValue());
        Assertions.assertEquals('D', card.getSuit());

    }

    

}
