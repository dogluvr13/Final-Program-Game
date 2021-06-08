package com.apcs;


public class Encounters {

    public int randomEncounter() {

        CrewEdits crew = new CrewEdits();
        int crewCounter = crew.size();
        int turnCounter = 0;
        int encounter = 0;
        int money = 0;

        if (encounter == 1) {

            System.out.println("Your crew has incurred the wrath of Lord Poseidon and is caught in a storm. One crew member has died. ");
            crew.killCrewMember();
            crewCounter = crew.size();
            turnCounter = turnCounter + 1;

        } else if (encounter == 2) {

            System.out.println("Your crew has incurred the wrath of Lord Poseidon and is caught in a storm.");

            if (sails = true) {

                System.out.println("Thank the gods you purchased those SAILS before! Your entire crew has survived.");
                sails =-;

            } else {

                System.out.println("You lacked the proper replacement SAILS to carry everyone safely through the storm. One crew member has died.");
                crew.killCrewMember();

            }
            turnCounter = turnCounter + 1;

        } else if (encounter == 3) {

            System.out.println("Your crew has encroached onto siren territory.");

            if (earbuds = true) {

                System.out.println("Thank the gods you purchased those EARBUDS before! Your entire crew has survived.");
                earbuds =-;

            } else {

                System.out.println("You lacked the proper replacement EARBUDS to protect your entire crew from the sirens. One crew member has died.");
                crew.killCrewMember();

            }
            turnCounter = turnCounter + 1;

        } else if (encounter == 4) {

            System.out.println("Lord Poseidon has favored your crew! You can travel safely THREE extra turns with no consequences. ");
            turnCounter = turnCounter + 4;

        } else if (encounter == 5) {

            System.out.println("A crew member got greedy with the ambrosia supply, spoiling and eating half of your supply. One crew member has died.");
            ambrosia/2 = ambrosia;
            turnCounter = turnCounter + 1;

        } else if (encounter == 6) {

            System.out.println("Your crew has found a pack of hippocampi, who help your ship travel faster. You can travel safely ONE extra turn with no consequences. ");
            turnCounter = turnCounter + 2;

        } else if (encounter == 7) {

            System.out.println("While sailing, your crew rescues someone stranded at sea by the name of Rusty. To express their gratitude, they offer to join your crew. A new crew member has joined.");
            crew.addCrewMember("Rusty");
            turnCounter = turnCounter + 1;

        } else if (encounter == 8) {

            System.out.println("Smooth sailing today. Nothing out of the ordinary happens.");
            turnCounter = turnCounter + 1;

        } else if (encounter == 9) {

            System.out.println("The goddess of the rainbow, Iris, has favored your crew and blessed you with some extra wealth. Receive plus 100 DRACHMAS.");
            money = money + 100;
            turnCounter = turnCounter + 1;

        } else if (encounter == 10) {

            System.out.println("A monster has attacked you and your crew.");

            if (bandages = true) {

                System.out.println("Thank the gods you purchased those BANDAGES before! Your entire crew has survived.");
                bandages =-;

            } else {

                System.out.println("You lacked the proper replacement BANDAGES to protect and rehabilitate your crew from the monster. One crew member has died.");
                crew.killCrewMember();

            }
            turnCounter = turnCounter + 1;

        } else if (encounter == 11) {

            System.out.println("It's a foggy day.");

            if (pegasus = true) {

                System.out.println("If you have a PEGASUS, you can travel safely ONE extra turn with no consequences.");
                turnCounter = turnCounter + 1;

            } else {

                System.out.println("Sailing takes longer than normal, but ultimately you make steady pace. Nothing out of the ordinary happens  ");

            }
            turnCounter = turnCounter + 1;

        } else if (encounter == 12) {

            System.out.println("The kerkopes have stolen away on your ship, looking to steal some of your riches.");

            if (threeHeadedDog = true) {

                System.out.println("If you have a THREE-HEADED DOG, your money is safe! Nothing out of the ordinary happens");

            } else {

                System.out.println("The brothers get into your money stash and are gone by the morning. Lose 50 drachmas.  ");
                money = money - 50;
            }
            turnCounter = turnCounter + 1;

        } else if (encounter == 13) {

            System.out.println("A crew member has fallen extremely ill and they most likely won't make it. ");

            if (phoenix = true) {

                System.out.println("If you have a PHOENIX, you can use the Phoenix tears to save their life. Nothing out of the ordinary happens. ");

            } else {

                System.out.println("The brothers get into your money stash and are gone by the morning. Lose 50 drachmas.  ");
                money = money - 50;
            }
            turnCounter = turnCounter + 1;

        } else if (encounter == 14) {

            System.out.println("A monster has attacked you and your crew. A crew member on the night shift fights back, but ultimately does not make it. One crew member has died.");
            crew.killCrewMember();

        } else {

            return 0;

        }

    }

}
