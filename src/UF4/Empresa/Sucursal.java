package UF4.Empresa;

public class Sucursal {
    public String nombre;
    public String direccion;
    public String telefono;
    public String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void descansa (Transportista t){

    }

    public void trabaja (Transportista t){

    }
    public void altaCliente(Cliente c){

    }

    public void bajaCliente (Cliente c){

    }
    public void AltaEncargo(Cliente c, Transportista t, Encargo e){

    }

    public void anularElEncargo(Encargo e){

    }



    public Sucursal(){}

}
