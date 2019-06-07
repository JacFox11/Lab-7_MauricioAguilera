
import java.awt.Color;
import java.util.Date;


public class Platillo {
    private String nombre;
    private int tiempo;
    private int ID;
    private Date fecha;
    private Color color;
    private String tipo;

    public Platillo(String nombre, int tiempo, int ID, Date fecha, Color color, String tipo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.ID = ID;
        this.fecha = fecha;
        this.color = color;
        this.tipo = tipo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
