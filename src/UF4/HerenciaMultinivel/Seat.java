package UF4.HerenciaMultinivel;

public class Seat extends Car{

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void brand() { System.out.println("Brand: Seat"); }
    public void speed() { System.out.println("Max: 120Kmph"); }
}
