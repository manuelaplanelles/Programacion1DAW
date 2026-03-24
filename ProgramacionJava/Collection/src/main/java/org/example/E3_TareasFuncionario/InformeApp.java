package org.example.E3_TareasFuncionario;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class InformeApp {
    public static void main(String[] args) {
        Stack<Informe> pila_informes = new Stack<>();
        Set<Informe> tipos_unicos = new HashSet<>();

        Informe documento1 = new Informe(1234, Descripcion.ADMINISTRATIVO);
        Informe documento2 = new Informe(4567, Descripcion.EMPRESARIAL);
        Informe documento3 = new Informe(7890, Descripcion.EMPRESARIAL);
        Informe documento4 = new Informe(2345, Descripcion.PERSONAL);
        Informe documento5 = new Informe(3456, Descripcion.ADMINISTRATIVO);

        pila_informes.push(documento1); tipos_unicos.add(documento1);
        pila_informes.push(documento2); tipos_unicos.add(documento2);
        pila_informes.push(documento3); tipos_unicos.add(documento3);
        pila_informes.push(documento4); tipos_unicos.add(documento4);
        pila_informes.push(documento5); tipos_unicos.add(documento5);

        System.out.println(pila_informes);
        while (!pila_informes.isEmpty()) {
            System.out.println("Próximo: " + pila_informes.peek());
            System.out.println("Eliminado: " + pila_informes.pop());
        }

        System.out.println("Tipos de tareas: " + tipos_unicos.size());

        Informe documento6 = new Informe(4567, Descripcion.PERSONAL);
        Informe documento7 = new Informe(7890, Descripcion.EMPRESARIAL);
        Informe documento8 = new Informe(1123, Descripcion.ADMINISTRATIVO);

        pila_informes.push(documento6); tipos_unicos.add(documento6);
        pila_informes.push(documento7); tipos_unicos.add(documento7);
        pila_informes.push(documento8); tipos_unicos.add(documento8);

        System.out.println("Orden de salida:");
        while (!pila_informes.isEmpty()) {
            System.out.println(pila_informes.pop());
        }

        System.out.println("Tipos de tareas: " + tipos_unicos.size());
    }
}
