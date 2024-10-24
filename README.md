Auxiliar 10
---

## Contexto

Usted está desarrollando un juego de combate. En este tiene tres tipos de
personajes que el jugador puede usar: **Guerrero**, **Mago** y **Ninja**.
Cada personaje se puede equipar un arma para combatir, pero cada tipo de
personaje sabe usar solo algunos tipos de armas. Las especificaciones de
esto se muestran a continuación.

|         | Sword              | Knife              | Staff              |
|---------|--------------------|--------------------|--------------------|
| Warrior | :heavy_check_mark: | :x:                | :x:                |
| Ninja   | :heavy_check_mark: | :heavy_check_mark: | :x:                |
| Mage    | :x:                | :heavy_check_mark: | :heavy_check_mark: |


## Problema 1: El inventario

Para poder equipar un arma, cada personaje deberá tener un inventario donde
estarán las armas que puede usar. Para eso, al inicio del juego se deberá 
inicializar el inventario del personaje con una cantidad fija de armas aleatorias,
pero debe asegurarse de que las armas sean de algún tipo que pueda equiparse
el personaje (por ejemplo, un Guerrero no debe tener un Cuchillo en su inventario).

## Problema 2: Mezclando armas

Además de lo anterior, se quiere agregar una funcionalidad para que se puedan 
combinar armas para obtener nuevas armas más poderosas. Para esto, si se toman
dos armas y se combinan, el daño de la nueva arma se suma y se pondera por `1.5`.
De esta forma, si se tienen dos armas de daño `10` y `20`, el daño de la nueva
arma será `45`.

Es importante resaltar que al combinar dos armas se genera una nueva arma, y
esta también se puede combinar con otras armas. Para efectos prácticos, no hay
restricciones para combinar las armas, y se puede asumir que, dada la solución 
del problema anterior, el arma del personaje siempre estará compuesta por armas
que puede equiparse.