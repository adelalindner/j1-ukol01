package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        nakresliPrasatko(zofka);


    }

    private static void nakresliPrasatko(Turtle zofka) {
        zofka.turnRight(180);

        //Domeček:
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }
        //Stříška:
        zofka.turnRight (60);
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);


        zofka.turnLeft(30);

        //První noha
        zofka.turnRight(60);
        zofka.move(25);
        zofka.turnRight (180);
        zofka.move (25) ;
        zofka.turnLeft (120);
        zofka.move (25);
        zofka.turnRight (180);
        zofka.move(25);

        //Přesun:
        zofka.turnRight (60);
        zofka.move (100);

        //Druhá noha:
        zofka.turnRight(60);
        zofka.move(25);
        zofka.turnRight (180) ;
        zofka.move (25) ;
        zofka.turnLeft (120);
        zofka.move (25);
        zofka.turnRight (180);
        zofka.move(25);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    }