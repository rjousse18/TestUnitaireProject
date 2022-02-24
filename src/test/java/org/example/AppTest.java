package org.example;

import static org.junit.Assert.assertTrue;

import junit.framework.Assert;
import org.example.FizzBuzz;
import org.testng.annotations.Test;

public class AppTest
{
    @org.testng.annotations.Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @org.testng.annotations.Test
    public void testDoFizzBuzz_NumberDivisibleBy3_ShouldReturnFizz(){
        int nombre = 9;
        String outputExpected = "Fizz";
        FizzBuzz fb = new FizzBuzz();

        String result = fb.doFizzBuzz(nombre);
        Assert.assertEquals(outputExpected, result);
    }

    @org.testng.annotations.Test
    public void testDoFizzBuzz_NumberDivisibleBy5_ShouldReturnBuzz(){
        int nombre = 25;
        String outputExpected = "Buzz";
        FizzBuzz fb = new FizzBuzz();

        String result = fb.doFizzBuzz(nombre);
        Assert.assertEquals(outputExpected, result);
    }

    @org.testng.annotations.Test
    public void testDoFizzBuzz_NumberDivisibleBy3And5_ShouldReturnFizzBuzz(){
        int nombre = 15;
        String outputExpected = "FizzBuzz";
        FizzBuzz fb = new FizzBuzz();

        String result = fb.doFizzBuzz(nombre);
        Assert.assertEquals(outputExpected, result);
    }

    @Test
    public void testDoFizzBuzz_NumberNotDivisibleBy3Or5_ShouldReturnEmpty(){
        int nombre = 2;
        String outputExpected = "2";
        FizzBuzz fb = new FizzBuzz();

        String result = fb.doFizzBuzz(nombre);
        Assert.assertEquals(outputExpected, result);
    }
}
