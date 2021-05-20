package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Before;
//import org.junit.jupiter.api.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    //@Before
    //public void beforeTest(){
    //  // some steps to perform before tests are run
    //}
    
    /**
     * An initial test
     */
    @Test
    public void TestOneDigit(){

        int input = 7;
        int expected = 1;

        Recursion recursion = new Recursion();
        assertEquals(expected, recursion.count7(input));

    }
    
    // add more tests
    @Test
    public void TestTwoDigit(){

        int input = 76;
        int expected = 1;

        Recursion recursion = new Recursion();
        assertEquals(expected, recursion.count7(input));

    }

    @Test
    public void TestThreeDigit(){

        int input = 707;
        int expected = 2;

        Recursion recursion = new Recursion();
        assertEquals(expected, recursion.count7(input));

    }

    @Test
    public void TestZero(){

        int input = 0;
        int expected = 0;

        Recursion recursion = new Recursion();
        assertEquals(expected, recursion.count7(input));

    }

    @Test
    public void TestNegative(){

        int input = -7;
        int expected = -1;

        Recursion recursion = new Recursion();
        assertEquals(expected, recursion.count7(input));

    }



    //@After
    //public void afterTest(){
    //  // some steps to perform after tests are run
    //}
    
    
}
