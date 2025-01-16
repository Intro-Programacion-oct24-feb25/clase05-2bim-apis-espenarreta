/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.security.SecureRandom;
// import java.security.*;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeroElementos = 20;
        int limite = 100;
        int [] valores = obtenerValores(numeroElementos, limite);

        
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%d ", valores[i]);
        }
        System.out.println("\n");
    }
    
    public static int[] obtenerValores(int a, int b) {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();
        
        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int [] valores = new int [a];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = numerosAleatorios.nextInt(b);
        }
        
        return valores;
    }
    
    public static int obtenerSuma(int a, int b){
        return a + b;
    }
    
}
