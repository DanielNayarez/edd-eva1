/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_arreglos_size;

import java.util.Arrays;

/**
 *
 * @author nayar
 */
public class EVA1_7_ARREGLOS_SIZE {

    public static void main(String[] args) {
        int[] original = new int [10];
        for(int i = 0; i < original.length; i++){// Llenar con datos aleatorios
            original[i] = (int)(Math.random()*100);
        }
        for(int i = 0; i < original.length; i++){// Imprimir 
            System.out.println("["+ original[i] + "]");
        }
        System.out.println("");
        // Cambiar el tamaño (no se puede)
        // Respaldo
        int[] copia = original; // copia la direccion del arreglo original
        original = new int [5];
        System.out.println(original);
        //Transferir la informacion
        for(int i = 0; i < original.length; i++){
            original[i] = copia[i];
        }
        for(int i = 0; i < original.length; i++){// Imprimir arreglo "modificado"
            System.out.println("["+ original[i] + "]");
        }
        
    }
    
}
