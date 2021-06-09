package com.apcs;

public class Quest {

   private LifeSituation lifeSituation = new LifeSituation();
   private Crew crew = new Crew();
   private Encounters encounters = new Encounters();

   void welcomeScreen() {

       System.out.println("QUEST");
       System.out.println("A game by Richa Juvekar and Tanya Vasireddy.");
       Utilities.pressEnterToContinue();

   }

   public void start() {

       welcomeScreen();
       lifeSituation.chooseLife();
       crew.chooseCrew();
       // shop option here
       System.out.println("");
       encounters.randomEncounter(Utilities.randomCalc());

   }

}
