package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {

    @Test
    public void shouldBeAbleToCreateFizzBuzzObject(){
        //Arrange and Action
        FizzBuzz UnderTest = new FizzBuzz();
        //Assertion
        assertTrue(UnderTest != null);
    }

    @Test
    public void given1ShouldReturn1(){
        //Arrange
        FizzBuzz underTest = new FizzBuzz();

        //Action
        String result = underTest.interpret(1);

        //Assertion
        assertEquals("1", result);
    }
}
