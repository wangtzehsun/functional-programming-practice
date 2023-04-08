package com.example.functionalprogramming;

import com.example.functionalprogramming.components.Gender;
import com.example.functionalprogramming.components.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImperativeVSDeclarative {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Jane", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Cathy", Gender.FEMALE),
                new Person("Peter", Gender.MALE)
        );
        // Imperative approach
        System.out.println("Imperative approach");
        List<Person> females = new ArrayList<>();
        for(Person person : people){
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for(Person female : females){
            System.out.println(female);
        }

        System.out.println(females.size());

        // Declarative approach
        System.out.println("Declarative approach");
        Predicate<Person> predicate = p -> Gender.FEMALE.equals(p.gender);

        List<Person> females2 = people.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        females2.forEach(System.out::println);
    }





}
