package laboratorio_1_ed;

public class Arbol {

    Nodo raiz;

    // Constructor que inicializa el árbol vacío
    public Arbol() {
        this.raiz = null;
    }

    // Método para insertar un nuevo nodo en el árbol
    public Nodo insertarNodo(String escenario, String enigma, boolean hojaLlegada) {
        Nodo nuevoNodo = new Nodo(escenario, enigma, hojaLlegada);
        if (raiz == null) {
            raiz = nuevoNodo;  // Si el árbol está vacío, este será el primer nodo
        } else {
            insertarEnABB(raiz, nuevoNodo);  // Inserta el nuevo nodo siguiendo la lógica de ABB
        }
        return nuevoNodo;
    }

    // Método recursivo para insertar un nodo en el árbol ABB
    private void insertarEnABB(Nodo actual, Nodo nuevoNodo) {
        // Compara el escenario para decidir en qué subárbol insertar el nuevo nodo
        if (nuevoNodo.escenario.compareTo(actual.escenario) < 0) {
            // El escenario del nuevo nodo es menor, se va al subárbol izquierdo
            if (actual.izquierda == null) {
                actual.izquierda = nuevoNodo;
            } else {
                insertarEnABB(actual.izquierda, nuevoNodo);
            }
        } else {
            // El escenario del nuevo nodo es mayor o igual, se va al subárbol derecho
            if (actual.derecha == null) {
                actual.derecha = nuevoNodo;
            } else {
                insertarEnABB(actual.derecha, nuevoNodo);
            }
        }
    }

    // Método para buscar la hoja de llegada
    public Nodo buscarHojaDeLlegada(Nodo nodo) {
        if (nodo == null || (nodo.izquierda == null && nodo.derecha == null)) {
            return nodo;
        }
        return buscarHojaDeLlegada(nodo.izquierda != null ? nodo.izquierda : nodo.derecha);
    }

    // Método para recorrer el árbol e imprimir los escenarios
    public void recorrerArbol(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.escenario);
            recorrerArbol(nodo.izquierda);
            recorrerArbol(nodo.derecha);
        }
    }
}
