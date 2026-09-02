/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mish.ejercicios;

import java.util.ArrayList;

public class Ejercicio3 {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Mish");
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Luis");
        nombres.add("Sofia");

        System.out.println("Lista de nombres:");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
