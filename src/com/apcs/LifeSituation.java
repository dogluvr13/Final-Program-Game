package com.apcs;

import java.util.Scanner;

public class LifeSituation {

    public static void main(String[] args) {

        int userChoice = 0;

        while (true) {

            System.out.println("Your life situation impacts the resources you can start with!\nAn easier life will give you more resources to begin with, but your final score will have a lower multiplier added on.");
            System.out.println("1) Olympian - With infinite resources, your life is off to an easy start. ");
            System.out.println("2) High Royalty - As part of the ancient royal courts, you've got quite the budget. ");
            System.out.println("3) Weaver - Average income, average life. ");
            System.out.println("4) Public servant - You don't have much to start with, but hopefully this journey can change that. ");
            System.out.print("Choice: ");

            Scanner scanner = new Scanner(System.in);

            try {

                userChoice = scanner.nextInt();
                scanner.nextLine();

            } catch (Exception e) {

                System.out.println("Bad input. Please enter a number between 1 and 4.");
                System.out.println("");
                continue;

            }

            if (userChoice < 1 || userChoice > 4) {

                System.out.println("Bad input. Please enter a number between 1 and 4.");
                System.out.println("");
                continue;

            }


        }

        if (userChoice == 1) {



        } else if (userChoice == 2) {



        } else if (userChoice == 3) {



        } else if (userChoice == 4) {


        }

    }

}
