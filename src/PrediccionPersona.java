import UF2.RegistreTemperatures.CalculArees;

import java.util.Scanner;
//Un programa que calcula descomptes.
public class PrediccionPersona {
     private String nombre;
    private String mesNacimiento;
    private int edad;
    private String equipFutbol;
    private String llenguatgeProgramacio;
    private int numSort;

    public static void main(String args[]) {

        PrediccionPersona programa= new PrediccionPersona();
        programa.inicio();
    }
    public void inicio() {
        //declarem l'element scanner per a poder saber què ens escriu l'usuari
        //per terminal
        Scanner s = new Scanner(System.in);

        //demanem a l'usuari el mes en què va nèixer
        System.out.print("Escribe el mes en el que naciste ");
        System.out.print("\n");
        System.out.print("Enero\tFebrero\tMarzo\n");
        System.out.print("Abril\tMayo\tJunio\n");
        System.out.print("Julio\tAgosto\tSeptiembre\n");
        System.out.print("Octubre\tNoviembre\tDiciembre");
        System.out.print("\n\n");

        //recollim la dada a la variable mesNaixement
        mesNacimiento = s.nextLine();

        //demanem a l'usuari el mes en què va nèixer
        System.out.print("\n");
        System.out.print("Como te llamas?\n");

        //recollim la dada a la variable nom
        nombre = s.nextLine();

        //demanem a l'usuari la seva edat
        System.out.print("\n");
        System.out.print("Para terminar, cuantos años tenes?\n");
        //recollim la dada a la variable edat
        edad = s.nextInt();

        System.out.print("\n\n");

        //Inicialitzem les variables que necessitarem per qualsevol cas


        System.out.print("------------------------------------------------\n");

        System.out.print("Un placer conocerte " + nombre + ". Con los datos que me diste, mira lo que descubrimos de ti... \n");
        System.out.print("\n\n");
        elegirMes();
        System.out.print(">>> Tu numero de la suerte es el " + numSort + "!");
        System.out.print("\n\n");

        System.out.print(">>> Tu equipo de fútbol favorito, aunque no lo digas en voz alta, es el " + equipFutbol + ".");
        System.out.print("\n\n");

        System.out.print(">>> Tu lenguaje de programación mas estimado es " + llenguatgeProgramacio + "!");
        System.out.print("\n\n");

        System.out.print("Vuelve cuando quieras!\n");
        System.out.print("------------------------------------------------\n\n\n");

    }
    public void elegirMes(){

        //fem els condicionals necessaris
        if (mesNacimiento.equals("Enero") || mesNacimiento.equals("enero")) {
            Enero();

        }
        else if (mesNacimiento.equals("Febrero")|| mesNacimiento.equals("febrero")){
            Febrero();
        }
        else if (mesNacimiento.equals("Marzo")|| mesNacimiento.equals("marzo")){
           Marzo();
        }
        else if (mesNacimiento.equals("Abril")|| mesNacimiento.equals("abril")){
           Abril();
        }
        else if (mesNacimiento.equals("Mayo")|| mesNacimiento.equals("mayo")){
            Mayo();
        }
        else if (mesNacimiento.equals("Junio")||mesNacimiento.equals("junio")){
            Junio();
        }
        else if (mesNacimiento.equals("Julio")|| mesNacimiento.equals("julio")){
            Julio();
        }
        else if (mesNacimiento.equals("Agosto")|| mesNacimiento.equals("agosto")){
            Agosto();
        }
        else if (mesNacimiento.equals("Septiembre")|| mesNacimiento.equals("septiembre")){
           Septiembre();
        }
        else if (mesNacimiento.equals("Octubre")|| mesNacimiento.equals("octubre")){
           Octubre();
        }
        else if (mesNacimiento.equals("Noviembre")|| mesNacimiento.equals("noviembre")){
            Noviembre();
        }
        else if (mesNacimiento.equals("Diciembre")|| mesNacimiento.equals("diciembre")){
            Diciembre();
        }
        else {
            numSort = 0;
            equipFutbol = "no tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
            llenguatgeProgramacio = "no tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
            System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
        }


    }

    public void Enero() {
        numSort = edad * 3/2;
        equipFutbol = "Bayern de Munich";
        llenguatgeProgramacio = "C++";
    }
    public void Febrero(){
        numSort = edad - 4;
        equipFutbol = "Atlético de Madrid";
        llenguatgeProgramacio = "Python";
    }
    public void Marzo(){
        numSort = edad / 2;
        equipFutbol = "Chelsea";
        llenguatgeProgramacio = "JavaScript";
    }
    public void Abril(){
        numSort = edad % 4;
        equipFutbol = "Manchester city";
        llenguatgeProgramacio = "Node.js";
    }
    public void Mayo(){
        numSort = edad * 3/6;
        equipFutbol = "Liverpool";
        llenguatgeProgramacio = "React";
    }
    public void Junio(){
        numSort = edad + edad;
        equipFutbol = "Real Madrid";
        llenguatgeProgramacio = "C#";
    }
    public void Julio(){
        numSort = edad * edad / 5;
        equipFutbol = "BVB";
        llenguatgeProgramacio = "Swift";
    }
    public void Agosto(){
        numSort = edad * 1/2 * edad;
        equipFutbol = "FCB";
        llenguatgeProgramacio = "Java";
    }
    public void Septiembre(){
        numSort = edad / edad;
        equipFutbol = "Juve";
        llenguatgeProgramacio = "PHP";
    }
    public void Octubre(){
        numSort = edad * 4 / 3;
        equipFutbol = "PSG";
        llenguatgeProgramacio = "R";
    }
    public void Noviembre(){
        numSort = edad % 2 + 23;
        equipFutbol = "Sevilla CF";
        llenguatgeProgramacio = "Go";
    }
    public void Diciembre(){
        numSort = (edad + edad) / 2;
        equipFutbol = "Manchester United";
        llenguatgeProgramacio = "Ruby";
    }


}
