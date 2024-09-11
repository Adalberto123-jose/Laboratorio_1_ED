package laboratorio_1_ed;

import java.util.Scanner;

public class Juego {

    Arbol arbol;  // Instancia del árbol
    Nodo nodoActual;  // El nodo donde está el jugador
    Acertijo acertijos;  // Instancia de la clase Acertijo para manejar los acertijos

    // Constructor
    public Juego() {
        arbol = new Arbol();
        acertijos = new Acertijo();  // Inicializar la clase de acertijos
        inicializarJuego();
    }

    // Método para inicializar el juego con algunos nodos y acertijos
    public void inicializarJuego() {
        Nodo nodo1 = arbol.insertarNodo("Bosque Encantado", acertijos.obtenerAcertijoAleatorio(), false);
        Nodo nodo2 = arbol.insertarNodo("Cueva Misteriosa", acertijos.obtenerAcertijoAleatorio(), false);
        Nodo nodo3 = arbol.insertarNodo("Lago Cristalino", acertijos.obtenerAcertijoAleatorio(), false);
        Nodo hojaDeLlegada = arbol.insertarNodo("Torre del Hechicero", acertijos.obtenerAcertijoAleatorio(), true);

        // Conectar nodos
        nodo1.izquierda = nodo2;
        nodo1.derecha = nodo3;
        nodo2.izquierda = hojaDeLlegada;

        nodoActual = arbol.raiz;  // El jugador comienza en la raíz del árbol
    }

    // Método para comenzar el juego
    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenido a la Aventura en el Bosque Misterioso!");

        while (true) {
            if (nodoActual.hojaLlegada) {
                System.out.println("¡Felicidades! Has llegado a la Hoja de Llegada.");
                break;
            }

            System.out.println("Estás en: " + nodoActual.escenario);
            System.out.println("Acertijo: " + nodoActual.enigma);  // Mostrar el acertijo actual

            // Entrada del jugador para decidir hacia dónde ir
            System.out.println("Elige 'izquierda', 'derecha' o 'salir': ");
            String eleccion = sc.nextLine().toLowerCase();

            if (eleccion.equals("salir")) {
                System.out.println("Gracias por jugar. ¡Hasta la próxima!");
                break;
            } else if (eleccion.equals("izquierda") && nodoActual.izquierda != null) {
                nodoActual = nodoActual.izquierda;
            } else if (eleccion.equals("derecha") && nodoActual.derecha != null) {
                nodoActual = nodoActual.derecha;
            } else {
                System.out.println("No puedes ir en esa dirección. Intenta de nuevo.");
            }
        }
        sc.close();
    }
}
