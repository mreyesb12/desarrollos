/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mish.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.print("Cuantos nombres desea ingresar: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            String nombre = entrada.nextLine();
            nombres.add(nombre);
        }

        System.out.print("Ingrese el nombre que desea buscar: ");
        String buscar = entrada.nextLine();

        if (nombres.contains(buscar)) {
            System.out.println("El nombre existe en la lista.");
        } else {
            System.out.println("El nombre no existe en la lista.");
        }

        entrada.close();
    }
}
