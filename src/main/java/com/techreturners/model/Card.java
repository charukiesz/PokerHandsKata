package com.techreturners.model;

public class Card {
    private int value;
    private char suit;

    public Card(String input) {
        this.suit = input.charAt(1);
        char temp = input.charAt(0);

        if (Character.isDigit(temp)) {
            this.value = Character.getNumericValue(input.charAt(0));
        } else {
            switch (temp){
                case 'T':
                    this.value = 10;
                    break;
                case 'J':
                    this.value = 11;
                    break;
                case 'Q':
                    this.value = 12;
                    break;
                case 'K':
                    this.value = 13;
                    break;
                case 'A':
                    this.value = 14;
                    break;
                default:
                    this.value = 0;
            }
        }
    }

    public char getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
}
