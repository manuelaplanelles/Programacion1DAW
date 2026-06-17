package org.example;

import org.example.ExtraordinariaJunio25.PiscinaMunicipal.Adulto;
import org.example.ExtraordinariaJunio25.PiscinaMunicipal.AppPiscina;
import org.example.ExtraordinariaJunio25.PiscinaMunicipal.Banyista;
import org.example.ExtraordinariaJunio25.PiscinaMunicipal.TipoUsuario;

import java.time.LocalDate;
import java.util.*;

/* ============================================================
   ║   REPERTORIO COMPLETO · Manuela · examen práctico Java   ║
   ║   Abre este archivo, busca tu pieza (Ctrl+F el número),   ║
   ║   copia el bloque y cámbiale los nombres a los de tu      ║
   ║   examen. Cada pieza dice CUÁNDO se usa.                  ║
   ============================================================

   ÍNDICE (Ctrl+F el código entre corchetes):
   [P1]  Esqueleto de clases (enum, abstracta, hija, interfaz, App)
   [P2]  Crear + añadir (carga manual)
   [P2B] Generar aleatorios sin repetir + generar DNI/matrícula
   [P3]  Recorrer e imprimir con numeración
   [P4]  Buscar por atributo -> objeto o null
   [P5]  Buscar + decidir (validación con mensajes)
   [P6]  Cambiar estado / polimorfismo (pagar, recibirBesico)
   [P7]  Borrar con Iterator
   [P8]  Menú que insiste (do-while)
   [P9]  Excepción personalizada
   [P10] equals + hashCode (no repetir en Set)
   [P11] Estadística: matriz conteo + %
   [E-A] Filtrar por tipo con instanceof
   [E-B] Ordenar (mayor a menor / Comparator)
   [E-C] Validar formato con .matches()
   [E-D] Map clave->valor
   [E-E] Cola FIFO con poll
*/

public class Repertorio {


// ===========================================================
// [UML] ESQUELETO DE CLASES  (apartado a, SIEMPRE el primero)
// CUÁNDO: "crea la estructura del diagrama UML"
// ===========================================================
//Orden: 1. Enum, 2. Interface (I+cursiva), 3. Padre (suele ser una interface o una abstracta), 4.Hijas (clase normal con extends), 5. App(clase normal con main).

    // --- ENUM (estados o tipos) ---
    public enum EstadoPeregrino {SOLICITUD_OK, EN_COLA, BENDECIDO;}

    // con atributos, se crea tambíen el constructor y el getter
    public enum TipoUsuario {
        ADULTO(30), NINO(15), INVITADO(3.5);
        private double precio;

        TipoUsuario(double precio) {
            this.precio = precio;
        }

        public double getPrecio() {
            return precio;
        }

        // --- PADRE ABSTRACTA --> implementa la interfaz y la hija extends de Padre ---
        static abstract class Peregrino implements AccionProtocolaria {
            private Integer numReserva;
            private String nombre;
            private EstadoPeregrino estado;

            public Peregrino(Integer numReserva, String nombre) {
                this.numReserva = numReserva;
                this.nombre = nombre;
                this.estado = EstadoPeregrino.SOLICITUD_OK; // valor por defecto, no en los parentesis del constructor
            }

            // getters/setters de todos los atributos
            public Integer getNumReserva() {return numReserva;}

            public String getNombre() {return nombre;}

            public EstadoPeregrino getEstado() {return estado;}

            public void setEstado(EstadoPeregrino estado) {this.estado = estado;}

            @Override
            public String toString() {
                return "Peregrino " + numReserva + " - " + nombre + " - " + estado;
            }
        }


        // --- HIJA: super() en la PRIMERA línea del constructor ---
        static class Nacional extends Peregrino {
            private String provincia;

            public Nacional(Integer numReserva, String nombre, String provincia) {
                super(numReserva, nombre);       // <-- PRIMERA línea, obligatorio
                this.provincia = provincia;
            }

            @Override
            public void recibirBesico() {
                System.out.println("El Papa besa a " + getNombre());
            }
        }

        // --- INTERFAZ ---
        interface AccionProtocolaria {
            void recibirBesico();
        }

        // --- APP: la colección va STATIC ---
        static class VaticanoApp {
            static Scanner teclado = new Scanner(System.in);
            // Set sin orden = HashSet | sin repetir y en orden = LinkedHashSet | cola = Queue
            static LinkedHashSet<Peregrino> registrados = new LinkedHashSet<>();
            static Queue<Peregrino> fila = new LinkedList<>();

            public static void main(String[] args) {
                // aquí llamas a tus métodos para probar
            }
        }


        // ===========================================================
// [P1] CREAR + AÑADIR  (carga manual de datos, apartado b)
// CUÁNDO: "llena la lista con N objetos", "carga de datos"
// ===========================================================
        static void cargaManual() {
            // El padre es abstracto -> creo HIJAS, no Peregrino directamente
            VaticanoApp.registrados.add(new Nacional(1, "Manuela", "Alicante"));
            VaticanoApp.registrados.add(new Nacional(2, "Pedro", "Madrid"));
            // mostrar para comprobar:
            for (Peregrino p : VaticanoApp.registrados) {
                System.out.println(p);
            }
        }

// ===========================================================
// [P1C] CONTADOR AUTOMÁTICO (el número se pone solo, +1)
// CUÁNDO: "el número se actualiza automáticamente, +1 al último"
// Va en la clase del objeto. Lo sube el CONSTRUCTOR. (PATRI)
// ===========================================================
        static abstract class BanyistaAuto {
            static Integer contador = 0;      // STATIC (uno solo para todos)
            private Integer numero;

            public BanyistaAuto() {           // NO recibe numero, se autonumera
                contador++;                   // sube el contador
                this.numero = contador;       // este objeto coge ese número
            }
            // TRAMPA: sin static, cada objeto su contador -> todos nº1 -> el Set los fusiona
        }


// ===========================================================
// [P1B] GENERAR ALEATORIOS sin repetir  + generar código
// CUÁNDO: "genera lista aleatoria", "sin repetir DNI/matrícula"
// (necesita equals/hashCode en la clase -> ver [P10])
// ===========================================================
        static Random aleatorio = new Random();

        static void generarAleatorios() {
            int cuantos = aleatorio.nextInt(10) + 5;          // entre 5 y 14
            for (int i = 0; i < cuantos; i++) {
                String dni = generarDni();
                int dias = aleatorio.nextInt(8) + 1;          // entre 1 y 8
                // huelguistas.add(new Docente(dni, dias, EstadoDocente.EN_HUELGA));
            }
        }

        static String generarDni() {                          // formato 8 números + 1 letra
            String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String numeros = "0123456789";
            String dni = "";
            for (int i = 0; i < 8; i++) {
                dni += numeros.charAt(aleatorio.nextInt(numeros.length()));
            }
            dni += letras.charAt(aleatorio.nextInt(letras.length()));
            return dni;
        }
        // nextInt(N) da de 0 a N-1.  nextInt(8)+1 da de 1 a 8.


// ===========================================================
// [P2] RECORRER e imprimir con numeración
// CUÁNDO: "muestra", "imprime la lista", "lista numerada"
// ===========================================================
        static void mostrarNumerado() {
            int n = 0;
            for (Peregrino p : VaticanoApp.registrados) {
                System.out.println(++n + ". " + p.getNombre() + " - " + p.getEstado());
            }
            // ++n suma ANTES de imprimir -> empieza en 1
        }


// ===========================================================
// [P3] BUSCAR por atributo -> devolver objeto o null
// CUÁNDO: "busca por DNI/matrícula", "valida", "verifica"
// ===========================================================
        static Peregrino buscar(Integer id) {
            for (Peregrino p : VaticanoApp.registrados) {
                if (p.getNumReserva().equals(id)) {   // .equals NUNCA ==
                    return p;                          // p minúscula = el objeto
                }
            }
            return null;                               // FUERA del for
        }

// ===========================================================
// [P3B] BUSCAR + DECIDIR (buscar busca, este decide y avisa)
// CUÁNDO: "si existe muestra X y devuelve, si no muestra Y"
// ===========================================================
        static Peregrino validacion() {
            System.out.println("Introduce el id:");
            Integer id = VaticanoApp.teclado.nextInt();
            Peregrino p = buscar(id);                  // reutiliza [P4]
            if (p != null) {
                System.out.println("Validado correctamente.");
                return p;
            } else {
                System.out.println("No existe.");
                return new Nacional(id, "Desconocido", "-"); // o null, según pida
            }
        }

// ===========================================================
// [P4] CAMBIAR estado / POLIMORFISMO
// CUÁNDO: "cambia a X", "cada tipo hace lo suyo" (pagar, leer)
// ===========================================================
        static void cambiarEstado(Integer id) {
            Peregrino p = buscar(id);
            if (p != null) {                            // if != null evita el error
                p.setEstado(EstadoPeregrino.BENDECIDO);
            }
        }

        static void procesarTodos() {
            for (Peregrino p : VaticanoApp.registrados) {
                p.recibirBesico();   // cada hija imprime lo suyo = polimorfismo
            }
        }

// ===========================================================
// [P5] BORRAR con Iterator (mientras recorro)
// CUÁNDO: "elimina los que...", "borra los de estado X"
// ===========================================================
        static void eliminarPorEstado() {
            Iterator<Peregrino> it = VaticanoApp.registrados.iterator();
            while (it.hasNext()) {
                Peregrino p = it.next();                // next() ANTES de remove()
                if (p.getEstado() == EstadoPeregrino.BENDECIDO) {
                    it.remove();                        // it.remove(), NUNCA lista.remove()
                }
            }
        }

// ===========================================================
// [P6] EXCEPCIÓN personalizada
// CUÁNDO: "lanza una excepción", "reporta el error", "si ya existe"
// ===========================================================
        //1. creamos la clase
        static class MiException extends RuntimeException {
            public MiException(String msg) {
                super(msg);
            }
        }
        //2. en el metodo o en el apartado que necesites introduces el if
        static void usarExcepcion(int edad) {
            if (edad > 16) {
                throw new MiException("Edad no permitida");
            }
            // para capturar y seguir (si piden volver al bucle):
//            try {
//                altaUsuario();              // esto PODRÍA lanzar la excepción
//            } catch (MiException e) {
//                System.out.println(e.getMessage());   // si salta, muestro el mensaje y sigo
//            }
//            System.out.println("El programa continúa...");  // esto se ejecuta igual
//            }
        }

// ===========================================================
// [P7] MENÚS · todas las variantes (elige la que pida el examen)
// CUÁNDO: "insiste hasta que sea válido", "vuelve a pedir", "menú hasta salir"
// ===========================================================

        // -------- [P7A] Validar UNA opción e insistir (do-while simple) --------
        // CUÁNDO: validar una sola opción (NO repite el menú)
        static void menu7A() {
            int op;
            do {
                System.out.println("1. Alta  2. Buscar  3. Salir");
                op = VaticanoApp.teclado.nextInt();
            } while (op < 1 || op > 3);   // repite hasta que introduzca 1, 2 o 3

            // versión TEXTO (SI/NO, FIESTAS/HUELGA):
            String tipo;
            do {
                tipo = VaticanoApp.teclado.next();
            } while (!tipo.equals("SI") && !tipo.equals("NO"));
        }


        // -------- [P7B] Menú que se REPITE, salir con NÚMERO (0) --------
        // CUÁNDO: "después de cada acción vuelve a mostrar el menú", salir = opción 0
        static void menu7B() {
            int opcion;
            do {
                System.out.println("--- MENÚ ---");
                System.out.println("1. Alta  2. Cobrar  3. Mostrar  0. Salir");
                opcion = VaticanoApp.teclado.nextInt();
                switch (opcion) {
                    case 1: /* altaUsuario(); */ break;
                    case 2: /* cobrar();      */ break;
                    case 3: /* mostrarLista();*/ break;
                    case 0: System.out.println("Saliendo..."); break;
                    default: System.out.println("Opción no válida.");
                }
            } while (opcion != 0);   // vuelve al menú hasta elegir 0
            // el break del switch NO sale del bucle, solo del switch -> vuelve al menú
        }


        // -------- [P7C] Menú que se REPITE, salir con PALABRA "salir" --------
        // CUÁNDO: "escribe una opción o 'salir'"
        // Lee TEXTO (porque "salir" no es número) y convierte con parseInt.
        static void menu7C() {
            String entrada;
            do {
                System.out.println("--- MENÚ ---");
                System.out.println("1. Alta usuario");
                System.out.println("2. Cobrar");
                System.out.println("Escribe una opción o 'salir':");
                entrada = VaticanoApp.teclado.nextLine();   // leo TEXTO (puede ser "salir" o "2")

                if (!entrada.equals("salir")) {             // si NO es salir, proceso la opción
                    try {
                        int opcion = Integer.parseInt(entrada);   // convierto "2" -> 2
                        switch (opcion) {
                            case 1: /* altaUsuario(); */ break;
                            case 2: /* cobrar();      */ break;
                            default: System.out.println("Opción no válida.");
                        }
                    } catch (NumberFormatException e) {     // si escribe algo que no es número
                        System.out.println("Entrada no válida. Escribe un número o 'salir'.");
                    }
                }
            } while (!entrada.equals("salir"));   // repite mientras NO escriba "salir"
            System.out.println("Saliendo del programa...");
        }


        // -------- [P7D] Validar texto SI/NO que insiste (sin menú) --------
        // CUÁNDO: "responde SI o NO, insiste hasta que sea válido" (referéndum, gratuito S/N)
        static void menu7D() {
            String resp;
            do {
                System.out.println("¿SÍ o NO? [SI, NO]");
                resp = VaticanoApp.teclado.next();
            } while (!resp.equals("SI") && !resp.equals("NO"));
            // al salir del while ya tengo SI o NO garantizado
        }

        // ¿CUÁL USO?
        //  [P7A] validar una opción una vez (no repite menú)
        //  [P7B] menú que se repite, salir con NÚMERO (0)
        //  [P7C] menú que se repite, salir con PALABRA "salir" (+ try por si no es número)
        //  [P7D] validar SI/NO (o FIESTAS/HUELGA) que insiste

// ===========================================================
// [P8] ESTADÍSTICA: matriz conteo + porcentaje
// CUÁNDO: "cuántos hay de cada estado", "porcentaje", "matriz"
// ===========================================================
        static void estadisticas() {

            // Creo una matriz de 2 filas y 3 columnas, llena de ceros.
            // Fila 0 = el CONTEO (cuántos hay de cada estado).
            // Fila 1 = el PORCENTAJE de cada estado.
            // 3 columnas = los 3 estados (SOLICITUD_OK, EN_COLA, BENDECIDO).
            double[][] m = new double[2][3];

            // Recorro TODOS los peregrinos de la lista, uno a uno.
            for (Peregrino p : VaticanoApp.registrados) {

                // Miro el estado de ESTE peregrino y sumo 1 en su casilla del conteo.
                switch (p.getEstado()) {

                    case SOLICITUD_OK:
                        m[0][0]++;   // fila 0 (conteo), columna 0 (SOLICITUD_OK): +1
                        break;

                    case EN_COLA:
                        m[0][1]++;   // fila 0 (conteo), columna 1 (EN_COLA): +1
                        break;

                    case BENDECIDO:
                        m[0][2]++;   // fila 0 (conteo), columna 2 (BENDECIDO): +1
                        break;
                }
            }
            // Al terminar el for, la FILA 0 ya tiene cuántos hay de cada estado.

            // Cuento cuántos peregrinos hay en total (para calcular los porcentajes).
            int total = VaticanoApp.registrados.size();

            // Recorro las 3 columnas para calcular el porcentaje de cada estado.
            for (int i = 0; i < 3; i++) {
                // Porcentaje = conteo de esa columna × 100 / total.
                // Lo guardo en la FILA 1 (la de porcentajes), misma columna.
                m[1][i] = m[0][i] * 100 / total;
            }
            // Al terminar, la FILA 1 tiene el % de cada estado.
        }



// ===========================================================
// [E-1] equals() + hashCode()  (no repetir por un atributo en Set)
// CUÁNDO: "sin repetir DNI/id" + colección Set
// PEGA ESTO DENTRO de la clase del objeto (Peregrino/Docente),
// cambiando el atributo (aquí numReserva).
// ===========================================================
        static class EjemploEquals {
            private Integer numReserva;

            @Override
            public boolean equals(Object o) {
                // Si el objeto que comparo es null, o NO es de la misma clase, no son iguales.
                if (o == null || getClass() != o.getClass()) return false;
                // Convierto el Object generico 'o' a mi tipo (EjemploEquals) para poder leer su atributo.
                EjemploEquals x = (EjemploEquals) o;
                // Son iguales SOLO si su numReserva coincide. Objects.equals compara sin petar si es null.
                return Objects.equals(numReserva, x.numReserva);
            }

            @Override
            public int hashCode() {
                // El hashCode se calcula con el MISMO atributo que el equals (numReserva).
                // equals y hashCode SIEMPRE van juntos y por el mismo atributo.
                return Objects.hashCode(numReserva);
            }
            // IntelliJ lo genera solo: clic derecho -> Generate -> equals() and hashCode()
        }

// ===========================================================
// [E-2] FILTRAR por tipo con instanceof
// CUÁNDO: "muestra solo los de tipo X" (lista mezclada)
// ===========================================================
        static void filtrarPorTipo() {
            // Recorro toda la lista (que tiene mezclados Nacional, Extranjero...).
            for (Peregrino p : VaticanoApp.registrados) {
                // instanceof pregunta: ¿este peregrino ES de tipo Nacional?
                if (p instanceof Nacional) {       // ¿es de este tipo?
                    // Solo imprimo los que SÍ son Nacional; los demás los ignora.
                    System.out.println(p);
                }
            }
        }

// ===========================================================
// [E-3] ORDENAR (de mayor a menor con Comparator)
// CUÁNDO: "ordenado por X", "de mayor a menor"
// Comparator en clase aparte (o anónima). .reversed() = invertir
// ===========================================================
        static class PorReserva implements Comparator<Peregrino> {
            @Override
            public int compare(Peregrino a, Peregrino b) {
                // Comparo dos peregrinos por su numReserva.
                // compareTo devuelve: negativo si a<b, 0 si iguales, positivo si a>b.
                // Eso ordena de MENOR a MAYOR.
                return a.getNumReserva().compareTo(b.getNumReserva());
            }
        }

        static void ordenar() {
            // Un Set no se puede ordenar directamente, así que lo paso a una List (ArrayList).
            List<Peregrino> lista = new ArrayList<>(VaticanoApp.registrados);
            // sort() ordena la lista usando mi Comparator: de menor a mayor.
            lista.sort(new PorReserva());              // de menor a mayor
            // .reversed() le da la vuelta al orden: de MAYOR a menor.
            // lista.sort(new PorReserva().reversed()); // de mayor a menor
        }

// ===========================================================
// [E-4] VALIDAR FORMATO con .matches()
// CUÁNDO: "valida el formato del DNI/matrícula"
// ===========================================================
        static boolean validarFormato(String doc) {
            // matches devuelve true SOLO si TODA la cadena cumple el patrón exacto.
            // "[0-9]{8}[A-Z]" = 8 dígitos seguidos de 1 letra mayúscula (un DNI).
            return doc.matches("[0-9]{8}[A-Z]");   // 8 números + 1 letra (DNI)
            // matrícula 1234BCD:  "[0-9]{4}[A-Z]{3}"  (4 números + 3 letras)
            // [0-9]=un número, {8}=ocho veces, [A-Z]=una letra mayúscula
        }

// ===========================================================
// [E-5] MAP clave -> valor
// CUÁNDO: "guarda X asociado a Y y accede por la clave"
// (pueblo->votos, palabra->significado). NO para buscar en lista.
// ===========================================================
        static void usarMap() {
            // Map = pares clave->valor. Aquí: nombre de pueblo (String) -> nº votos (Integer).
            Map<String, Integer> votos = new HashMap<>();   // TreeMap si lo quieres ordenado
            String pueblo = "Mutxamel";
            // getOrDefault(pueblo, 0) = los votos que ya tiene ese pueblo, o 0 si aún no está.
            // Le sumo 1 y lo vuelvo a guardar con put. Así voy contando votos por pueblo.
            votos.put(pueblo, votos.getOrDefault(pueblo, 0) + 1);  // suma 1
            // keySet() = todas las claves (los nombres de pueblo). Recorro cada una.
            for (String clave : votos.keySet()) {
                // get(clave) = el valor (los votos) de ese pueblo.
                System.out.println(clave + ": " + votos.get(clave));
            }
        }

// ===========================================================
// [E-6] COLA FIFO con poll (atender por orden de llegada)
// CUÁNDO: "el primero que llega es el primero que sale"
// ===========================================================
        static void atenderPorOrden() {
            // Una cola (Queue): el primero que entró es el primero que sale (FIFO).
            Queue<Peregrino> fila = VaticanoApp.fila;
            // offer(p) METE un peregrino al final de la cola.
            // fila.offer(p);  // meter al final
            // Mientras la cola NO esté vacía, sigo atendiendo.
            while (!fila.isEmpty()) {
                // poll() SACA el primero de la cola Y lo elimina de ella.
                Peregrino p = fila.poll();   // saca el primero Y lo quita
                // Atiendo a ese peregrino (hago lo que toque con él).
                p.recibirBesico();
            }
        }

// ===========================================================
// [E-7] ENCAPSULADO · control de dato que INSISTE
// CUÁNDO: "controla que no se den de alta con [dato] inválido", "aplica encapsulación"
// El control va en el SETTER. El constructor debe LLAMAR al setter. (PATRI)
// ===========================================================
        static class EjemploEncapsulado {
            private int edad;

            public EjemploEncapsulado(int edad) {
                // El constructor NO hace this.edad = edad directo, sino que LLAMA al setter,
                // para que la edad pase por el control de validación.
                setEdad(edad);                // <-- pasa por el control, NO this.edad = edad
            }
            public void setEdad(int edad) {
                Scanner teclado = new Scanner(System.in);
                // Mientras la edad sea inválida (negativa), repito: aviso y pido otra.
                while (edad < 0) {            // mientras sea INVÁLIDO, insiste
                    System.out.println("ERROR. Edad no válida. Introduce la edad:");
                    edad = teclado.nextInt();   // leo una edad nueva y vuelvo a comprobar
                }
                // Solo llego aquí cuando la edad ya es válida (0 o más): la guardo.
                this.edad = edad;            // sale del while = ya es válido
            }
            // TRAMPAS:
            //  - while al revés (edad > 0) rechaza las edades buenas. Es edad < 0
            //  - constructor con this.edad=edad en vez de setEdad() se SALTA el control
            // VARIANTE (Patri): valor comodín (-1) y comprobar en la App antes del .add()
        }
    }
}