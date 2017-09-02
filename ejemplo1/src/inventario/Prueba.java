package inventario;

import javax.swing.JOptionPane;

/**
 *
 * @author adan
 */
public class Prueba {
        public static void main(String[] args) {
        Articulo ob=new Articulo();
        
            JOptionPane.showMessageDialog(null, "por defecto " +ob.getNombre()+"," +ob.getCategoria());
            
            Articulo ob1 = new Articulo("pasta de dientes", "dentifricos");
            
             JOptionPane.showMessageDialog(null, "Dos Parametros " +ob1.getNombre()+"," +ob1.getCategoria()+ "," +ob1.getReferencia());
           
             Articulo obj2 = new Articulo("llantas", "automotores", 0003, 200, 150);
             
                JOptionPane.showMessageDialog(null, "Dos Parametros " +obj2.getNombre()+"," +obj2.getCategoria()+ "," +obj2.getReferencia() + "," +obj2.getPunitario() + "," +obj2.getCantidad());
         
    }
        
}
