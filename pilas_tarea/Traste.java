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

}

//
//Nodo newNode = new Nodo();
//        newNode.setValor(valor);
//
//        
//        if (this.Vacia()) {
//            this.cima = newNode;
//            this.largo++;
//            return;
//        }
//
//        if (!valor.esColon()) {
//            newNode.setSiguiente(this.cima);
//            this.cima = newNode;
//            this.largo++;
//            return;
//        }
//        
//        
//        
//        Nodo previousNext = this.cima.getSiguiente();
//        
//        this.cima.setSiguiente(newNode);
//        newNode.setSiguiente(previousNext);
//        
//        this.largo++;