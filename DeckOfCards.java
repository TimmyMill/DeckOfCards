package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Mike on 10/21/2015.
 *  Asssignment 4, deckOfCards pt 2
 */
public class DeckOfCards {
    //initiate an arrayList using the card object
    private ArrayList<Card> cards;
    //populate the arrayList
    public DeckOfCards(){
        cards = new ArrayList<Card>();

        for ( int i = 0; i <=3;i++){
            for(int x = 0; x <= 12;x++){
                cards.add(new Card(i,x));
            }
        }
    }
    public Card drawRandomCard(){
        //open random,
        Random generator = new Random();
        int index = generator.nextInt(cards.size());
        return cards.remove(index);
    }
}

