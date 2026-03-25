<p align="center">
  <img src="img/banner.png" alt="Learning Curve Banner" width="100%">
</p>
<h1 align="center"> Práctica 2. Sistema de modernización para el MUTXAMEL FC vs Real Madrid </h1>
<h2 align="center"> Manuela Planelles - 1º DAW - IES Mutxamel</h2>

---
---

## Índice

1. [Introducción]()
2. [Objetivos de la práctica]()
3. [Diseño e Implementación del programa]()
   - [3.1. Estructura de clases]()
     - [Clase Enum Posiciones]()
     - [Clase Enum Equipos]()
     - [Clase Abstract MutxamelFC]()
     - [Clase Interface FuncionesIntegrantes]()
     - [Clase Interface AccionesDeportivas]()
     - [Clase Masajista]()
     - [Clase Jugador]()
     - [Clase Acompañante]()
     - [Clase Entrenador]()
     - [Clase Exception ControlDorsal]()
     - [Clase Exception ControlformacionPreferida]()
     - [Clase AppMutxamelFC]()
     - [Clase AppMantenimiento]()
4. [Relaciones entre clases]()
5. [Plan de pruebas finales]()
6. [Documentación Javadoc]()
7. [Conclusión]()
    

---
---
## 1. Introducción
Esta aplicación gestiona el sistema del MUTXAMEL FC, un club de fútbol local que se ha clasificado para la Copa del Rey contra el Real Madrid. La app permite visualizar los equipos del club y sus jugadores, así como crear y modificar los distintos miembros del club: jugadores, entrenadores y masajistas.

La aplicación se divide en dos partes:

- AppMutxamelFC: simula el día a día del club, desde la concentración hasta la celebración del gol.
- AppMantenimiento: menú interactivo para gestionar los integrantes del club.

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

## 2. Objetivos de la práctica

El objetivo es aplicar los conceptos de POO vistos en clase. Por un lado el documento pide desarrollar un software de mantenimiento para el club siguiendo un diagrama UML concreto, con excepciones personalizadas y dos aplicaciones principales. Por otro lado la profesora pide que se trabajen los siguientes conceptos:
- Herencia: Jugador, Entrenador, Masajista y Acompanyante heredan de MutxamelFC
- Clase abstracta: MutxamelFC como base común
- Interfaces: FuncionesIntegrantes y AccionesDeportivas
- Enums: Equipos y Posiciones
- Excepciones personalizadas: dorsal duplicado y formato de formación incorrecto
- Polimorfismo: Este concepto no se ha llegado a implementar

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

## 3. Diseño e Implementación del programa

### 3.1. Estructura de clases

#### Clase Enum `Posiciones`

<details>
<summary>Ver el código completo.</summary>
  
```java
package practicas.SistemaModernizacionMutxamel;

public enum Posiciones {
    PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO;

}

```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase Enum `Equipos`

<details>
<summary>Ver el código completo.</summary>
  
```java
package practicas.SistemaModernizacionMutxamel;

public enum Equipos {
    BENJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, SENIOR;

}

```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase Abstract `MutxamelFC`

<details>
<summary>Ver el código completo.</summary>
  
```java
package practicas.SistemaModernizacionMutxamel;

abstract class MutxamelFC implements FuncionesIntegrantes{
    private String nombre;
    private int edad;

    public MutxamelFC(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    @Override
    public void concentrarse() {
        System.out.println(nombre + " se esta concentrando.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(nombre + " viaja a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("¡GOOOOOOOOOOOL! "+ this.nombre +" celebra el gol!");
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "MutxamelFC{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase Interface `FuncionesIntegrantes`

<details>
<summary>Ver el código completo.</summary>
  
```java
package practicas.SistemaModernizacionMutxamel;

abstract class MutxamelFC implements FuncionesIntegrantes{
    private String nombre;
    private int edad;

    public MutxamelFC(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    @Override
    public void concentrarse() {
        System.out.println(nombre + " se esta concentrando.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(nombre + " viaja a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("¡GOOOOOOOOOOOL! "+ this.nombre +" celebra el gol!");
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "MutxamelFC{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}


```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase Interface `AccionesDeportivas`

<details>
<summary>Ver el código completo.</summary>
  
```java
package practicas.SistemaModernizacionMutxamel;

public interface AccionesDeportivas {
    void entrenar();
    void jugarPartido(String rival);


}

```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase `Masajista`

<details>
<summary>Ver el código completo.</summary>
  
```java
package practicas.SistemaModernizacionMutxamel;

import java.util.ArrayList;

public class Masajista extends MutxamelFC{
    private String titulacion;
    private int anyosExperiencia;
    public static ArrayList<Masajista> listaMasajistas = new ArrayList<>();

    public Masajista(String nombre, int edad, String titulacion, int anyosExperiencia){
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anyosExperiencia=anyosExperiencia;
    }



    public void darMasaje(Jugador jugador){
        System.out.println("El masajista " + this.getNombre() + " esta dando un masaje al jugador " + jugador.getNombre());
    }


    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    public static ArrayList<Masajista> getListaMasajistas() {
        return listaMasajistas;
    }

    public static void setListaMasajistas(ArrayList<Masajista> listaMasajistas) {
        Masajista.listaMasajistas = listaMasajistas;
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista " + this.getNombre() + " se ha ido a la concentracion con el equipo.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista " + this.getNombre() + " acompaña al equipo en el viaje a " + ciudad + " para el partido.");
    }

    @Override
    public void celebrarGol() {
        System.out.println("¡GOOOOOOOOOOOL! "+ this.getNombre() +" celebra el gol!");
    }

    @Override
    public String toString() {
        return
        "Masajista{ Nombre: "  + getNombre() + ", Edad: " + getEdad() + ", Titulación: " + titulacion + ", Años experiencia: " + anyosExperiencia + "]";
    }
}

```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase `Jugador`

<details>
<summary>Ver el código completo.</summary>
  
```java
package practicas.SistemaModernizacionMutxamel;

import java.util.ArrayList;

public class Jugador extends MutxamelFC implements AccionesDeportivas{
    private Equipos categoria;
    private int dorsal;
    private Posiciones posiciones;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posiciones, ArrayList<Jugador> listaJugadores){
        super(nombre, edad);
        this.categoria=categoria;
        this.posiciones=posiciones;
        setDorsal(dorsal, listaJugadores);
    }

    public void calentar(){
        System.out.println(this.getNombre() + " esta calentando para salir al campo.");
    }
    public void descansar(){
        System.out.println("Al jugador " + this.getNombre() + " le toca descansar el proximo partido.");
    }
    public void marcarGol(){
        System.out.println(this.getNombre() + " levanta los brazos y grita ¡GOOOLL!");
    }

    public Posiciones getPosiciones() {
        return posiciones;
    }
    public void setPosiciones(Posiciones posiciones) {
        this.posiciones = posiciones;
    }
    public int getDorsal() {

        return dorsal;
    }
    //Si se intenta crear o modificar a un jugador en un mismo equipo con un dorsal que ya tiene asignado otro jugador.
    public void setDorsal(int dorsal, ArrayList<Jugador> listaJugadores) {
        for (Jugador jugador : listaJugadores){
            if (dorsal == jugador.getDorsal() && jugador.getCategoria().equals(categoria)){
                throw new ControlDorsal();
            }
        }
        this.dorsal = dorsal;
        listaJugadores.add(this);
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }


    @Override
    public void entrenar() {
        System.out.println(this.getNombre() + " esta entrenando para la posción de " + this.posiciones);
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println(this.getNombre() + " esta jugando el partido en la posición "+this.posiciones+" contra el "+ rival);
    }
    @Override
    public void concentrarse() {
        System.out.println("El jugador " + this.getNombre() + " se esta concentrando con su equipo.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El jugador " + this.getNombre() + " esta de viaje en " + ciudad + " para un shooting.");
    }

    @Override
    public void celebrarGol() {
        System.out.println("¡GOOOOOOOOOOOL! "+ this.getNombre() +" celebra el gol!");
    }

    @Override
    public String toString() {
        return
        "jugador{ Nombre: "  + getNombre() + ", Edad: " + getEdad() + ", Categoria =" + categoria + ", Dorsal=" + dorsal + ", Posiciones=" + posiciones + "]";

    }
}

```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase `Acompañante`

<details>
<summary>Ver el código completo.</summary>
  
```java
package practicas.SistemaModernizacionMutxamel;

public class Acompanyante extends MutxamelFC {
    private Jugador integrante;
    private String parentesco;

     public Acompanyante(String nombre, int edad, Jugador integrante,String parentesco){
         super(nombre,edad);
         this.integrante=integrante;
         this.parentesco=parentesco;
     }
     public void animarEquipo(){
         System.out.println("¡"+this.parentesco+" de " + integrante + " animando al equipo! ¡VAMOS MUTXAMEL!");
     }


    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }


    @Override
    public void concentrarse() {
        System.out.println(this.getNombre() + " se ha ido a compañar al equipo a la concentración.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println( this.getNombre() + " viaja con el equipo a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("¡GOOOOOOOOOOOL! "+ this.getNombre() +" celebra el gol!");
    }

}

```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase `Entrenador`

<details>
<summary>Ver el código completo.</summary>
  
```java
package practicas.SistemaModernizacionMutxamel;

import java.util.ArrayList;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{
    private Equipos equipos;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipos, String formacionPreferida, ArrayList<Entrenador>listaEntrenador){
        super(nombre, edad);
        this.equipos = equipos;
        setFormacionPreferida(formacionPreferida, listaEntrenador);
    }

    public void planificarEntrenamiento(){
        System.out.println("El entrenador " +  this.getNombre() +  " está planificando el entrenamiento con formación " + this.getFormacionPreferida());
    }
    public void hacerCambios(){
        System.out.println("El entrenador " +  this.getNombre() + " está realizando cambios tácticos en el equipo "+ this.equipos);
    }



    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida, ArrayList<Entrenador>listaEntrenador) {
        if(!formacionPreferida.matches("\\d-\\d-\\d")){
            throw new ControlformacionPreferida();
        }
        this.formacionPreferida = formacionPreferida;
        listaEntrenador.add(this);
    }

    @Override
    public void entrenar() {
        System.out.println( this.getNombre() + " esta entrenando al equipo " + equipos);
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El entrenador " + this.getNombre()+ " está dirigiendo el partido contra " + rival + " con formación " + this.formacionPreferida);
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + this.getNombre() + " esta en concentración con el equipo de " + equipos);
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El entrenador " + this.getNombre() + " viaja con su equipo " + equipos + " para el partido que se celebra en " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("¡GOOOOOOOOOOOL! "+ this.getNombre() +" celebra el gol!");
    }
}

```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase Exception `ControlDorsal`

<details>
<summary>Ver el código completo.</summary>
  
```java
package practicas.SistemaModernizacionMutxamel;

public class ControlDorsal extends RuntimeException {
    public ControlDorsal() {
        super("El dorsal ya esta adjudicado a un jugador.");
    }
}

```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase Exception `ControlformacionPreferida`

<details>
<summary>Ver el código completo.</summary>
  
```java
package practicas.SistemaModernizacionMutxamel;

public class ControlformacionPreferida extends RuntimeException {
    public ControlformacionPreferida() {
        super("El formato debe ser N-N-N");
    }
}

```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase `AppMutxamelFC`

<details>
<summary>Ver el código completo.</summary>
  
```java
package practicas.SistemaModernizacionMutxamel;

import java.util.ArrayList;

public class AppMutxamelFC {
    public static void main(String[] args) {

        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        Jugador j1 = new Jugador("Juan",30, Equipos.SENIOR,9,Posiciones.CENTROCAMPISTA,listaJugadores);
        Jugador j2 = new Jugador("Ivan",29, Equipos.SENIOR,3,Posiciones.DEFENSA,listaJugadores);
        Jugador j3 = new Jugador("Marcos",23, Equipos.SENIOR,7,Posiciones.DEFENSA,listaJugadores);
        Jugador j4 = new Jugador("Raul",21, Equipos.SENIOR,6,Posiciones.CENTROCAMPISTA,listaJugadores);
        Jugador j5 = new Jugador("Fernando",26, Equipos.SENIOR,4,Posiciones.DELANTERO,listaJugadores);
        Jugador j6 = new Jugador("José",22, Equipos.SENIOR,2,Posiciones.DELANTERO,listaJugadores);
        Jugador j7 = new Jugador("Carlos",30, Equipos.SENIOR,8,Posiciones.CENTROCAMPISTA,listaJugadores);
        Jugador j8 = new Jugador("Manuel",28, Equipos.SENIOR,1,Posiciones.PORTERO,listaJugadores);
        Jugador j9 = new Jugador("Fran",24, Equipos.SENIOR,5,Posiciones.DELANTERO,listaJugadores);
        Jugador j10 = new Jugador("Loreto",25, Equipos.SENIOR,10,Posiciones.DEFENSA,listaJugadores);
        Jugador j11 = new Jugador("Roberto",29, Equipos.SENIOR,11,Posiciones.PORTERO,listaJugadores);

        ArrayList<Entrenador> listaEntrenador = new ArrayList<>();
        Entrenador e1 = new Entrenador("Pepe",40, Equipos.SENIOR,"4-4-2",listaEntrenador);
        Entrenador e2 = new Entrenador("Lolo",45, Equipos.INFANTIL,"4-3-3",listaEntrenador);
        Entrenador e3 = new Entrenador("Carlos",43, Equipos.ALEVIN,"4-2-3",listaEntrenador);

        ArrayList<Masajista> listaMasajistas = new ArrayList<>();
        Masajista m1 = new Masajista("Carlos",26,"Fisioterapeuta",5);
        Masajista m2 = new Masajista("Ramón",32,"Quiromasajista",7);
        Masajista m3 = new Masajista("José",45,"masajista Deportivo",20);

        ArrayList<Acompanyante> listaAcompanyante = new ArrayList<>();
        Acompanyante a1 = new Acompanyante("Mari Carmen",55, j1, "Madre");
        Acompanyante a2 = new Acompanyante("Ainna",26, j1, "Pareja");
        Acompanyante a3 = new Acompanyante("José Ramon",58, j6, "Padre");
        Acompanyante a4 = new Acompanyante("Iñaqui",33, j6, "Hermano");
        Acompanyante a5 = new Acompanyante("Manoli",55, j4, "Madre");
        Acompanyante a6 = new Acompanyante("María Ángeles",26, j4, "Tia");
        Acompanyante a7 = new Acompanyante("Fernan",58, j2, "Amigo");
        Acompanyante a8 = new Acompanyante("Rober",33, j2, "amigo");

        j1.concentrarse();
        e1.concentrarse();
        m1.concentrarse();
        a1.concentrarse();
        System.out.println();

        j2.entrenar();
        e2.entrenar();

        System.out.println();
        m3.darMasaje(j6);

        System.out.println();
        j4.viajar("Madrid");
        e3.viajar("Madrid");
        m2.viajar("Madrid");
        a4.viajar("Madrid");

        System.out.println();
        e1.planificarEntrenamiento();

        System.out.println();
        j2.descansar();

        System.out.println();
        j5.calentar();

        System.out.println();
        j2.jugarPartido("Madrid");
        e2.jugarPartido("Madrid");

        System.out.println();
        a4.animarEquipo();

        System.out.println();
        e2.hacerCambios();

        System.out.println();
        j3.marcarGol();

        System.out.println();
        j1.celebrarGol();
        e2.celebrarGol();
        m1.celebrarGol();
        a7.celebrarGol();

        System.out.println();
        for (int i = 0; i < 4; i++) {
            m1.darMasaje(listaJugadores.get(i));
        }

        System.out.println();
        j4.viajar("Mutxamel");
        e3.viajar("Mutxamel");
        m2.viajar("Mutxamel");
        a4.viajar("Mutxamel");


    }
}

```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase `AppMantenimiento`

<details>
<summary>Ver el código completo.</summary>
  
```java
package practicas.SistemaModernizacionMutxamel;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMantenimiento {
    static ArrayList<Masajista> listaMasajistas = new ArrayList<>();
    static ArrayList<Jugador> listaJugadores = new ArrayList<>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Masajista m1 = new Masajista("Carlos",26,"Fisioterapeuta",5); //0
        Masajista m2 = new Masajista("Ramón",32,"Quiromasajista",7); //1
        Masajista m3 = new Masajista("José",45,"masajista Deportivo",20); //2
        listaMasajistas.add(m1);
        listaMasajistas.add(m2);
        listaMasajistas.add(m3);
        String resptPrimerMenu;


        Jugador j1 = new Jugador("Juan",30, Equipos.SENIOR,9,Posiciones.CENTROCAMPISTA,listaJugadores);
        Jugador j2 = new Jugador("Ivan",29, Equipos.SENIOR,3,Posiciones.DEFENSA,listaJugadores);
        Jugador j3 = new Jugador("Marcos",23, Equipos.BENJAMIN,7,Posiciones.DEFENSA,listaJugadores);
        Jugador j4 = new Jugador("Raul",21, Equipos.BENJAMIN,6,Posiciones.CENTROCAMPISTA,listaJugadores);
        Jugador j5 = new Jugador("Fernando",26, Equipos.ALEVIN,4,Posiciones.DELANTERO,listaJugadores);
        Jugador j6 = new Jugador("José",22, Equipos.ALEVIN,2,Posiciones.DELANTERO,listaJugadores);
        Jugador j7 = new Jugador("Carlos",30, Equipos.INFANTIL,8,Posiciones.CENTROCAMPISTA,listaJugadores);
        Jugador j8 = new Jugador("Manuel",28, Equipos.INFANTIL,1,Posiciones.PORTERO,listaJugadores);
        Jugador j9 = new Jugador("Fran",24, Equipos.CADETE,5,Posiciones.DELANTERO,listaJugadores);
        Jugador j10 = new Jugador("Loreto",25, Equipos.CADETE,10,Posiciones.DEFENSA,listaJugadores);
        Jugador j11 = new Jugador("Roberto",29, Equipos.JUVENIL,11,Posiciones.PORTERO,listaJugadores);
        listaJugadores.add(j1);
        listaJugadores.add(j2);
        listaJugadores.add(j3);
        listaJugadores.add(j4);
        listaJugadores.add(j5);
        listaJugadores.add(j6);
        listaJugadores.add(j7);
        listaJugadores.add(j8);
        listaJugadores.add(j9);
        listaJugadores.add(j10);
        listaJugadores.add(j11);



        do {
            System.out.println("App de mantenimiento del MUTXAMEL FC");
            System.out.println("  [1]. Mantenimiento de jugadores");
            System.out.println("         Dentro podremos añadir jugadores, modificar datos y añadir acompañantes (sólo seniors).");
            System.out.println("  [2]. Mantenimiento de entrenadores (añadir-modificar-salir)");
            System.out.println("         Dentro podremos añadir entrenadores y modificar sus datos.");
            System.out.println("  [3]. Mantenimiento masajistas (añadir-modificar datos-salir)");
            System.out.println("         Dentro podremos añadir masajistas y modificar sus datos.");
            System.out.println("  [4]. Consultar equipos");
            System.out.println("         Dentro se deben listar los tipos de equipos del club y elegir uno.");
            System.out.println("  [x]. Salir");
            System.out.println();
            System.out.print("Selecciona una opción --> ");

            resptPrimerMenu = teclado.next().toLowerCase();

            switch (resptPrimerMenu) {
                case "1":
                    System.out.println("Mantenimiento de Jugadores");
                    System.out.println("   [1]. Añadir nuevo jugador");
                    System.out.println("   [2]. Modificar datos de jugador existente");
                    System.out.println("   [3]. Crear acompañantes (sólo seniors)");
                    System.out.println("   [X]. Volver al menú principal");
                    System.out.println();
                    System.out.println("Selecciona una opción --> ");
                    break;

                case "2":
                    System.out.println("Mantenimiento de Entrenadores");
                    System.out.println("   [1]. Añadir nuevo entrenador");
                    System.out.println("   [2]. Modificar datos de entrenador existente");
                    System.out.println("   [X]. Volver al menú principal");
                    System.out.println();
                    System.out.println("Selecciona una opción --> ");
                    break;

                case "3":
                    menuMasajista();

                    break;

                case "4":
                    menuConsultarEquipos();
                    break;

                case "x":
                    System.out.println("Finalizando programa.");
                    break;
                default:
                    System.out.println("La opción no es valida");
                    break;
            }

        } while (!resptPrimerMenu.equals("x"));

    }
    public static void menuMasajista () {
        Scanner teclado = new Scanner(System.in);
        String nuevoMasj;

        do {
            System.out.println("Mantenimiento de Entrenadores");
            System.out.println("   [1]. Añadir nuevo entrenador");
            System.out.println("   [2]. Modificar datos de entrenador existente");
            System.out.println("   [x]. Volver al menú principal");
            System.out.println();
            System.out.println("Selecciona una opción --> ");

            nuevoMasj = teclado.next().toLowerCase();
            switch (nuevoMasj) {
                case "1": //Añadir nuevo entrenador
                    System.out.println("Introduce los datos del nuevo masajista: ");
                    System.out.println("Nombre: ");
                    String nombre = teclado.next();

                    System.out.println("Edad: ");
                    int edad = teclado.nextInt();

                    System.out.println("Titulación: ");
                    String titulacion = teclado.next();

                    System.out.println("Años de experiencia: ");
                    int anyos = teclado.nextInt();

                    listaMasajistas.add(new Masajista(nombre, edad, titulacion, anyos));

                    System.out.println("¡Masajista añadido correctamente!");

                   /*for (int i = 0; i <listaMasajistas.size(); i++) {
                        Masajista m = listaMasajistas.get(i);
                       System.out.println(listaMasajistas.get(i).toString() );
                   }

                    */

                    break;

                    case "2": //Modificar datos de entrenador existente
                    System.out.println("¿De qué masajista quieres hacer cambios?");

                    for (int i = 0; i < listaMasajistas.size(); i++) {
                        System.out.println("[" + i + ", "+ listaMasajistas.get(i).toString() );
                    }

                    System.out.print("Selecciona una opción --> ");
                    int masajSelect = teclado.nextInt();

                    Masajista masajista = listaMasajistas.get(masajSelect);
                    System.out.print("¿Qué quieres modificar? nombre, edad, titulacion o anyosExperiencia: ");
                    String modificar = teclado.next().toLowerCase();

                    switch (modificar){
                        case "nombre":
                            String nomNuevo = teclado.next();
                            listaMasajistas.get(masajSelect).setNombre(nomNuevo);
                            System.out.println("Masajista actualizado: [" + listaMasajistas.get(masajSelect).toString() + "]");
                            break;
                        case "edad":
                            int edadNuevo = teclado.nextInt();
                            listaMasajistas.get(masajSelect).setEdad(edadNuevo);
                            System.out.println("Masajista actualizado: [" + listaMasajistas.get(masajSelect).toString() + "]");
                            break;
                        case "titulacion":
                            String titNuevo = teclado.next();
                            listaMasajistas.get(masajSelect).setTitulacion(titNuevo);
                            System.out.println("Masajista actualizado: [" + listaMasajistas.get(masajSelect).toString() + "]");
                            break;
                        case "anyosexperiencia":
                            int anyosExpNuevo = teclado.nextInt();
                            listaMasajistas.get(masajSelect).setAnyosExperiencia(anyosExpNuevo);
                            System.out.println("Masajista actualizado: [" + listaMasajistas.get(masajSelect).toString() + "]");
                            break;
                        default:
                            System.out.println("La opción no es valida");
                            break;
                    }
                    break;
                case "x": //Volver al menú principal
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("La opción no es valida");
                    break;
            }
        } while (!nuevoMasj.equals("x"));

    }
    public static void menuConsultarEquipos(){
    //Dentro se deben listar los tipos de equipos del club y elegir uno.
        // BENJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, SENIOR
        Scanner teclado = new Scanner(System.in);
        String equipo;
        do {
        System.out.println("Equipos: ");
        for (Equipos equipos : Equipos.values()) {
            System.out.println(equipos);
        }
        System.out.println("[x]. Volver al menú.");

        System.out.print("Selecciona una opción --> ");
        equipo = teclado.next().toLowerCase();


            switch (equipo){
                case "benjamin":
                    for (Jugador jugador : listaJugadores) {
                        if (jugador.getCategoria() == Equipos.BENJAMIN) {
                            System.out.println(jugador.toString());
                        }
                    }
                break;
                case "alevin":
                    for (Jugador jugador : listaJugadores) {
                        if (jugador.getCategoria() == Equipos.ALEVIN) {
                            System.out.println(jugador.toString());
                        }
                    }
                    break;
                case "infantil":
                    for (Jugador jugador : listaJugadores) {
                        if (jugador.getCategoria() == Equipos.INFANTIL) {
                            System.out.println(jugador.toString());
                        }
                    }
                    break;
                case "cadete":
                    for (Jugador jugador : listaJugadores) {
                        if (jugador.getCategoria() == Equipos.CADETE) {
                            System.out.println(jugador.toString());
                        }
                    }
                    break;
                case "juvenil":
                    for (Jugador jugador : listaJugadores) {
                        if (jugador.getCategoria() == Equipos.JUVENIL) {
                            System.out.println(jugador.toString());
                        }
                    }
                    break;
                case "senior":
                    for (Jugador jugador : listaJugadores) {
                        if (jugador.getCategoria() == Equipos.SENIOR) {
                            System.out.println(jugador.toString());
                        }
                    }
                    break;
                case "x":
                    System.out.println("Volviendo al menú...");
                    break;
                default:
                    System.out.println("La opción no es valida.");
            }
        }while (!equipo.equals("x"));
    }
}


```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---
---

## 4. Relaciones entre clases

La clase base de toda la aplicación es `MutxamelFC`, una clase abstracta que contiene los atributos comunes `nombre` y `edad`. De ella heredan `Jugador`, `Entrenador`, `Masajista` y `Acompanyante`, lo que significa que todas comparten esos atributos sin necesidad de repetirlos. `MutxamelFC` implementa la interfaz `FuncionesIntegrantes`, por lo que todas sus subclases saben concentrarse, viajar y celebrar goles. Además, `Jugador` y `Entrenador` implementan `AccionesDeportivas`, que les obliga a saber entrenar y jugar partidos. `Acompanyante` tiene una relación especial con `Jugador` ya que contiene una referencia directa al jugador al que acompaña.

<p align="right"><a href="#índice">Ir al Índice</a></p>

---
---

## 5. Plan de prueba final feliz

El plan de pruebas cubre el flujo principal de la aplicación. Al ejecutar AppMantenimiento aparece el menú principal correctamente. Desde ahí se puede elegir la opción 3 que abre el menú de masajistas, donde las tres opciones funcionan correctamente: se puede añadir un masajista nuevo, modificar sus datos y volver al menú principal. La opción 4 muestra la lista de equipos del club y permite elegir uno para ver sus jugadores. La opción X cierra la aplicación, de cualquiera de los menus.

<p align="right"><a href="#índice">Ir al Índice</a></p>

---
---

## 6. Documentación Javadoc

El código no tiene comentarios Javadoc. 
Como has comentado en clase, el Javadoc tiene que reflejar nuestro trabajo, no el de una herramienta. Por eso en esta práctica prefería no meterla antes que entregar algo que no es mío. No me ha dado tiempo a hacerla, lo siento.

<p align="right"><a href="#índice">Ir al Índice</a></p>

---
---

## 7. Conclusión

Uno de los puntos que no he llegado a implementar es el polimorfismo. No lo he metido porque sinceramente no lo tengo del todo claro todavía y prefería no ponerlo mal que ponerlo por ponerlo.
Una de las cosas que más me lió fueron las listas. Tenía los ArrayList creados en una app y en la clase, y yo pensaba que con llamarlos directamente ya funcionaría. Fue en clase cuando entendí que hay que crearlos donde los vayas a usar, no es lo mismo tenerlos en un sitio que en otro.
Con el toString me pasó algo parecido. Al principio cuando quería mostrar la información de un jugador iba poniendo prints uno a uno, hasta que hablando con compañeros aprendí que para eso existe el toString y que es mucho más limpio.
A la hora de modificar los datos del masajista también me quedé bastante bloqueada, pero igual que con las listas y el toString, hablar con los compañeros me ayudó a salir del bloqueo.
Otra cosa que me costó bastante fue entender que había dos mains para dos cosas distintas, al principio no veía claro por qué ni cómo separarlos. También me costó recordar cómo llamar a los enums y tuve que repasar los apuntes para acordarme.
En resumen, la práctica me ha llevado bastante tiempo. Me veo lenta a la hora de sacar la lógica y de escribir el código, y sé que necesito más práctica para coger fluidez. Pero también noto que cada error que cometí me enseñó algo, y que cuando me bloqueaba hablar con los compañeros fue clave para poder seguir.

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

