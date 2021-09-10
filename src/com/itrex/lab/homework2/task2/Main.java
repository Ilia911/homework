package com.itrex.lab.homework2.task2;

import com.itrex.lab.homework2.task2.exception.EvenException;

import java.util.List;

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
