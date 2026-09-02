/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mish.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {

    static class Empleado {

        String nombre;
        double salario;

        public Empleado(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        System.out.print("Cuantos empleados desea ingresar: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();

        double sumaSalarios = 0;

        for (int i = 0; i < cantidad; i++) {

            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese el salario: ");
            double salario = entrada.nextDouble();
            entrada.nextLine();

            Empleado empleado = new Empleado(nombre, salario);
            empleados.add(empleado);

            sumaSalarios += salario;
        }

        double promedio = sumaSalarios / empleados.size();

        System.out.println("\nEmpleados ingresados:");

        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.nombre);
            System.out.println("Salario: " + empleado.salario);
            System.out.println();
        }

        System.out.println("Promedio de salarios: " + promedio);

        entrada.close();
    }
}
