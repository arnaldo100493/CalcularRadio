/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author abarrime
 */
public class Radio {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio ");
        int radio = sc.nextInt();
        System.out.println("El area de la circunferencia es: " + (Math.PI * radio * radio));
    }

}
