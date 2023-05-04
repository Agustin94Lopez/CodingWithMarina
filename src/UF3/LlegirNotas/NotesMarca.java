package UF3.LlegirNotas;

import java.io.File;
import java.util.Scanner;

public class NotesMarca {
    //la paraula fi serveix com a marca de final de fitxer
    public static final String MARCA_FI = "fi";
    public static void main (String[] args) {
        NotesMarca programa = new NotesMarca();
        programa.inici();
    }
    public void inici() {
        try {
            File f = new File("C:\\Users\\Agust\\IdeaProjects\\CodingWithMarina\\src\\UF3\\LlegirNotas\\NotesMarca.txt");
            Scanner lector = new Scanner(f);
            boolean llegir = true;
            while (llegir) {
                String nom = lector.next();
                if (MARCA_FI.equals(nom)) {
                    llegir = false;
                }
                else {
                    String cognom = lector.next();
                    System.out.print("Estudiant: " + nom + " " + cognom);
                    //Noteu com un scanner es pot passar com paràmetre
                    double mitjana = llegirNotes(lector);
                    System.out.println("− Mitjana: " + mitjana);
                }
            }
            //Cal tancar el fitxer
            lector.close();
        }
        catch(Exception e) {
            //Excepció!
            System.out.println("Error llegint estudiants: " + e);
        }
    }

    /** Donat un Scanner en un fitxer quan l’apuntador es troba sobre l’inici
     * de les notes, s’extreuen i es calcula la mitjana.
     *
     * @param lector Scanner a processar
     * @return Mitjana de notes
     */
    public double llegirNotes(Scanner lector) {
        double res = 0;
        try {
            //Es fan lectures. Cal controlar excepcions també!
            double numNotes = lector.nextDouble();
            boolean llegir = true;
            int notas= 0;
            while (numNotes!=(-1)) {
                ++notas;
                res = res + numNotes;
                numNotes = lector.nextDouble();
            }
            res = res / notas;
        }
        catch (Exception e) {
            //Excepció!
            System.out.println("Error llegint notes: " + e);
        }
        return res;
    }
}

