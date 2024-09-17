package laboratorio_1_ed;

import java.util.Scanner;

public class Juego {

    private Arbol arbol;  // Instancia del árbol
    private Nodo nodoActual;  // El nodo donde está el jugador
    private Acertijo acertijos;  // Instancia de la clase Acertijo para manejar los acertijos
    private int respuestasCorrectas;
    private int respuestasIncorrectas;
    private int puntaje;

    // Constructor que acepta una instancia de Acertijo
    public Juego() {
        arbol = new Arbol();
        acertijos = new Acertijo();  // Inicializar la clase de acertijos
        respuestasCorrectas = 0;
        respuestasIncorrectas = 0;
        puntaje = 0;
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
                puntaje += 3;  // Incrementar puntaje por respuesta correcta
            } else {
                System.out.println("Respuesta incorrecta. Intentaré con otro acertijo.");
                nodoActual.enigma = acertijos.obtenerAcertijoAleatorio();  // Proporcionar nuevo acertijo
                respuestasIncorrectas++;
                if (respuestasIncorrectas % 3 == 0) {
                    puntaje -= 1;  // Penalización por errores múltiples
                }
                continue;
            }

            // Verificar si el jugador llega a un nodo hoja que no es la Hoja de Llegada
            if (!nodoActual.hojaLlegada && (nodoActual.izquierda == null && nodoActual.derecha == null)) {
                System.out.println("No has llegado a la Hoja de Llegada. Sigue buscando.");

                // Muestra los nodos hasta el punto actual
                System.out.println("Estos son los escenarios que has visitado hasta ahora:");
                arbol.recorrerArbol(nodoActual);

                // Busca y muestra la Hoja de Llegada real
                Nodo hojaDeLlegada = arbol.buscarHojaDeLlegada(arbol.raiz);
                System.out.println("La Hoja de Llegada está en: " + hojaDeLlegada.escenario);
            }

        

            // Navegar al siguiente nodo
            System.out.println("¿A dónde quieres ir? (izquierda/derecha/salir)");
            String eleccion = sc.nextLine().toLowerCase();
            if (eleccion.equals("salir")) {
                mostrarResultados();
                break;
            } else if (eleccion.equals("izquierda")) {
                if (nodoActual.izquierda != null) {
                    nodoActual = nodoActual.izquierda;
                } else {
                    System.out.println("No hay un camino a la izquierda.");
                }
            } else if (eleccion.equals("derecha")) {
                if (nodoActual.derecha != null) {
                    nodoActual = nodoActual.derecha;
                } else {
                    System.out.println("No hay un camino a la derecha.");
                }
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }

    // Método para verificar la respuesta del usuario
    private boolean verificarRespuesta(String respuesta) {
        // Lógica simple para verificar respuestas (puede mejorarse)
        return respuesta.contains("futuro") || respuesta.contains("segundos") || respuesta.contains("aguja");
    }

    // Método para mostrar los resultados finales
    private void mostrarResultados() {
        System.out.println("Fin del juego.");
        System.out.println("Puntaje total: " + puntaje);
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
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
