package com.apcs;

public class Utilities {

    public static void pressEnterToContinue()
    {
        System.out.print("Press [ENTER] to continue...");
        try
        {
            System.in.read();
        }

        catch (Exception e) {

        }
    }

    public static int randomCalc() {

        int encounter = (int)(Math.floor(Math.random() * (14 - 1 + 1) + 1));
        return encounter;

    }

}
