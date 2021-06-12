package com.apcs;

public class MajorEncounters {

    QuestionBank qB = new QuestionBank();
    //Crew crew = new Crew();

    public void circeIsland() {

        System.out.println("You've arrived to a mythological island, the home of the goddess-sorceress Circe. " +
                "Circe stands before you, and poses you a question to pass.");
        System.out.println("If you answer the question correctly, your crew can move on safely. If not, your quest is as good as over.");
        Utilities.pressEnterToContinue();
        qB.circeQuestions();
        Utilities.pressEnterToContinue();

    }

    public void monsterStraits(Quest quest) {

        //TODO: this keeps saying everyone has died?
        if (quest.getCrew().getCount() == 0) {

            System.out.println("Your entire crew has died! GAME OVER. ");
            System.exit(0);

        } else {

            System.out.println("You've arrived to the straits of Charybdis and Scylla. This narrow passage of water gives your crew" +
                    " two options going forward.\n If you go by the path of Scylla, you will lose two crew mates, but otherwise your crew will be" +
                    " safe. If you go by the path of Charybdis, you will have a good chance of your entire crew surviving, but your entire crew \n " +
                    " also has a chance to all die. ");
            Utilities.pressEnterToContinue();
            qB.straitsQuestion();
            Utilities.pressEnterToContinue();

        }

    }

    public void cyclopsIsland() {



    }

}
