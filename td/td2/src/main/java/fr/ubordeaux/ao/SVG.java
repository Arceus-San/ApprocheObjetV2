package fr.ubordeaux.ao;

import java.util.ArrayList;
import java.util.List;

import fr.ubordeaux.ao.Forme;

public class SVG {
    private int width;
    private int heigth;
    private ArrayList<Forme> liste;

    public SVG(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
        this.liste=new ArrayList<Forme>();
    }

    public void addForme(Forme f){
        this.liste.add(f);
    }

    public void affiche(){
        System.out.println("<svg width="+this.width+" heigth="+this.heigth+" >");
        int y=this.liste.size();
        for(int i=0;i<y;i++){
            System.out.println(this.liste.get(i).toSVG());
        }
    }

    
}