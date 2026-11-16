# Algoritmos y Estructuras de Datos

> [!CAUTION]
> Cualquier resolución está sujeta a ERRORES.

Prácticas, ejercitaciones teóricas y parciales resueltos de Algoritmos y Estructuras de Datos (UNLP, cursada 2025), con código en Java. Todo está en [`2025/src/`](2025/src/).

## Prácticas

### [Práctica 1: Java básico, recursión y listas](2025/src/Práctica/Práctica%201%20-%20Listas/)

- [Consigna](2025/src/Práctica/Práctica%201%20-%20Listas/Enunciado.pdf)
- [Ejercicio 5/Calcular.java](2025/src/Práctica/Práctica%201%20-%20Listas/Ejercicio%205/Calcular.java): mínimo, máximo y promedio de un arreglo devueltos de tres formas distintas.
- [Ejercicio 7/](2025/src/Práctica/Práctica%201%20-%20Listas/Ejercicio%207/): ejercicios con `ArrayList` y `LinkedList` (capicúa, sucesión, inversión y suma recursivas, combinar listas ordenadas).
- [Ejercicio 8/](2025/src/Práctica/Práctica%201%20-%20Listas/Ejercicio%208/): implementación de `Queue`, `CircularQueue`, `DoubleEndedQueue` y `PriorityQueue`.
- [Ejercicio 9/TestBalanceo.java](2025/src/Práctica/Práctica%201%20-%20Listas/Ejercicio%209/TestBalanceo.java): verifica si un string de paréntesis, corchetes y llaves está balanceado.
- Respuestas teóricas: [Ej. 6](2025/src/Práctica/Práctica%201%20-%20Listas/Ejercicio%206/Respuestas.md), [Ej. 10](2025/src/Práctica/Práctica%201%20-%20Listas/Ejercicio%2010/Respuestas.md), [Ej. 11](2025/src/Práctica/Práctica%201%20-%20Listas/Ejercicio%2011/Respuestas.md).

### [Práctica 2: árboles binarios](2025/src/Práctica/Práctica%202%20-%20Árboles%20Binarios/)

- [Consigna](2025/src/Práctica/Práctica%202%20-%20Árboles%20Binarios/Enunciado.pdf)
- [BinaryTree.java](2025/src/Práctica/Práctica%202%20-%20Árboles%20Binarios/Ejercicio%201-2/BinaryTree.java): clase `BinaryTree` con sus operaciones (ejercicios 1 y 2).
- Ejercicios 3 a 9: un problema por carpeta (pares en distintos recorridos, retardo de reenvío en una red binaria, suma por profundidad, transformación de árbol, `isLeftTree`, `esPrefijo` y `sumAndDif`).

### [Práctica 3: árboles generales](2025/src/Práctica/Práctica%203%20-%20Árboles%20Generales/)

- [Consigna](2025/src/Práctica/Práctica%203%20-%20Árboles%20Generales/Enunciado.pdf)
- [GeneralTree.java](2025/src/Práctica/Práctica%203%20-%20Árboles%20Generales/Ejercicio%201-2b-3-5/GeneralTree.java): clase `GeneralTree` (lista de hijos) con altura, nivel, ancho, etc.
- [RecorridosAG.java](2025/src/Práctica/Práctica%203%20-%20Árboles%20Generales/Ejercicio%202/RecorridosAG.java): impares mayores a n en pre, in y postorden y por niveles.
- Ejercicios 4 a 11: un problema por carpeta (máximo promedio por nivel de una empresa, red de agua potable, camino a la hoja más lejana, "abeto navideño", árbol de selección y otros tipo parcial).

### [Práctica 4: análisis de algoritmos](2025/src/Práctica/Práctica%204%20-%20Análisis%20de%20Algoritmos/)

- [Consigna](2025/src/Práctica/Práctica%204%20-%20Análisis%20de%20Algoritmos/Enunciado.pdf)
- Respuestas por ejercicio en `Ejercicio N/` (`Respuesta.txt` o `Respuesta.pdf`), con código para medir tiempos en los ejercicios 1 (`Banco.java`), 2 (`BuscadorEnArrayOrdenado.java`, búsqueda lineal vs. dicotómica) y 5 (`EjercicioPermutaciones.java`).

### [Práctica 5: grafos](2025/src/Práctica/Práctica%205%20-%20Grafos/)

- [Consigna](2025/src/Práctica/Práctica%205%20-%20Grafos/Enunciado.pdf)
- [Ejercicio 1/](2025/src/Práctica/Práctica%205%20-%20Grafos/Ejercicio%201/): interfaces `Graph`, `Vertex` y `Edge`, con implementaciones por [lista](2025/src/Práctica/Práctica%205%20-%20Grafos/Ejercicio%201/adjList/) y [matriz](2025/src/Práctica/Práctica%205%20-%20Grafos/Ejercicio%201/adjMatrix/) de adyacencias.
- [Recorridos.java](2025/src/Práctica/Práctica%205%20-%20Grafos/Ejercicio%202/Recorridos.java): DFS (pre y postorden) y BFS.
- [Mapa.java](2025/src/Práctica/Práctica%205%20-%20Grafos/Ejercicio%203/Mapa.java): caminos entre ciudades con distintas restricciones.
- [VisitaOslo.java](2025/src/Práctica/Práctica%205%20-%20Grafos/Ejercicio%204/VisitaOslo.java), [QuedateEnCasa.java](2025/src/Práctica/Práctica%205%20-%20Grafos/Ejercicio%205/QuedateEnCasa.java) y [BuscadorDeCaminos.java](2025/src/Práctica/Práctica%205%20-%20Grafos/Ejercicio%206/BuscadorDeCaminos.java): ejercicios de aplicación tipo parcial.

## Apuntes

| Tema | Apunte |
| --- | --- |
| Recorrido por niveles y uso de helpers | [ApunteAlgoritmos.pdf](2025/src/Práctica/Práctica%203%20-%20Árboles%20Generales/ApunteAlgoritmos.pdf) |
| Propiedades matemáticas para tiempos de ejecución | [AyED-Resumen-Matematica.pdf](2025/src/Práctica/Práctica%204%20-%20Análisis%20de%20Algoritmos/AyED-Resumen-Matematica.pdf) |
| Análisis de algoritmos iterativos y recursivos | [resumenAnalisisDeAlgoritmos.pdf](2025/src/Práctica/Práctica%204%20-%20Análisis%20de%20Algoritmos/resumenAnalisisDeAlgoritmos.pdf) |
| Guía para el cálculo de T(n) | [TP04_explicacion1.pdf](2025/src/Práctica/Práctica%204%20-%20Análisis%20de%20Algoritmos/TP04_explicacion1.pdf) |
| Demostración del orden de ejecución | [TP04_explicacion2.pdf](2025/src/Práctica/Práctica%204%20-%20Análisis%20de%20Algoritmos/TP04_explicacion2.pdf) |

## Ejercitaciones teóricas

| Tema | Consigna | Resolución |
| --- | --- | --- |
| Árboles binarios, de expresión y generales | [PDF](2025/src/Ejercitacion_AB-AE-AG/AyED%202025%20-%20Ejercitación%20AB%20y%20AG.pdf) | [`EJn/res.txt`](2025/src/Ejercitacion_AB-AE-AG/) |
| Análisis de algoritmos | [PDF](2025/src/Ejercitacion_AnalisisDeAlgoritmos/AyED-%202025%20-%20Ejercitación%20Análisis%20de%20Algoritmos.pdf) | [Resolución.pdf](2025/src/Ejercitacion_AnalisisDeAlgoritmos/Resolución.pdf) |
| Grafos | [PDF](2025/src/Ejercitacion_Grafos/AyED%202025%20-%20Ejercitación%20Teórica%20de%20Grafos.pdf) | [Resolución.pdf](2025/src/Ejercitacion_Grafos/Resolución.pdf) |
| Heap | [PDF](2025/src/Ejercitacion_Heap/AyED%202025%20-%20Ejercitación%20de%20Heap.pdf) | [`EJn.txt` / `EJn.pdf`](2025/src/Ejercitacion_Heap/) |

## [Parciales](2025/src/Parciales/)

### [Árboles](2025/src/Parciales/Árboles/)

Cada carpeta tiene el enunciado (imagen o PDF) y la solución en Java.

| Parcial | Solución | Qué resuelve |
| --- | --- | --- |
| [AYED_2022](2025/src/Parciales/Árboles/AYED_2022/Enunciados.pdf) | [Punto1 a Punto7](2025/src/Parciales/Árboles/AYED_2022/) | Parciales 2022: camino por valores, princesa accesible, árbol creciente, código zigzag, caminos pares, suma de impares en posorden. |
| [10/05/2025](2025/src/Parciales/Árboles/Fecha_10_5_2025/Examen%20Completo.pdf) | [ParcialArboles.java](2025/src/Parciales/Árboles/Fecha_10_5_2025/ParcialArboles.java) | Camino de signo alternante en un árbol general. |
| [28/04/2025](2025/src/Parciales/Árboles/Fecha_28_4_2025/Enunciado.jpg) | [Tesoros.java](2025/src/Parciales/Árboles/Fecha_28_4_2025/Tesoros.java) | Tesoro más cercano a la raíz sin pasar por cámaras bloqueadas. |
| [Fecha 16/11/2024](2025/src/Parciales/Árboles/Fecha_16_11_2024/Enunciado.jpg) | [ComparadorDeArbolesGenerales.java](2025/src/Parciales/Árboles/Fecha_16_11_2024/ComparadorDeArbolesGenerales.java) | Si un árbol general es "inferior profundo" de otro. |
| [29/06/2024](2025/src/Parciales/Árboles/Fecha_29_6_2024/Enunciado.jpg) | [ParcialArboles.java](2025/src/Parciales/Árboles/Fecha_29_6_2024/ParcialArboles.java) | Copia el árbol binario sumándole a cada hijo izquierdo el valor de su padre. |
| [15/05/2024](2025/src/Parciales/Árboles/Fecha_15_5_2024/Enunciado.jpg) | [ParcialArboles.java](2025/src/Parciales/Árboles/Fecha_15_5_2024/ParcialArboles.java) | Camino a una hoja en el que cada nodo interno tiene al menos `num` hijos. |
| [Fecha 15/10/2022](2025/src/Parciales/Árboles/Fecha_15_10_2022/Enunciado.jpg) | [Parcial.java](2025/src/Parciales/Árboles/Fecha_15_10_2022/Parcial.java) | Primer camino a hoja con al menos `min` valores pares. |
| [COLAPINTO](2025/src/Parciales/Árboles/COLAPINTO/Enunciado.jpeg) | [Estrategia.java](2025/src/Parciales/Árboles/COLAPINTO/Estrategia.java) | Mejor estrategia de compuestos de neumáticos. |
| [EncontrarALaPrincesa](2025/src/Parciales/Árboles/EncontrarALaPrincesa/Enunciado.png) | [Parcial.java](2025/src/Parciales/Árboles/EncontrarALaPrincesa/Parcial.java) | Camino desde la raíz hasta la princesa sin pasar por dragones. |
| [IsTwoTree](2025/src/Parciales/Árboles/IsTwoTree/Enunciado.png) | [ParcialArboles.java](2025/src/Parciales/Árboles/IsTwoTree/ParcialArboles.java) | Si los dos subárboles del nodo `num` tienen la misma cantidad de nodos con dos hijos. |
| [Monodistante](2025/src/Parciales/Árboles/Monodistante/Enunciado.jpeg) | [Parcial.java](2025/src/Parciales/Árboles/Monodistante/Parcial.java) | Si todos los caminos raíz-hoja suman k. |
| [NivelConNHijos](2025/src/Parciales/Árboles/NivelConNHijos/Enunciado.jpg) | [ParcialArboles.java](2025/src/Parciales/Árboles/NivelConNHijos/ParcialArboles.java) | Primer nivel en el que todos los nodos tienen al menos `num` hijos. |
| [ProcesadorDeArbol](2025/src/Parciales/Árboles/ProcesadorDeArbol/Enunciado.jpg) | [ProcesadorDeArbol.java](2025/src/Parciales/Árboles/ProcesadorDeArbol/ProcesadorDeArbol.java) | Impares con un solo hijo y cantidad total de impares. |
| [ProductoHojasProfundas](2025/src/Parciales/Árboles/ProductoHojasProfundas/Enunciado.JPG) | [Parcial.java](2025/src/Parciales/Árboles/ProductoHojasProfundas/Parcial.java) | Producto de los nodos del último nivel. |
| [PromedioRango](2025/src/Parciales/Árboles/PromedioRango/Enunciado.jpg) | [Parcial.java](2025/src/Parciales/Árboles/PromedioRango/Parcial.java) | Promedio de los valores dentro del rango [min, max]. |
| [SubarbolesHijosPares](2025/src/Parciales/Árboles/SubarbolesHijosPares/Enunciado.jpg) | [Parcial.java](2025/src/Parciales/Árboles/SubarbolesHijosPares/Parcial.java) | Subárboles con cantidad par de hijos, en inorden. |
| [SumaParesImpares](2025/src/Parciales/Árboles/SumaParesImpares/Enunciado.jpg) | [Parcial.java](2025/src/Parciales/Árboles/SumaParesImpares/Parcial.java) | Si la suma total es par, suma los positivos; si es impar, los negativos. |
| [ValorNivelInOrden](2025/src/Parciales/Árboles/ValorNivelInOrden/Enunciado.jpg) | [Parcial.java](2025/src/Parciales/Árboles/ValorNivelInOrden/Parcial.java) | Valores mayores a uno dado, con su nivel, en inorden. |

### [Grafos](2025/src/Parciales/Grafos/)

| Parcial | Solución | Qué resuelve |
| --- | --- | --- |
| [15/06/2024, tema 1](2025/src/Parciales/Grafos/Fecha_15_06_2024/Tema1/Enunciado.jpg) | [Temaiken1.java](2025/src/Parciales/Grafos/Fecha_15_06_2024/Tema1/Temaiken1.java) | Máxima cantidad de recintos visitables en un tiempo dado. |
| [15/06/2024, tema 2](2025/src/Parciales/Grafos/Fecha_15_06_2024/Tema2/Enunciado.jpg) | [Temaiken2.java](2025/src/Parciales/Grafos/Fecha_15_06_2024/Tema2/Temaiken2.java) | Si se pueden recorrer todos los recintos en el tiempo dado. |
| [28/11/2022](2025/src/Parciales/Grafos/Fecha_28_11_2022/Enunciado.pdf) | [Estadios.java](2025/src/Parciales/Grafos/Fecha_28_11_2022/Estadios.java) | Camino que visita la mayor cantidad de estadios desde un origen sin superar `cantKm`. |

### [Análisis de algoritmos](2025/src/Parciales/Análisis%20de%20Algoritmos%20-%20Tiempos%20de%20Ejecución/)

Enunciados (PDF e imágenes) de parciales de tiempos de ejecución de 2008 y de 2022 a 2024.
