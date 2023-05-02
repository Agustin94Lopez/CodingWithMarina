package UF4.Figuras;

public class Rectangulo{

    public int base;
    public int altura;
    public String color;
    public Rectangulo (){}
    public Rectangulo (int b, int h) {

        base= b;
        altura= h;
    }
    public Rectangulo(String c){
        color= c;
    }

    public Rectangulo(String c,int b, int h){

        color= c;
        base= b;
        altura=h;
    }
}





