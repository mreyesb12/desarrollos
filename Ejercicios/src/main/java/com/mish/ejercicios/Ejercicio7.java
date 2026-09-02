/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mish.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> calificaciones = new ArrayList<>();

        System.out.print("Cuantas calificaciones desea ingresar: ");
        int cantidad = entrada.nextInt();

        double suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la calificacion " + (i + 1) + ": ");
            double calificacion = entrada.nextDouble();

            calificaciones.add(calificacion);
            suma += calificacion;
        }

        double promedio = suma / calificaciones.size();

        System.out.println("\nCalificaciones ingresadas:");

        for (Double calificacion : calificaciones) {
            System.out.println(calificacion);
        }

        System.out.println("\nPromedio: " + promedio);

        entrada.close();
    }
}
