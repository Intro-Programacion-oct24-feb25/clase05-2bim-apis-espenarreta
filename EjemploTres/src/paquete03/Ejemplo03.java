/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import org.apache.commons.lang3.math.NumberUtils;
/**
 *
 * @author utpl
 */
public class Ejemplo03 {
    public static void main(String[] args) {
        String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"};
        int [] datoF = new int [6];
        for (int i = 0; i < datoF.length; i++) {
            datoF [i] = NumberUtils.toInt(dataInicial[i]);
        }
        
        for (int i = 0; i < datoF.length; i++) {
            System.out.printf("%d\n", datoF[i]);
        }
    }
}
