package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Main {

    static String str;
    static int num;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter number of cards");
        int card_Num = sc.nextInt();
        sc.nextLine();

        while (card_Num < 3 || card_Num > 11) {
            System.out.println("You can only have between 3 and 11 tactics");
            card_Num = sc.nextInt();
            sc.nextLine();
        }

        Card first = new Card();
        Card second = new Card();
        Card third = new Card();
        Card fourth = new Card();
        Card fifth = new Card();
        Card sixth = new Card();
        Card seventh = new Card();
        Card eighth = new Card();
        Card ninth = new Card();
        Card tenth = new Card();
        Card eleventh = new Card();

        for (int i = 1; i <= card_Num; i++) {

            System.out.println("Enter card name");
            str = sc.nextLine();
            System.out.println("Enter number of dice");
            num = sc.nextInt();
            sc.nextLine();

            if (i == 1) {
                first = create(str, num);
                first.set_Dice();
            }
            if (i == 2) {
                second = create(str, num);
                second.set_Dice();
            }
            if (i == 3) {
                third = create(str, num);
                third.set_Dice();
            }
            if (i == 4) {
                fourth = create(str, num);
                fourth.set_Dice();
            }
            if (i == 5) {
                fifth = create(str, num);
                fifth.set_Dice();
            }
            if (i == 6) {
                sixth = create(str, num);
                sixth.set_Dice();
            }
            if (i == 7) {
                seventh = create(str, num);
                seventh.set_Dice();
            }
            if (i == 8) {
                eighth = create(str, num);
                eighth.set_Dice();
            }
            if (i == 9) {
                ninth = create(str, num);
                ninth.set_Dice();
            }
            if (i == 10) {
                tenth = create(str, num);
                tenth.set_Dice();
            }
            if (i == 11) {
                eleventh = create(str, num);
                eleventh.set_Dice();
            }
        }

        repeat();
    }

    public static Card create(String s, int n) {
        Card place = new Card(s, n);
        return place;
    }

    public static void repeat() {
        System.out.println("Which card would you like to use?");
        String name = sc.nextLine();
        
        if(name.equals("0")) return;
        for (int b : (Card.go_Roll(name)).roll()) {
            System.out.print(b + " ");
        }
        
        System.out.println("");
        
        repeat();
    }
}
