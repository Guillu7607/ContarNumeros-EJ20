# Resumen
Este proyecto consta de dos aplicaciones de consola independientes en Java que ilustran el ciclo de vida básico de la persistencia de datos en archivos de texto plano. El primer programa (EscribirNumeros) se encarga de generar y estructurar un archivo con datos numéricos secuenciales, mientras que el segundo (LeerNumeros) realiza la lectura y volcado de dicha información por consola.

## Características
Generación Secuencial de Datos: Implementa un bucle indexado clásico (for) para escribir una secuencia numérica correlativa del 1 al 10 en un archivo externo.

Persistencia Limpia de Caracteres: Utiliza FileWriter para la creación y sobrescritura del archivo físico, concatenando saltos de línea explícitos (\n) para estructurar los datos por filas.

Lectura Orientada a Líneas: Emplea la combinación de File y Scanner para recuperar y escanear de forma secuencial cada elemento del archivo sin necesidad de cargar todo el bloque de texto en memoria a la vez.

Doble Enfoque de Gestión de Recursos: Muestra de forma práctica el contraste entre el cierre automático de flujos modernos (try-with-resources) y el cierre manual de objetos mediante código tradicional.
