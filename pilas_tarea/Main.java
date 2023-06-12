package pilas_tarea;

import pilas_tarea.Pilas.Pila;

public class Main {

    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.push(new Traste("Vaso", 0));
        pila.push(new Traste("Vaso", 2));
        pila.push(new Traste("Plato", 3));
        pila.push(new Traste("Vaso", 1));
        pila.push(new Traste("Vaso", 0));
        pila.push(new Traste("Plato", 6));

        pila.listar();
    }
}
