
package buscaminas;

import java.util.Random;

public class Sembrador {
    
    void sembrarCorazones(Celda lasCeldas[][],int cantidad){
        
        Random aleatorio=new Random(System.currentTimeMillis());
        int coraAleatorio,sumatoria=0;
 
        for(Celda[] laFila:lasCeldas)
        {
            for(Celda laCelda:laFila)
            {
                coraAleatorio=aleatorio.nextInt(10);
                if(coraAleatorio>5 && sumatoria<cantidad){
                Corazon unCorazon=new Corazon();
                laCelda.setMiCorazon(unCorazon);
                sumatoria++;
                }
            }
        }
    }
}



