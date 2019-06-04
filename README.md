# Un Paseo por el Infierno

## Parte 1

El Diablo no da más con el lío de demonios que tiene a su cargo y nos contrató para desarrollar un sistema que lo ayude a organizar sus cosas,
que según sus propias palabras “son un infierno”.
Obviamente, nuestras pobres almas no opusieron resistencia a fin de evitar arder por toda la eternidad.

Nos cuenta que tiene distintos tipos de demonios: 
los hay de `fuego`, también de `hielo` (eternos rivales entre sí) y otros de `sombras`. Todos ellos 
con innumerables tareas a realizar, pero cuya tarea más *importante* es la de `cazar` almas,
y es ésta la que el Diablo quiere que modelemos.

Cada alma tiene un determinado nivel de bondad y de valor. El Diablo, eventualmente, da la orden a un demonio para que vaya
a cazar almas a un determinado `lugar`. Cuando un demonio sale a cazar a un lugar, para cada alma del lugar pueden ocurrir dos cosas: 
* que el demonio logre *cazarla*
* o bienque el demonio no logre su objetivo, en cuyo caso se desquita *atormentándola*.

Para poder cazar a un alma determinada tienen que darse *siempre* dos condiciones (para cualquier tipo de demonio) :

1. que el nivel de maldad del demonio, el cual se conoce para cada demonio, sea superior al nivel de bondad del alma
2. una condición propia de cada tipo de demonio:
* para el demonio de `sombras`, que el nivel de valor del alma esté por debajo de un límite dado, que  es de 50.
* para los demonios de `hielo`, que el alma sea friolenta. De cada alma se sabe si es friolenta o no.
* para los demonios de `fuego`, que el alma NO sea friolenta.

Cuando un demonio no es capaz de cazar un alma, se dice que es un alma jodida para este demonio. Las almas jodidas son las que terminan siendo atormentadas cuando el demonio sale a cazar.
Cuando un demonio caza a un alma, la misma deja de habitar el lugar y pasa a estar en poder del demonio.

Las almas no cazadas (las jodidas), como se dijo, son `atormentadas` por el demonio. Cuando esto ocurre:
1. el nivel de bondad del alma se reduce en 5 y además:
2. dependiendo del tipo de demonio:
* en su mencionada rivalidad, los demonios de hielo y de fuego se ponen obstáculos los unos a los otros. Si el que atormenta es un demonio de fuego, entonces el alma atormentada deja de ser friolenta; si es un demonio de hielo, entonces convierte al alma atormentada en friolenta
* los demonios de sombras, en cambio, son más inteligentes y disminuyen adicionalmente el nivel de valor a la mitad para mejorar las probabilidades de éxito en un ataque futuro.

Finalmente, cuando cuando un demonio sale a cazar a un lugar aumenta su nivel de maldad en un número igual a la suma de la cantidad de almas atormentadas más el doble de las almas cazadas.

## Parte II

Las `almas` pueden entrenar y aprender distintas técnicas para  defenderse y evitar ser cazadas y/o atormentadas por los demonios. Las técnicas son las siguientes y un alma puede aprender mas de 1 técnica.

* Lucha marcial demoníaca: si un es entrenada en estas artes marcialaes, se duplica se duplica su `valor`.
* Supervivencia extrema en el infierno: si realiza esta supervivencia, el alma nunca puede ser friolenta.
* Paseo por la antartida:  si realiza este paseo, el alma siempre va a ser friolenta.

## Parte III

El Diablo quiere que podamos poder obtener:
- todas las almas cazadas por todos sus demonios
- de todas las almas cazadas, quiere obtener la mas valiente
- obtener el demonio que mas almas cazó
