/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_matrices;

/**
 *
 * @author nayar
 */
public class EVA1_9_MATRICES {

    public static void main(String[] args) {
        int[][] matriz = new int [5][3];
        System.out.println("matriz = " + matriz);
        System.out.println("matriz.lenght = " + matriz.length);
        System.out.println("matriz[0] = " + matriz[0]);
        System.out.println("matriz[0].lenght = " + matriz[0].length);
        System.out.println("matriz[1] = " + matriz[1]);
        System.out.println("matriz[1].lenght = " + matriz[1].length);
        //--------
        
        for(int i = 0; i < matriz[i].length; i++){ // Primera Dimension ---> filas
        for(int j = 0; j < matriz[i].length; j++){ // Segunda Dimension ----> Columnas
                matriz[i][j] = (int)(Math.random()*100);
        }
        }
        for(int i = 0; i < matriz.length; i++){ // Primera Dimension ---> filas
        for(int j = 0; j < matriz[i].length; j++){ // Segunda Dimension ----> Columnas
                System.out.println("[" + matriz[i][j] + "]");
                System.out.println("");
        }
        }
    }
}
