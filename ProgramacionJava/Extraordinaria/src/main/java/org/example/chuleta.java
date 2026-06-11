package org.example;

public class chuleta {
//    # 📋 CHULETA — EXAMEN PRÁCTICO (plantillas listas para copiar)
//
//> **Regla de oro:** monta primero TODO el esqueleto y que **COMPILE**, y después rellenas la lógica. **Prohibido lambdas y streams.**
//
//            **Orden de montaje:** 1) enum → 2) interfaz → 3) clase abstracta padre → 4) clases hijas → 5) clase con la colección → 6) excepción → 7) App (main).
//
//            ---
//
//            ## 1. enum
//
//```java
//    public enum Experiencia {
//        HORRIBLE, MEJORABLE, INTUITIVA, EXCELENTE;
//    }
//```
//
//        **enum con atributo (si lo piden):**
//            ```java
//    public enum Estado {
//        ACTIVO("disponible"), INACTIVO("no disponible");
//
//        private String descripcion;
//        Estado(String descripcion) {          // constructor SIEMPRE private (sin escribir 'private')
//            this.descripcion = descripcion;
//        }
//        public String getDescripcion() { return descripcion; }
//    }
//```
//
//        ---
//
//        ## 2. Interfaz
//
//```java
//    public interface Accion {
//        void hacerAlgo();        // solo cabeceras, sin cuerpo, acaban en ;
//    }
//```
//
//        ---
//
//        ## 3. Clase abstracta PADRE
//
//```java
//    public abstract class Padre {
//        private String dato;
//        private boolean estado;
//
//        public Padre() { }                       // VACÍO (necesario para el constructor parcial de las hijas)
//
//        public Padre(String dato) {              // completo
//            this.dato = dato;
//        }
//
//        public abstract String metodoAbstracto();   // sin cuerpo
//
//        // getters y setters (SIN static)...
//    }
//```
//
//        ---
//
//        ## 4. Clases HIJAS (super + los DOS constructores)
//
//```java
//    public class Hija extends Padre {
//        private String propio;
//
//        public Hija(String dato, String propio) {   // COMPLETO: hereda + propio
//            super(dato);                            // 1ª línea: pasa lo heredado al padre
//            this.propio = propio;
//        }
//
//        public Hija(String propio) {                // PARCIAL: solo lo propio (super() vacío implícito)
//            this.propio = propio;
//        }
//
//        @Override
//        public String metodoAbstracto() {
//            return "...";
//        }
//        // getters/setters propios
//    }
//```
//
//        ---
//
//        ## 5. Clase con la COLECCIÓN estática
//
//```java
//    public class Censo {
//        static ArrayList<Votante> censo = new ArrayList<>();
//
//        public static void generarCenso() {
//            censo.add(new Nacional("Mutxamel", "Patricia", "12345678X"));
//            // ... más votantes
//        }
//    }
//```
//
//        ---
//
//        ## 6. Excepción personalizada
//
//```java
//    public class FraudeException extends Exception {
//        public FraudeException(String mensaje) {
//            super(mensaje);
//        }
//    }
//```
//        - **Lanzar:** `throw new FraudeException("¡AVISO! ...");`
//            - **Capturar:** `try { ... } catch (FraudeException e) { System.out.println(e.getMessage()); }`
//            - *Hereda de `Exception` (obliga a try-catch) o de `RuntimeException` (no obliga).*
//
//            ---
//
//            ## 7. App: colecciones estáticas
//
//```java
//    static Scanner teclado = new Scanner(System.in);
//    static double[][] matriz = new double[2][4];                 // 2 filas x 4 columnas
//    static Collection<Votante> yaHanVotado = new HashSet<>();    // SIN duplicados
//    static Map<String,Integer> votosPorPueblo = new TreeMap<>(); // ORDENADO por clave
//```
//
//        ---
//
//        ## 8. Bucle principal + validar "insistiendo"
//
//            **Bucle hasta "salir":**
//            ```java
//while (true) {
//        try {
//            System.out.println("Introduce ... ó SALIR:");
//            String entrada = teclado.nextLine().toUpperCase();
//
//            if (entrada.equals("SALIR")) {
//                recuento();
//                break;                  // rompe el bucle
//            }
//            // ... resto del flujo
//
//        } catch (FraudeException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//```
//
//        **Insistir hasta opción válida (SI/NO):**
//            ```java
//    String opcion;
//do {
//        System.out.println("¿SI o NO? [SI, NO]");
//        opcion = teclado.nextLine().toUpperCase();
//    } while (!opcion.equals("SI") && !opcion.equals("NO"));
//```
//
//        ---
//
//        ## 9. Buscar en la colección (devuelve null si no está)
//
//```java
//    public static Votante buscar(String dni) {
//        for (Votante v : Censo.censo) {
//            if (v instanceof Nacional n && n.getDni().equals(dni)) {
//                return v;          // encontrado
//            }
//        }
//        return null;               // no encontrado
//    }
//```
//        **Strings SIEMPRE con `.equals()`, nunca `==`.**
//
//            ---
//
//            ## 10. Borrar con Iterator
//
//```java
//    public static void borrarDelCenso(Votante votante) {
//        Iterator<Votante> it = censo.iterator();
//        while (it.hasNext()) {
//            Votante v = it.next();      // SIEMPRE next() ANTES de remove()
//            if (v.equals(votante)) {
//                it.remove();
//            }
//        }
//    }
//```
//
//        ---
//
//        ## 11. Validar formato con .matches()
//
//            ```java
//numero.matches("\\d{8}[A-Za-z]")    // 8 dígitos + 1 letra → true / false
//        ```
//
//        ---
//
//        ## 12. Polimorfismo (mismo método, cada uno el suyo)
//
//```java
//for (Votante v : lista) {
//        v.metodoAbstracto();     // cada objeto ejecuta SU versión
//    }
//```
//
//        ---
//
//        ## 13. Matriz de estadísticas (conteo + %)
//
//```java
//// fila 0 = conteo  |  fila 1 = porcentaje sobre 100
//    matriz[0][opcion - 1]++;                 // suma 1 a la categoría elegida
//
//    // al final (recuento): total y porcentajes
//    double total = 0;
//for (int c = 0; c < 4; c++) total += matriz[0][c];
//for (int c = 0; c < 4; c++) matriz[1][c] = matriz[0][c] / total * 100;
//```
//
//        ---
//
//        ## 14. Map: meter y contar
//
//```java
//// sumar 1 a un pueblo (si no existe, empieza en 0):
//votosPorPueblo.put(pueblo, votosPorPueblo.getOrDefault(pueblo, 0) + 1);
//
//// recorrer un Map:
//for (Map.Entry<String,Integer> e : votosPorPueblo.entrySet()) {
//        System.out.println(e.getKey() + ": " + e.getValue());
//    }
//```
//
//        ---
//
//        ## 15. Recordatorio de colecciones (UD7)
//
//| Estructura | Tipo Java | Métodos |
//            |---|---|---|
//            | **Cola** FIFO (peaje, fila) | `Queue` → `LinkedList` | `offer` añadir · `poll` sacar 1º · `peek` mirar |
//            | **Pila** LIFO (bandeja, apilar) | `Stack` | `push` añadir · `pop` sacar último · `peek` mirar |
//            | **Map** clave→valor | `HashMap` (sin orden) · `TreeMap` (ordenado) | `put` · `get` · `getOrDefault` |
//            | **Set** sin duplicados | `HashSet` · `TreeSet` (ascendente) | `add` · `contains` |
//            | **Prioridad** | `PriorityQueue` | `offer` · `poll` |
//
//            ---
//
//            ## ⚠️ 16. Errores típicos (revísalos antes de entregar)
//
//- Strings con **`.equals()`**, no `==`.
//            - **Constructores:** sin `static`, sin `void`. **Getters/setters:** sin `static`.
//            - **`super(...)`** es la **1ª línea** del constructor hijo.
//- **enum:** constructor `private`.
//            - **Iterator:** `next()` ANTES de `remove()`.
//            - **`matriz = new double[2][4];`** inicializada.
//- **TreeMap/TreeSet** = ordenados ascendente. **HashMap/HashSet** = sin orden.
//            - **NO** lambdas ni streams.
//}
