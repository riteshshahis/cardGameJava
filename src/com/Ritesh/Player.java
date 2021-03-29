package com.Ritesh;

import java.util.Scanner;

public class Player extends CardGame{

    public Player(String name) {
        super(name);
        this.deckOfCards = constructGame();
    }


    // Create a Player class and enable the snap game to be two player, with the users taking it in
    // turns to go. If the snap occurs on the users turn, they win.

        public void playSnap2 (Player player1, Player player2) {
        player1.shuffleDeck();
        player2.shuffleDeck();
        System.out.println(player1);
        System.out.println(player2);

        int counter =0;
        Scanner scanner = new Scanner(System.in);
        for (; counter < player2.deckOfCards.size();counter++) {
            System.out.println("Player 1, press Enter to draw card");
            String input = scanner.next();
            Card currentCardPlayer1 = player1.dealCard(counter);
            Card currentCardPlayer2 = player2.dealCard(counter); //need to store this before the draw
            System.out.println(currentCardPlayer1);
            if (counter!=0) { //compare against player 2's last card
                Card tempCurrentCardPlayer2 = player2.dealCard(counter-1);
                if (currentCardPlayer1.value==tempCurrentCardPlayer2.value) {
                    System.out.println("Player 1 wins!!! You snapped " + currentCardPlayer1);
                    break;
                }
            }
            System.out.println("Player 2, press Enter to draw card");
            String input2 = scanner.next();
            System.out.println(currentCardPlayer2);
            if (currentCardPlayer1.value==currentCardPlayer2.value) {
//                long limit = 12000L;
//                long startTime = System.currentTimeMillis();
                //String input = scanner.next();
//                if ((startTime + limit) < System.currentTimeMillis())
                // if input.tolower == "snap" sout Player 2 wins
                // break
                // sout Player 1 wins as took too long for Player 2 to type snap


                System.out.println("Player 2 wins!!! You snapped " + currentCardPlayer2);
                break;
            }
        }

    }


}
