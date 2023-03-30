package com.example.functionalprogramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        greetCustomer(new Customer("Alex", "0912345678"));
        // Consumer Functional Interface
        greetCustomerConsumer.accept(new Customer("Alex", "0912345678"));
        greetCustomerConsumerV2.accept(new Customer("Alex", "0912345678"), true);
        greetCustomerConsumerV2.accept(new Customer("Alex", "0912345678"), false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.name +
                    ", thanks for registering "
                    + (showPhoneNumber ? customer.phoneNumber : "****"));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.name +
            ", thanks for registering " +
            customer.phoneNumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.name +
                ", thanks for registering " +
                customer.phoneNumber);
    }

    static class Customer{
        private final String name;
        private final String phoneNumber;

        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }

}
