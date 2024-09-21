package laboratorio_1_ed;

public class Nodo {

    public String escenario;  // Nombre del escenario o mundo
    Nodo izquierda, derecha;  // Hijos izquierdo y derecho (decisiones del jugador)
    boolean hojaLlegada;  // Marca si es la "Hoja de Llegada"
    String enigma;  // Acertijo asociado al nodo
    public int id;  // Añade un atributo para el ID

    // Constructor
    public Nodo(String escenario, String enigma, boolean hojaLlegada, int id) {
        this.escenario = escenario;
        this.enigma = enigma;
        this.hojaLlegada = hojaLlegada;
        this.id = id;  // Asigna el ID
        izquierda = derecha = null;
    }
}
