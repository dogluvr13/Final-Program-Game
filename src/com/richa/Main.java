package com.richa;

import java.util.Scanner;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        while (true) {

            System.out.println("Your life situation impacts the resources you can start with!\nAn easier life will give you more resources to begin with, but your final score will have a lower multiplier added on.");
            System.out.println("1) Olympian - With infinite resources, your life is off to an easy start. ");
            System.out.println("2) High Royalty - As part of the ancient royal courts, you've got quite the budget. ");
            System.out.println("3) Weaver - Average income, average life. ");
            System.out.println("4) Public servant - You don't have much to start with, but hopefully this journey can change that. ");
            System.out.print("Choice: ");

            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();

            if (userChoice >= 1 && userChoice <= 4) {

                System.out.println("Excellent! Now, it's time to name you and your crew.");

                System.out.print("1) ");
                String name1 = scanner.next();

                System.out.print("2) ");
                String name2 = scanner.next();

                System.out.print("3) ");
                String name3 = scanner.next();

                System.out.print("4) ");
                String name4 = scanner.next();

                System.out.print("5) ");
                String name5 = scanner.next();

                break;

            } else {

                System.out.println("That's not a choice. Let's try this again... ");
                System.out.println("");

            }

        }

    }
}
