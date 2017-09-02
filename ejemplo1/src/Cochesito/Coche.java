
package Cochesito;

/**
 *
 * @author adan
 */
public class Coche {
    private int Gasolina;
    private String Modelo;
    private int Año;

    //Generamos el primer constructor basio 
    public Coche() {
    }

       //Segundo Constuctor con el primer valor
    public Coche(int Gasolina) {
        this.Gasolina = Gasolina;
    }
    
    //Tercer constructor con los dos pimeros valoress;

    public Coche(int Gasolina, String Modelo) {
        this.Gasolina = Gasolina;
        this.Modelo = Modelo;
    }
    
    //Cuarto Constructor con los tres primeros valores

    public Coche(int Gasolina, String Modelo, int Año) {
        this.Gasolina = Gasolina;
        this.Modelo = Modelo;
        this.Año = Año;
    }
    
    
    

    public int getGasolina() {
        return Gasolina;
    }

    public void setGasolina(int Gasolina) {
        this.Gasolina = Gasolina;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }
    
}

