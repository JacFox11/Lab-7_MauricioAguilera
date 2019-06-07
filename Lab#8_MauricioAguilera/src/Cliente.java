
import java.util.ArrayList;


public class Cliente {
    private String nombre;
    private int edad;
    private String genero;
    private Orden orden;

    public Cliente(String nombre, int edad, String genero, Orden orden) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.orden = orden;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    
    
    
    
}
