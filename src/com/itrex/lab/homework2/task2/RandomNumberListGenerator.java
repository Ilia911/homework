package com.itrex.lab.homework2.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberListGenerator {

    private final Random generator = new Random();

    public List<Integer> generateList() {

        List<Integer> randomList = new ArrayList<>(3);

        for (int i = 0; i < 3; i++) {
            int generatedValue = generator.nextInt(9) + 1;
            randomList.add(generatedValue);
        }
        return randomList;
    }
}
