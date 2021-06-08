package com.apcs;

public class Quest {

   private LifeSituation lifeSituation = new LifeSituation();

   void welcomeScreen() {

       System.out.println("QUEST");
       System.out.println("A game by Richa Juvekar and Tanya Vasireddy.");
       Utilities.pressEnterToContinue();

   }

   public void start() {

       welcomeScreen();
       lifeSituation.chooseLife();

   }

}
