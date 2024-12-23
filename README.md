# Conversor de Monedas con la Api ExchangeRate
_Programa desarrollado en el lenguaje de programación java que tiene como función convertir un valor de una moneda base 
al valor correspondiente de la moneda objetivo (USD -> PEN), para realizar la conversión se ha utilizado el Api ExchangeRate._
## 🔨:Funcionalidades del proyecto
- `Funcionalidad 1`: _Realizar conversiones de monedas (en este proyecto se utilizo solo 7 variedades de monedas) de una moneda base a una moneda objetivo_
- `Funcionalidad 2`: _Visualizar el historial de conversiones realizados al ejecutar el programa_
## Ejecución 🔧
_Descargar el archivo zip, extraerlo y ejecutar el programa en un IDE en el archivo ConversionDeMonedas.java_

_Al ejecutar el programa saldra un serie de opciones donde podra elegir si realizar una conversion, mostrar el historial o salir del programa_
```
***********************************************
1) EUR
2) JPY
3) MXN
4) PEN
5) QAR
6) YER
7) USD
************************************************
Para convertir moneda -> 1
Para ver conversiones anteriores -> 2
Para salir -> 3
Elija una opcion: 
```
_Al elegir la opcion 1 se tendra que elegir la moneda base, la moneda objtivo y el monto. Al realizarse la consulta se mostrara el resultado de la conversion_
```
Elija una opcion: 
1
Seleccione la moneda base: 
4
Seleccione la moneda objetivo: 
1
Ingrese el monto a convertir: 
100
(2024-12-23T03:09:56.286992900)  Se convirtio 100.0 de la moneda 'PEN' a 25.71 de la moneda 'EUR'.
```
_Para mostrar el historial se debera elegir la opcion 2. Para mejor visualizacion se realizo más consultas_
```
Elija una opcion: 
2
(2024-12-23T03:09:56.286992900)  Se convirtio 100.0 de la moneda 'PEN' a 25.71 de la moneda 'EUR'.
(2024-12-23T03:11:59.857095600)  Se convirtio 100.0 de la moneda 'EUR' a 388.98 de la moneda 'PEN'.
(2024-12-23T03:12:19.082095800)  Se convirtio 20.25 de la moneda 'USD' a 75.510225 de la moneda 'PEN'.
(2024-12-23T03:12:38.597262600)  Se convirtio 15.257 de la moneda 'PEN' a 4.0919274 de la moneda 'USD'.
```
_Por ultimo, para finalizar el programa se debera elegir la opcion 3_
```
Elija una opcion: 
3
Finalizo la ejecución del programa!

```

## Palabras Finales
_Eso seria el programa. Gracias por leer._
