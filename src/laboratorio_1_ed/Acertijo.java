package laboratorio_1_ed;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Acertijo {

    // Listas de acertijos categorizados por dificultad
//    private List<String> acertijosMedios;
//    private List<String> acertijosDificiles;
    private List<AcertijoPregunta> acertijosDisponibles;
    private List<AcertijoPregunta> acertijosUsados;
    private String dificultadSeleccionada;

    // Constructor
    public Acertijo() {
//        acertijosMedios = new ArrayList<>();
//        acertijosDificiles = new ArrayList<>();
        acertijosDisponibles = new ArrayList<>();
        acertijosUsados = new ArrayList<>();
        agregarAcertijos();

    }

    private class AcertijoPregunta {

        private String pregunta;   // Almacena la pregunta del acertijo
        private String respuesta;  // Almacena la respuesta correcta del acertijo
        private String[] opciones; // Opciones incorrectas para el acertijo
        String respuestaCorrecta;
        String[] respuestasIncorrectas;

        public AcertijoPregunta(String pregunta, String respuestaCorrecta, String[] respuestasIncorrectas) {
            this.pregunta = pregunta;
            this.respuestaCorrecta = respuestaCorrecta;
            this.respuestasIncorrectas = respuestasIncorrectas;
            this.respuesta = respuesta;
            this.opciones = opciones;
        }
    }

    public String getPregunta() {
        return pregunta;
    }

    // Método para obtener la respuesta (si es necesario)
    public String getRespuesta() {
        return respuesta;
    }

    // Método para obtener las opciones de respuesta
    public String[] getOpciones() {
        return opciones;
    }

    private void agregarAcertijos() {
        // Agregar acertijos con dificultad
        //Acertijos Fáciles
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

        //Acertijos Medios
//        acertijosMedios.add("¿Qué tiene cabeza, pero no cerebro?");// ???
//        acertijosMedios.add("Ave que vuelo ágil y rápido, amante de flores");//Colibri
//        acertijosMedios.add("Fruta energética muy popular en América del Sur, sus frutos son pequeños y oscuros. ¿Qué es?");//Guarana
//        acertijosMedios.add("Insecto pequeño, reconocible instantaneamente por sus antenas y 'pies' ");//Ciempies
//        acertijosMedios.add("Pequeño, peligroso y electrificante");//Anguila electrica
//        acertijosMedios.add("Una de las, sino, la rana más venenosa");//Rana dardo dorada
//        acertijosMedios.add("Rana de piel brillante y dorada. Advertencia para los depredadores sobre su potente veneno");//Rana dorada de Zetek
//        acertijosMedios.add("Insecto pequeño, verde y ruidoso");//Grillo
//        acertijosMedios.add("Pequeño mono que vive en las selvas de América Central y del Sur. Tiene pelaje esponjoso y se balancearme entre los árboles muy bien.");//Tití
//        acertijosMedios.add("Tiene piel de color verde con manchas negras, pasa la mayor parte del tiempo en los árboles. Tiene veneno potente.");//Rana arbórea verde
//        acertijosMedios.add("Cuerpo pequeño de color verde que lo camuflarme entre las hojas. Vive en el suelo del bosque tropical y me alimento de insectos.");//Gecko
//        acertijosMedios.add("Planta trepadora que crece en los árboles del bosque tropical. Hojas con forma de corazón y sus flores son pequeñas y de colores variados.");//El filodendro (Philodendron).
//        acertijosMedios.add("Tronco delgado y corteza de textura rugosa. Crece en los bosques y sus hojas tienen un olor característico.");//Arbol de canela
//        acertijosMedios.add("Piel de color azul brillante y tiene una cola larga y puntiaguda. Es conocido por su agilidad y colores llamativos.");//Lagarto azul
//        acertijosMedios.add("Es un insecto que pasa la mayor parte de su vida en un estado de larva. Tiene movimientos rápidos y se esconde bajo las hojas.");//Escarabajo rinoceronte
//        acertijosMedios.add("Conocido por su habilidad para construir nidos flotantes en los árboles. Plumaje de colores vivos y de canto es distintivo.");//Pajaro tejedor
//        acertijosMedios.add("Cuerpo pequeño y de coloración que imita las hojas secas. Conocido por su habilidad para esconderse.");//Insecto hoja
//        acertijosMedios.add("Vive en los arroyos tropicales y tiene un cuerpo alargado con una piel escamosa. Se alimenta de insectos y pequeños peces. ¿Qué es?");//Dragon de agua
//        acertijosMedios.add("Es un pez con cuerpo alargado y un color brillante. Se alimenta principalmente de otros peces pequeños.");//Pez angel
//        acertijosMedios.add("Insecto que viaja grandes distancias y atrae a su pareja cantando");//Saltamontes
//
//        //Acertijos Dificiles
//        acertijosDificiles.add("¿Qué se puede ver pero no tocar?");// ???
//        acertijosDificiles.add("¿Qué baja pero nunca sube?");//Una fruta
//        acertijosDificiles.add("Es pequeña y colorida, atrae a los colibríes con su dulce néctar. ¿Qué es?");//Flor de hibisco
//        acertijosDificiles.add("Su fruta es grande y espinosa por fuera, pero por dentro es suave y dulce. Su olor es tan fuerte que algunos no lo soportan. ¿Qué es?");//El durián
//        acertijosDificiles.add("Flor que crece en las selvas de Sumatra, de olor potente, como podrido");//Flor cadaver
//        acertijosDificiles.add("Nadador de mordida brutal, comparado a su tamaño diminuto");//Piraña
//        acertijosDificiles.add("Poliniza flores y tiene un gran olfato");//Murcielago nectarivoro
//        acertijosDificiles.add("Es uno de los árboles más grandes de la selva. Su tronco es macizo y sus raíces se extienden muy lejos para buscar agua en la tierra húmeda.");//Arbol de ceiba
//        acertijosDificiles.add("Es un insecto que vive en colonias en los árboles. Construyen grandes nidos de barro y sus picaduras duelen mucho.");//Avispa tropical
//        acertijosDificiles.add("Planta de hojas afiladas, que guarda su agua en si misma.");//Bromelia
//        acertijosDificiles.add("Con ojos prominentes y brillantes, venenosa al tacto");//Rana arborícola venenosa.
//        acertijosDificiles.add("De alas coloridas y vuelo majestuoso, ayuda a polinizar las flores del bosque tropical. Vuela largas distancias y algunas especies migran a través de continentes. ¿Qué es?");//Mariposa monarca
//        acertijosDificiles.add("Sus hojas pueden alcanzar hasta tres metros y sus raíces están diseñadas para aguantar fuertes lluvias y tormentas. ¿Qué es?");//Arbol de pan
//        acertijosDificiles.add("Sus raíces aéreas cuelgan de las ramas de los árboles y ayudan a sostener el dosel en el bosque tropical. Depende de otros arboles. ¿Qué es?");//Epifita
//        acertijosDificiles.add("Sus hojas son carnosas y sus espinas son largas, puede sobrevivir en zonas tropicales secas y se adapta fácilmente al calor intenso. ¿Qué es?");//Catcus saguaro
//        acertijosDificiles.add("Vive en las selvas tropicales y sus colores brillantes advierten a los depredadores. Es pequeño pero con veneno mortal.");//Salamandra venenosa
//        acertijosDificiles.add("Mamifero cuya dieta se basa en frutas y pequeños animales. Vive en las selvas del Amazonas y es bueno escalando.");//Coatí
//        acertijosDificiles.add("Conocido por su piel resbaladiza y sus habilidades para saltar grandes distancias. Su coloración es verde y amarilla.");//Sapo de caña
//        acertijosDificiles.add("Piel brillante, tamaño pequeño, su fama es tan alta como su camuflaje");//Mantis religiosa
//        acertijosDificiles.add("Ave colorida famosa en el folklore");//Tucan        
    }

// Establecer dificultad seleccionada
    public void setDificultad(String dificultad) {
        this.dificultadSeleccionada = dificultad;
        System.out.println("Dificultad seleccionada: " + dificultad);  // Verificar la dificultad
        reiniciarAcertijos(); // Reiniciar la lista de acertijos disponibles según la dificultad
    }

    // Obtener un acertijo aleatorio según la dificultad
    public AcertijoPregunta obtenerAcertijoAleatorio() {
        if (acertijosDisponibles.isEmpty()) {
            System.out.println("Todos los acertijos ya han sido utilizados.");
            return null;
        }

        Random random = new Random();
        int index = random.nextInt(acertijosDisponibles.size());
        AcertijoPregunta acertijoSeleccionado = acertijosDisponibles.get(index);

        acertijosUsados.add(acertijoSeleccionado);
        acertijosDisponibles.remove(index);

        if (!acertijosDisponibles.isEmpty()) {
            int indiceAleatorio = (int) (Math.random() * acertijosDisponibles.size());
            return acertijosDisponibles.get(indiceAleatorio);
        }
        return null;  // Si no hay acertijos disponibles, devuelve null

//        if (acertijosDisponibles.isEmpty()) {
//            System.out.println("Advertencia: ya no hay más acertijos disponibles.");
//        }
//
//        return acertijoSeleccionado;
    }

    // Reiniciar los acertijos disponibles según la dificultad seleccionada
    private void reiniciarAcertijos() {
        acertijosDisponibles.clear();
        acertijosUsados.clear();

        // Rellenar acertijosDisponibles según la dificultad seleccionada
        acertijosDisponibles.addAll(acertijosDisponibles);

        // Verificar que acertijosDisponibles no esté vacía
        if (acertijosDisponibles.isEmpty()) {
            System.out.println("No hay acertijos disponibles para la dificultad seleccionada: " + dificultadSeleccionada);
        } else {
            System.out.println("Acertijos disponibles cargados: " + acertijosDisponibles.size());
        }
    }
}
