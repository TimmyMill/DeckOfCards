/*
* Mike Knutson
* ITEC 2545-02, 10.18.2015, Assignment 4 pt.1
 */


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // open scanner
        Scanner scan = new Scanner(System.in);
        // create card object
        Card C;
        // create deck object
        DeckOfCards deck = new DeckOfCards();

        System.out.println("Enter the amount of cards to deal: ");

        int numOfCards = scan.nextInt();

        System.out.println("Cards drawn: ");
        for (int i = 0; i<numOfCards;i++){
            C = deck.drawRandomCard();
            System.out.println(C.toString());
        }
    }
}
