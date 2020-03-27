package com.company;
import com.sun.jdi.Mirror;

import java.awt.*;



public class Main {

    public static void main(String[] args) {

        RearMirror r1 = new RearMirror(100,10);
        RearMirror r2 = new RearMirror(130,-40);
        Wheel c1w1 = new Wheel("Summer", 10, 20);
        Wheel c1w2 = new Wheel("Summer", 9, 20);
        Wheel c1w3 = new Wheel("Summer", 10, 20);
        Wheel c1w4 = new Wheel("Summer", 9, 20);

            Engine e1 = new Engine(90, Engine.TYPE.Gas);

            Car c1 = new Car(e1, 100, "Dacia", "D2312",20);
            c1.fuelConsamption = 12;
            c1.gasoline = 50;



        c1.addWheel(c1w1);
        c1.addWheel(c1w2);
        c1.addWheel(c1w3);
        c1.addWheel(c1w4);
        c1.addMirror(r1);
        c1.addMirror(r2);




        RearMirror c2r1 = new RearMirror(160,30);
        RearMirror c2r2 = new RearMirror(130,-10);


        Engine e2 =new Engine(120, Engine.TYPE.Diesel);

        Car c2 = new Car(e2,100 , "Mazda", "M234324",17);
        c2.fuelConsamption = 10;
        c2.gasoline = 100;

        Wheel c2w1 = new Wheel("Winter", 5, 20);
        Wheel c2w2 = new Wheel("Winter", 6, 19);
        Wheel c2w3 = new Wheel("Winter", 8, 20);
        Wheel c2w4 = new Wheel("Winter", 9, 20);
        c2.addWheel(c2w1);
        c2.addWheel(c2w2);
        c2.addWheel(c2w3);
        c2.addWheel(c2w4);
        c2.addMirror(c2r1);
        c2.addMirror(c2r2);



        RearMirror c3r1 = new RearMirror(160,30);
        RearMirror c3r2 = new RearMirror(130,-10);

         Engine e3 = new Engine(100, Engine.TYPE.Gas);

        Car c3 = new Car(e3,120, "Opel","O2322",18);
        c3.fuelConsamption = 12;
        c3.gasoline = 120;

        Wheel c3w1 = new Wheel("Summer", 5, 20);
        Wheel c3w2 = new Wheel("Summer", 9, 20);
        Wheel c3w3 = new Wheel("Summer", 10, 20);
        Wheel c3w4 = new Wheel("Summer", 9, 20);
        c3.addWheel(c3w1);
        c3.addWheel(c3w2);
        c3.addWheel(c3w3);
        c3.addWheel(c3w4);
        c3.addMirror(c3r1);
        c3.addMirror(c3r2);





        c1.brake();
        c3.getRemainingRange();
        System.out.println(c1.getMirrors().get(0).getPosition());

        c1.ProfileCheck();
        c2.ProfileCheck();

    }
}
