# Servicio meteorologico

Se tiene un sistema online de informes meteorológicos utilizando el componente MeteoData que se encaga de registrar los datos de temperatura, humedad y presión.


## Parte I

Nos gustaría crear una aplicación que inicialmente tenga 3 displays que nos informen:

- condiciones actuales
- estadisticas
- pronostico

Todos deben actualizarse en tiempo real cada vez que el MeteoData obtiene nuevas mediciones.

No nos interesa saber como MeteData obtiene los datos de la estación meteorológica. Solo nos interesa saber que cada vez q algún dato se actualiza, se ejecuta el método `informacionActualizada`.

## Parte II

Ahora nos interesa desarrollar un API que permita que otros desarrolladores creer sus propios displays y los conecten al sistema.
De esta forma los nuevos display van a empezar a consumir y obtener en tiempo real la información del MeteoData.

