package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {
    Turtle zofka;

    public void main(String[] args) {

        zofka = new Turtle();

//        zofka.setLocation(300, 350);
//        nakresliKolecko(80);
//        zofka.penUp();
//        for (int i = 0; i < 90; i++) {
//            zofka.move(80 * 0.0174);
//            zofka.turnRight(1);
//        }
//        zofka.turnLeft(180);
//        zofka.penDown();
//        nakresliKolecko(60);
//        zofka.penUp();
//        for (int i = 0; i < 90; i++) {
//            zofka.move(60 * 0.0174);
//            zofka.turnRight(1);
//        }
//        zofka.turnLeft(180);
//        zofka.penDown();
//        nakresliKolecko(20);
//        zofka.penUp();
//        for (int i = 0; i < 180; i++) {
//            zofka.move(60 * 0.0174);
//            zofka.turnLeft(1);
//        }
//        zofka.penDown();
//        nakresliKolecko(20);
//        zofka.penUp();
//        for (int i = 0; i < 90; i++) {
//            zofka.move(60 * 0.0174);
//            zofka.turnLeft(1);
//        }
//        zofka.penDown();
//        nakresliKolecko(40);
//        zofka.turnRight(90);

        zofka.setLocation(50, 230);
        nakresliKolecko(68);
        //85

        zofka.penUp();
        zofka.turnRight(180);
        for (int i = 0; i < 15; i++) {
            zofka.move(68 * 0.0174);
            zofka.turnLeft(1);
        }
        zofka.turnLeft(7.5);
        zofka.penDown();
        nakresliRovnoramennyTrojuhelnik(171.44, 131.2, 112.5, 135);
        //214.3, 164
        zofka.turnLeft(157.5);

    }
        public void nakresliCtverec ( double velikostStrany){
            for (int i = 0; i < 4; i++) {
                zofka.move(velikostStrany);
                zofka.turnRight(90);
            }
        }
        public void nakresliObdelnik ( double velikostStranyA,
        double velikostStranyB){
            for (int i = 0; i < 2; i++) {
                zofka.move(velikostStranyA);
                zofka.turnRight(90);
                zofka.move(velikostStranyB);
                zofka.turnRight(90);
            }
        }
        public void nakresliKolecko ( double polomer){
            for (int i = 0; i < 360; i++) {
                zofka.move(polomer * 0.0174);
                zofka.turnRight(1);
            }
        }
        public void nakresliRovnoramennyTrojuhelnik ( double stranaA, double stranaC,
        double uhelAlfa, double uhelGama){
            zofka.move(stranaA);
            zofka.turnLeft(uhelGama);
            zofka.move(stranaA);
            zofka.turnLeft(uhelAlfa);
            zofka.move(stranaC);
            zofka.turnLeft(uhelAlfa);
        }
}
