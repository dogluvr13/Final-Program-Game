package com.apcs;

public class Shop {

    private int sails = 1;
    private int earbuds = 1;
    private int ambrosia = 1; // if food hits zero, they lose?
    private int bandages = 1;
    // can only buy one egg
    private boolean pegasus = true;
    private boolean threeHeadedDog = true;
    private boolean phoenix = true;

    public int getSails() {
        return sails;
    }

    public void setSails(int sails) {
        this.sails = sails;
    }

    public int getEarbuds() {
        return earbuds;
    }

    public void setEarbuds(int earbuds) {
        this.earbuds = earbuds;
    }

    public int getAmbrosia() {
        return ambrosia;
    }

    public void setAmbrosia(int ambrosia) {
        this.ambrosia = ambrosia;
    }

    public int getBandages() {
        return bandages;
    }

    public void setBandages(int bandages) {
        this.bandages = bandages;
    }

    public boolean isPegasus() {
        return pegasus;
    }

    public void setPegasus(boolean pegasus) {
        this.pegasus = pegasus;
    }

    public boolean isThreeHeadedDog() {
        return threeHeadedDog;
    }

    public void setThreeHeadedDog(boolean threeHeadedDog) {
        this.threeHeadedDog = threeHeadedDog;
    }

    public boolean isPhoenix() {
        return phoenix;
    }

    public void setPhoenix(boolean phoenix) {
        this.phoenix = phoenix;
    }
}
