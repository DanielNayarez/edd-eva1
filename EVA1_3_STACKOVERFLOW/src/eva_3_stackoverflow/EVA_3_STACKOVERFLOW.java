/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_stackoverflow;

/**
 *
 * @author nayar
 */
public class EVA_3_STACKOVERFLOW {
    public static void main(String[] args) {
       A();
    }
    
    public static void A(){
        B();    
    }
    
    public static void B(){
        int i = 5;
        double d = 5.5;
        A();
    }
    
}
