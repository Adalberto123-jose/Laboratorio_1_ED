package laboratorio_1_ed;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Acertijo {

    // Listas de acertijos categorizados por dificultad
    private List<String> acertijosFaciles;
    private List<String> acertijosMedios;
    private List<String> acertijosDificiles;
    private List<String> acertijosDisponibles;
    private List<String> acertijosUsados;
    private String dificultadSeleccionada;

    // Constructor
    public Acertijo() {
        acertijosFaciles = new ArrayList<>();
        acertijosMedios = new ArrayList<>();
        acertijosDificiles = new ArrayList<>();
        acertijosDisponibles = new ArrayList<>();
        acertijosUsados = new ArrayList<>();

        // Agregar acertijos con dificultad
        acertijosFaciles.add("¿Cuántas patas tiene una araña?");
        acertijosMedios.add("¿Qué tiene cabeza, pero no cerebro?");
        acertijosDificiles.add("¿Qué se puede ver pero no tocar?");
        acertijosDificiles.add("¿Qué sube pero nunca baja?");
        // Puedes agregar más acertijos aquí
    }

    // Establecer dificultad seleccionada
    public void setDificultad(String dificultad) {
        this.dificultadSeleccionada = dificultad;
        reiniciarAcertijos(); // Reiniciar la lista de acertijos disponibles según la dificultad
    }

    // Obtener un acertijo aleatorio según la dificultad
    public String obtenerAcertijoAleatorio() {
        if (acertijosDisponibles.isEmpty()) {
            System.out.println("Todos los acertijos ya han sido utilizados.");
            return null;
        }

        // Selecciona un acertijo aleatorio
        Random random = new Random();
        int index = random.nextInt(acertijosDisponibles.size());
        String acertijoSeleccionado = acertijosDisponibles.get(index);

        // Mueve el acertijo a la lista de usados y elimínalo de la lista disponible
        acertijosUsados.add(acertijoSeleccionado);
        acertijosDisponibles.remove(index);

        return acertijoSeleccionado;
    }

    // Reiniciar los acertijos disponibles según la dificultad seleccionada
    private void reiniciarAcertijos() {
        acertijosDisponibles.clear();
        if (dificultadSeleccionada.equals("fácil")) {
            acertijosDisponibles.addAll(acertijosFaciles);
        } else if (dificultadSeleccionada.equals("medio")) {
            acertijosDisponibles.addAll(acertijosMedios);
        } else if (dificultadSeleccionada.equals("dificil")) {
            acertijosDisponibles.addAll(acertijosDificiles);
        }
        acertijosUsados.clear();
    }
}
