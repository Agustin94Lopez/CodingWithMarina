package RegistroNotas;

public class RegistreNotes {
    public static void main(String[] args) {
        Minim mini= new Minim();
        Mitjana Mit= new Mitjana();
        Maxima maxi= new Maxima();
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        double max = maxi.calcularMaxim(notes);
        double min = mini.calcularMinim(notes);
        double mitjana = Mit.calcularMitjana(notes);
        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }

}

