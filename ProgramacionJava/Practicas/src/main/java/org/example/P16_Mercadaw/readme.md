<p align="center">
  <img src="img/banner1.png" width="100%">
</p>
<h1 align="center"> Práctica: Servicio de compra online en MERCADAW </h1>
<h2 align="center"> Manuela Planelles - 1º DAW - IES Mutxamel</h2>

---

## Índice

1. [Introducción](#1-introducción)
2. [Objetivos de la práctica](#2-objetivos-de-la-práctica)
3. [Diseño e Implementación del programa](#3-diseño-e-implementación-del-programa)
   - [3.1. Estructura de clases](#31-estructura-de-clases)
     - [3.1.1. Enum Producto](#enum-producto)
     - [3.1.2. Clase Pedido](#clase-pedido)
     - [3.1.3. Clase Cliente](#clase-cliente)
     - [3.1.4. Clase Mercadaw](#clase-mercadaw)
     - [3.1.5. Clase AppZonaClientes](#clase-appzonaclientes)
4. [Ejemplo de funcionamiento](#4-ejemplo-de-funcionamiento)

---

## 1. Introducción

Esta práctica consiste en implementar una aplicación de compra online para un supermercado llamado MERCADAW. La app tiene dos partes: una zona de gestión para el personal y una zona de clientes donde estos pueden autenticarse y realizar pedidos desde casa.

La parte que se ha desarrollado es la zona de clientes: autenticación, selección de productos, aplicación de promociones y resumen del pedido.

---

## 2. Objetivos de la práctica

- Implementar un sistema de autenticación con límite de intentos.
- Gestionar un pedido usando `HashMap<Producto, Integer>`.
- Aplicar promociones: 3x2 y 10% de descuento.
- Usar colecciones dinámicas del Java Collections Framework (HashMap, List).
- Trabajar con enums para representar los productos del supermercado.

---

## 3. Diseño e Implementación del programa

### 3.1. Estructura de clases

La estructura sigue el diagrama dado en el enunciado:

- `AppZonaClientes` → invoca a `Mercadaw`
- `Mercadaw` → crea y gestiona la lista de `Cliente`
- `Cliente` → realiza un `Pedido`
- `Pedido` → contiene un `HashMap<Producto, Integer>`
- `Producto` → enum con los productos y sus precios

---

#### Enum `Producto`

Contiene todos los productos del supermercado con su precio. El constructor guarda el precio y se accede a él con `getPrecio()`.

```java
public enum Producto {
    MANZANAS(2.30), PAN(1.00), ARROZ(3.50), POLLO(4.30),
    LECHE(1.30), ACEITE(8.30), HUEVOS(3.30), TOMATES(4.00), PASTA(0.89);

    private double precio;

    Producto(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
```

---

#### Clase `Pedido`

Gestiona el `HashMap<Producto, Integer>` con los productos y sus cantidades. Tiene los métodos para aplicar las promociones y mostrar el resumen.

- `aplicarPromo3x2()`: recorre el mapa buscando productos con 3 o más unidades y descuenta el precio de una unidad por cada grupo de 3.
- `aplicarPromo10()`: aplica un 10% de descuento sobre el importe total.

```java
public void aplicarPromo3x2() {
    for (Map.Entry<Producto, Integer> entry : pedido.entrySet()) {
        Producto producto = entry.getKey();
        int cantidad = entry.getValue();

        if (cantidad % 3 == 0) {
            int unidadesGratis = cantidad / 3;
            double descuento = unidadesGratis * producto.getPrecio();
            importe_total = importe_total - descuento;
        }
    }
}

public void aplicarPromo10() {
    double descuento = importe_total * 0.10;
    importe_total = importe_total - descuento;
}
```

---

#### Clase `Cliente`

Tiene los atributos `usuario`, `contraseña`, `direccion`, `pedido` y `promociones`. El pedido se inicia a `null` y las promociones a `false`, como indica el enunciado. La dirección siempre es "Calle falsa, 123".

El método `insertarProducto(String nombreProducto)` usa `Producto.valueOf()` para convertir el String al enum. Si no existe lanza una `IllegalArgumentException` que capturamos para informar del error.

```java
public void insertarProducto(String nombreProducto) {
    try {
        Producto producto = Producto.valueOf(nombreProducto.toUpperCase());
        if (pedido.getPedido().containsKey(producto)) {
            pedido.getPedido().put(producto, pedido.getPedido().get(producto) + 1);
        } else {
            pedido.getPedido().put(producto, 1);
        }
    } catch (IllegalArgumentException e) {
        System.out.println("El producto no existe! Elige otro.");
        imprimirProductos();
    }
}
```

El método `importePedido()` recorre el HashMap y calcula el total multiplicando precio por cantidad de cada producto:

```java
public double importePedido() {
    double total = 0;
    for (java.util.Map.Entry<Producto, Integer> entry : pedido.getPedido().entrySet()) {
        total += entry.getKey().getPrecio() * entry.getValue();
    }
    return total;
}
```

---

#### Clase `Mercadaw`

Genera clientes aleatorios en `generarClientes()`. El usuario y contraseña de 8 caracteres se generan recorriendo la cadena de caracteres indicada en el enunciado con `Random`.

```java
public static void generarClientes() {
    String caracter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    Random random = new Random();
    String constructorUsuario = "";
    String constructorContrasenya = "";
    for (int i = 0; i < 8; i++) {
        constructorContrasenya += caracter.charAt(random.nextInt(caracter.length()));
        constructorUsuario += caracter.charAt(random.nextInt(caracter.length()));
    }
    clientes.add(new Cliente(constructorUsuario, constructorContrasenya));
    System.out.println("Usuario creado: " + constructorUsuario);
    System.out.println("Contraseña creada: " + constructorContrasenya);
}
```

`getClientes()` devuelve la lista para que `AppZonaClientes` pueda usarla en la autenticación.

---

#### Clase `AppZonaClientes`

Es la clase principal. Tiene un atributo estático `Cliente` que se asigna cuando la autenticación es correcta.

- `autenticacion()`: pide usuario y contraseña hasta 3 veces. Si coinciden con algún cliente de la lista, lo asigna al atributo estático y llama a `iniciarCompra()`.
- `iniciarCompra()`: crea el pedido, muestra los productos y gestiona el bucle de compra.
- `imprimirProductos()`: recorre el enum con `Producto.values()` y muestra cada producto con su precio.
- `imprimirDespedida()`: muestra el mensaje final con la dirección del cliente.

```java
public static void autenticacion(List<Cliente> clientes) {
    System.out.println("*** COMPRA ONLINE DE MERCADAW ***");
    boolean encontrado = false;
    for (int intentos = 0; intentos < 3; intentos++) {
        System.out.println("Usuario: ");
        String usuarioIntroducido = teclado.next();
        System.out.println("Contraseña: ");
        String contrasenyaIntroducido = teclado.next();

        for (Cliente clienteActual : clientes) {
            if (clienteActual.getUsuario().equals(usuarioIntroducido) &&
                    clienteActual.getContrasenya().equals(contrasenyaIntroducido)) {
                encontrado = true;
                cliente = clienteActual;
            }
        }
        if (encontrado) {
            iniciarCompra();
            break;
        } else {
            System.out.println("Algo no coincide o no existe! Vuelve a intentarlo...");
        }
    }
    if (!encontrado) {
        System.out.println("ERROR DE AUTENTICACION.");
    }
}
```

El menú final con las opciones [1], [2], [3] se gestiona con un `switch` dentro de un `while`.

---

## 4. Ejemplo de funcionamiento

Al arrancar el programa se imprimen los clientes generados aleatoriamente para poder hacer las pruebas. Luego se pide usuario y contraseña:


Si el producto no existe se informa y se vuelve a mostrar la lista. Si se elige la opción 3 se muestra la despedida con la dirección del cliente.
