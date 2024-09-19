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
            // Insertar el nuevo nodo siguiendo la lógica de ABB
            Nodo actual = raiz;
            

            while (true) {
                if (nuevoNodo.escenario.compareTo(actual.escenario) < 0) {
                    if (actual.izquierda == null) {
                        actual.izquierda = nuevoNodo;
                        break;
                    } else {
                        actual = actual.izquierda;
                    }
                } else {
                    if (actual.derecha == null) {
                        actual.derecha = nuevoNodo;
                        break;
                    } else {
                        actual = actual.derecha;
                    }
                }
            }
        }
        return nuevoNodo;
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

    // Método para actualizar un nodo
    public void actualizarNodo(Nodo nodo, String nuevoEscenario, String nuevoEnigma, boolean nuevaHojaLlegada) {
        if (nodo != null) {
            nodo.escenario = nuevoEscenario;
            nodo.enigma = nuevoEnigma;
            nodo.hojaLlegada = nuevaHojaLlegada;
        }
    }

    // Método para eliminar un nodo
    public Nodo eliminarNodo(Nodo raiz, String escenario) {
        if (raiz == null) {
            return null;
        }
        if (escenario.compareTo(raiz.escenario) < 0) {
            raiz.izquierda = eliminarNodo(raiz.izquierda, escenario);
        } else if (escenario.compareTo(raiz.escenario) > 0) {
            raiz.derecha = eliminarNodo(raiz.derecha, escenario);
        } else {
            // Nodo con el escenario encontrado
            if (raiz.izquierda == null) {
                return raiz.derecha;
            } else if (raiz.derecha == null) {
                return raiz.izquierda;
            }
            // Nodo con dos hijos
            Nodo temp = obtenerNodoMinimo(raiz.derecha);
            raiz.escenario = temp.escenario;
            raiz.enigma = temp.enigma;
            raiz.hojaLlegada = temp.hojaLlegada;
            raiz.derecha = eliminarNodo(raiz.derecha, temp.escenario);
        }
        return raiz;
    }

    private Nodo obtenerNodoMinimo(Nodo nodo) {
        while (nodo.izquierda != null) {
            nodo = nodo.izquierda;
        }
        return nodo;
    }
}
