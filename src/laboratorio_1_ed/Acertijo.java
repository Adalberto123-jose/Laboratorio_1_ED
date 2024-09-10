package laboratorio_1_ed;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Acertijo {

    private List<String> acertijosDisponibles;  // Lista de acertijos aún no utilizados
    private List<String> acertijosUsados;       // Lista de acertijos ya usados

    // Constructor
    public Acertijo() {
        acertijosDisponibles = new ArrayList<>();
        acertijosUsados = new ArrayList<>();

        // Agregar acertijos a la lista
        acertijosDisponibles.add("¿Cuántas patas tiene una araña?");
        acertijosDisponibles.add("¿Qué tiene cabeza, pero no cerebro?");
        acertijosDisponibles.add("¿Qué se puede ver pero no tocar?");
        acertijosDisponibles.add("¿Qué sube pero nunca baja?");
        // Puedes agregar más acertijos aquí
    }

    // Método para obtener un acertijo aleatorio que no se haya usado
    public String obtenerAcertijoAleatorio() {
        if (acertijosDisponibles.isEmpty()) {
            // Si todos los acertijos ya fueron usados, puedes reiniciar o manejar de otra forma
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

    // Método para reiniciar los acertijos si es necesario (opcional)
    public void reiniciarAcertijos() {
        acertijosDisponibles.addAll(acertijosUsados);
        acertijosUsados.clear();
    }
}
