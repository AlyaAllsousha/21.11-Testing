package ru.example.a2111;

import org.junit.After
import org.junit.Assert
import org.junit.Before;
import org.junit.Test

public class calculationTests {
     var calculations:calculation? = null
    @Before
    fun initCal(){
        calculations = calculation()
    }
    @Test
    fun factorial_isCorrect(){
        Assert.assertEquals(120, calculations?.factorial(5))
    }
    @Test
    fun factorial0_isCorrect(){
        Assert.assertEquals(0, calculations?.factorial(-1))
    }
    @Test
    fun fib_isCorrect(){
        Assert.assertEquals(12, calculations?.fibbonachi(5))
    }
    @Test
    fun fib1_isCorrect(){
        Assert.assertEquals(2, calculations?.fibbonachi(2))
    }
    @Test
    fun fib2_isCorrect(){
        Assert.assertEquals(7, calculations?.fibbonachi(4)) //1 1 2 3
    }
    @Test
    fun fib3_isCorrect(){
        Assert.assertEquals(20, calculations?.fibbonachi(6)) //1 1 2 3 5 8
    }
    @Test
    fun sochet_isCorrect(){
        Assert.assertEquals(4, calculations?.sochetanie(4,3))
    }
    @After
    fun destructCal(){
        calculations = null
    }
}
