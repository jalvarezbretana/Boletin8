/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_3;

import java.util.Scanner;

/**
 *
 * @author jalvarezbretana
 */
public class Calculo8_3 {

    Scanner sc = new Scanner(System.in);
    int mes;

    public void mensual() {
        System.out.println("Dime el número del mes del cual quieres saber los días, Enero=1, Febrero=2, etc");
        mes = sc.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Enero tiene 31 días");
                break;
            case 2:
                System.out.println("Febrero tiene 28 días");
                break;
            case 3:
                System.out.println("Marzo tiene 31 días");
                break;
            case 4:
                System.out.println("Abril tiene 30 días");
                break;
            case 5:
                System.out.println("Mayo tiene 31 días");
                break;
            case 6:
                System.out.println("Junio tiene 30 días");
                break;
            case 7:
                System.out.println("Julio tiene 31 días");
                break;
            case 8:
                System.out.println("Agosto tiene 31 días");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 días");
                break;
            case 10:
                System.out.println("Octubre tiene 31 días");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 días");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 días");
                break;
        }
    }
}
