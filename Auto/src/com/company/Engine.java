package com.company;
import java.util.Scanner;

public class Engine {
    private Engine engine;




    public enum TYPE {Diesel, Gas}
    private float horsePower;
    private TYPE type;

        public Engine(int horsePower, TYPE type) {

            this.horsePower = horsePower;
            this.type = type;

        }





    public float getHorsePower (){

            return horsePower;

    }

    public TYPE type () {

            return type;
    }

    public void drive () {

        System.out.println("Wie viel Gas willst du geben(zwischen 0-100)");
        Scanner scanner = new Scanner(System.in);
        int Input = scanner.nextInt();
        float motorWork = engine.getHorsePower() / 100 * Input;

        System.out.println(engine.getHorsePower());
        System.out.println("Deine Motorleistung ist bei" + motorWork + "%");


    }


}
