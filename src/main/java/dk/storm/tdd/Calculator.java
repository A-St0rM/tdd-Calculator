package dk.storm.tdd;

public class Calculator {

    public int add(int a, int b) {
        int y = a + b;
        return y;
    }

    public int add(String numbers) {
        String[] numberParts = numbers.split(",");

        int sum = 0;
        for(String n : numberParts){
            sum += Integer.parseInt(n.trim());
        }
        return sum;
    }

    public int add(int[] numbers) {
        int sum = 0;
        for(int n : numbers){
            sum += n;
        }
        return sum;
    }

    public int subtract(int a, int b){
        int y = a - b;
        return y;
    }

    public int multiply(int a, int b){
        int y = a * b;
        return y;
    }

    public double divide(int a, int b){
        int y = a / b;
        return y;
    }

}
