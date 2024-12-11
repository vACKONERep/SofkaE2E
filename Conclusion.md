# Conclusiones del Ejercicio 1: Prueba E2E en DemoBlaze

## Resumen

En este ejercicio se implementó una prueba funcional automatizada de un flujo de compra en el sitio web de **DemoBlaze** utilizando el framework **Serenity BDD**. El objetivo de la prueba fue automatizar las siguientes acciones dentro del flujo de compra:

1. Agregar dos productos al carrito.
2. Visualizar el carrito.
3. Completar el formulario de compra.
4. Finalizar la compra.

## Hallazgos

- **Flujo de Compra Completo**: La prueba cubre todos los pasos del flujo de compra, incluyendo la selección de productos, visualización del carrito, el llenado del formulario de compra y la finalización del proceso de compra.
  
- **Uso de Serenity BDD**: El uso de Serenity BDD proporcionó una estructura clara para la automatización de las pruebas, con la ventaja de generar informes detallados sobre la ejecución de los tests y la visualización de los pasos del escenario.
- ![Test Report](https://github.com/vACKONERep/SofkaE2E/blob/master/brave_xjI7YrC654.png)
- ![Test Report](https://github.com/vACKONERep/SofkaE2E/blob/master/brave_Mxqu1wYIwS.png)
  
- **Interacción con Elementos Dinámicos**: El sitio web de DemoBlaze utiliza elementos dinámicos que requieren una espera adecuada para asegurar que los elementos estén cargados antes de interactuar con ellos. Serenity BDD facilitó la implementación de esperas implícitas para garantizar que la prueba fuera confiable.

- **Pruebas en Navegadores**: La prueba se ejecutó en el navegador Chrome y se verificó que los pasos fueran consistentes y funcionales en este entorno.

## Conclusiones

- **Automatización Exitosa**: El flujo de compra en el sitio web fue completamente automatizado y se realizó con éxito en la mayoría de los casos. La prueba cubrió los pasos clave, desde la selección de productos hasta la finalización de la compra.

- **Posibilidades de Mejora**: Se podrían añadir más validaciones en los formularios de compra para verificar que los datos introducidos sean correctos, y también realizar pruebas en diferentes navegadores y dispositivos.

- **Reproducibilidad**: El proyecto contiene todos los insumos necesarios (scripts, archivos, reportes) para ser reproducido y ejecutado por otros usuarios. Instrucciones detalladas sobre cómo ejecutar el proyecto están disponibles en el archivo `README.txt`.

- **Recomendaciones**: Para futuros ejercicios, se recomienda incluir pruebas adicionales para verificar la validación de los campos en los formularios de compra y la validación del estado del carrito antes y después de la compra.

## Archivos y Reportes Generados

- **Reportes**: Serenity BDD generó reportes detallados que incluyen información sobre cada paso de la prueba, tiempos de ejecución y cualquier error encontrado.
  
- **Archivos de Prueba**: Todos los archivos necesarios para ejecutar el proyecto están incluidos en el repositorio de GitHub, permitiendo que otros puedan verificar y ejecutar las pruebas sin problemas.
