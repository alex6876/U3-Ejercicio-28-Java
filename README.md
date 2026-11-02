Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Catálogo de Productos y Cálculo de Precios (Herencia, Sobrescritura y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🛒 Simulación de Catálogo de Productos y Precios (Herencia y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de gestión comercial para una tienda, implementando una jerarquía de clases mediante herencia para administrar distintos tipos de artículos (productos alimenticios y electrodomésticos) con reglas de cálculo de precios personalizadas. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la reutilización de constructores e invocación de métodos mediante `super`, la sobrescritura polimórfica de métodos (`@Override`) y el procesamiento dinámico de operaciones financieras en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base general, sus respectivas subclases especializadas y un punto de ejecución:

* **`Producto`**: Clase base que centraliza los atributos y comportamientos comunes de cualquier artículo comercializado.
* **Atributos protegidos (`protected`)**: `codigo`, `descripcion` y `costoBase`, permitiendo que las clases hijas accedan directamente a la información esencial del producto.
* **Constructor**: Inicializa los datos comunes del artículo.
* **Métodos operativos**:
* `calcularPrecioFinal()`: Método base que retorna simplemente el costo base, diseñado para ser sobrescrito por las subclases.
* `mostrarInformacion()`: Imprime de forma estructurada el código, la descripción y el costo base del producto.




* **`ProductoAlimenticio`**: Extiende de `Producto` para modelar artículos de consumo masivo con impuestos internos específicos.
* **Atributo privado (`private`)**: `porcentajeImpuestoInterno`.
* **Constructor**: Invoca a `super(...)` para inicializar los datos heredados y configura el impuesto interno.
* **Sobrescritura (`@Override`)**:
* `calcularPrecioFinal()`: Calcula el precio sumando al costo base el porcentaje correspondiente de impuesto interno.
* `mostrarInformacion()`: Reutiliza `super.mostrarInformacion()` y detalla el impuesto interno y el precio final calculado.




* **`Electrodomestico`**: Extiende de `Producto` para modelar aparatos electrónicos que incorporan impuestos generales y recargos proporcionales por meses de garantía.
* **Atributos privados (`private`)**: `porcentajeImpuesto` y `garantiaMeses`.
* **Constructor**: Utiliza `super(...)` y asigna el impuesto general y los meses de garantía.
* **Sobrescritura (`@Override`)**:
* `calcularPrecioFinal()`: Calcula el precio sumando el costo base, el impuesto general aplicable y un recargo proporcional de garantía basado en los meses estipulados.
* `mostrarInformacion()`: Muestra los datos base mediante `super`, y añade el porcentaje de impuesto, la garantía en meses y el precio final.




* **`Main`**: Punto de entrada del programa. Instancia un producto alimenticio (leche) y dos electrodomésticos (heladera y televisor) con sus respectivos costos y parámetros específicos, e invoca sus métodos de visualización para imprimir por consola los reportes detallados y precios finales.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Cálculo Polimórfico de Precios:** Cada tipo de producto implementa su propia fórmula de cálculo de precio final (impuestos internos para alimentos vs. impuestos generales y recargo por garantía para electrodomésticos), manteniendo una arquitectura extensible.
2. **Reutilización Estructural con `super`:** Las subclases evitan la duplicación de código al delegar la impresión de los atributos genéricos a la superclase mediante `super.mostrarInformacion()`.
3. **Encapsulamiento de Atributos Comerciales:** Los detalles específicos de costos impositivos y garantías permanecen protegidos como atributos privados en sus respectivas clases hijas.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
===== PRODUCTOS DE LA TIENDA =====

--- PRODUCTO ALIMENTICIO ---
Código: A001
Descripción: Leche
Costo base: $1000.0
Impuesto interno: 10.0%
Precio final: $1100.0

--- ELECTRODOMÉSTICO ---
Código: E001
Descripción: Heladera
Costo base: $500000.0
Impuesto: 21.0%
Garantía: 24 meses
Precio final: $628000.0

--- ELECTRODOMÉSTICO ---
Código: E002
Descripción: Televisor
Costo base: $300000.0
Impuesto: 21.0%
Garantía: 12 meses
Precio final: $369000.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Jerarquía Comercial:** Modelado de artículos de venta mediante una estructura limpia de herencia orientada a objetos.
* **Sobrescritura de Métodos (`@Override`):** Adaptación dinámica de los algoritmos de cálculo de precios y presentación de información según la naturaleza del producto.
* **Diseño Modular:** Clara separación entre la lógica del dominio de inventario y la ejecución de casos de prueba simulados en el cliente (`Main`).
