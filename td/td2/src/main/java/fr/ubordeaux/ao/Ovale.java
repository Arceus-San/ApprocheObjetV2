package fr.ubordeaux.ao;

public abstract class Ovale extends Forme{

    int rayonX;
    int rayonY;

    public Ovale(int x, int y, int rX, int rY){
        super(x,y);
        this.rayonX=rX;
        this.rayonY=rY;
    }

}