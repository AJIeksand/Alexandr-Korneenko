package com.aston.java.lesson;

import java.util.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordsFrequency = new HashMap<>();

        for (String word : words) {
            wordsFrequency.put(word, wordsFrequency.getOrDefault(word, 0) + 1);
        }

        return wordsFrequency;
    }
}
