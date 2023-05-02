package UF4.ProjecteFigura;

import UF4.Figuras.Rectangulo;

public class MainFigura {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(6,8);
        t1.imprimirDatos();

        rectangulo r2= new rectangulo(12,8);
        r2.imprimirDatos();

        Trapezio t2= new Trapezio(14,5,7);
        t2.imprimirDatos();

        Rombo r1= new Rombo(34,25);
        r1.imprimirDatos();

        Paralelogramo p1= new Paralelogramo(12,31);
        p1.imprimirDatos();

        circulo c1= new circulo(235);
        c1.imprimirDatos();

        cuadrado c2= new cuadrado(23);
        c2.imprimirDatos();
    }
}
