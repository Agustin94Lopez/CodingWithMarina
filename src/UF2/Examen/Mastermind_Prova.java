package UF2.Examen;
import java.util.Scanner;


//Un programa para jugar al MasterMind.
public class Mastermind_Prova {
    //Constants
    public final static char TOT_CORRECTE = '0';
    public final static char MALA_POSICIO = 'X';
    public final static char INCORRECTE = '-';
    public final int LONG_SECRET = 3;
    public final static String abc = "abcdefghijklmnopqrstuvwxyz";
    public static String secreto = "Agustin";
    public static String respuesta = "";

    //Mètodes associats al problema general
    public static void main(String[] args) {
        Mastermind_Prova programa = new Mastermind_Prova();
        programa.inicio();
    }


    public void inicio() {
        boolean end= false;
        generarParaulaSecreta();
        while (!end){
            preguntarRespuesta();
            end = resoldreResposta(secreto, respuesta);
        }

    }


    //Mètodes associats al primer nivell de descomposició
    //Param. entrada:
    //Param. sortida:


    public String generarParaulaSecreta() {
        String res = "";
        for (int i = 0; i < LONG_SECRET; i++) {
            res = res + generarLletraAleatoria();
        }
        return res;
    }

    //Param. entrada: cap, tot s’obté del teclat
    // Param. sortida: la paraula de resposta (un String)
    public String preguntarRespuesta() {
        System.out.println("Escribe la palabra secreta: ");
        Scanner palabrita= new Scanner(System.in);
        respuesta = palabrita.nextLine();
        return respuesta;
        //desenvolupeu el codi d'aquesta funció
     }

    //Param. entrada: String secret, String resposta
    //Param. sortida: boolean

    public boolean resoldreResposta(String secreto, String respuesta) {
        String res = generarPista(secreto, respuesta);
        boolean fi = false;
        System.out.print("La resposta és [" + res + "].");
        if (respuesta.equals(secreto)){
            System.out.println("Has encertat!");
            fi = true;
        } else {
            System.out.println("Continua intentant−ho!");
        }
        return fi;
    }

    //Mètodes associats al segon nivell de descomposició
    //Param. entrada:-
    //Param. sortida: char (letra aleatoria de la solucion)
    public char generarLletraAleatoria() {
        long nano = System.nanoTime();
        int index = (int) (nano % abc.length());
        return abc.charAt(index);
    }

    //Param. entrada: String resposta
    //Param. sortida: boolean
    public boolean comprobarRespuesta(String respuesta) {
        if (respuesta.length() != LONG_SECRET) {
            return false;
        }
        for (int i = 0; i < respuesta.length(); i++) {
            char c = respuesta.charAt(i);
            if ( -1 == abc.indexOf(c)){
                return false;
            }
        }
        return true;
    }

    //Param. entrada: string s, string r
    //Param. sortida: string
    public String generarPista(String s, String r) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char charSecreto = s.charAt(i);
            char charRespuesta = r.charAt(i);
            if (charSecreto == charRespuesta) {
                res = res + TOT_CORRECTE;
            }
            else if (s.indexOf(charRespuesta) != - 1){
                res = res + MALA_POSICIO;
            }
            else {
                res = res + INCORRECTE;
            }
        }
        return res;
    }
}