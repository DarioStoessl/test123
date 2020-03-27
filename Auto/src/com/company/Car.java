package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Car {

    private Engine engine;
    private int fuelTank;
    private List<RearMirror> mirrors;
    private List<Wheel> whells;
    public int fuelConsamption;
    private String brand;
    private String serialnummber;
    public float gasoline;
    private int WheelSize;


    public Car(Engine engine, int fuelTank, String brand, String serialnummber,int wheelSize) {
        this.fuelTank = fuelTank;
        this.brand = brand;
        this.serialnummber = serialnummber;
        this.engine = engine;
        this.mirrors = new ArrayList<>();
        this.whells = new ArrayList<>();
        this.WheelSize = wheelSize;


    }


    public void addMirror(RearMirror rearMirror) {

        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void addWheel(Wheel wheel) {

        this.whells.add(wheel);
    }

    public List<Wheel> getWhells() {
        return whells;
    }

    public void setFuelTank(int fuelTank) {

        this.fuelTank = fuelTank;

    }

    public void drive() {

        System.out.println("Wie viel Gas willst du geben(zwischen 0-100)");
        Scanner scanner = new Scanner(System.in);
        int Input = scanner.nextInt();
        float motorWork = engine.getHorsePower() / 100 * Input;

        System.out.println(engine.getHorsePower());
        System.out.println("Dein Motor ist bei" + motorWork + "Ps");


    }

    public void getRemainingRange() {


        float Range = this.gasoline / this.fuelConsamption * 100;

        System.out.println("Du hast noch" + Range + "Km");

    }

    public void brake() {

        System.out.println("Ich Bremse");

    }


    public void Honk() {
        System.out.println("Wie oft hupst du?");
        Scanner scanner = new Scanner(System.in);
        int Honk = scanner.nextInt();

        while (Honk > 0) {

            System.out.println("Tuut,tuut");
            Honk--;

        }

    }

    public void ProfileCheck() {

        if ((this.whells.get(0).profile <= 5) || (this.whells.get(1).profile <= 5) ||
                (this.whells.get(2).profile <= 5) || (this.whells.get(3).profile <= 5)) {

            System.out.println("Die reifen sind abgefahren.");

        } else
            System.out.println("Die Reifen sind noch in Ordnung");

        if ((this.whells.get(0).size == this.WheelSize)&&(this.whells.get(1).size == this.WheelSize)&&
                (this.whells.get(2).size == this.WheelSize)&&(this.whells.get(3).size == this.WheelSize)){

            System.out.println("Felgengröße ist in Ordnung");
        } else
            System.out.println("Falsche Felgengröße");
    }
}


