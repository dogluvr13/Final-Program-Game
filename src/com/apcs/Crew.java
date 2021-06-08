package com.apcs;
import java.util.ArrayList;
import java.util.Scanner;

public class Crew {

    private ArrayList<String> crew = new ArrayList<String>();

    public void addCrewMember(String name) {

        String crewMember = new String(name);
        crew.add(crewMember);

    }

    public void killCrewMember() {

        if (crew.size() > 0) {

            crew.remove(crew.size() - 1);

        }

    }


    public static void main(String[] args) {

        Crew crew = new Crew();
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

    public int getCount() {

        return crew.size();

    }

}
