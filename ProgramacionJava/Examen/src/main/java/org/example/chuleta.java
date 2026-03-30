package org.example;
/**
 * =====================================================================
 *  CHULETA DE ESTRUCTURAS - EXAMEN PRÁCTICO PROGRAMACIÓN (UD1-UD7)
 *  IES Mutxamel - DAW
 * =====================================================================
 *  Organizada por bloques para buscar rápido durante el examen.
 *  Cada bloque tiene: comentario de qué hace + ejemplo funcional.
 * =====================================================================
 */
import java.time.LocalDate;
import java.util.*;
public class chuleta {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
            // =====================================================================
            //  BLOQUE 1: ENTRADA DE DATOS + TRY-CATCH
            // =====================================================================

        // --- Leer un entero con control de error ---
        System.out.println("Introduce un número entero: ");
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                numero = teclado.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: introduce un número entero.");
                teclado.next(); // limpia el buffer del scanner
            }
        }

        // --- Leer un double con try-catch ---
        System.out.println("Introduce un decimal: ");
        double decimal = 0;
        try {
            decimal = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("ERROR: no es un número válido.");
            teclado.next();
        }

        // --- Leer un String después de un nextInt (OJO: limpiar buffer) ---
        teclado.nextLine(); // <-- siempre después de nextInt/nextDouble
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        // --- Validar que un número esté en un rango (pedir hasta que sea válido) ---
        int edad = 0;
        do {
            System.out.println("Introduce tu edad (0-120): ");
            edad = teclado.nextInt();
        } while (edad < 0 || edad > 120);

            // =====================================================================
            //  BLOQUE 2: BUCLES Y ESTRUCTURAS DE CONTROL
            // =====================================================================

        // --- For clásico ---
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // --- For descendente ---
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i); // 10, 8, 6, 4, 2, 0
        }

        // --- While con condición de salida ---
        int intentos = 0;
        while (intentos < 10) {
            // hacer algo
            intentos++;
        }

        // --- Do-while (se ejecuta al menos 1 vez) ---
        String opcion;
        do {
            System.out.println("¿Quieres continuar? (S/N): ");
            opcion = teclado.next();
        } while (!opcion.equalsIgnoreCase("N"));

        // --- Switch-case ---
        System.out.println("Elige opción (1-3): ");
        int op = teclado.nextInt();
        switch (op) {
            case 1: System.out.println("Opción 1"); break;
            case 2: System.out.println("Opción 2"); break;
            case 3: System.out.println("Opción 3"); break;
            default: System.out.println("Opción no válida");
        }

        // --- Operador ternario ---
        int x = 10;
        String mensaje = (x > 5) ? "Mayor que 5" : "Menor o igual a 5";

        // --- Random: número aleatorio entre min y max ---
        Random aleatorio = new Random();
        int min = 1, max = 90;
        int aleatorioEntre = aleatorio.nextInt(max - min + 1) + min; // [1, 90]

            // =====================================================================
            //  BLOQUE 3: STRINGS
            // =====================================================================

        String texto = "Hola Mundo";

        // --- Longitud ---
        int longitud = texto.length();
        // --- Obtener carácter en posición ---
        char caracter = texto.charAt(0); // 'H'
        // --- Comparar strings ---
        boolean iguales = texto.equals("Hola Mundo");           // true
        boolean sinMayus = texto.equalsIgnoreCase("hola mundo"); // true
        // --- Contiene un substring ---
        boolean contiene = texto.contains("Mundo"); // true
        // --- Mayúsculas / minúsculas ---
        String mayus = texto.toUpperCase();   // "HOLA MUNDO"
        String minus = texto.toLowerCase();   // "hola mundo"

        // --- Recorrer caracteres de un string ---
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
        }

        // --- Split: dividir string por separador ---
        String datos = "45-33-12";
        String[] partes = datos.split("-"); // ["45", "33", "12"]
        int num1 = Integer.parseInt(partes[0]); // convertir a int

        // --- Validar formato con split (estilo examen UD3 bingo) ---
        // Si no tiene 3 partes o alguna no es numérica → error
        if (partes.length != 3) {
            System.out.println("Formato inválido");
        }

            // =====================================================================
            //  BLOQUE 4: ARRAYS / VECTORES
            // =====================================================================

        // --- Crear array vacío ---
        int[] vector = new int[5]; // [0, 0, 0, 0, 0]

        // --- Crear array con valores ---
        int[] notas = {7, 8, 5, 10, 6};

        // --- Recorrer array con for ---
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + i + ": " + notas[i]);
        }

        // --- Recorrer array con for-each ---
        for (int nota : notas) {
            System.out.println(nota);
        }

        // --- Imprimir array completo ---
        System.out.println(Arrays.toString(notas)); // [7, 8, 5, 10, 6]

        // --- Buscar un elemento en un array ---
        // Opción 1: bucle
        int buscado = 10;
        boolean encontrado = false;
        for (int nota : notas) {
            if (nota == buscado) {
                encontrado = true;
                break;
            }
        }

        // Opción 2: Arrays.asList (solo con Integer[], no int[])
        Integer[] notasObj = {7, 8, 5, 10, 6};
        boolean existe = Arrays.asList(notasObj).contains(10);

        // Opción 3: Arrays.binarySearch (REQUIERE array ordenado)
        int[] ordenado = {1, 3, 5, 7, 9};
        int pos = Arrays.binarySearch(ordenado, 5); // devuelve índice (2)
        // si no existe, devuelve número negativo

        // --- Ordenar array ---
        Arrays.sort(notas); // ordena in-place

        // --- Copiar array (copia real, no referencia) ---
        int[] copiaReal = Arrays.copyOf(notas, notas.length);

        // --- System.arraycopy(origen, posOrigen, destino, posDestino, cantidad) ---
        int[] origen = {2, 3, 5, 7, 11, 13, 17};
        int[] destino = new int[origen.length];
        System.arraycopy(origen, 2, destino, 4, 3);
        // destino = [0, 0, 0, 0, 5, 7, 11]

        // --- Eliminar duplicados de un array ---
        int[] conDuplicados = {3, 3, 7, 8, 8, 9};
        int[] sinDuplicados = Arrays.stream(conDuplicados).distinct().toArray();

            // =====================================================================
            //  BLOQUE 5: MATRICES (ARRAYS BIDIMENSIONALES)
            // =====================================================================

        // --- Crear matriz vacía ---
        int[][] matriz = new int[3][4]; // 3 filas, 4 columnas

        // --- Crear matriz con valores ---
        int[][] matrizDatos = {
                {5, 3, 2},
                {1, 4, 6},
                {7, 8, 9}
        };

        // --- Recorrer matriz (filas x columnas) ---
        for (int i = 0; i < matrizDatos.length; i++) {           // filas
            for (int j = 0; j < matrizDatos[i].length; j++) {    // columnas
                System.out.print(matrizDatos[i][j] + " ");
            }
            System.out.println(); // salto de línea entre filas
        }

        // --- Sumar una columna entera (ejemplo: columna j=1) ---
        int sumaColumna = 0;
        int col = 1;
        for (int i = 0; i < matrizDatos.length; i++) {
            sumaColumna += matrizDatos[i][col];
        }

        // --- Sumar última fila (sin importar cuántas columnas tenga) ---
        int sumaUltimaFila = 0;
        int ultimaFila = matrizDatos.length - 1;
        for (int j = 0; j < matrizDatos[ultimaFila].length; j++) {
            sumaUltimaFila += matrizDatos[ultimaFila][j];
        }

        // --- Rellenar matriz leyendo filas con formato "12 3 34 17" ---
        int filas = 3, columnas = 4;
        int[][] bancal = new int[filas][columnas];
        teclado.nextLine(); // limpiar buffer
        for (int i = 0; i < filas; i++) {
            System.out.println("Fila " + (i + 1) + ": ");
            String linea = teclado.nextLine();
            String[] valores = linea.split(" ");
            for (int j = 0; j < columnas; j++) {
                bancal[i][j] = Integer.parseInt(valores[j]);
            }
        }

        // --- Buscar el máximo en una matriz y su posición ---
        int maxValor = bancal[0][0];
        int maxFila = 0, maxCol = 0;
        for (int i = 0; i < bancal.length; i++) {
            for (int j = 0; j < bancal[i].length; j++) {
                if (bancal[i][j] > maxValor) {
                    maxValor = bancal[i][j];
                    maxFila = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Máximo: " + maxValor + " en (" + maxFila + "," + maxCol + ")");

            // =====================================================================
            //  BLOQUE 6: ARRAYLIST (UD5 en adelante)
            // =====================================================================

        // --- Crear ArrayList ---
        ArrayList<String> lista = new ArrayList<>();

        // --- Añadir elementos ---
        lista.add("Patri");
        lista.add("Pedro");
        lista.add("Lucas");

        // --- Añadir varios a la vez (desde varargs en un método) ---
        // public void insertarMiembros(String... miembros) {
        //     for (String m : miembros) { lista.add(m); }
        // }
        // Llamada: insertarMiembros("Daniel", "Lucas", "Carla");

        // --- Tamaño ---
        int tam = lista.size();
        // --- Acceder por índice ---
        String primero = lista.get(0);
        // --- Eliminar por índice ---
        lista.remove(0);
        // --- Eliminar por objeto ---
        lista.remove("Pedro");
        // --- Buscar ---
        boolean estaPatri = lista.contains("Patri");
        // --- Recorrer ---
        for (String s : lista) {
            System.out.println(s);
        }

        // --- Crear desde array ---
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Ana", "Luis", "Carlos"));

        // --- Crear lista NO MODIFICABLE (solo lectura, estilo getUsuarios) ---
        List<String> soloLectura = Collections.unmodifiableList(nombres);

            // =====================================================================
            //  BLOQUE 7: POO - CLASES, CONSTRUCTORES, TOSTRING
            // =====================================================================

        /*
        --- Estructura básica de una clase (sin Lombok) ---

        public class Corredor {
            private String nombre;
            private int dorsal;
            private ArrayList<String> listaPatrocinadores;
            private double importe_vuelta;
            private int vueltas_completadas;

            // Constructor con parámetros
            public Corredor(String nombre, double importe_vuelta) {
                this.nombre = nombre;
                this.importe_vuelta = importe_vuelta;
                this.vueltas_completadas = 0;
                this.listaPatrocinadores = new ArrayList<>();
            }

            // Constructor por defecto (si se necesita)
            public Corredor() {
                this.importe_vuelta = 0.50;
                this.vueltas_completadas = 0;
                this.listaPatrocinadores = new ArrayList<>();
            }

            // Getters y setters
            public String getNombre() { return nombre; }
            public void setNombre(String nombre) { this.nombre = nombre; }
            public int getDorsal() { return dorsal; }
            // ... etc para cada atributo

            // toString para imprimir el objeto
            @Override
            public String toString() {
                return "Corredor{nombre='" + nombre + "', dorsal=" + dorsal + "}";
            }

            // Insertar varios patrocinadores a la vez (varargs)
            public void insertarPatrocinador(String... patrocinadores) {
                for (String p : patrocinadores) {
                    listaPatrocinadores.add(p);
                }
            }
        }
        */

            // =====================================================================
            //  BLOQUE 8: POO - ATRIBUTO STATIC (auto-incremento de ID/dorsal)
            // =====================================================================

        /*
        --- Atributo compartido por todos los objetos de la clase ---

        public class Corredor {
            private static int contadorDorsal = 0;
            private int dorsal;

            public Corredor(String nombre) {
                contadorDorsal++;
                this.dorsal = contadorDorsal; // 1, 2, 3...
            }
        }
        */

            // =====================================================================
            //  BLOQUE 9: POO AVANZADA - HERENCIA
            // =====================================================================

        /*
        --- Clase padre (puede ser abstract si no se instancia directamente) ---

        public abstract class Participante {
            private String nombre;
            private String pais;

            public Participante() {
                System.out.println("Nombre: ");
                nombre = teclado.nextLine();
                System.out.println("País: ");
                pais = teclado.nextLine();
            }

            public String getNombre() { return nombre; }
            public String getPais() { return pais; }
        }

        --- Clase hija ---

        public class Piloto extends Participante {
            private String marca;
            private int puntuacion;

            public Piloto(String marca) {
                super(); // llama al constructor del padre
                this.marca = marca;
                this.puntuacion = 0;
            }
        }

        --- Clase hija 2 ---

        public class Mecanico extends Participante {
            private Piloto piloto; // relación con otra clase

            public Mecanico(Piloto piloto) {
                super();
                this.piloto = piloto;
            }
        }
        */

            // =====================================================================
            //  BLOQUE 10: ENUM
            // =====================================================================

        /*
        --- Enum simple ---

        public enum EstadoCoche {
            PENDIENTE, REVISADO, APTO, NO_APTO;
        }

        // Uso: EstadoCoche.PENDIENTE
        // Comparar: estado.equals(EstadoCoche.APTO)

        --- Enum con atributo y constructor ---

        public enum CategoriaDrift {
            STREET(50.0), PRO(150.0), HYPER_DRIFT(300.0);

            private double precio;

            CategoriaDrift(double precio) {
                this.precio = precio;
            }

            public double getPrecio() { return precio; }
        }

        // Uso: CategoriaDrift.PRO.getPrecio() → 150.0
        // Listar todos: Arrays.toString(CategoriaDrift.values())

        --- Leer enum por teclado con validación ---

        while (true) {
            System.out.println("Elige categoría " + Arrays.toString(CategoriaDrift.values()));
            try {
                CategoriaDrift cat = CategoriaDrift.valueOf(teclado.next());
                break; // si no lanza excepción, es válido
            } catch (IllegalArgumentException e) {
                System.out.println("Categoría incorrecta. Elige una existente.");
            }
        }
        */

            // =====================================================================
            //  BLOQUE 11: INTERFACE
            // =====================================================================

        /*
        --- Definir una interfaz ---

        public interface AccionesCarrera {
            void validarInscripciones(Inscripcion inscripcion);
            void darSalida();
            void puntuar(Piloto piloto);
        }

        --- Clase que implementa la interfaz ---

        public class Juez extends Participante implements AccionesCarrera {

            @Override
            public void validarInscripciones(Inscripcion inscripcion) {
                // lógica
            }

            @Override
            public void darSalida() {
                System.out.println("3... 2... 1... ¡YA!");
            }

            @Override
            public void puntuar(Piloto piloto) {
                Random r = new Random();
                piloto.setPuntuacion(r.nextInt(10) + 1);
            }
        }

        --- Clase anónima (sin crear clase .java, solución temporal) ---

        public interface GestionInventario {
            void verificarStock();
        }

        // En el main:
        GestionInventario gestion = new GestionInventario() {
            @Override
            public void verificarStock() {
                System.out.println("Verificando stock temporalmente...");
            }
        };
        gestion.verificarStock();
        */

            // =====================================================================
            //  BLOQUE 12: EXCEPCIÓN PERSONALIZADA
            // =====================================================================

        /*
        --- Crear la excepción ---

        public class CocheNoRevisadoException extends Exception {
            public CocheNoRevisadoException(String mensaje) {
                super(mensaje);
            }
        }

        --- Lanzarla con throw ---

        public void validarCocheApto(Piloto piloto) throws CocheNoRevisadoException {
            if (!piloto.getEstado().equals(EstadoCoche.REVISADO)) {
                throw new CocheNoRevisadoException("El coche no está revisado");
            }
            piloto.setEstado(EstadoCoche.APTO);
        }

        --- Capturarla con try-catch ---

        try {
            juez.validarCocheApto(piloto);
        } catch (CocheNoRevisadoException e) {
            System.out.println("ERROR: " + e.getMessage());
            piloto.setEstado(EstadoCoche.NO_APTO);
        }
        */

            // =====================================================================
            //  BLOQUE 13: POLIMORFISMO (instanceof)
            // =====================================================================

        /*
        --- Comprobar tipo de objeto en una lista mezclada ---

        ArrayList<Bañista> listaBañistas = new ArrayList<>();
        // ... añadir Adulto, Niño, Invitado (todos extienden Bañista)

        for (Bañista b : listaBañistas) {
            if (b instanceof Invitado) {
                System.out.println(b.getNombre() + " es un invitado.");
            }
        }
        */

            // =====================================================================
            //  BLOQUE 14: COLLECTIONS - QUEUE (Cola FIFO)
            // =====================================================================

        // --- Cola: el primero en entrar es el primero en salir ---
        Queue<String> cola = new LinkedList<>();

        // --- Añadir a la cola ---
        cola.offer("Cliente 1");   // añade al final
        cola.offer("Cliente 2");
        cola.offer("Cliente 3");

        // --- Ver el primero SIN sacarlo ---
        String primeroEnCola = cola.peek(); // "Cliente 1"

        // --- Sacar el primero (y eliminarlo) ---
        String atendido = cola.poll(); // "Cliente 1", cola queda [Cliente 2, Cliente 3]

        // --- Recorrer y vaciar la cola ---
        while (!cola.isEmpty()) {
            System.out.println("Atendiendo: " + cola.poll());
        }

            // =====================================================================
            //  BLOQUE 15: COLLECTIONS - STACK (Pila LIFO)
            // =====================================================================

        // --- Pila: el último en entrar es el primero en salir ---
        Stack<Integer> pila = new Stack<>();

        // --- Apilar (meter encima) ---
        pila.push(10);
        pila.push(20);
        pila.push(30);

        // --- Ver el de arriba SIN sacarlo ---
        int cima = pila.peek(); // 30

        // --- Desapilar (sacar el de arriba) ---
        int sacado = pila.pop(); // 30, pila queda [10, 20]

        // --- Invertir un orden con pila ---
        // Ejemplo: introducir 3, 5, 1 → sacar 1, 5, 3
        Stack<Integer> invertir = new Stack<>();
        invertir.push(3);
        invertir.push(5);
        invertir.push(1);
        while (!invertir.isEmpty()) {
            System.out.println(invertir.pop()); // 1, 5, 3
        }


            // =====================================================================
            //  BLOQUE 16: COLLECTIONS - SET (sin duplicados)
            // =====================================================================

        // --- HashSet: sin orden, sin duplicados ---
        Set<String> hashSet = new HashSet<>();
        hashSet.add("banana");
        hashSet.add("manzana");
        hashSet.add("pera");
        hashSet.add("banana"); // NO se añade (duplicado)
        // Salida: orden impredecible, ej: [pera, banana, manzana]

        // --- TreeSet: ordenado alfabéticamente, sin duplicados ---
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("banana");
        treeSet.add("manzana");
        treeSet.add("pera");
        treeSet.add("banana");
        // Salida: [banana, manzana, pera]

        // --- LinkedHashSet: mantiene orden de inserción, sin duplicados ---
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("banana");
        linkedHashSet.add("manzana");
        linkedHashSet.add("pera");
        linkedHashSet.add("banana");
        // Salida: [banana, manzana, pera]

        // --- Para que funcione con objetos propios: necesitas equals + hashCode ---

            // =====================================================================
            //  BLOQUE 17: COLLECTIONS - MAP (clave → valor)
            // =====================================================================

        // --- HashMap: sin orden ---
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Ana", 10);
        mapa.put("Luis", 20);
        mapa.put("Ana", 30); // sobreescribe el valor de "Ana"

        // --- Obtener valor ---
        int valorAna = mapa.get("Ana"); // 30

        // --- Comprobar si existe una clave ---
        boolean existeAna = mapa.containsKey("Ana");

        // --- Recorrer un mapa ---
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // --- getOrDefault: si no existe la clave, devuelve valor por defecto ---
        // Útil para CONTAR apariciones (estilo examen Epstein)
        HashMap<String, Integer> contador = new HashMap<>();
        String[] palabras = {"hola", "mundo", "hola", "java", "hola"};
        for (String p : palabras) {
            contador.put(p, contador.getOrDefault(p, 0) + 1);
        }
        // {hola=3, mundo=1, java=1}

        // --- TreeMap: ordenado por clave (requiere Comparable si es objeto propio) ---
        TreeMap<String, Integer> mapaOrdenado = new TreeMap<>();
        mapaOrdenado.put("Carlos", 5);
        mapaOrdenado.put("Ana", 10);
        mapaOrdenado.put("Luis", 3);
        // Recorre en orden: Ana, Carlos, Luis

        // --- Ordenar un mapa por VALOR (descendente) - estilo ranking Epstein ---
        ArrayList<Map.Entry<String, Integer>> listaEntries = new ArrayList<>(contador.entrySet());
        listaEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for (Map.Entry<String, Integer> entry : listaEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

            // =====================================================================
            //  BLOQUE 18: ITERATOR (borrar mientras recorres)
            // =====================================================================

        // --- ¡¡NO se puede borrar con for-each!! Lanza ConcurrentModificationException ---
        // --- Se DEBE usar Iterator ---

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));

        // Ejemplo: eliminar mayores que 5
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            int n = it.next();    // PRIMERO next()
            if (n > 5) {
                it.remove();      // DESPUÉS remove()
            }
        }
        // numeros queda: [2, 4]

        // --- Eliminar menores de edad de una lista de objetos ---
        /*
        Iterator<Famoso> it = listaEpstein.iterator();
        while (it.hasNext()) {
            Famoso f = it.next();
            if (f.getEdad() < 18) {
                it.remove();
            }
        }
        */

            // =====================================================================
            //  BLOQUE 19: COMPARABLE (para TreeSet/TreeMap y ordenar)
            // =====================================================================

        /*
        --- La clase debe implementar Comparable<NombreClase> ---
        --- Necesario para: TreeSet, TreeMap, Collections.sort ---

        public class Famoso implements Comparable<Famoso> {

            private String nombre;
            private String pais;

            // Ordenar por país, y si son iguales, por nombre
            @Override
            public int compareTo(Famoso o) {
                int comparar = this.pais.compareTo(o.getPais());
                if (comparar != 0) {
                    return comparar;   // si los países son distintos, ordena por país
                }
                return this.nombre.compareTo(o.getNombre()); // si no, por nombre
            }
        }

        // También se puede hacer con Comparator externo:
        // lista.sort(Comparator.comparing(Famoso::getPais).thenComparing(Famoso::getNombre));
        */

            // =====================================================================
            //  BLOQUE 20: EQUALS + HASHCODE (para HashSet/HashMap detecte duplicados)
            // =====================================================================

        /*
        --- Sin equals/hashCode: dos objetos con mismos datos NO se consideran iguales ---
        --- Con equals/hashCode: sí se consideran iguales → Set no los duplica ---

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Famoso famoso = (Famoso) o;
            return edad == famoso.edad
                && Objects.equals(nombre, famoso.nombre)
                && Objects.equals(pais, famoso.pais)
                && Objects.equals(profesion, famoso.profesion);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nombre, pais, profesion, edad);
        }

        // REGLA: si dos objetos son equals, DEBEN tener el mismo hashCode
        // import java.util.Objects; para usar Objects.equals y Objects.hash
        */


            // =====================================================================
            //  BLOQUE 21: LOMBOK (anotaciones más usadas)
            // =====================================================================

        /*
        @Getter                      → genera getters para todos los atributos
        @Setter                      → genera setters para todos los atributos
        @ToString                    → genera toString() con todos los atributos
        @AllArgsConstructor          → constructor con TODOS los atributos
        @RequiredArgsConstructor     → constructor SOLO con atributos @NonNull o final
        @NoArgsConstructor           → constructor vacío (SIN parámetros)

        Ejemplo:
        @AllArgsConstructor
        @Getter
        @ToString
        public class Alumno {
            private int nia;
            private String nombre;
        }

        Equivale a:
        public class Alumno {
            private int nia;
            private String nombre;

            public Alumno(int nia, String nombre) {
                this.nia = nia;
                this.nombre = nombre;
            }
            public int getNia() { return nia; }
            public String getNombre() { return nombre; }
            public String toString() {
                return "Alumno(nia=" + nia + ", nombre=" + nombre + ")";
            }
        }

        OJO: @NoArgsConstructor con @RequiredArgsConstructor
        → si hay atributos @NonNull, @NoArgsConstructor da error
           porque no puede inicializarlos sin valor.
        */

            // =====================================================================
            //  BLOQUE 22: LOCALDATE (fechas)
            // =====================================================================

        // --- Crear fecha ---
        LocalDate fecha = LocalDate.of(2025, 4, 16);  // 16 de abril de 2025

        // --- Fecha actual del sistema ---
            LocalDate hoy = LocalDate.now();

            // --- Comparar fechas ---
        boolean esAntes = fecha.isBefore(hoy);
        boolean esDespues = fecha.isAfter(hoy);

        // --- Obtener partes ---
        int anyo = hoy.getYear();
        int mes = hoy.getMonthValue();
        int dia = hoy.getDayOfMonth();

            // =====================================================================
            //  BLOQUE 23: GENERAR STRINGS ALEATORIOS (usuarios, matrículas)
            // =====================================================================

        // --- Generar string aleatorio de N caracteres ---
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rnd = new Random();
        int longitudDeseada = 8;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitudDeseada; i++) {
            sb.append(caracteres.charAt(rnd.nextInt(caracteres.length())));
        }
        String usuario = sb.toString();

        // --- Generar matrícula formato 1234BCD ---
        String letrasMatricula = "BCDFGHJKLMNPQRSTVWXYZ";
        String numerosMatricula = "0123456789";
        StringBuilder matricula = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            matricula.append(numerosMatricula.charAt(rnd.nextInt(numerosMatricula.length())));
        }
        for (int i = 0; i < 3; i++) {
            matricula.append(letrasMatricula.charAt(rnd.nextInt(letrasMatricula.length())));
        }
        // Resultado ejemplo: "4821BKT"

            // =====================================================================
            //  BLOQUE 24: THREAD.SLEEP (pausa/espera)
            // =====================================================================

        // --- Pausar la ejecución 3 segundos (para simular espera) ---
        try {
            Thread.sleep(3000); // milisegundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

            // =====================================================================
            //  BLOQUE 25: MENÚ INTERACTIVO (patrón típico de examen)
            // =====================================================================

        int opcionMenu;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Opción A");
            System.out.println("2. Opción B");
            System.out.println("3. Salir");
            System.out.println("Elige: ");
            opcionMenu = teclado.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("Has elegido A");
                    break;
                    case 2:
                        System.out.println("Has elegido B");
                        break;
                        case 3:
                            System.out.println("¡Adiós!");
                            break;
                            default:
                                System.out.println("Opción no válida");
            }
        } while (opcionMenu != 3);
    }
}

