package UF4.Agenda;

public class Pagina {

    public int dia;
    public int mes;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }


    public void añadirCita(Cita c){

    }

    public void borrarCita(Cita c){

    }

    public Cita buscarCita(String titulo){
        Cita c = new Cita();
        return c;
    }
    public Pagina(){}
}
