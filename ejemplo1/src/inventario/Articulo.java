package inventario;

/**
 *
 * @author adan
 */
public class Articulo {
    private String nombre;
    private String categoria;
    private int referencia;
    private int cantidad;
    private int punitario;

    public Articulo() {
    }

    public Articulo(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public Articulo(String nombre, String categoria, int referencia, int cantidad, int punitario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.punitario = punitario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPunitario() {
        return punitario;
    }

    public void setPunitario(int punitario) {
        this.punitario = punitario;
    }
    
}
