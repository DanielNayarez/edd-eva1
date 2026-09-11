/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_5_paso_parametros;

/**
 *
 * @author bisonte
 */
public class EVA_5_PASO_PARAMETROS {

    public static void main(String[] args) {
        int i = 5;
        System.out.println("Valor de i = "+ i);
        incrementar(i);
        System.out.println("Valor de i(despues de incrementar) = "+ i);
        // Ahora paso por referencia
        Prueba prueba = new Prueba();
        System.out.println("Valor de prueba.y = "+ i);
        incrementarObj(prueba);
        System.out.println("Valor de prueba.y (despues de incrementar) = "+ prueba.y);
 
    }
    
    public static void incrementar(int valor){ // Paso por valor (recibo una copia)
        valor++;
    }
    public static void incrementarObj(Prueba objeto){
        objeto.y++;
    }
    
}

class Prueba {
    int y = 5;
}