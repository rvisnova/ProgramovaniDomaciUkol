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

        for (int i = 0; i <4; i++){
            zofka.move(100);
            zofka.turnRight(90);
        }

        }
    }
