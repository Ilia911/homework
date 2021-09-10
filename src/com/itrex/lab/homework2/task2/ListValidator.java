package com.itrex.lab.homework2.task2;

import com.itrex.lab.homework2.task2.exception.EvenException;

import java.util.List;

public class ListValidator {

    public static boolean validate(List<Integer> list) throws EvenException {

        for (Integer value : list) {
            if (value % 2 == 0) {
                throw new EvenException(list, value, "The list contains an even value");
            }
        }
        return true;
    }
}
