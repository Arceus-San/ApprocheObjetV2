package fr.ubordeaux.ao;

import fr.ubordeaux.ao.Circle;
import fr.ubordeaux.ao.Rectangle;
import fr.ubordeaux.ao.SVG;

public class Main{
    
    public static void main(String[] args) {
        SVG svg = new SVG(100,100);
        Circle c1 = new Circle(50, 50, 40);
        Rectangle r1 = new Rectangle(10, 10, 100, 60);
        svg.addForme(c1);
        svg.addForme(r1);
        svg.affiche();
    }
}