package edu.ejercicios;

import edu.ejemplo.clsEjemplo;
import edu.EjercicioClase.clsEjercicioClase;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import edu.ejemplo.clsEjemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        //System.out.print("Ingrese a: ");
        //String a = br.readLine();
        //System.out.print("Ingrese b: ");
        //String b = br.readLine();



        int varA, varB;
        varA=Integer.valueOf(a).intValue();
        varB=Integer.valueOf(b).intValue();




        clsEjemplo ej = new clsEjemplo();
        ej.calculo(varA,varB);

        System.out.print("Ingrese el radio: ");
        String a = br.readLine();

        clsEjercicioClase ej1 = new clsEjercicioClase();
        ej1.ejercicio1(varA);


    }
}