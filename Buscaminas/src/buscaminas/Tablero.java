
package buscaminas;

import java.util.Random;

public class Tablero {
    
    private Emoji miEmoji;
    private Crono miCronometro;
    private Contador miContador;
    private Celda[][] misCeldas;
    Random llenado = new Random();
    
    public Tablero(int ancho, int largo){
        
        misCeldas=new Celda[ancho][largo];
        
        int fila;
        int columna;
        
        for(fila=0;fila<largo;fila++){
            for (columna=0;columna<ancho;columna++){
                
                misCeldas[fila][columna]=new Celda();
            }    
        }
        Sembrador miTrabajador=new Sembrador();
        miTrabajador.sembrarCorazones(misCeldas,5);
    }
}



