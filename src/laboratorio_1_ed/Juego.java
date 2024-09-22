package laboratorio_1_ed;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Juego {

    private Arbol arbol; 
    public Nodo nodoActual; 
    private Acertijo acertijos;  // Instancia de la clase Acertijo para manejar los acertijos
    private Acertijo.AcertijoPregunta acertijoActual;  // Se guarda el acertijo actual para verificar la respuesta
    public int respuestasCorrectas;
    public int respuestasIncorrectas;
    public int puntaje;

    
    public Juego() {
        arbol = new Arbol();
        acertijos = new Acertijo(); 
        respuestasCorrectas = 0;
        respuestasIncorrectas = 0;
        puntaje = 0;
        inicializarJuego();
    }

    // Se inicializa el juego con métodos y acertijos
    public void inicializarJuego() {
       
        Nodo nodo1 = arbol.insertarNodo("Bosque Encantado", acertijos.obtenerAcertijoAleatorio().getPregunta(), false,1);
        Nodo nodo2 = arbol.insertarNodo("Cueva Misteriosa", acertijos.obtenerAcertijoAleatorio().getPregunta(), false,2);
        Nodo nodo3 = arbol.insertarNodo("Lago Cristalino", acertijos.obtenerAcertijoAleatorio().getPregunta(), false,3);
        Nodo nodo4 = arbol.insertarNodo("Montaña Mística", acertijos.obtenerAcertijoAleatorio().getPregunta(), false,4);
        Nodo nodo5 = arbol.insertarNodo("Ruinas Antiguas", acertijos.obtenerAcertijoAleatorio().getPregunta(), false,5);
        Nodo nodo6 = arbol.insertarNodo("Cascada Brillante", acertijos.obtenerAcertijoAleatorio().getPregunta(), false,6);
        Nodo nodo7 = arbol.insertarNodo("Templo Secreto", acertijos.obtenerAcertijoAleatorio().getPregunta(), false,7);
        Nodo nodo8 = arbol.insertarNodo("Desierto Perdido", acertijos.obtenerAcertijoAleatorio().getPregunta(), false,8);
        Nodo nodo9 = arbol.insertarNodo("Cueva Oculta", acertijos.obtenerAcertijoAleatorio().getPregunta(), false,9);
        Nodo nodo10 = arbol.insertarNodo("Santuario Oscuro", acertijos.obtenerAcertijoAleatorio().getPregunta(), false,10);
        Nodo nodo11 = arbol.insertarNodo("Valle Escondido", acertijos.obtenerAcertijoAleatorio().getPregunta(), false,11);
        Nodo nodo12 = arbol.insertarNodo("Fortaleza Antigua", acertijos.obtenerAcertijoAleatorio().getPregunta(), false,12);
        Nodo nodo13 = arbol.insertarNodo("Jardín Místico", acertijos.obtenerAcertijoAleatorio().getPregunta(), false,13);
        Nodo nodo14 = arbol.insertarNodo("Bosque Tenebroso", acertijos.obtenerAcertijoAleatorio().getPregunta(), false,14);
        Nodo hojaDeLlegada = arbol.insertarNodo("Torre del Hechicero", acertijos.obtenerAcertijoAleatorio().getPregunta(), true,15);

        
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

        nodoActual = arbol.raiz;  
        acertijoActual = acertijos.obtenerAcertijoAleatorio();  
    }

    public void iniciar() {

        JOptionPane.showMessageDialog(null, "¡Bienvenido a la Aventura en el Bosque Misterioso!");

        actualizarPregunta();

    }

// Este metodo verifica la respuesta en NivelGO
    public boolean verificarRespuesta(String respuesta) {
        return respuesta.equalsIgnoreCase(acertijoActual.getRespuesta());
    }

    public void actualizarPregunta() {

        System.out.println("Se ejecuta el del juego");//Debug, aunque esto en si sirve en NivelGO lol
        JOptionPane.showMessageDialog(null, "Estás en: " + nodoActual.escenario + "\nAcertijo: " + nodoActual.enigma);
    }

    // Este metodo muestra los resultados finales en NivelGO
    public void mostrarResultados() {
        JOptionPane.showMessageDialog(null, "Resultados Finales:\nPuntaje: " + puntaje
                + "\nRespuestas Correctas: " + respuestasCorrectas
                + "\nRespuestas Incorrectas: " + respuestasIncorrectas);
    }

    public void setDificultad(String dificultad) {
        acertijos.setDificultad(dificultad);
    }

    public boolean esHojaDeLlegada() {
        return nodoActual.hojaLlegada;
    }

    public boolean moverIzquierda() {
        if (nodoActual.izquierda != null) {
            nodoActual = nodoActual.izquierda;
            acertijoActual = acertijos.obtenerAcertijoAleatorio();  // Nuevo acertijo para el nuevo nodo
            return true;
        }
        return false;
    }

    public boolean moverDerecha() {
        if (nodoActual.derecha != null) {
            nodoActual = nodoActual.derecha;
            acertijoActual = acertijos.obtenerAcertijoAleatorio();  // Nuevo acertijo para el nuevo nodo
            return true;
        }
        return false;
    }

    public String getNodoActualEscenario() {
        return nodoActual.escenario;
    }

    public String getNodoActualEnigma() {
        return acertijoActual.getPregunta();  // Devolvemos el acertijo actual
    }

    public String obtenerPreguntaActual() {
        return nodoActual.enigma;
    }

    public void generarNuevoAcertijo() {
        acertijoActual = acertijos.obtenerAcertijoAleatorio();  // Se obtiene un nuevo acertijo para el mismo nodo
    }

    public Nodo buscarHojaDeLlegada() {
        return arbol.buscarHojaDeLlegada(arbol.raiz);  // Buscar el nodo de la Hoja de Llegada
    }

}
