/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE JAVIER
 */
package numeroinvertido;
 
import javax.swing.JOptionPane;
public class OrdenInverso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int numero,i=0,digitos=0;
        String invertido="";
    try {
            
            numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número:"));
            digitos=numero;
            
            while (digitos>=1){
                invertido=invertido+digitos%10;
                digitos=digitos/10;
            }
            JOptionPane.showMessageDialog(null, "El número invertido es: "+invertido);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Formato incorrecto");
        }
    } 
}
    
    
    
    

