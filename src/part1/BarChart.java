package part1;

import TurtleGraphics.*;
import BreezySwing.*;
import java.awt.Color;
import java.util.Scanner;

public class BarChart {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SketchPadWindow spw = new SketchPadWindow(800, 600);
        Pen p = new StandardPen(spw);

        int bar1, bar2, bar3, bar4;
        System.out.println("Enter width for bar 1: >");
        bar1 = s.nextInt();
        System.out.println("Enter width for bar 2: >");
        bar2 = s.nextInt();
        System.out.println("Enter width for bar 3: >");
        bar3 = s.nextInt();
        System.out.println("Enter width for bar 4: >");
        bar4 = s.nextInt();
        
        
       
        makeBar(p, -200, -250, bar2, Color.red);
        makeBar(p, -100, -250, bar1, Color.blue);
        makeBar(p, 0, -250, bar3, Color.green);
        makeBar(p, 100, -250, bar4, Color.yellow);
        p.up();
        p.move(400,-250);
        p.setColor(Color.black);
        p.down();
        p.move(-400,-250);

    }

    public static void makeBar(Pen p, int xloc, int yloc, int length, Color col) {
        p.up();
        p.move(xloc, yloc);
        p.down();
        p.setWidth(10);
        p.setColor(col);
        p.setDirection(90);
        p.move(length);
        p.up();
        p.move(15);
        p.down();
        p.drawString(length + "");
    }

}
