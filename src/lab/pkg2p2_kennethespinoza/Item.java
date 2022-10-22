
package lab.pkg2p2_kennethespinoza;

public class Item {

    private int precio;
    private String nombre;
    
    public Item(String n ,int p) {
        precio = p;
        nombre = n;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int p) {
        precio = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    

    
    
}
