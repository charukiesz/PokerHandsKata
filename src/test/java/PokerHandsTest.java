import com.techreturners.model.Hand;
import com.techreturners.model.Card;
import com.techreturners.model.PokerHands;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;


public class PokerHandsTest {

   @Disabled
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
   @Test
    public void checkCanCreateTwoPlayersFromInput(){
        //Arrange
       String input = "Black: 2H 4S 4C 2D 4H  White: 2S 8S AS QS 3S";
        PokerHands pokerHands = new PokerHands(input);
        String expectedResultBlack = "Black: 2H 4S 4C 2D 4H";
        String expectedResultWhite = "White: 2S 8S AS QS 3S";

        //Assert and Act
        Assertions.assertEquals(expectedResultBlack, pokerHands.getPlayer1());
        Assertions.assertEquals(expectedResultWhite, pokerHands.getPlayer2());


    }

    @Test
    public void checkHandForRankConditionStraightFlush(){
        //Arrange
        String [] input = {"6C", "7C", "8C", "9C", "TC"};
        Hand player1Hand = new Hand(input);
        PokerHands pokerHands = new PokerHands();
        //Assert and Act
        Assertions.assertTrue(pokerHands.isStraightFlush(player1Hand));
    }


    @Test
    public void checkHandForRankConditionForNotStraightFlush(){
        //Arrange
        String [] input = {"6C", "7C", "4C", "9C", "TC"};
        Hand player1Hand = new Hand(input);
        PokerHands pokerHands = new PokerHands();

        //Assert and Act
        Assertions.assertFalse(pokerHands.isStraightFlush(player1Hand));
    }


    @Test
    public void checkHandForRankConditionIsFourOfAKind(){
        //Arrange
        String [] input = {"6D", "6C", "6H", "6S", "2C"};
        Hand player1Hand = new Hand(input);
        PokerHands pokerHands = new PokerHands();

        //Assert and Act
        Assertions.assertTrue(pokerHands.isFourOfAKind(player1Hand));
    }

}




