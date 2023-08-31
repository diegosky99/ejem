package co.com.udem.model;

public class Lechuga {
    private  String nombre;
    private  int edad;
    private  String tipo;
    private  int prom_vida;

    public Lechuga(String nombre, int edad, String tipo, int prom_vida) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.prom_vida = prom_vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getProm_vida() {
        return prom_vida;
    }

    public void setProm_vida(int prom_vida) {
        this.prom_vida = prom_vida;
    }


}
