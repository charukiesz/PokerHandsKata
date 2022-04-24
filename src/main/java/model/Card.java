package model;

public class Card {
    private int value;
    private char suit;

    public Card(String input) {
        this.value = Character.getNumericValue(input.charAt(0));
        this.suit = input.charAt(1);
    }

    public char getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
}
