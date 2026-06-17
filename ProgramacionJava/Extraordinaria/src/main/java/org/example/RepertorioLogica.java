package org.example;

import java.util.*;

/* ================================================================
   REPERTORIO DE LOGICA PURA - PLAN DE ATAQUE (haz SIEMPRE estos 4 pasos antes de teclear)
   ----------------------------------------------------------------
   1. Que ENTRA?  Mira el ejemplo de entrada del enunciado.
        - Una cadena de letras?  (SQUASH: "AABBSF")
        - Una cadena con separadores?  (PADEL: "54-12-25-8")
        - Datos sueltos en bucle hasta una palabra?  (SERIES)
   2. Que SALE?  Mira el ejemplo de SALIDA. Es tu meta EXACTA
        (espacios, guiones, mayusculas... cópialo igual).
   3. Que pasa EN MEDIO, en ESPANOL?  Escribe los pasos en espanol
        ANTES de Java. ESTO ES EL 80%. Si no sabes decirlo en
        espanol, no sabras decirlo en Java.
   4. Que CONTROLES hacen falta?  Cada "valida que...", "si no es
        correcto...", "insiste hasta..." es un control. Cuéntalos.
        Luego copia cada control de la seccion [C] de abajo.

   SI TE BLOQUEAS: escribe al menos el Scanner y el bucle. Eso ya
   puntua. Un ejercicio a medias da mas que en blanco.

   ----------------------------------------------------------------
   INDICE
   ----------------------------------------------------------------
   CONTROLES SUELTOS (las piezas que se combinan):
     [C1] Validar formato con .matches()  (regex)
     [C2] Trocear una cadena con .split()
     [C3] Convertir texto a numero con Integer.parseInt()
     [C4] Validar rango de un numero (1..90) con flag + break
     [C5] Recorrer cadena letra a letra con charAt()
     [C6] Bucle infinito que reinicia: do{...}while(true) + continue
     [C7] Bucle hasta "salir" (do-while con palabra clave)
     [C8] Acumular en Map (nombre -> valor) y filtrar
     [C9] Limpiar el buffer del Scanner (nextInt + nextLine)
   EJERCICIOS RESUELTOS ENTEROS:
     [PADEL]   formato N-N-N-N, rango 1-90, suma<100, % culpa
     [SQUASH]  cadena A/B/S/F -> marcador por sets
     [SERIES]  datos hasta salir -> filtrar > 30 minutos
*/

public class RepertorioLogica {

    static Scanner teclado = new Scanner(System.in);


// ################################################################
// #####################  CONTROLES SUELTOS  ######################
// ################################################################

// ===========================================================
// [C1] VALIDAR FORMATO con .matches()  (expresion regular)
// CUANDO: "valida que el formato sea...", "si no coincide, error"
// ===========================================================
    static void c1_validarFormato() {
        String entrada = teclado.nextLine();
        // matches devuelve true SOLO si toda la cadena cumple el patron
        if (!entrada.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}")) {
            System.out.println("Formato incorrecto.");
        }
        // EXPLICACION del patron "\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}":
        //   \\d   = un digito (0-9)              (en Java la barra va doble: \\d)
        //   {1,2} = entre 1 y 2 veces            (numeros de 1 o 2 cifras)
        //   -     = un guion literal
        //   => valida "54-12-25-8" pero NO "5-4-2" ni "abc"
        // OTROS PATRONES UTILES:
        //   DNI 8 numeros + letra:      "[0-9]{8}[A-Z]"
        //   matricula 1234BCD:          "[0-9]{4}[A-Z]{3}"
        //   solo numeros, cualquier nº: "\\d+"
        //   palabra de letras:          "[a-zA-Z]+"
    }

// ===========================================================
// [C2] TROCEAR una cadena con .split()
// CUANDO: la entrada viene junta con separadores y necesitas las partes
// ===========================================================
    static void c2_trocear() {
        String culpas = "54-12-25-8";
        String[] partes = culpas.split("-");   // corta por cada guion
        // partes = ["54", "12", "25", "8"]   -> es un vector de String
        // partes.length = 4
        // partes[0] = "54" (sigue siendo TEXTO, no numero -> ver [C3])
        // se separa por coma: split(",") | por espacio: split(" ")
    }


// ===========================================================
// [C3] CONVERTIR texto a numero con Integer.parseInt()
// CUANDO: tienes un String que es un numero y quieres operar con el
// ===========================================================
    static void c3_aNumero() {
        String texto = "54";
        int num = Integer.parseInt(texto);   // "54" (texto) -> 54 (numero)
        // ahora SI puedes sumar/comparar: num + 1, num > 90, etc.
        // para decimales: Double.parseDouble("3.5")
        // OJO: si el texto no es un numero ("abc"), peta (NumberFormatException)
    }


// ===========================================================
// [C4] VALIDAR RANGO de cada numero (1..90) con flag + break
// CUANDO: "cada valor debe estar entre X e Y", recorriendo un vector
// ===========================================================
    static void c4_validarRango(String[] vector) {
        int suma = 0;
        boolean control = false;          // flag: ¿hubo algun valor malo?

        for (int i = 0; i < vector.length; i++) {
            int num = Integer.parseInt(vector[i]);
            if (num < 1 || num > 90) {    // fuera de rango
                System.out.println("Valor incorrecto (debe estar entre 1 y 90)");
                control = true;           // marco que hubo error
                break;                    // salgo del for, no sigo sumando
            } else {
                suma += num;              // valido -> sumo
            }
        }
        // despues del for: si hubo error, no continuo con el resto
        // if (control) { continue; }   <- (dentro del bucle grande)
        //
        // POR QUE EL FLAG: el break sale del for, pero necesito "recordar"
        // fuera del for que hubo un error, para no seguir con la logica buena.
        // El boolean control es esa memoria.
    }


// ===========================================================
// [C5] RECORRER cadena LETRA A LETRA con charAt()
// CUANDO: te dan un texto y hay que mirar/contar cada caracter
// ===========================================================
    static void c5_recorrerLetras(String cadena) {
        int a = 0, b = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);    // la letra en la posicion i
            if (c == 'A') a++;            // los char van con comillas SIMPLES 'A'
            if (c == 'B') b++;
        }
        // length() = numero de letras | charAt(i) = letra en posicion i
    }


    // ===========================================================
// [C6] BUCLE INFINITO que reinicia: do{...}while(true) + continue
// CUANDO: "el programa vuelve a empezar", validaciones que reintentan
// ===========================================================
    static void c6_bucleInfinito() {
        do {
            String entrada = teclado.nextLine();
            if (entrada.equals("malo")) {
                System.out.println("Reintenta...");
                continue;     // SALTA al principio del bucle (no ejecuta lo de abajo)
            }
            // ... aqui va la logica buena, solo se llega si NO hubo continue ...
        } while (true);       // se repite para siempre (sale con un break o return)
        // continue = "vuelve arriba ya" | break = "sal del bucle del todo"
    }


    // ===========================================================
// [C7] BUCLE hasta "salir" (do-while con palabra clave)
// CUANDO: "pide datos hasta que escriba salir"
// ===========================================================
    static void c7_hastaSalir() {
        String entrada;
        do {
            System.out.println("Introduce algo (o 'salir'):");
            entrada = teclado.nextLine();
            if (!entrada.equals("salir")) {
                // procesar el dato (el if evita procesar la palabra "salir")
            }
        } while (!entrada.equals("salir"));
    }


    // ===========================================================
// [C8] ACUMULAR en Map (nombre -> valor) y filtrar
// CUANDO: guardas un valor asociado a un nombre y luego filtras
// ===========================================================
    static void c8_map() {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("breaking bad", 2222);          // guarda nombre -> minutos
        for (String clave : mapa.keySet()) {     // keySet = los nombres
            if (mapa.get(clave) > 30) {          // get(clave) = su valor
                System.out.println(clave + " con " + mapa.get(clave) + " minutos.");
            }
        }
    }


    // ===========================================================
// [C9] LIMPIAR el buffer del Scanner (nextInt + nextLine)
// CUANDO: mezclas nextInt() y nextLine() y se "salta" una lectura
// ===========================================================
    static void c9_limpiarBuffer() {
        int n = teclado.nextInt();
        teclado.nextLine();   // <- limpia el ENTER que deja nextInt, si no
        //    el siguiente nextLine() leeria vacio
    }


// ################################################################
// #################  EJERCICIOS RESUELTOS ENTEROS  ###############
// ################################################################

    // ===========================================================
// [PADEL] POR QUE PIERDO AL PADEL
// ENTRA: cadena "N-N-N-N" (pista, pala, compi, pelota), cada uno 1-90.
// SALE:  "Tienes un X% de culpa."  con X = 100 - suma.
// CONTROLES: C1 formato + C2 split + C3 parseInt + C4 rango 1-90 + suma<100.
// EN ESPANOL: 1) pido la cadena. 2) valido formato N-N-N-N; si no, error y
//   reintento. 3) la troceo en 4 numeros. 4) por cada numero compruebo
//   1-90 y voy sumando; si uno falla, aviso y reintento. 5) si la suma
//   es >=100, error y reintento. 6) si todo bien, muestro 100 - suma.
// ===========================================================
    static void padel() {
        do {
            System.out.println("Introduce el porcentaje de culpa (pista-pala-compi-pelota):");
            String culpas = teclado.nextLine();

            // CONTROL 1: formato N-N-N-N (1 o 2 digitos cada uno)
            if (!culpas.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}")) {
                System.out.println("Formato incorrecto.");
                continue;                         // vuelve a pedir
            }

            // CONTROL 2: trocear en vector
            String[] vector = culpas.split("-");

            int suma = 0;
            boolean control = false;              // flag de valor malo

            // CONTROL 3 + 4: cada numero, convertir y validar rango 1-90
            for (int i = 0; i < vector.length; i++) {
                int num = Integer.parseInt(vector[i]);
                if (num < 1 || num > 90) {
                    System.out.println("Valor incorrecto (debe estar entre 1 y 90)");
                    control = true;
                    break;                        // sale del for
                } else {
                    suma += num;
                }
            }
            if (control) continue;                // si hubo valor malo, reintenta

            // CONTROL 5: la suma no puede llegar a 100
            if (suma >= 100) {
                System.out.println("ERROR. La suma es mayor a 100.");
                continue;                         // reintenta
            }

            // TODO OK: muestro el resultado
            System.out.println("Tienes un " + (100 - suma) + "% de culpa.");

        } while (true);   // bucle infinito; sale cerrando el programa
    }


    // ===========================================================
// [SQUASH] PARTIDO DE SQUASH
// ENTRA: cadena de A/B/S/F (ej "AABBSAABBF"). A=punto A, B=punto B,
//        S=fin de set, F=fin del partido.
// SALE:  marcador por sets (ej "9-11 2-3").
// CONTROLES: C1 validar (acaba en F, sin F antes) + C5 recorrer letras.
// EN ESPANOL: 1) pido la cadena. 2) valido que acabe en F y no haya F
//   antes; si no, "El formato no es correcto." 3) recorro letra a letra.
//   4) A suma a puntosA, B a puntosB. 5) S o F cierran el set: muestro
//   "puntosA-puntosB " y reinicio los dos a 0.
// ===========================================================
    static void squash() {
        System.out.println("Introduce los tantos para cada jugador:");
        String cadena = teclado.next();

        // CONTROL 1: acaba en F y no hay F en otra posicion
        if (!cadena.endsWith("F") || cadena.indexOf("F") != cadena.length() - 1) {
            System.out.println("El formato no es correcto.");
            return;
        }
        // endsWith("F")            = ¿termina en F?
        // indexOf("F")            = posicion de la PRIMERA F
        // length()-1              = posicion de la ULTIMA letra
        // si la primera F NO es la ultima letra -> hay una F antes -> malo

        // CONTROL 5: recorrer contando, S/F cierran set
        int a = 0, b = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == 'A') a++;
            if (c == 'B') b++;
            if (c == 'S' || c == 'F') {     // fin de set o de partido
                System.out.print(a + "-" + b + " ");
                a = 0; b = 0;               // reinicio para el siguiente set
            }
        }
    }


    // ===========================================================
// [SERIES] CONTENIDO MAS VISTO
// ENTRA: nombre de serie + minutos, repetido, hasta "salir".
// SALE:  series vistas mas de 30 minutos, con nombre y minutos.
// CONTROLES: C7 hasta salir + C9 limpiar buffer + C8 Map + filtro >30.
// EN ESPANOL: 1) en bucle pido nombre; si es "salir" paro. 2) si no,
//   pido minutos y guardo nombre->minutos en un Map. 3) al salir, recorro
//   el Map y muestro solo los que pasan de 30.
// ===========================================================
    static void series() {
        Map<String, Integer> series = new HashMap<>();
        String nombre;
        do {
            System.out.println("Introduce el nombre de tu serie (o 'salir'):");
            nombre = teclado.nextLine();
            if (!nombre.equals("salir")) {
                System.out.println("Minutos:");
                int min = teclado.nextInt();
                teclado.nextLine();              // CONTROL 9: limpia el enter
                series.put(nombre, min);         // CONTROL 8: guarda nombre->minutos
            }
        } while (!nombre.equals("salir"));

        System.out.println("Las series que has visto mas de 30 minutos son:");
        for (String s : series.keySet()) {
            if (series.get(s) > 30) {            // filtro > 30
                System.out.println(s + " con " + series.get(s) + " minutos.");
            }
        }
    }


// ===========================================================
// RECONOCER QUE EJERCICIO ES (por la entrada):
//   "cadena de letras A/B/S/F"        -> SQUASH (charAt, [C5])
//   "cadena con guiones N-N-N-N"      -> PADEL (matches+split+parseInt)
//   "datos hasta salir" + nombre/valor-> SERIES (Map, [C8])
// CONTROLES MAS COMUNES (cuéntalos en el enunciado):
//   "valida el formato"   -> [C1] matches
//   "separa / cada parte" -> [C2] split
//   "entre X e Y"         -> [C4] rango + flag
//   "vuelve a pedir"      -> [C6] continue
//   "hasta salir"         -> [C7]
// ===========================================================

}