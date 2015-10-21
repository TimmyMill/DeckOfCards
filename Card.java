package com.company;

/**
 * Created by Mike on 10/21/2015.
 * Assignment 4, DeckOfCards pt.3
 */
public class Card {

    private int type, value;
    private String[] cardValue ={"Ace", "King","Queen","Jack", "10", "9", "8", "7", "6","5","4","3","2"};
    private String[] cardSuit = {"Clubs","Spades","Diamonds", "Hearts"};

    public Card(int types, int values){
        type = types;
        value = values;
    }
    @Override
    public String toString(){
        String drawCard = cardValue[value] + " of " + cardSuit[type];
        return drawCard;
    }
}
