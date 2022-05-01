package com.techreturners.model;

import java.io.BufferedReader;
import java.io.FileReader;
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

//Constructor 1
    public PokerHands(String input) {
        this.player1 = input.substring(input.indexOf("Black:") , input.indexOf("White:")).trim();
        this.player2 = input.substring(input.lastIndexOf("White:")).trim();
    }

//Constructor 2
    public PokerHands() {
    }
//Getters
    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

//Setters
    public void setPlayer1Hand() {
        this.player1Hand = parsePlayerToHand(this.player1);
    }

    public void setPlayer2Hand() {
        this.player2Hand = parsePlayerToHand(this.player2);
    }
//Method to create the hand from a player
    public Hand parsePlayerToHand(String player){
        String[] playerHand;
        playerHand = player.substring(player.indexOf(8)).trim().toUpperCase().split(" "); //convert to String array

        return new Hand(playerHand);
    }

//Method to check if hand is Straight Flush
    public boolean isStraightFlush(Hand playerHand) {
        char firstCard = playerHand.cards.get(0).getSuit();
        boolean isStraight = true;
        for (int i = 1; i < playerHand.cards.size(); i++) {
            if (firstCard != playerHand.cards.get(i).getSuit()) {
                isStraight = false;
                break;
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
                break;
            }
        }
        return isStraight;
    }

//Method to check if hand is Four of a Kind (four cards with the same value)


    public boolean isFourOfAKind(Hand playerHand) {
        for (int i=0; i < playerHand.cards.size(); i++) {
            return true;
        }

//Method to check if hand is Full House (three cards with the same value and two of a pair)

//Method to check if hand is Flush (five cards of the same suit)

//Method to check if hand is Straight (five cards of consecutive values)

//Method to check if hand is Three of a kind (three cards of the same value)

//Method to check if hand is Two Pairs (two pairs of cards each pair of the same value)

//Method to check if hand is One Pair (one pair of cards with the same value)

//Method to check if hand is High Card (check for the highest card in the hand)

return false;
    }
}
