package fr.ubordeaux.ao;

public class Circle extends Forme{

    int rayon;

    public Circle(int cX, int cY, int rad){
        super(cX,cY);
        this.rayon=rad;
    }

    public String toSVG(){
        StringBuffer sb=new StringBuffer();
        sb.append("<circle x=");
        sb.append(this.x);
        sb.append(" y=");
        sb.append(this.y);
        sb.append(" rayon=");
        sb.append(this.rayon);
        sb.append(" >");
        return sb.toString();
    }

}