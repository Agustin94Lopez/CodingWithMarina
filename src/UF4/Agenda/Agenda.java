package UF4.Agenda;

public class Agenda {
    int any;
    public int getAny(){
     return any;
    }
    public void setAny(int any){
    this.any= any;
    }
    public void avanzarPagina(){}
    public void retrocederPagina(){}
    public Pagina leerPagina(){
    Pagina p = new Pagina();
    return p;
    }
    public Agenda(){}
}