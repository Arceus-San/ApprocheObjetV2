package fr.ubordeaux.ao;

public class Line extends Forme{
    int x2;
    int y2;

    public Line(int x1, int y1, int x2, int y2){
        super(x1,y1);
        this.x2=x2;
        this.y2=y2;
    }

    public String toSVG(){
        return "";
    }


}