/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mish.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> pendientes = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n===== CONTROL DE ACTIVIDADES =====");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas pendientes");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese la tarea: ");
                    String tarea = entrada.nextLine();
                    pendientes.add(tarea);
                    System.out.println("Tarea agregada.");
                    break;

                case 2:
                    if (pendientes.isEmpty()) {
                        System.out.println("No hay tareas pendientes.");
                    } else {
                        System.out.println("\nTareas pendientes:");

                        for (int i = 0; i < pendientes.size(); i++) {
                            System.out.println(i + " - " + pendientes.get(i));
                        }
                    }
                    break;

                case 3:
                    if (pendientes.isEmpty()) {
                        System.out.println("No hay tareas pendientes.");
                    } else {
                        System.out.println("\nTareas pendientes:");

                        for (int i = 0; i < pendientes.size(); i++) {
                            System.out.println(i + " - " + pendientes.get(i));
                        }

                        System.out.print("Ingrese el indice de la tarea completada: ");
                        int indice = entrada.nextInt();

                        if (indice >= 0 && indice < pendientes.size()) {
                            System.out.println("Tarea completada: " + pendientes.get(indice));
                            pendientes.remove(indice);
                        } else {
                            System.out.println("Indice no valido.");
                        }
                    }
                    break;

                case 4:
                    if (pendientes.isEmpty()) {
                        System.out.println("No hay tareas para eliminar.");
                    } else {
                        System.out.println("\nTareas pendientes:");

                        for (int i = 0; i < pendientes.size(); i++) {
                            System.out.println(i + " - " + pendientes.get(i));
                        }

                        System.out.print("Ingrese el indice de la tarea que desea eliminar: ");
                        int indice = entrada.nextInt();

                        if (indice >= 0 && indice < pendientes.size()) {
                            pendientes.remove(indice);
                            System.out.println("Tarea eliminada.");
                        } else {
                            System.out.println("Indice no valido.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Programa terminado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 5);

        entrada.close();
    }
}
