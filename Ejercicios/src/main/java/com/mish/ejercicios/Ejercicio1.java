/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mish.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String elemento;

        do {
            System.out.print("Ingrese un elemento (escriba fin para terminar): ");
            elemento = entrada.nextLine();

            if (!elemento.equalsIgnoreCase("fin")) {
                System.out.println("Elemento ingresado: " + elemento);
            }

        } while (!elemento.equalsIgnoreCase("fin"));

        System.out.println("Programa terminado.");

        entrada.close();
    }
}
