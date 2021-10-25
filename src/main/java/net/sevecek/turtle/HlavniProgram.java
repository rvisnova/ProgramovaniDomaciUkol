package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {
    Turtle zofka;
    public void main(String[] args) {

        zofka = new Turtle();

        zofka.setLocation(350, 300);
        nakresliRovnoramennyTrojuhelnik(150, 100, 109.471, 141.058);

        }
    public void nakresliCtverec(double velikostStrany) {
        for (int i = 0; i <4; i++){
            zofka.move(velikostStrany);
            zofka.turnRight(90);
        }
    }
    public void nakresliObdelnik(double velikostStranyA,
                                 double velikostStranyB) {
        for (int i = 0; i < 2; i++) {
            zofka.move(velikostStranyA);
            zofka.turnRight(90);
            zofka.move(velikostStranyB);
            zofka.turnRight(90);
        }
    }
    public void nakresliKolecko(double polomer){
        for (int i = 0; i<360; i++) {
            zofka.move(polomer * 0.0174);
            zofka.turnRight(1);
        }
    }
    public void nakresliRovnoramennyTrojuhelnik(double stranaA, double stranaC,
                                                double uhelAlfa, double uhelGama){
                zofka.move(stranaA);
        zofka.turnLeft(uhelGama);
        zofka.move(stranaA);
        zofka.turnLeft(uhelAlfa);
        zofka.move(stranaC);
        zofka.turnLeft(uhelAlfa);
    }
    }
