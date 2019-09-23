package fr.ubordeaux.ao;

public class Rectangle extends Forme{
    int width;
    int height;

    public Rectangle(int x, int y, int w, int h){
        super(x,y);
        this.width=w;
        this.height=h;
    }

    public String toSVG(){
        StringBuffer sb=new StringBuffer();
        sb.append("<rectangle x=");
        sb.append(this.x);
        sb.append(" y=");
        sb.append(this.y);
        sb.append(" width=");
        sb.append(this.width);
        sb.append(" height=");
        sb.append(this.height);
        sb.append(" >");
        return sb.toString();
    }

}