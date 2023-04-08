package com.example.functionalprogramming;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlsSupplier.get());
        System.out.println(getDBConnectionUrlListSupplier.get());
    }

    static String getDBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionUrlsSupplier = ()-> "jdbc://localhost:5432/users";

    static Supplier<List<String>> getDBConnectionUrlListSupplier = ()->
    List.of("jdbc://localhost:5432/users", "postgres://localhost:5432/users");
}
