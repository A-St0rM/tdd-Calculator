package dk.storm;

import dk.storm.tdd.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculator cl = new Calculator();
        System.out.println(cl.add("2,2,3"));
    }
}