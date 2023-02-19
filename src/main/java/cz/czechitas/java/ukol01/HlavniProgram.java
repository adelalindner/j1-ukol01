package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

/*

        nakresliPrasatko(zofka);

        zofka.penUp();
        zofka.turnLeft(30);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliKruznici(zofka);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(200);
        zofka.turnLeft(180);
        zofka.penDown();


        nakresliSlunce(zofka);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(200);
        zofka.penDown();

        nakresliOsmiuhelnik(zofka);

*/

        nakresliPrasatko(zofka);

        zofka.penUp();
        zofka.turnRight(60);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecek(zofka);

        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move (50);
        zofka.turnRight(90);
        zofka.penDown();

        for (int i = 0; i < 5; i++) {
            nakresliDomecek(zofka);

            zofka.penUp();
            zofka.turnLeft(90);
            zofka.move(130);
            zofka.turnRight(180);
            zofka.penDown();
        }

        zofka.penUp();
        zofka.move (80);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliDomecek(zofka);

        zofka.penUp();
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(15);
        zofka.penDown();


        nakresliSlunce(zofka);


    }

    private static void nakresliDomecek(Turtle zofka) {
        //Domeček:
        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
        //Stříška:
        zofka.turnLeft (60);
        zofka.move(50);
        zofka.turnRight(120);
        zofka.move(50);
        zofka.turnLeft(150);
    }

    private static void nakresliOsmiuhelnik(Turtle zofka) {
        for (int i = 0; i < 8; i++) {
            zofka.move(30);
            zofka.turnRight(45);
        }
    }

    private static void nakresliSlunce(Turtle zofka) {
        for (int i = 0; i < 12; i++) {

            for (int j = 0; j < 15; j++) {
                zofka.move(1);
                zofka.turnLeft(2);
            }
                zofka.turnRight(90);
                zofka.move(10);
                zofka.turnRight(180);
                zofka.move (10);
                zofka.turnRight(90);
        }
    }

    private static void nakresliKruznici(Turtle zofka) {
        for (int i = 0; i < 180; i++) {
            zofka.move(1);
            zofka.turnLeft(2);
        }
    }

    private static void nakresliPrasatko(Turtle zofka) {
        zofka.turnRight(180);

        //Domeček:
        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnLeft(90);
        }
        //Stříška:
        zofka.turnRight (60);
        zofka.move(50);
        zofka.turnLeft(120);
        zofka.move(50);


        zofka.turnLeft(30);

        //První noha
        zofka.turnRight(60);
        zofka.move(15);
        zofka.turnRight (180);
        zofka.move (15) ;
        zofka.turnLeft (120);
        zofka.move (15);
        zofka.turnRight (180);
        zofka.move(15);

        //Přesun:
        zofka.turnRight (60);
        zofka.move (50);

        //Druhá noha:
        zofka.turnRight(60);
        zofka.move(15);
        zofka.turnRight (180) ;
        zofka.move (15) ;
        zofka.turnLeft (120);
        zofka.move (15);
        zofka.turnRight (180);
        zofka.move(15);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    }