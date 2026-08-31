/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_1_scope;

/**
 *
 * @author nayar
 */
public class EVA1_1_SCOPE {
    public static void main(String[] args) {
        int x = 100;// Existe dentro del bloque del main ()
        for(int i = 0; i > 10; i++){ // Existe solo dentro del for
            System.out.println("i = " + i);
            x++;// Visible dentro del for
        }
        System.out.println("Valor final de la i = "+ i);// Ya No existe
        System.out.println("Valor final de la x = "+ x); // Todavia existe
    }
    
    public static void OtraFuncion () {
        System.out.println("Valor de x " +  x ); // No existe
        
    }
    
}
