/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_4_objects;

/**
 *
 * @author nayar
 */
public class EVA_4_OBJECTS {

    public static void main(String[] args) {
     Prueba prueba = new Prueba();
        System.out.println(prueba);
        // Eliminar Prueba
        // Terminar el programa --> garbage collector (libera memoria automaticamente)
        // Eliminar directamente el objeto
        prueba = null;
    }
}
class Prueba{
    
}
