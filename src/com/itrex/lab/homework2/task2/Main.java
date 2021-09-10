package com.itrex.lab.homework2.task2;

import com.itrex.lab.homework2.task2.exception.EvenException;

import java.util.List;

/*
*Написать генератор листа рандомных чисел от 1 до 9, лист должен содержать 3 элемента.
Написать валидатор этого листа который проверяет все ли значения этого листа не четные.
Если лист содержит четное число/числа валидатор бросает Вашу собственную ошибку(её нужно написать).
Ошибка должна содержать поле с самим листом и поле со значением которое не прошло валидацию.
Эту ошибку из валидатора нужно пробросить на верх.
Выше уровнем ошибку нужно поймать, залогировать и запустить всю логику заново.
(программа должна работать пока не сгенерит валидный лист).
* */

public class Main {

    public static void main(String[] args) {
        go();
    }

    private static void go() {
        List<Integer> list = null;

        while (list == null) {
            list = generateList();
        }
        System.out.println("Result valid list is: " + list);
    }

    private static List<Integer> generateList() {
        List<Integer> generatedList = null;

        RandomNumberListGenerator generator = new RandomNumberListGenerator();

        try {
            generatedList = generator.generateList();
            ListValidator.validate(generatedList);
        } catch (EvenException ex) {
            evenExceptionLog(ex);
            generatedList = null;
        }
        return generatedList;

    }

    private static void evenExceptionLog(EvenException ex) {
        System.out.println("EvenException captured. Origin list: " + ex.getValidatedList()
                + ", even value: " + ex.getEvenValue());
    }

}
