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

        agregarAcertijos();

    }

    private void agregarAcertijos() {
        // Agregar acertijos con dificultad
        //Acertijos Fáciles
        acertijosFaciles.add("¿Cuántas patas tiene una araña?");//Seis, creo
        acertijosFaciles.add("Mucho de eso te mata, pero nada tambien. Lo tenemos todos. ¿Qué es?");//Agua
        acertijosFaciles.add("Cuando cae del cielo, todo florece en el suelo. ¿Qué es?");//Lluvia
        acertijosFaciles.add("Verde es en primavera, marrón en otoño, se cae en invierno y renace en abril. ¿Qué es?");//Hoja
        acertijosFaciles.add("Sin ser ni humano ni animal, ilumina el bosque de foco en foco. ¿Qué es?");//Luciernaga
        acertijosFaciles.add("Vive en la copa de los árboles, salta de rama en rama y le encanta la banana. ¿Qué es?");//Mono
        acertijosFaciles.add("Flota sobre el agua en ríos tropicales, su piel es gruesa y sus dientes son afilados. ¿Qué es?");//Cocodrilo
        acertijosFaciles.add("Tiene caparazón, es lento y viaja por agua y tierra. ¿Qué es?");//Tortuga
        acertijosFaciles.add("¡Es un animal parlanchin!");//Loro
        acertijosFaciles.add("Es un animal que se camufla ante depredadores");//Camaleon
        acertijosFaciles.add("No tiene piernas, pero puede desplazarse habilmente");//Serpiente
        acertijosFaciles.add("Tiene una lengua pegajosa que atrapa inscetos");//Rana
        acertijosFaciles.add("De color verde y cola larga, se desliza entre las ramas y se alimenta de insectos y frutas. ¿Qué es?");//Iguana
        acertijosFaciles.add("Es una linda ave generalmente de color azul y amarillo");//Guacamaya
        acertijosFaciles.add("Es un insecto responsable por la generacion de miel");//Abeja
        acertijosFaciles.add("Flor bella de color magenta");//Orquidea
        acertijosFaciles.add("Esta flor sigue el trayecto de nuestra estrella");//Girasol
        acertijosFaciles.add("Es un felino ágil y fuerte, sus manchas lo ayudan a camuflarse entre los árboles ¿Qué es?");//Jaguar
        acertijosFaciles.add("Tiene alas hermosas y vuela entre flores");//Mariposa
        acertijosFaciles.add("Es una flor que solo se abre de noche");//Flor noctura o flor de cactus

        //Acertijos Medios
        acertijosMedios.add("¿Qué tiene cabeza, pero no cerebro?");// ???
        acertijosMedios.add("Ave que vuelo ágil y rápido, amante de flores");//Colibri
        acertijosMedios.add("Fruta energética muy popular en América del Sur, sus frutos son pequeños y oscuros. ¿Qué es?");//Guarana
        acertijosMedios.add("Insecto pequeño, reconocible instantaneamente por sus antenas y 'pies' ");//Ciempies
        acertijosMedios.add("Pequeño, peligroso y electrificante");//Anguila electrica
        acertijosMedios.add("Una de las, sino, la rana más venenosa");//Rana dardo dorada
        acertijosMedios.add("Rana de piel brillante y dorada. Advertencia para los depredadores sobre su potente veneno");//Rana dorada de Zetek
        acertijosMedios.add("Insecto pequeño, verde y ruidoso");//Grillo
        acertijosMedios.add("Pequeño mono que vive en las selvas de América Central y del Sur. Tiene pelaje esponjoso y se balancearme entre los árboles muy bien.");//Tití
        acertijosMedios.add("Tiene piel de color verde con manchas negras, pasa la mayor parte del tiempo en los árboles. Tiene veneno potente.");//Rana arbórea verde
        acertijosMedios.add("Cuerpo pequeño de color verde que lo camuflarme entre las hojas. Vive en el suelo del bosque tropical y me alimento de insectos.");//Gecko
        acertijosMedios.add("Planta trepadora que crece en los árboles del bosque tropical. Hojas con forma de corazón y sus flores son pequeñas y de colores variados.");//El filodendro (Philodendron).
        acertijosMedios.add("Tronco delgado y corteza de textura rugosa. Crece en los bosques y sus hojas tienen un olor característico.");//Arbol de canela
        acertijosMedios.add("Piel de color azul brillante y tiene una cola larga y puntiaguda. Es conocido por su agilidad y colores llamativos.");//Lagarto azul
        acertijosMedios.add("Es un insecto que pasa la mayor parte de su vida en un estado de larva. Tiene movimientos rápidos y se esconde bajo las hojas.");//Escarabajo rinoceronte
        acertijosMedios.add("Conocido por su habilidad para construir nidos flotantes en los árboles. Plumaje de colores vivos y de canto es distintivo.");//Pajaro tejedor
        acertijosMedios.add("Cuerpo pequeño y de coloración que imita las hojas secas. Conocido por su habilidad para esconderse.");//Insecto hoja
        acertijosMedios.add("Vive en los arroyos tropicales y tiene un cuerpo alargado con una piel escamosa. Se alimenta de insectos y pequeños peces. ¿Qué es?");//Dragon de agua
        acertijosMedios.add("Es un pez con cuerpo alargado y un color brillante. Se alimenta principalmente de otros peces pequeños.");//Pez angel
        acertijosMedios.add("Insecto que viaja grandes distancias y atrae a su pareja cantando");//Saltamontes

        //Acertijos Dificiles
        acertijosDificiles.add("¿Qué se puede ver pero no tocar?");// ???
        acertijosDificiles.add("¿Qué baja pero nunca sube?");//Una fruta
        acertijosDificiles.add("Es pequeña y colorida, atrae a los colibríes con su dulce néctar. ¿Qué es?");//Flor de hibisco
        acertijosDificiles.add("Su fruta es grande y espinosa por fuera, pero por dentro es suave y dulce. Su olor es tan fuerte que algunos no lo soportan. ¿Qué es?");//El durián
        acertijosDificiles.add("Flor que crece en las selvas de Sumatra, de olor potente, como podrido");//Flor cadaver
        acertijosDificiles.add("Nadador de mordida brutal, comparado a su tamaño diminuto");//Piraña
        acertijosDificiles.add("Poliniza flores y tiene un gran olfato");//Murcielago nectarivoro
        acertijosDificiles.add("Es uno de los árboles más grandes de la selva. Su tronco es macizo y sus raíces se extienden muy lejos para buscar agua en la tierra húmeda.");//Arbol de ceiba
        acertijosDificiles.add("Es un insecto que vive en colonias en los árboles. Construyen grandes nidos de barro y sus picaduras duelen mucho.");//Avispa tropical
        acertijosDificiles.add("Planta de hojas afiladas, que guarda su agua en si misma.");//Bromelia
        acertijosDificiles.add("Con ojos prominentes y brillantes, venenosa al tacto");//Rana arborícola venenosa.
        acertijosDificiles.add("De alas coloridas y vuelo majestuoso, ayuda a polinizar las flores del bosque tropical. Vuela largas distancias y algunas especies migran a través de continentes. ¿Qué es?");//Mariposa monarca
        acertijosDificiles.add("Sus hojas pueden alcanzar hasta tres metros y sus raíces están diseñadas para aguantar fuertes lluvias y tormentas. ¿Qué es?");//Arbol de pan
        acertijosDificiles.add("Sus raíces aéreas cuelgan de las ramas de los árboles y ayudan a sostener el dosel en el bosque tropical. Depende de otros arboles. ¿Qué es?");//Epifita
        acertijosDificiles.add("Sus hojas son carnosas y sus espinas son largas, puede sobrevivir en zonas tropicales secas y se adapta fácilmente al calor intenso. ¿Qué es?");//Catcus saguaro
        acertijosDificiles.add("Vive en las selvas tropicales y sus colores brillantes advierten a los depredadores. Es pequeño pero con veneno mortal.");//Salamandra venenosa
        acertijosDificiles.add("Mamifero cuya dieta se basa en frutas y pequeños animales. Vive en las selvas del Amazonas y es bueno escalando.");//Coatí
        acertijosDificiles.add("Conocido por su piel resbaladiza y sus habilidades para saltar grandes distancias. Su coloración es verde y amarilla.");//Sapo de caña
        acertijosDificiles.add("Piel brillante, tamaño pequeño, su fama es tan alta como su camuflaje");//Mantis religiosa
        acertijosDificiles.add("Ave colorida famosa en el folklore");//Tucan        
    }

// Establecer dificultad seleccionada
    public void setDificultad(String dificultad) {
        this.dificultadSeleccionada = dificultad;
        System.out.println("Dificultad seleccionada: " + dificultad);  // Verificar la dificultad
        reiniciarAcertijos(); // Reiniciar la lista de acertijos disponibles según la dificultad
    }

    // Obtener un acertijo aleatorio según la dificultad
    public String obtenerAcertijoAleatorio() {
        if (acertijosDisponibles.isEmpty()) {
            System.out.println("Todos los acertijos ya han sido utilizados.");
            return null;
        }

        System.out.println("Seleccionando un acertijo aleatorio de la lista de " + acertijosDisponibles.size() + " acertijos.");

        // Selecciona un acertijo aleatorio
        Random random = new Random();
        int index = random.nextInt(acertijosDisponibles.size());
        String acertijoSeleccionado = acertijosDisponibles.get(index);

        // Mueve el acertijo a la lista de usados y elimínalo de la lista disponible
        acertijosUsados.add(acertijoSeleccionado);
        acertijosDisponibles.remove(index);
        
        if (acertijosDisponibles.isEmpty()) {
            System.out.println("Advertencia: ya no hay más acertijos disponibles.");
        }

        return acertijoSeleccionado;
    }

    // Reiniciar los acertijos disponibles según la dificultad seleccionada
    private void reiniciarAcertijos() {
        
        acertijosUsados.clear();

        // Rellenar acertijosDisponibles según la dificultad seleccionada
        if (dificultadSeleccionada.equals("fácil")) {
            acertijosDisponibles.addAll(acertijosFaciles);
        } else if (dificultadSeleccionada.equals("medio")) {
            acertijosDisponibles.addAll(acertijosMedios);
        } else if (dificultadSeleccionada.equals("difícil")) {
            acertijosDisponibles.addAll(acertijosDificiles);
        }

        // Verificar que acertijosDisponibles no esté vacía
        if (acertijosDisponibles.isEmpty()) {
            System.out.println("No hay acertijos disponibles para la dificultad seleccionada: " + dificultadSeleccionada);
        } else {
            System.out.println("Acertijos disponibles cargados: " + acertijosDisponibles.size());
        }
    }
}
