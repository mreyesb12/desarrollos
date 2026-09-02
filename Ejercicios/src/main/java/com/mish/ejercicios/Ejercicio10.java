/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mish.ejercicios;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio10 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random aleatorio = new Random();

        for (int i = 0; i < 20; i++) {
            int numero = aleatorio.nextInt(100) + 1;
            numeros.add(numero);
        }

        System.out.println("20 numeros aleatorios:");

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
