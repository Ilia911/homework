package com.itrex.lab.homework2.task2.exception;

import java.util.List;

public class EvenException extends Exception {

    private final int evenValue;
    private final List<Integer> validatedList;

    public EvenException(List<Integer> validatedList, int evenValue, String msg) {
        super(msg);
        this.evenValue = evenValue;
        this.validatedList = validatedList;
    }

    public int getEvenValue() {
        return evenValue;
    }

    public List<Integer> getValidatedList() {
        return validatedList;
    }
}
