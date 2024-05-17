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
   
    public Computador(String mc, Procesador p,Memoria m){
        marca = mc;
        procesador = p;
        memoria = m;
    }
    
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
    
    @Override
    public String toString() {
        String cadena = String.format("Marca Computadora: %s\n"
                + "Marca Memoria: %s\nMarca Procesador: %s\nCosto Memoria: %.2f"
                + "\nCosto Procesador: %.2f\nCosto Computador: %.2f\n"
                ,obtenerMarca(),obtenerMemoria().obtenerMarca()
                ,obtenerProcesador().obtenerMarca()
                ,obtenerMemoria().obtenerCosto()
                ,obtenerProcesador().obtenerCosto()
                ,obtenerCostoComputador());
        return cadena;
    }
}
