package pilas_tarea.Pilas;

import pilas_tarea.Traste;

public class Pila {

    private Nodo cima; //top
    private int largo;

    public Pila() {
        this.cima = null;
        this.largo = 0;
    }

    public boolean Vacia() {
        return cima == null;
    }

    public int tamanio() {
        return this.largo;
    }

    public void push(Traste valor) {
        Nodo newNode = new Nodo();
        newNode.setValor(valor);

        
        if (this.Vacia()) {
            this.cima = newNode;
        }
        if (!valor.tieneCubiertos) {
            newNode.setSiguiente(this.cima);
            this.cima = newNode;
            this.largo++;
            return;
        }
        
        
        
        Nodo previousNext = this.cima.getSiguiente();
        
        this.cima.setSiguiente(newNode);
        newNode.setSiguiente(previousNext);
        
        this.largo++;
      
    }

    public void listar() {
        // Crea una copia de la pila.
        Nodo aux = cima;
        // Recorre la pila hasta el ultimo node.
        while (aux != null) {
            System.out.println("|\t" + aux.getValor().getTipo()+ "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
}