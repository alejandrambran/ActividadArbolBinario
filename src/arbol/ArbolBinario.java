package arbol;

// Maneja toda la lógica del árbol
public class ArbolBinario {

    Nodo raiz;

    // Constructor: crea un árbol vacío
    public ArbolBinario() {
        raiz = null;
    }

    // Metodo para insertar un dato
    public void insertar(int dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    // Metodo recursivo para ubicar el nodo correctamente
    private Nodo insertarRecursivo(Nodo actual, int dato) {

        // Si el nodo está vacío, se crea uno nuevo
        if (actual == null) {
            return new Nodo(dato);
        }

        // Si el dato es menor, va al subárbol izquierdo
        if (dato < actual.dato) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, dato);
        }
        // Si es mayor, va al subárbol derecho
        else if (dato > actual.dato) {
            actual.derecho = insertarRecursivo(actual.derecho, dato);
        }

        // Se retorna el nodo actual
        return actual;
    }

    // Metodo para recorrer el árbol en inorden
    public void inorden() {
        inordenRecursivo(raiz);
    }

    // Recorre: izquierda → raíz → derecha
    private void inordenRecursivo(Nodo actual) {

        if (actual != null) {

            inordenRecursivo(actual.izquierdo); // izquierda

            System.out.print(actual.dato + " "); // raíz

            inordenRecursivo(actual.derecho); // derecha
        }
    }

    // Metodo para buscar un número
    public boolean buscar(int dato) {
        return buscarRecursivo(raiz, dato);
    }

    // Metodo recursivo de búsqueda
    private boolean buscarRecursivo(Nodo actual, int dato) {

        // Si no se encuentra el nodo
        if (actual == null) {
            return false;
        }

        // Si se encuentra el dato
        if (dato == actual.dato) {
            return true;
        }

        // Si es menor, buscar a la izquierda
        if (dato < actual.dato) {
            return buscarRecursivo(actual.izquierdo, dato);
        }

        // Si es mayor, buscar a la derecha
        return buscarRecursivo(actual.derecho, dato);
    }
}