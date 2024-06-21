
package com.aston.java.lesson;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+375331112233");
        phoneBook.add("Петров", "+375332223344");
        phoneBook.add("Сидоров", "+375334445533");
        phoneBook.add("Петров", "+375335559988");
        phoneBook.add("Иванов", "+375337771133");

        String searchSurname = "Петров";
        List<String> petrovPhones = phoneBook.get(searchSurname);
        if (!petrovPhones.isEmpty()) {
            System.out.println("Номера телефонов для контакта по фамилии " + searchSurname + ": " + petrovPhones);
        } else {
            System.out.println("Записей с фамилией " + searchSurname + " не найдено.");
        }

        String[] wordsArray = new String[]{
                "Дерево", "Дом", "Кот", "Солнце", "Пляж",
                "Море", "Дорога", "Кот", "Пляж", "Дом"
        };

        List<String> wordList = new ArrayList<>(Arrays.asList(wordsArray));

        Set<String> uniqueWords = new HashSet<>(wordList);

        System.out.println("Уникальные слова: " + uniqueWords);

        Map<String, Integer> wordsFrequency = WordFrequencyCounter.countWords(wordList);

        for (Map.Entry<String, Integer> entry : wordsFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
