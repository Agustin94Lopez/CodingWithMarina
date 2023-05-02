package UF4.Figuras;

public class FigurasMain {
    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo();
            r1.color = "azul";

       Rectangulo r2 = new Rectangulo();
            r2.base=5;
            r2.altura=3;
            r2.color= "verde";

     /*   Rectangulo r2 = new Rectangulo(5,3);
        r2.color= "verde";*/

       /* Rectangulo r3 = new Rectangulo();
            r3.base=6;
            r3.altura=4;
            r3.color= "rosa"; */

        Rectangulo r3= new Rectangulo("rosa",6,4);


        Cuadrado c1= new Cuadrado(3,"rojo");

        Triangulo t1= new Triangulo(4,4,3, "verde");

        Circulo ci1= new Circulo(2.5,"azul");
    }
}
