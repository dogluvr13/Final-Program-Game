package com.apcs;
import java.util.Scanner;

public class Crew {

    public void nameCrew() {

        CrewEdits crew = new CrewEdits();
        System.out.println("Now, name your crew. ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("1) ");
        String name1 = scanner.nextLine();
        crew.addCrewMember(name1);

        System.out.print("2) ");
        String name2 = scanner.nextLine();
        crew.addCrewMember(name2);

        System.out.print("3) ");
        String name3 = scanner.nextLine();
        crew.addCrewMember(name3);

        System.out.print("4) ");
        String name4 = scanner.next();
        crew.addCrewMember(name4);

        System.out.print("5) ");
        String name5 = scanner.next();
        crew.addCrewMember(name5);

    }

}
