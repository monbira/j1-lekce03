package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {

        zofka = new Turtle();
        this.ctverec(100);

        zofka.setLocation(300,400);
        this.ctverec(150);

    }


    public void ctverec (double delkaStrany) {
        zofka.setPenColor(Color.green);
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }

    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
