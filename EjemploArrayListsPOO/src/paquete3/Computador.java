/*
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Computador {
   private String marca;
   private Procesador procesador;
   private Memoria memoria;
   private double costoComputador;
   
   public void establecerMarca(String m){
       marca = m;
    }
   
    public void establecerProcesador(Procesador p){
       procesador = p;
    }
   
    public void establecerMemoria(Memoria m){
       memoria = m;
    } 
    
    public void establecerCostoComputador(){
        costoComputador = memoria.obtenerCosto() + procesador.obtenerCosto();
    }
    
    public String obtenerMarca(){
        return marca;
    }
    
    public Procesador obtenerProcesador(){
        return procesador;
    }
    
    public Memoria obtenerMemoria(){
        return memoria;
    }
    
    public double obtenerCostoComputador(){
        return costoComputador;
    }
}
