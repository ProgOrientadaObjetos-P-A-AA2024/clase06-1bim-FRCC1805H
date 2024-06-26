/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

// Uso de la clase Formatter para escribir datos en un archivo de texto.
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;

import paquete1.Profesor;

public class ArchivoEscritura {

    private String nombreArchivo;
    private String rutaArchivo;
    private Profesor registro;
    private Formatter salidaArchivo;

    public ArchivoEscritura(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s", nombreArchivo); // "data/profesores2.txt"
        
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());;
    }

    public void establecerRegistro(Profesor n) {
        registro = n;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    public Profesor obtenerRegistro() {
        return registro;
    }
    // se estrae los valores de el archivo txt para poder presentar en ejcutor 
    // mediante un arryst
    // agrega registros al archivo
    public void establecerSalida() {
        try {
            salidaArchivo = new Formatter(new FileWriter(rutaArchivo, true));
            Profesor p = obtenerRegistro();
            
            String cadenaRegistro = String.format("%s;%s",
                    p.obtenerNombre(), p.obtenerTipo());
            
            salidaArchivo.format("%s\n", cadenaRegistro);
            salidaArchivo.close();
        } catch (IOException e) {
            System.err.println("Error al crear el archivo.");
            System.err.println(e);

        }

    }

    public void cerrarArchivo() {
        if (salidaArchivo != null) {
            salidaArchivo.close();
        } // cierra el archivo

    }

}
