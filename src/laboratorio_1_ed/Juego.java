package laboratorio_1_ed;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
        // Crear los nodos
        Nodo nodo1 = arbol.insertarNodo("Bosque Encantado", acertijos.obtenerAcertijoAleatorio().getPregunta(), false);
        Nodo nodo2 = arbol.insertarNodo("Cueva Misteriosa", acertijos.obtenerAcertijoAleatorio().getPregunta(), false);
        Nodo nodo3 = arbol.insertarNodo("Lago Cristalino", acertijos.obtenerAcertijoAleatorio().getPregunta(), false);
        Nodo nodo4 = arbol.insertarNodo("Montaña Mística", acertijos.obtenerAcertijoAleatorio().getPregunta(), false);
        Nodo nodo5 = arbol.insertarNodo("Ruinas Antiguas", acertijos.obtenerAcertijoAleatorio().getPregunta(), false);
        Nodo nodo6 = arbol.insertarNodo("Cascada Brillante", acertijos.obtenerAcertijoAleatorio().getPregunta(), false);
        Nodo nodo7 = arbol.insertarNodo("Templo Secreto", acertijos.obtenerAcertijoAleatorio().getPregunta(), false);
        Nodo nodo8 = arbol.insertarNodo("Desierto Perdido", acertijos.obtenerAcertijoAleatorio().getPregunta(), false);
        Nodo nodo9 = arbol.insertarNodo("Cueva Oculta", acertijos.obtenerAcertijoAleatorio().getPregunta(), false);
        Nodo nodo10 = arbol.insertarNodo("Santuario Oscuro", acertijos.obtenerAcertijoAleatorio().getPregunta(), false);
        Nodo nodo11 = arbol.insertarNodo("Valle Escondido", acertijos.obtenerAcertijoAleatorio().getPregunta(), false);
        Nodo nodo12 = arbol.insertarNodo("Fortaleza Antigua", acertijos.obtenerAcertijoAleatorio().getPregunta(), false);
        Nodo nodo13 = arbol.insertarNodo("Jardín Místico", acertijos.obtenerAcertijoAleatorio().getPregunta(), false);
        Nodo nodo14 = arbol.insertarNodo("Bosque Tenebroso", acertijos.obtenerAcertijoAleatorio().getPregunta(), false);
        Nodo hojaDeLlegada = arbol.insertarNodo("Torre del Hechicero", acertijos.obtenerAcertijoAleatorio().getPregunta(), true);

        // Conectar los nodos
        nodo1.izquierda = nodo2;
        nodo1.derecha = nodo3;
        nodo2.izquierda = nodo4;
        nodo2.derecha = nodo5;
        nodo3.izquierda = nodo6;
        nodo3.derecha = nodo7;
        nodo4.izquierda = nodo8;
        nodo4.derecha = nodo9;
        nodo5.izquierda = nodo10;
        nodo5.derecha = nodo11;
        nodo6.izquierda = nodo12;
        nodo6.derecha = nodo13;
        nodo7.izquierda = nodo14;
        nodo7.derecha = hojaDeLlegada;

        nodoActual = arbol.raiz;  // El jugador comienza en la raíz del árbol
    }

    // Método para comenzar el juego
    public void iniciar() {

        JOptionPane.showMessageDialog(null, "¡Bienvenido a la Aventura en el Bosque Misterioso!");

        while (true) {
            if (nodoActual.hojaLlegada) {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Has llegado a la Hoja de Llegada.");
                mostrarResultados();
                break; // Terminar el juego cuando se llega a la hoja final
            }

            // Mostrar escenario y acertijo
            JOptionPane.showMessageDialog(null, "Estás en: " + nodoActual.escenario + "\nAcertijo: " + nodoActual.enigma);

            // Solicitar respuesta del usuario
            System.out.println("Llegó a la respuesta"); // Debugging
            String respuesta = JOptionPane.showInputDialog(null, "Tu respuesta:");
            String respuestaCorrecta = acertijos.obtenerAcertijoAleatorio().getRespuesta();

            if (respuesta != null && respuesta.equalsIgnoreCase(respuestaCorrecta)) {
                JOptionPane.showMessageDialog(null, "Respuesta correcta!");
                respuestasCorrectas++;
                puntaje += 3;
            } else {
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Intenta con otro acertijo.");
                respuestasIncorrectas++;
                if (respuestasIncorrectas % 3 == 0) {
                    puntaje -= 1;  // Penalización por múltiples errores
                }
                continue;  // Volver a solicitar la respuesta con un nuevo acertijo
            }

            // Verificar si el jugador está en un nodo sin salida
            if (!nodoActual.hojaLlegada && (nodoActual.izquierda == null && nodoActual.derecha == null)) {
                JOptionPane.showMessageDialog(null, "No has llegado a la Hoja de Llegada. Sigue buscando.");
            }

            // Muestra los nodos hasta el punto actual
            JOptionPane.showMessageDialog(null, "Estos son los escenarios que has visitado hasta ahora:");
            arbol.recorrerArbol(nodoActual);

            // Buscar y mostrar la Hoja de Llegada real
            Nodo hojaDeLlegada = arbol.buscarHojaDeLlegada(arbol.raiz);
            JOptionPane.showMessageDialog(null, "La Hoja de Llegada está en: " + hojaDeLlegada.escenario);

            // Navegar al siguiente nodo (Izquierda, Derecha, Salir)
            String[] opciones = {"Izquierda", "Derecha", "Salir"};
            int eleccion = JOptionPane.showOptionDialog(null, "¿A dónde quieres ir?", "Decisión",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            // Manejar la elección del jugador
            if (eleccion == 2) {  // Salir
                mostrarResultados();
                break;  // Termina el ciclo y el juego
            } else if (eleccion == 0 && nodoActual.izquierda != null) {
                nodoActual = nodoActual.izquierda;
            } else if (eleccion == 1 && nodoActual.derecha != null) {
                nodoActual = nodoActual.derecha;
            } else {
                JOptionPane.showMessageDialog(null, "No hay camino en esa dirección.");
            }
        }
    }

// Método para verificar la respuesta del usuario
    private boolean verificarRespuesta(String respuesta) {
        // Lógica simple para verificar respuestas (puede mejorarse)
        return respuesta.contains("bro") || respuesta.contains("segundos") || respuesta.contains("aguja");
    }

    // Método para mostrar los resultados finales
    private void mostrarResultados() {
        System.out.println("Fin del juego.");
        System.out.println("Puntaje total: " + puntaje);
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }

    public void setDificultad(String dificultad) {
        acertijos.setDificultad(dificultad);
    }

    public boolean moverIzquierda() {
        if (nodoActual.izquierda != null) {
            nodoActual = nodoActual.izquierda;
            return true;
        }
        return false;
    }

    public boolean moverDerecha() {
        if (nodoActual.derecha != null) {
            nodoActual = nodoActual.derecha;
            return true;
        }
        return false;
    }

    public String getNodoActualEscenario() {
        return nodoActual.escenario;
    }

    public String getNodoActualEnigma() {
        return nodoActual.enigma;
    }

}
