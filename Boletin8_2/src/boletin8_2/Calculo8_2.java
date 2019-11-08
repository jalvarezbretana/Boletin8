/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_2;

import java.util.Scanner;

/**
 *
 * @author jalvarezbretana
 */
public class Calculo8_2 {

    Scanner sc = new Scanner(System.in);
    private float total;

    public void calculo() {

        System.out.println("Cantas unidades compraches?");
        int unidade = sc.nextInt();
        
        System.out.println("Cal é o precio de cada unidade");
        float precio = sc.nextFloat();
        
        if (unidade < 100) {
            total = unidade * precio;
        } else if (unidade < 200) {
            if (precio > 4000) {
                total = precio * unidade * 0.95f;
            
            } else {
                total = precio * unidade * 0.98f;
            }

        } else if (unidade >= 200) {
            if (precio > 4000) {
                total = precio * unidade * 0.9f;
            } else {
                total = precio * unidade * 0.92f;
            }

        }
        System.out.println("A cantidade de unidades é " + unidade);
        System.out.println("O precio por unidade é " + precio+"€");
        System.out.println("Desconto é " + (precio * unidade - total)+"€");
        System.out.println("O precio é " + total+"€");
    }

}
