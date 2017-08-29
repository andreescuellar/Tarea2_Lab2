# Laboratorio 2 Programación Avanzada

## a) Cuestionario


- ¿Qué es GitHub?
 
GitHub es una plataforma de desarrollo colaborativo de software para alojar proyectos utilizando el sistema de control de versio.nes [Git](https://es.wikipedia.org/wiki/Git).


- ¿Qué es EclipseChe?

Es un IDE on-demand donde las herramientas y el workspace puedan ser provisionados dinámicamente. Dicho de otra forma Eclipse Che es un Cloud IDE open-source.


- ¿Qué diferencia hay entre agregación y herencia?

Agregacion: es un tipo de asociación que indica que una clase es parte de otra clase 

Herencia: es la habilidad de extender una funcionalidad existente definiendo una nueva clase que hereda funcionalidad de una clase existente. 

La diferencia seria que la herencia expone el objeto administrado como un objeto externo y la agregacion permite que el objeto externo exponga la implementación de una interfaz de otro objeto sin modificaciones


- ¿Qué relación existe entre herencia y polimorfismo? 

La diferencia entre herencia y polimorfismo es que herencia está relacionada con clases y polimorfismo con métodos. Mas sin embargo, la relación que existe entre ambos es que con la herencia tenemos la relación entre las clases y en esas clases tenemos los métodos a ejecutar. 


## b) Bitácora

1. Comprobar la version de Java disponible en el sistema 

    [Versión de Java](https://www.dropbox.com/home/Lab2_1?preview=Version.png)

2. Crear una cuenta en GitHub

    [Como crear cuenta Hub](https://www.dropbox.com/home/Lab2_1?preview=CGit.png)

3.  Crear cuenta y utilizarla en EclipseChe/Eclipse

    [Como crear cuenta EclipseCHE](https://www.dropbox.com/home/Lab2_1?preview=EcliCHE.png)

    [Entorno EclipseCHE](https://www.dropbox.com/home/Lab2_1?preview=EcliCHE2.png)

### Agregación
1. Crear la clase Main, la clase Point y la clase Line

[Clases](https://www.dropbox.com/home/Lab2_2?preview=Crear+clases.png)

2. Implementar lo siguiente en la clase Point

    2.1 Se crea la clase "Point" donde se declaran las variables private x & y 

    2.2 Se crea el constructor para obtener los valores de x & Y

    2.3 Se crean las funciones y procedimientos Gets y Sets para las variables x & y, junto con un arreglo de tamaño donde 
    la posicion 0 es x y la posicion 1 es y.

    2.4 Se escribe un to string para tener las variables en un dato alfanumérico

    2.5 Se crean las funciones para calcular las distancias entre los puntos. 

     [Imagen 1](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(20).png)

     [Imagen 2](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(21).png)

     [Imagen 3](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(22).png)

     [Imagen 4](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(23).png)

     [Imagen 5](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(24).png)

     [Imagen 6](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(25).png)

     [Imagen 7](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(26).png)

     [Imagen 8](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(27).png)

3. Implementar lo siguiente en la clase Line

    3.1 Se crea el objeto de punto inicial y objeto de punto final 

    3.2 Se crea el constructor para obtener los valores finales e iniciales de x & Y

    3.3 Crear el constructor que recopila la información de la distancia entre puntos y distancia entre los ejes. 

     [Imagen 1](https://www.dropbox.com/home/Lab2_3?preview=Captura+de+pantalla+(28).png)

     [Imagen 2](https://www.dropbox.com/home/Lab2_3?preview=Captura+de+pantalla+(29).png)

     [Imagen 3](https://www.dropbox.com/home/Lab2_3?preview=Captura+de+pantalla+(30).png)

### Herencia

1. Crear la clase Person con sus variables, constructor y sus métodos propios de la clase.

     [Imagen 1](https://www.dropbox.com/home/Lab2_4?preview=Captura+de+pantalla+(31).png).

2. Crear la clase Student la cual hereda los métodos de person, se realiza un constructor y los métodos propios de la subclase Student.
     
     [Imagen 1](https://www.dropbox.com/home/Lab2_4?preview=Captura+de+pantalla+(32).png).

     [Imagen 2](https://www.dropbox.com/home/Lab2_4?preview=Captura+de+pantalla+(33).png).

3. Crear la clase Teacher la cual hereda los métodos de person, se realiza un constructor y los métodos propios de la subclase Student.

     [Imagen 1](https://www.dropbox.com/home/Lab2_4?preview=Captura+de+pantalla+(34).png).

     [Imagen 2](https://www.dropbox.com/home/Lab2_4?preview=Captura+de+pantalla+(35).png).

### Ejecución

1. En la clase Main, se ejecutará los dos programas. Por un lado tenemos la ejecución de la distancias de los puntos que seria el proyecto de agregación y por el otro lado tenemos la ejecución de el proyecto de herencia en donde se daran todos los metodos que se les dio a las clases Student y Teacher.  

     [Imagen 1](https://www.dropbox.com/home/Lab2_5?preview=Captura+de+pantalla+(36).png).

     [Imagen 2](https://www.dropbox.com/home/Lab2_5?preview=Captura+de+pantalla+(37).png).


