# Trabajo Práctico N° 2: Árboles Generales

Este módulo aborda el diseño, implementación y recorrido de estructuras jerárquicas no lineales (Árboles Generales o n-arios) utilizando la representación de "Lista de Hijos" por asignación dinámica.

## Contenido del Práctico
*   **`ArbolGeneral<T>`**: Clase base que encapsula el dato del nodo y una lista enlazada de subárboles hijos.
*   **`RecorridosAG`**: Algoritmos de filtrado e iteración sobre árboles generales abarcando:
    *   Preorden
    *   Inorden (adaptado para árboles n-arios)
    *   Postorden
    *   Por Niveles (Anchura mediante el uso de colas)
*   **Problemas de Aplicación**: Modelado de esquemas jerárquicos de comunicación empresarial y redes de distribución de caudal de agua potable.
*   **Métricas del Árbol**: Cálculo de altura, nivel, amplitud (ancho), verificación de ancestros y validación de árboles llenos o completos.

## Documentación
El enunciado completo, junto con los diagramas esquemáticos de los árboles de prueba, se encuentra en la carpeta `docs/`.