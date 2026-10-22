/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroelectronico;

import java.util.HashMap;
/**
 *
 * @author DELL
 */
public class CajeroElectronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer,Integer> billete=new HashMap<>();
        billete.put(10000, 100);
        billete.put(20000, 100);
        billete.put(50000, 100);
        billete.put(100000, 100);
        
        interfaz4 ventana=new interfaz4();
        ventana.setInventario(billete);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    
}
