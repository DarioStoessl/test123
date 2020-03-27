package com.company;

public class Wheel {

    String SummerWinterWheels;
    int profile;
    int size;


    public Wheel(String summerWinterWheels, int profile, int size) {
        SummerWinterWheels = summerWinterWheels;
        this.profile = profile;
        this.size = size;
    }

    public String getSummerWinterWheels() {
        return SummerWinterWheels;
    }

    public void setSummerWinterWheels(String summerWinterWheels) {
        SummerWinterWheels = summerWinterWheels;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
