package com.Ritesh;

import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame{

    public Snap (String name) {
        super(name);
        this.deckOfCards = constructGame();

    }


    public void playSnap (Snap mySnap) {

        // shuffle cards
        mySnap.shuffleDeck();
        System.out.println(mySnap);
        Card storeCard = null;
        int counter =0;
        Scanner scanner = new Scanner(System.in);
        for (;counter < deckOfCards.size(); counter++) {
            if (counter%2 == 1) {
                System.out.println("Player 2, press Enter to draw card");
            } else System.out.println("Player 1, press Enter to draw card");
            //ternary on modulus of counter to ask player 1 or 2 to enter???
            String input = scanner.next();
            Card currentCard = mySnap.dealCard(counter);
            System.out.println(currentCard);
            if(counter==0) {
                //first card, so simply store
                storeCard = currentCard;
            } else {
                // compare cards
                if (storeCard.getValue() == currentCard.getValue()) {
                    if (counter % 2>0) {
                        System.out.println("Player 2 wins!!! You snapped " + currentCard);
                    } else {
                        System.out.println("Player 1 wins!!! You snapped " + currentCard);
                    }
                    break;
                } else {
                    //store the card to compare with the next turn
                    storeCard = currentCard;
                }
            }
            if (counter == (deckOfCards.size())-1) {
                // got to the end of the pack and no winners so let's shuffle again and reset the counter
                System.out.println("Ahhh... No winners, let's play again....");
                counter=0;
                mySnap.shuffleDeck();
            }
        }

    }


}
