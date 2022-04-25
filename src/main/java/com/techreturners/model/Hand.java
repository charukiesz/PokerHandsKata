package com.techreturners.model;
import java.util.ArrayList;

public class Hand {

   public ArrayList<Card> cards = new ArrayList<>(5);
    int highCard;

    public Hand (String[] input){
        for (int i = 0; i < input.length; i++) {
            this.cards.add(new Card(input[i]));
        }

    }


    public int getValue(int i) {
        return this.cards.get(i).getValue();
    }

    public char getSuit(int i) {
        return this.cards.get(i).getSuit();
    }

}
