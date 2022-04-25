package com.techreturners.model;

public class Card {
    private int value;
    private char suit;

    public Card(String input) {
        char tempValue = input.charAt(0);
        char tempSuit = input.charAt(1);

        if (Character.isDigit(tempValue)) {
            this.value = Character.getNumericValue(input.charAt(0));
        } else {
            switch (tempValue){
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

        if (tempSuit == 'C' || tempSuit == 'D' || tempSuit == 'H' || tempSuit == 'S') {
            this.suit = tempSuit;
        }
        switch(tempSuit) {
            case 'C':
                this.suit = tempSuit;
                break;
            case 'D':
                this.suit = tempSuit;
                break;
            case 'H':
                this.suit = tempSuit;
                break;
            case 'S':
                this.suit = tempSuit;
                break;
            default:
                this.suit = ' ';
        }

    }

    public char getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }





}
