package com.aston.java.lesson;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> contactList = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        contactList.computeIfAbsent(surname, _unused -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String surname) {

        return contactList.getOrDefault(surname, new ArrayList<>());
    }
}
