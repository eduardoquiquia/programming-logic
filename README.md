# Lógica de Programación - Java 
## ¿Qué es la lógica de programación?
La lógica de programación 🧠💻 es el conjunto de técnicas y métodos usados para resolver problemas de forma estructurada 🧩 y ordenada 📏 a través de instrucciones que una computadora puede ejecutar. Aprender lógica de programación te permite pensar como un programador 👨‍💻👩‍💻, dividir problemas complejos en partes simples 🔍 y diseñar soluciones paso a paso 🚀.

Dominar la lógica de programación es esencial para cualquier persona que quiera aprender a programar, ya que te permite estructurar soluciones de forma clara, eficiente y ordenada.

![aña](https://i.pinimg.com/736x/b4/d5/e3/b4d5e3a47472d0a6b2606dd065cb0f93.jpg)

---

## Conceptos Fundamentales

### 🔤 _Variables_
Las **variables** son espacios en la memoria donde se puede almacenar información que puede cambiar durante la ejecución del programa. Piensa en ellas como cajas con etiquetas, donde cada etiqueta tiene un nombre y dentro se guarda un valor. 

### 🧪 Ejemplo en código Java:
```codigo
Definir edad Como Entero
int edad = 20

Definir nombre Como Caracter o Cadena
String nombre = "Ana"
```

---

### 🔀 _Condicionales_
Los **condicionales** nos permiten tomar decisiones dentro de un programa. Según una condición (verdadera o falsa), el programa puede seguir diferentes caminos.

### 🧪 Ejemplo en código Java:
```codigo
System.out.print("Ingrese su edad: ");
int edad = scanner.nextInt.(System.in);  // scanner nos permite ingresar datos en consola

if (edad >= 18) {
    System.out.print("Eres mayor de edad.");
} else {
    System.out.print("Eres menor de edad.");
}
```

---

### 🔁 _Bucles_
Los **bucles** permiten repetir una serie de instrucciones múltiples veces. Son útiles cuando queremos ejecutar algo una y otra vez hasta que se cumpla una condición.

### 🧪 Bucle Mientras (while):
```codigo
int contador = 1;

while (contador < 5) {
    System.out.print("Hola Mundo");
    contador += 1;
}
```

### 🧪 Bucle Para (for):
```codigo
for (int i=0; i < 5; i++) {
    System.out.print("Hola Mundo");
}
```

---

### 🧩 _Funciones_
Las **funciones** son bloques de código reutilizables que realizan una tarea específica. Nos permiten dividir un problema en partes más pequeñas y reutilizar código en distintos lugares del programa.

### 🧪 Ejemplo de función en código Java (método):
```codigo
public void Saludar (String nombre) {
    System.out.print("Hola " + nombre)
}

Saludar(Eduardo);
```
