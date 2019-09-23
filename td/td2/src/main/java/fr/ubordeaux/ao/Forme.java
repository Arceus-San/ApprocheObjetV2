package fr.ubordeaux.ao;

public abstract class Forme{
    protected int x;
    protected int y;

    public Forme(int x, int y){
        this.x=x;
        this.y=y;
    }

    public abstract String toSVG();

}