package pilas_tarea.Pilas;

import pilas_tarea.Traste;

public class Nodo {
    private Traste valor; //dato
    private Nodo siguiente;
    
    //constructor para inicializar

    public Nodo() {
        this.valor = null;
        this.siguiente = null;
    }

    public Traste getValor() {
        return valor;
    }

    public void setValor(Traste valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
