package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

public class Card {

    private String name;
    private int[] dice;
    static private Scanner sa = new Scanner(System.in);
    public static ArrayList<Card> Deck = new ArrayList<Card>();
    public static ArrayList<String> card_Name = new ArrayList<String>();

    public Card(String n, int d) {
        name = n;
        dice = new int[d];
        Deck.add(this);
        card_Name.add(this.name);
    }

    public Card() {
    }

    public void set_Dice() {
        int i = 0;
        for (int a : this.dice) {
            a = sa.nextInt();
            dice[i] = a;
            i++;
        }
    }

    public int[] get_Dice() {
        return dice;
    }

    public String get_Name() {
        return name;
    }

    public int[] roll() {
        int i = 0;
        int[] b = this.dice.clone();
        for (int A : b) {
            b[i] = (int) (Math.random() * (A - 1 + 1) + 1);
            i++;
        }
        return b;
    }

    static public Card go_Roll(String n) {
        int pos = 0;
        for (String str : card_Name) {
            if (str.equals(n)) {
                break;
            }
            pos++;
        }
        return Deck.get(pos);
    }
}
