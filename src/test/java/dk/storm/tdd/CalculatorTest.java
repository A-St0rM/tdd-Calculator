package dk.storm.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator cl = new Calculator();

    @Test
    public void add(){
        int expected = 10;
        int actual = cl.add(5,5);
        assertEquals(expected, actual);
    }

    @Test
    public void stringAdd(){
        int expected = 10;
        int actual = cl.add("5,5");
        assertEquals(expected, actual);
    }

    @Test
    public void arrayAdd(){
        int expected = 8;
        int actual = cl.add(new int[]{3,2,3}); //Initializing array (Deciding size)
        assertEquals(expected, actual);
    }

    @Test
    public void subtract(){
        int expected = 5;
        int actual = cl.subtract(10,5);
        assertEquals(expected, actual);
    }

    @Test
    public void multiply(){
        int expected = 10;
        int actual = cl.multiply(5,2);
        assertEquals(expected, actual);
    }

    @Test
    public void divide(){
        double expected = 1;
        double actual = cl.divide(5,5);
        assertEquals(expected, actual);
    }


}