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
        else{
            newNode.setSiguiente(this.cima);
            this.cima = newNode;
            
            if(valor.tieneCubiertos()){
                Traste nodoActual = this.cima.getValor();
                Traste nodoAnterior = this.cima.getSiguiente().getValor();
                
                int cubiertosNodoAnterior = nodoAnterior.getCubiertos();
                nodoAnterior.quitarCubiertos();
                
                nodoActual.agregarCubiertos(cubiertosNodoAnterior);
            }
        }
        
        
        this.largo++;
    }

    public void listar() {
        // Crea una copia de la pila.
        Nodo nodoActual = this.cima;
        // Recorre la pila hasta el ultimo node.
        while (nodoActual != null) {
            Traste traste = nodoActual.getValor();
            
            
            System.out.println("|\t" + traste.getTipo()+ " con " + traste.getCubiertos() + " cubiertos" +"\t|");
            System.out.println("-----------------\n");
            
            nodoActual = nodoActual.getSiguiente();
        }
    }
}