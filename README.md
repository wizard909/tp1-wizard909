## Un Paseo por el Infierno

Objetivo: Leer y comprender el enunciado. Realizar las preguntas que crean necesarias para aclarar el diseño del modelo.

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
a. para el demonio de sombras, que el nivel de valor del alma esté por debajo de un límite dado, que actualmente es de 50 y es el mismo para todos los demonios de sombras. El Diablo tiene un programa de entrenamiento de demonios muy riguroso con el que pretende poder ir aumentando este límite, pero siempre para todos por igual.
b. para los demonios de hielo, que el alma sea friolenta. De cada alma se sabe si es friolenta o no.
c. para los demonios de fuego, que el alma NO sea friolenta.

Cuando un demonio no es capaz de cazar un alma, se dice que es un alma jodida para este demonio. Las almas jodidas son las que terminan siendo atormentadas cuando el demonio sale a cazar.
Cuando un demonio caza a un alma, la misma deja de habitar el lugar y pasa a estar en poder del demonio.
Las almas no cazadas (las jodidas), como se dijo, son atormentadas por el demonio. Cuando esto ocurre, el nivel de bondad del alma se reduce en 5 y además:
en su mencionada rivalidad, los demonios de hielo y de fuego se ponen obstáculos los unos a los otros. Si el que atormenta es un demonio de fuego, entonces el alma atormentada deja de ser friolenta; si es un demonio de hielo, entonces convierte al alma atormentada en friolenta.
los demonios de sombras, en cambio, son más inteligentes y disminuyen adicionalmente el nivel de valor a la mitad para mejorar las probabilidades de éxito en un ataque futuro.
Finalmente, el demonio aumenta su nivel de maldad en un número igual a la suma de la cantidad de almas atormentadas más el doble de las almas cazadas.
