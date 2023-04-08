package com.example.functionalprogramming;


import com.example.functionalprogramming.components.Person;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.example.functionalprogramming.components.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        
        List<Person> people = getPersonList();
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("=========================");

        people.stream()
                .map(person -> person.name)
                .mapToInt(name -> name.length())
                .forEach(System.out::println);

        System.out.println("=========================");

        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> person.gender.equals(FEMALE));
        System.out.println(containsOnlyFemales);

        System.out.println("=========================");

        Set<String> s = people.stream()
                .filter(p -> FEMALE.equals(p.gender))
                .map(person -> person.name)
                .collect(Collectors.toSet());
        System.out.println(s);

    }



    private static List<Person> getPersonList() {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Jane", FEMALE),
                new Person("Alex", MALE),
                new Person("Cathy", FEMALE),
                new Person("Peter", MALE),
                new Person("Jack", PREFER_NOT_TO_SAY)
        );
        return people;
    }
}
