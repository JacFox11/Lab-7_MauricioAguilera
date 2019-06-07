
import java.util.ArrayList;


public class Orden {
    private Platillo entrada;
    private Platillo sopa;
    private Platillo fuerte;
    private Platillo postre;

    public Orden(Platillo entrada, Platillo sopa, Platillo fuerte, Platillo postre) {
        this.entrada = entrada;
        this.sopa = sopa;
        this.fuerte = fuerte;
        this.postre = postre;
    }

    public Platillo getEntrada() {
        return entrada;
    }

    public void setEntrada(Platillo entrada) {
        this.entrada = entrada;
    }

    public Platillo getSopa() {
        return sopa;
    }

    public void setSopa(Platillo sopa) {
        this.sopa = sopa;
    }

    public Platillo getFuerte() {
        return fuerte;
    }

    public void setFuerte(Platillo fuerte) {
        this.fuerte = fuerte;
    }

    public Platillo getPostre() {
        return postre;
    }

    public void setPostre(Platillo postre) {
        this.postre = postre;
    }
    
    
}
