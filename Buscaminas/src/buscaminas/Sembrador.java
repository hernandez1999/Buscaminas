package buscaminas;

import java.util.Random;

public class Sembrador {

    void sembrarCorazones(Celda lasCeldas[][], int cantidad) {

        Random aleatorio = new Random();
        int coraAleatorio, sumatoria = 0;

        for (Celda[] laFila : lasCeldas) {
            for (Celda laCelda : laFila) {
                
                coraAleatorio = aleatorio.nextInt(9);
                
                if (coraAleatorio > 3 && sumatoria < cantidad) {
                    Corazon unCorazon = new Corazon();
                    laCelda.setMiCorazon(unCorazon);
                    sumatoria++;
                }
            }
        }
    }
    
    void contarCorazones(Celda lasCeldas[][]){

    int suma = 0, x, y, celdaValida;

    for (x=-1;x< 2; x++) {
            for (y = -1; y < 2; y++) {
                
            celdaValida = celdaValida(fila, columna, x, y);
            
            if (celdaValida && Celda[fila + x][columna + y] == 9) {
                suma++;
            }
        }
    }
    return suma;
    }

    void validarCeldas(Celda lasCeldas[][],int fila, int columna, int x, int y){

    int filaValida, columnaValida;

        if(x<0){

                filaValida=(fila+x>-1);

            }else{

                filaValida=(fila+x<9);
            }

        if(y<0){

                columnaValida=(columna+y>-1);

            }else{

                columnaValida=(columna+y<9);
            }

        return filaValida && columnaValida;
}
}