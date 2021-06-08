package com.apcs;
import java.util.ArrayList;

public class CrewEdits {

    ArrayList<String> crew = new ArrayList<String>();

    public void addCrewMember(String name) {

        String crewMember = new String(name);
        crew.add(crewMember);

    }

    public void killCrewMember() {

        crew.remove(crew.size() - 1);

    }

}
