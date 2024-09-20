package laboratorio_1_ed;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Acertijo {
 private List<AcertijoPregunta> acertijosDisponibles;
    private List<AcertijoPregunta> acertijosUsados;
    private String dificultadSeleccionada;

    public Acertijo() {
        acertijosDisponibles = new ArrayList<>();
        acertijosUsados = new ArrayList<>();
        agregarAcertijos(); // Llamada correcta aquí
    }

    public class AcertijoPregunta {

        private String pregunta;
        private String respuestaCorrecta;
        private String[] opciones;

        public AcertijoPregunta(String pregunta, String respuestaCorrecta, String[] respuestasIncorrectas) {
            this.pregunta = pregunta;
            this.respuestaCorrecta = respuestaCorrecta;
            // Combinar respuesta correcta con incorrectas
            opciones = new String[respuestasIncorrectas.length + 1];
            opciones[0] = respuestaCorrecta;
            System.arraycopy(respuestasIncorrectas, 0, opciones, 1, respuestasIncorrectas.length);
            // Mezclar las opciones (opcional)
            mezclarOpciones();
        }

        public String getPregunta() {
            return pregunta;
        }

        public String getRespuesta() {
            return respuestaCorrecta;
        }

        public String[] getOpciones() {
            return opciones;
        }

        private void mezclarOpciones() {
            // Aquí puedes implementar un algoritmo para mezclar las opciones
        }
    }

    private void agregarAcertijos() {
        // Aquí agregar acertijos a acertijosDisponibles
       acertijosDisponibles.add(new AcertijoPregunta("¿Cuántas patas tiene una araña?", "Ocho", new String[]{"Seis", "Siete"}));
            acertijosDisponibles.add(new AcertijoPregunta("Mucho de eso te mata, pero nada también. Lo tenemos todos. ¿Qué es?", "Agua", new String[]{"Comida", "Sol"}));
            acertijosDisponibles.add(new AcertijoPregunta("Cuando cae del cielo, todo florece en el suelo. ¿Qué es?", "Lluvia", new String[]{"Sol", "Nieve"}));
            acertijosDisponibles.add(new AcertijoPregunta("Verde es en primavera, marrón en otoño, se cae en invierno y renace en abril. ¿Qué es?", "Hoja", new String[]{"Hierba", "Flor"}));
            acertijosDisponibles.add(new AcertijoPregunta("Sin ser ni humano ni animal, ilumina el bosque de foco en foco. ¿Qué es?", "Luciérnaga", new String[]{"Lámpara", "Estrella"}));
            acertijosDisponibles.add(new AcertijoPregunta("Vive en la copa de los árboles, salta de rama en rama y le encanta la banana. ¿Qué es?", "Mono", new String[]{"Loro", "Perezoso"}));
            acertijosDisponibles.add(new AcertijoPregunta("Flota sobre el agua en ríos tropicales, su piel es gruesa y sus dientes son afilados. ¿Qué es?", "Cocodrilo", new String[]{"Hipopótamo", "Tiburón"}));
            acertijosDisponibles.add(new AcertijoPregunta("Tiene caparazón, es lento y viaja por agua y tierra. ¿Qué es?", "Tortuga", new String[]{"Cangrejo", "Erizo"}));
            acertijosDisponibles.add(new AcertijoPregunta("¡Es un animal parlanchín!", "Loro", new String[]{"Mono", "Perro"}));
            acertijosDisponibles.add(new AcertijoPregunta("Es un animal que se camufla ante depredadores", "Camaleón", new String[]{"Serpiente", "Conejo"}));
            acertijosDisponibles.add(new AcertijoPregunta("No tiene piernas, pero puede desplazarse hábilmente", "Serpiente", new String[]{"Anguila", "Gusano"}));
            acertijosDisponibles.add(new AcertijoPregunta("Tiene una lengua pegajosa que atrapa insectos", "Rana", new String[]{"Lagartija", "Salamandra"}));
            acertijosDisponibles.add(new AcertijoPregunta("De color verde y cola larga, se desliza entre las ramas y se alimenta de insectos y frutas. ¿Qué es?", "Iguana", new String[]{"Serpiente", "Lagartija"}));
            acertijosDisponibles.add(new AcertijoPregunta("Es una linda ave generalmente de color azul y amarillo", "Guacamaya", new String[]{"Cacatúa", "Flamenco"}));
            acertijosDisponibles.add(new AcertijoPregunta("Es un insecto responsable por la generación de miel", "Abeja", new String[]{"Avispa", "Hormiga"}));
            acertijosDisponibles.add(new AcertijoPregunta("Flor bella de color magenta", "Orquídea", new String[]{"Girasol", "Rosa"}));
            acertijosDisponibles.add(new AcertijoPregunta("Esta flor sigue el trayecto de nuestra estrella", "Girasol", new String[]{"Rosa", "Tulipán"}));
            acertijosDisponibles.add(new AcertijoPregunta("Es un felino ágil y fuerte, sus manchas lo ayudan a camuflarse entre los árboles. ¿Qué es?", "Jaguar", new String[]{"Tigre", "Leopardo"}));
            acertijosDisponibles.add(new AcertijoPregunta("Tiene alas hermosas y vuela entre flores", "Mariposa", new String[]{"Libélula", "Mosca"}));
            acertijosDisponibles.add(new AcertijoPregunta("Es una flor que solo se abre de noche", "Flor nocturna o flor de cactus", new String[]{"Rosa", "Dalia"}));

    }

    public void setDificultad(String dificultad) {
        this.dificultadSeleccionada = dificultad;
        System.out.println("Dificultad seleccionada: " + dificultad);
        reiniciarAcertijos();
    }

    public AcertijoPregunta obtenerAcertijoAleatorio() {
        if (!acertijosDisponibles.isEmpty()) {
            int indiceAleatorio = new Random().nextInt(acertijosDisponibles.size());
            AcertijoPregunta acertijoSeleccionado = acertijosDisponibles.get(indiceAleatorio);
            acertijosDisponibles.remove(indiceAleatorio);
            acertijosUsados.add(acertijoSeleccionado);
            return acertijoSeleccionado;
        } else {
            System.out.println("No hay acertijos disponibles.");
            return null;
        }
    }

    private void reiniciarAcertijos() {
        acertijosDisponibles.clear();
        acertijosUsados.clear();
        agregarAcertijos(); // Aquí debes agregar los acertijos de la dificultad seleccionada
        System.out.println("Acertijos disponibles cargados: " + acertijosDisponibles.size());
    }
    
}
