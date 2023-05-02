package herenciaSimpleActividad;

public class Persona {

    private int id;
    private int edad;
    private String Nom;
    private String Congnom;

    private String Direccion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getCongnom() {
        return Congnom;
    }

    public void setCongnom(String congnom) {
        Congnom = congnom;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}
