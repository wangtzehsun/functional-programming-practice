package com.example.functionalprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("Without Predicate=====");
        System.out.println(isPhoneNumberValid("0912345678"));
        System.out.println(isPhoneNumberValid("0212345678"));
        System.out.println("With Predicate========");
        System.out.println(isPhoneNumberValidPredicate.test("0912345678"));
        System.out.println(isPhoneNumberValidPredicate.test("0212345678"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("0912345678"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("0922456783"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("09224533336783"));
    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("09") && phoneNumber.length() == 10;
    }

    static Predicate<String> isPhoneNumberValidPredicate = (phoneNumber) -> phoneNumber.startsWith("09") && phoneNumber.length() == 10;

    static Predicate<String> containsNumber3 = (phoneNumber) -> phoneNumber.contains("3");

}
