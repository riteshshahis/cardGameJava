package com.Ritesh;

public class Card {
    String suit;
    String symbol;
    int value;

    public Card(String suit, int value, String symbol) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", value=" + value +
                '}';
    }
}
