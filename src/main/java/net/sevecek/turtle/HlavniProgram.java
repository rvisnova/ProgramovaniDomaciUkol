package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

         //Rovnoramenny trojuhelnik
//        zofka.move(150);
//        zofka.turnLeft(141.058);
//        zofka.move(150);
//        zofka.turnLeft(109.471);
//        zofka.move(100);
//        zofka.turnLeft(109.471);

        //Ctverec
//        for (int i = 0; i <4; i++){
//            zofka.move(100);
//            zofka.turnRight(90);
//        }

        //Obdelnik
//        for (int i = 0; i < 2; i++) {
//            zofka.move(150);
//            zofka.turnRight(90);
//            zofka.move(100);
//            zofka.turnRight(90);
//        }

        for (int i = 0; i<360; i++) {
            zofka.move(100 * 0.0174);
            zofka.turnRight(1);
        }

        }
    }
