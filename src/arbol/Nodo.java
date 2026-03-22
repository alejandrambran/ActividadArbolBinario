package arbol;

// Representa cada elemento del árbol
public class Nodo {

    int dato;
    Nodo izquierdo;
    Nodo derecho;

    // Constructor: inicializa el nodo con un valor
    public Nodo(int dato) {
        this.dato = dato;
        this.izquierdo = null;  // inicialmente no tiene hijos
        this.derecho = null;
    }
}