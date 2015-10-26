package com.nextreme.lib;

/**
 * Created by huazhang on 10/26/15.
 */
public enum Suit {
    CLUBS("CLUBS"),
    DIAMONDS("DIAMONDS"),
    HEARTS("HEARTS"),
    SPADES("SPADES");

    String name;

    Suit(String name) {
        this.name = name;
    }

    public String toString() { return name; }
}
