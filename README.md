# Conversor de Monedas

Este es un proyecto de Java que realiza la conversión de monedas utilizando una API de tasas de cambio. El programa permite al usuario elegir entre varias opciones de conversión de moneda y muestra la tasa de cambio actual.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

- `ConversorPrincipal.java`: Clase principal que maneja la interacción del usuario.
- `Menu.java`: Clase que maneja la impresión del menú y la selección de opciones.
- `ConversorMonedas.java`: Clase que maneja la conversión de moneda y la interacción con la API.

## Instalación

### Prerrequisitos

- Java Development Kit (JDK) 11 o superior.
- Un entorno de desarrollo integrado (IDE) como IntelliJ IDEA, Eclipse o NetBeans.
- Si usas Maven, asegúrate de tenerlo instalado.

### Sin Maven

1. Clona el repositorio:
    ```sh
    git clone <URL_DEL_REPOSITORIO>
    ```

2. Navega al directorio del proyecto:
    ```sh
    cd <NOMBRE_DEL_PROYECTO>
    ```

3. Descarga el archivo JAR de `org.json` desde [aquí](https://mvnrepository.com/artifact/org.json/json/20211205).

4. Añade el archivo JAR descargado a tu proyecto en tu IDE.

5. Compila y ejecuta el proyecto desde tu IDE.

## Uso

1. Ejecuta la clase `ConversorPrincipal`.
2. Selecciona una de las opciones del menú para realizar una conversión de moneda.
3. El programa mostrará la tasa de cambio correspondiente.

## API de Tasas de Cambio

Este proyecto utiliza la API de ExchangeRate-API para obtener las tasas de cambio. Puedes obtener más información sobre esta API [aquí](https://www.exchangerate-api.com/).

## Contribuir

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (feature/nueva-caracteristica).
3. Realiza tus cambios.
4. Haz un commit de tus cambios (git commit -am 'Añadir nueva característica').
5. Sube la rama (git push origin feature/nueva-caracteristica).
6. Abre un Pull Request.
