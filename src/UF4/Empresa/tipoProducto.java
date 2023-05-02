package UF4.Empresa;

public class tipoProducto {
    public String nombre;
    public int codigoIdentificador;
    public double precio;
    public int stock;
    public boolean aLaVenta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(int codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isaLaVenta() {
        return aLaVenta;
    }

    public void setaLaVenta(boolean aLaVenta) {
        this.aLaVenta = aLaVenta;
    }

    public tipoProducto(){}
}
