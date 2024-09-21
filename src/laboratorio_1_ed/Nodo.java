package laboratorio_1_ed;

public class Nodo {

    public String escenario;  // Nombre del escenario o mundo
    Nodo izquierda, derecha;  // Hijos izquierdo y derecho (decisiones del jugador)
    boolean hojaLlegada;  // Marca si es la "Hoja de Llegada"
    String enigma;  // Acertijo asociado al nodo

    // Constructor
    public Nodo(String escenario, String enigma, boolean hojaLlegada) {
        this.escenario = escenario;
        this.enigma = enigma;
        this.hojaLlegada = hojaLlegada;
        izquierda = derecha = null;
    }
}
