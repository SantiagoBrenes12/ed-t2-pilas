package pilas_tarea;

public class Traste {
    String tipo;
    int cubiertos;

    public Traste() {
    }

    public Traste(String tipo, int cubiertos) {
        this.tipo = tipo;
        this.cubiertos = cubiertos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCubiertos() {
        return cubiertos;
    }

    public void setCubiertos(int cubiertos) {
        this.cubiertos = cubiertos;
    }
    
    public void agregarCubiertos(int cubiertosASumar){
        this.cubiertos = this.cubiertos + cubiertosASumar;
    }

    public boolean tieneCubiertos(){
        if (this.cubiertos > 0){
            return true;
        }else{
            return false;
        }
    }
    
    public void quitarCubiertos(){
        this.setCubiertos(0);
    }
}
