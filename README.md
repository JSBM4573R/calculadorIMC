# calculadorIMC
Reto 1 Java - Programa que calcula el Indice de Masa Corporal (IMC) retornando su estado actual y nivel de riesgo.

## Descripcion Reto:
Maria una estudiante de primer semestre de Medicina tiene como proyecto crear un programa que permita determinar el riesgo que tienen sus familiares de sufrir problemas del corazón. Una persona puede estar en riesgo de sufrir estas enfermedades dependiendo de su edad y su indice de masa corporal (IMC). Los siguientes datos presenta los diferentes niveles de riesgo:<br><br>

IMC <=22 : Edad <=40 riesgo = Bajo y Edad > 40 riesgo = Medio.<br>
IMC > 22 : Edad <=40 riesgo = Medio y Edad > 40 riesgo = Alto.

## Historia de usuario:
### Entrada:
Cada caso de prueba estara construida por una linea formada por 3 valores separados por un espacio:<br>
La masa de la personaa en Kg<br>
La altura en metros<br>
La edad de la persona en Años<br>

### Salida:
El programa imprimira una linea con dos valores:<br>
El IMC calculado con dos numeros decimales.<br>
El nivel de riesgo actual.<br>
En caso de ingresar algun valor de masa, altura o edad fuera de rangos permitidos retornara la palabra "ERROR".<br>

### Casos de prueba:
Entrada:<br>
73.1 1.65 35<br>
190 1.60 100<br><br>
Salida:<br>
26.85 Medio<br>
ERROR
