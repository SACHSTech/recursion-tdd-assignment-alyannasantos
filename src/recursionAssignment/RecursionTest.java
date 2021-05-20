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
    public void TestCount7OneDigit(){

        int input = 7;
        int expected = 1;

        Recursion recursion = new Recursion();
        assertEquals(expected, recursion.count7(input));

    }
    
    // add more tests
    @Test
    public void TestCount7TwoDigit(){

        int input = 76;
        int expected = 1;

        Recursion recursion = new Recursion();
        assertEquals(expected, recursion.count7(input));

    }

    @Test
    public void TestCount7ThreeDigit(){

        int input = 707;
        int expected = 2;

        Recursion recursion = new Recursion();
        assertEquals(expected, recursion.count7(input));

    }

    @Test
    public void TestCount7Zero(){

        int input = 0;
        int expected = 0;

        Recursion recursion = new Recursion();
        assertEquals(expected, recursion.count7(input));

    }

    @Test
    public void TestCount7Negative(){

        int input = -7;
        int expected = -1;

        Recursion recursion = new Recursion();
        assertEquals(expected, recursion.count7(input));

    }

    @Test
    public void TestChangePiNoPi(){

        String input = "xxxx";
        String expected = "xxxx";

        Recursion recursion = new Recursion();
        assertEquals(expected, recursion.changePi(input));

    }

    @Test
    public void TestChangePiBeginningPi(){

        String input = "pixx";
        String expected = "3.14xx";

        Recursion recursion = new Recursion();
        assertEquals(expected, recursion.changePi(input));

    }

    @Test
    public void TestChangePiMiddlePi(){

        String input = "xpix";
        String expected = "x3.14x";

        Recursion recursion = new Recursion();
        assertEquals(expected, recursion.changePi(input));

    }

    @Test
    public void TestChangePiEndPi(){

        String input = "xxxpi";
        String expected = "xxx3.14";

        Recursion recursion = new Recursion();
        assertEquals(expected, recursion.changePi(input));

    }

    @Test
    public void TestChangePiMultiplePi(){

        String input = "pipipi";
        String expected = "3.143.143.14";

        Recursion recursion = new Recursion();
        assertEquals(expected, recursion.changePi(input));

    }

    //@After
    //public void afterTest(){
    //  // some steps to perform after tests are run
    //}
    
    
}
