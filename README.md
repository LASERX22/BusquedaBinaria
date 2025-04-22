## Practica autonoma Busqueda Binaria
Autor: Joey Diaz
Profesor: Ing. Juan Pablo Torres
Asignatura: Estructura de Datos

## Explicacion del codigo
El proyecto incluye un App que maneja el main, donde se recibe el arreglo de personas dependiendo de cuanto quiera agregar el usuario. Incluye un MetodoBurbuja que se encarga de ordenar el arreglo ingresado por el usuario para que sea facil a la hora de buscar mediante BusquedaBinaria que maneja el metodo de busqueda como tal y se encarga de mostrar el arreglo, el bajo, el alto y el dato central en la consola/terminal. Y el proyecto finalmente incluye un Persona que se encarga de los constructores respectivos, el metodo que retorna el nombre y la edad para la impresion, getters and setters.

## Salida del codigo
```
Ingrese la cantidad de personas
5
Ingrese Persona
Nombre:        
Joey
Edad:
18
Ingrese Persona
Nombre:
Juan
Edad:
12
Ingrese Persona
Nombre:
Jose
Edad:
14
Ingrese Persona
Nombre:
Daniel
Edad:
19
Ingrese Persona
Nombre:
Maria
Edad:
16
Metodo de busqueda binaria
Edad de la persona a buscar:
19
12 | 14 | 16 | 18 | 19 | 
BAJO=0 ALTO=4 CENTRO=2 VALORCENTRO=16 --> DERECHA
18 | 19 |
BAJO=3 ALTO=4 CENTRO=3 VALORCENTRO=18 --> DERECHA
19 |
BAJO=4 ALTO=4 CENTRO=4 VALORCENTRO=19 --> ENCONTRADO
Persona con edad 19 encontrada
Nombre: Daniel, Edad: 19
```
