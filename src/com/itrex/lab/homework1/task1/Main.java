package com.itrex.lab.homework1.task1;

import java.util.HashMap;
import java.util.Map;

/*
* Задан текст на английском языке. Выделить все различные слова.
Для каждого слова подсчитать частоту его встречаемости.
Слова, отличающиеся регистром букв, считать различными.
* */
public class Main {

    private static final String TEST_TEXT = "Hello my friends! And hello my hat! It is my awesome hat? Is it my Hat?";

    public static void main(String[] args) {
        String[] words = TEST_TEXT.split("\\W+");

        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {
            if (result.containsKey(word)) {
                int i = result.get(word);
                result.put(word, ++i);
            } else {
                result.put(word, 1);
            }
        }
        System.out.println(result);
    }
}
