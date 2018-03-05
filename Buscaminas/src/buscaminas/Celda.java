
package buscaminas;

public class Celda {
    
    private Corazon miCorazon;
    private Bandera miBandera;
    private boolean estado;
    private int corazonesAlrededor;      

    public Corazon getMiCorazon() {
        return miCorazon;
    }

    public void setMiCorazon(Corazon miCorazon) {
        this.miCorazon = miCorazon;
    }

    public Bandera getMiBandera() {
        return miBandera;
    }

    public void setMiBandera(Bandera miBandera) {
        this.miBandera = miBandera;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCorazonesAlrededor() {
        return corazonesAlrededor;
    }

    public void setCorazonesAlrededor(int corazonesAlrededor) {
        this.corazonesAlrededor = corazonesAlrededor;
    }
    
    

}
