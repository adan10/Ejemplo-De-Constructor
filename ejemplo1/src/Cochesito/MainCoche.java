
package Cochesito;

import javax.swing.JOptionPane;

/**
 *
 * @author adan
 */
public class MainCoche {
    public static void main(String[] args) {
        
        Coche ob =new Coche();
        JOptionPane.showMessageDialog(null, "Primer constructor por defecto \n"+ob.getModelo()+"," +ob.getAño()+ "," + ob.getGasolina());
        
        Coche ob1=new Coche(100);
        JOptionPane.showMessageDialog(null, "Litros de Gasolina \n" + ob1.getGasolina());
        
        Coche ob2 = new Coche(100, "Mazda");
        JOptionPane.showMessageDialog(null, "Litros de Gasolina \n" + ob2.getGasolina()+ "\n Modelo del Coche \n " +ob2.getModelo() );
        
       Coche ob3 = new  Coche(100,  "Mazda" ,2017);
       JOptionPane.showMessageDialog(null, "litros de Gasolina \n" +ob3.getGasolina() + "\n Modelo del Coche \n" +ob3.getModelo()+ "\n Año del Cohe \n" +ob3.getAño() );
    }   
    
}
