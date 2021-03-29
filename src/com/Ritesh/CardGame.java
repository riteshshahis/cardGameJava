package com.Ritesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {
    String name;
    ArrayList <Card> deckOfCards = new ArrayList<Card>();
    final String[] cardSuit = {"\u2660",	"\u2665",	"\u2666",	"\u2663"};
    final int[] cardValue = {2,3,4,5,6,7,8,9,10,11,12,13,14};
    final String[] cardSymbol = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

    public CardGame(String name) {
        this.name = name;
        this.deckOfCards = constructGame();
    }

    String[] suitArray  = new String[] {};

    public ArrayList constructGame () {
        //loop through all suits and add a value +symbol to create tempCard and add that to deckOfCards
        int counter = 0;
        for (; counter < cardSuit.length; counter++) {
            int cardCount=0;
            for (cardCount =0; cardCount<cardValue.length; cardCount++ ) {

                Card tempCard = new Card(cardSuit[counter], cardCount+2,cardSymbol[cardCount]);
                deckOfCards.add(tempCard);

            }

        }
        System.out.println(deckOfCards);
        return deckOfCards;
    }


    public void getDeck() {
        int counter = 0;
        for (Card card : deckOfCards) {
            counter++;
            System.out.println(
                            card.getSuit() + " " +
                            card.getSymbol() + " " +
                            card.getValue() + ", ");
            }


        }

        public Card dealCard(int nextCard) {
            return CardGame.this.deckOfCards.get(nextCard);
        }

        public void sortDeckInNumberOrder () {

            deckOfCards.sort(Comparator.comparing(Card::getValue));
            System.out.println(deckOfCards);
            }

            public void sortDeckIntoSuits () {
                deckOfCards.sort(Comparator.comparing(Card::getSuit));
                System.out.println(deckOfCards);
            }

            public void shuffleDeck () {
                Collections.shuffle(deckOfCards);
                System.out.println(deckOfCards);
            }


    @Override
    public String toString() {
        return "CardGame{" +
                "name='" + name + '\'' +
                ", deckOfCards=" + deckOfCards +
                ", cardSuit=" + Arrays.toString(cardSuit) +
                ", cardValue=" + Arrays.toString(cardValue) +
                ", cardSymbol=" + Arrays.toString(cardSymbol) +
                ", suitArray=" + Arrays.toString(suitArray) +
                '}';
    }
}
