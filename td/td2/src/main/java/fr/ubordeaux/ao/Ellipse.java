package fr.ubordeaux.ao;

public class Ellipse extends Circle{

    int rayon2;

    public Ellipse(int rX, int rY, int x, int y){
        super(x,y,rX);
        this.rayon2=rY;
    }
    
    public String toSVG(){
        return "";
    }

}