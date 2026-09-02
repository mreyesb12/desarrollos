/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mish.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("Cuantos numeros desea ingresar: ");
        int cantidad = entrada.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            int numero = entrada.nextInt();

            numeros.add(numero);
        }

        System.out.println("\nNumeros pares:");

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }

        entrada.close();
    }
}
