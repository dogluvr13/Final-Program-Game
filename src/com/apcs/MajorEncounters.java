package com.apcs;

public class MajorEncounters {

    QuestionBank qB = new QuestionBank();

    public void circeIsland() {

        System.out.println("You've arrived to a mythological island, the home of the goddess-sorceress Circe. " +
                "Circe stands before you, and poses you a question to pass.");
        System.out.println("If you answer the question correctly, your crew can move on safely. If not, your quest is as good as over.");
        qB.circeQuestions();
        Utilities.pressEnterToContinue();

    }

    public void monsterStraits() {



    }

    public void cyclopsIsland() {



    }

}
