package laboratorio_1_ed;

import java.util.Scanner;

public class Juego {

    private Arbol arbol;  // Instancia del árbol
    private Nodo nodoActual;  // El nodo donde está el jugador
    private Acertijo acertijos;  // Instancia de la clase Acertijo para manejar los acertijos
    private int respuestasCorrectas;
    private int respuestasIncorrectas;

    // Constructor que acepta una instancia de Acertijo
    public Juego(Acertijo acertijos) {
        this.acertijos = acertijos;
        arbol = new Arbol();
        respuestasCorrectas = 0;
        respuestasIncorrectas = 0;
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
                mostrarResultados();
                break;
            }

            System.out.println("Estás en: " + nodoActual.escenario);
            System.out.println("Acertijo: " + nodoActual.enigma);  // Mostrar el acertijo actual

            // Entrada del usuario para responder el acertijo
            System.out.println("Tu respuesta: ");
            String respuesta = sc.nextLine().toLowerCase();
            if (verificarRespuesta(respuesta)) {
                System.out.println("Respuesta correcta!");
                respuestasCorrectas++;
            } else {
                System.out.println("Respuesta incorrecta.");
                respuestasIncorrectas++;
            }

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

    // Método para verificar la respuesta del usuario
    private boolean verificarRespuesta(String respuesta) {
        // Aquí se puede implementar la lógica para verificar la respuesta del acertijo
        // Actualmente siempre devuelve true para propósitos de ejemplo
        return true;
    }

    // Método para mostrar los resultados finales
    private void mostrarResultados() {
        System.out.println("Resultados finales:");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
