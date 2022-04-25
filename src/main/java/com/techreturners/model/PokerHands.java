package com.techreturners.model;

import java.util.Arrays;

public class PokerHands {


    //A Game will consist of two hands
    //Each hand contains five cards - input as a String Arraylist
    //Each card is represented by a String of two characters - split the String Arraylist on the spaces
    //Parse the hand - split the string on the spaces to get each card
    //Evaluate each card by value and by suit
    //Evaluate each hand for the Rank conditions
    //Card class
    //Hand class

    public  String player1;
    public String player2;
    public Hand player1Hand;
    public Hand player2Hand;





    public boolean isStraightFlush(Hand playerHand) {
        char firstCard = playerHand.cards.get(0).getSuit();
        boolean isStraight = true;
        for (int i = 1; i < playerHand.cards.size(); i++) {
            if (firstCard != playerHand.cards.get(i).getSuit()) {
                isStraight = false;
            }
        }
        int[] arr = new int[playerHand.cards.size()];
        for (int i = 0; i < playerHand.cards.size(); i++) {
            arr[i] = playerHand.cards.get(i).getValue();
        }
        Arrays.sort( arr );
        for (int i=0; i<arr.length-1; i++)
        {
            if (arr[i]+1 != arr[i+1]) {
                isStraight = false;
            }
        }
        return isStraight;
    }




}
