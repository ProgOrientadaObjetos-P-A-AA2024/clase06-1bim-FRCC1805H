/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ejecutor {

    public static void main(String[] args) {
        // listado de variables para ingreso de datos por teclado
        Scanner entrada = new Scanner(System.in);

        ArrayList<Computador> computadoras = new ArrayList<>();

        int limite;
        String cadena1 = "";
        String cadena2 = "";

        System.out.println(" Cuantas computadoras desea ingresar ");
        limite = entrada.nextInt();

        entrada.nextLine();

        for (int i = 0; i < limite; i++) {
            entrada.nextLine();
            System.out.println("Ingrese la Marca del Procesador");
            String marcaprocesador = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Ingrese el Costo del Procesador");
            double costoprocesador = entrada.nextDouble();
            entrada.nextLine();
            Procesador P1 = new Procesador(marcaprocesador, costoprocesador);
            entrada.nextLine();
            System.out.println("Ingrese la marca de la Memoria");
            String marcamemoria = entrada.nextLine();
            System.out.println("Ingrese el Costo de la Memoria");
            double costomemoria = entrada.nextDouble();
            entrada.nextLine();

            Memoria M2 = new Memoria(marcamemoria, costomemoria);

            System.out.println("Ingrese la Marca del Computador");
            String marcacomputador = entrada.nextLine();
            entrada.nextLine();
            //Procesador P1 = new Procesador(marcaprocesador,costoprocesador);
            //Memoria M2 = new Memoria(marcamemoria,costomemoria);
            Computador C3 = new Computador(marcacomputador, P1, M2);
            C3.establecerCostoComputador();
            entrada.nextLine();

            cadena1 = String.format("%s - %s\n", cadena1,C3);
            computadoras.add(C3);
            Venta V4 = new Venta(computadoras);
            V4.establecerValorVenta(C3.obtenerCostoComputador());
            cadena2 = String.format("%s\n", V4);

        }
        
        System.out.printf(" %s - %s \n", cadena1, cadena2);
    }

}
