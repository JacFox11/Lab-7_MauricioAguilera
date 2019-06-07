
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AdminPlatillo {
    private File archivo;
    private ArrayList  <Platillo> platillos = new ArrayList();

    public AdminPlatillo(String path) {
        archivo = new File (path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(ArrayList<Platillo> platillos) {
        this.platillos = platillos;
    }
    
    public void setPlatillo (Platillo p) {
        platillos.add(p);
    }
    
    public void cargarArchivo() {
        try {            
            platillos = new ArrayList();
            Platillo temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Platillo) objeto.readObject()) != null) {
                        platillos.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Platillo t : platillos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (IOException ex) {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
}
