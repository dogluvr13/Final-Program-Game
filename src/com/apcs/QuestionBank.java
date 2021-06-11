package com.apcs;

import java.util.Scanner;

public class QuestionBank {

    public void circeQuestions() {

        int question = 1;
        int userChoice2 = 0;

        if (question == 1) {

            System.out.println("");
            System.out.println("What animals did Circe turn men into when they arrived upon her island? ");
            System.out.println("1) Guinea Pigs");
            System.out.println("2) Cows ");
            System.out.println("3) Pigs ");
            System.out.println("4) Birds ");

            Scanner scanner = new Scanner(System.in);

            try {

                userChoice2 = scanner.nextInt();
                scanner.nextLine();

            } catch (Exception e) {

                System.out.println("Bad input. Please enter a number between 1 and 4.");
                System.out.println("");

            }

            if (userChoice2 == 3) {

                System.out.println("Correct! You are free to pass, but first, feel free to purchase anything else you might need from the shop.");
                // add shop call here

            } else {

                System.out.println("Incorrect. Your crew has upset Circe, as she turns your crew into pigs and ends your journey early. GAME OVER.");
                System.exit(0);

            }

        } else {

            System.out.println("Bad input. Please enter a number between 1 and 4.");

        }

    }

}
