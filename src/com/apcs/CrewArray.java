package com.apcs;

public class CrewArray {

    Crew[] crew = null;

    public CrewArray() {
    }

    // adds a new crew member to our array of crew members
    public void addCrewMember(String name) {

        if ( name == null ) {

            crew = new Crew[1];
            crew[0] = new Crew(name);

        } else {

            Crew[] crew2 = new Crew[crew.length+1];
            for (int i = 0; i < crew.length; i++) {

                crew2[i] = crew[i];

            }

            crew2[crew.length] = new Crew(name);
            crew = crew2;
        }

    }

    // gives the total number of crew members
    public int getNumCrew() {
        if (crew == null) {
            return 0;
        }
        return crew.length;
    }

    public void deleteCrewMember() {

        Crew[] crew2 = new Crew[crew.length];

        for (int i = 0; i < crew.length-1; i++) {

            crew2[i] = crew[i];

        }

        crew = crew2;

    }

}
