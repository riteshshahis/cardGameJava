package com.Ritesh;

public class Main {

    public static void main(String[] args) {
	// Instantiate a cardGame
        CardGame myGame = new CardGame("Not A Clue");
        Snap mySnap = new Snap("Snappy");
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");




        System.out.println(myGame);

        myGame.getDeck();

        System.out.println(myGame.dealCard(0));

        myGame.sortDeckInNumberOrder();
        myGame.sortDeckIntoSuits();
        myGame.shuffleDeck();

        mySnap.playSnap(mySnap);
        player1.playSnap2(player1, player2);

    }
}
