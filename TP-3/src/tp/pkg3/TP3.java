/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author usuario
 */
public class TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //1-a)
        String texto = "trabajo practico tres";
        char letra = 'a';
        int numeroDeVeces = contarCaracteres(texto, letra);
        System.out.print("La letra " + letra + " aparece " + numeroDeVeces + " veces\n ");

        //1-b)
        int a = 1, b = 3, c = 2;
        String orden = "decreciente";
        ordenarNumeros(orden, a, b, c);
        
        //1-c)
        int[] lista = {5,5,5};
        int numeroSuma = 5;
        sumarNumero(lista, numeroSuma);
        
        //1-d)
        String nombres = "Eric Paulina Milena Sandra Alberto Eduardo Lucia Luis Rosa Hector";
        String[] array = nombres.split(" ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " / ");
        }
    }

    /*1-a)*/
    public static int contarCaracteres(String texto, char letra) {
        int posicion, contador = 0;
        posicion = texto.indexOf(letra);
        while (posicion != -1) {
            contador++;
            posicion = texto.indexOf(letra, posicion + 1);
        }
        return contador;
    }

    /*1-b)*/
    public static void ordenarNumeros(String orden, int num1, int num2, int num3) {
        Integer [] vector = {num1, num2, num3};
        if (orden == "ascendiente") {
            Arrays.sort(vector);
            System.out.println(Arrays.toString(vector));
        }
        if (orden == "decreciente") {
            Arrays.sort(vector, Collections.reverseOrder());      
                System.out.println(Arrays.toString(vector));
        }

    }
    
    /*1-c)*/
    public static void sumarNumero(int[] numeros, int suma){
        int acumulador = 0;
        for(int i = 0; i<numeros.length;i++){
            acumulador += numeros[i];
        }
        System.out.println(acumulador + suma);
    }
}
