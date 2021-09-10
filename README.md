# homework

homework 2: task 1:
-Написать программу которая при запуске вызывает OutOfMemoryError: Metaspace.

Для того, чтобы уменьшить размер Metaspace, использовал опцию -XX:MaxMetaspaceSize=100m, хотя и без этой опции ошибка генерируется, но позже.

Запускал свой класс из командной строки:
java -XX:MaxMetaspaceSize=100m com.itrex.lab.homework2.task1.Main