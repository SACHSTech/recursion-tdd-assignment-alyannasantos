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
    public void TestCount7OneDigit() {

        int input = 7;
        int expected = 1;

        assertEquals(expected, Recursion.count7(input));
    }
    
    // add more tests
    @Test
    public void TestCount7TwoDigit() {

        int input = 76;
        int expected = 1;

        assertEquals(expected, Recursion.count7(input));
    }

    @Test
    public void TestCount7ThreeDigit() {

        int input = 707;
        int expected = 2;

        assertEquals(expected, Recursion.count7(input));
    }

    @Test
    public void TestCount7Zero() {

        int input = 0;
        int expected = 0;

        assertEquals(expected, Recursion.count7(input));
    }

    @Test
    public void TestCount7Negative() {

        int input = -7;
        int expected = -1;

        assertEquals(expected, Recursion.count7(input));
    }

    @Test
    public void TestChangePiNoPi() {

        String input = "xxxx";
        String expected = "xxxx";

        assertEquals(expected, Recursion.changePi(input));
    }

    @Test
    public void TestChangePiBeginningPi() {

        String input = "pixx";
        String expected = "3.14xx";

        assertEquals(expected, Recursion.changePi(input));
    }

    @Test
    public void TestChangePiMiddlePi() {

        String input = "xpix";
        String expected = "x3.14x";

        assertEquals(expected, Recursion.changePi(input));
    }

    @Test
    public void TestChangePiEndPi() {

        String input = "xxxpi";
        String expected = "xxx3.14";

        assertEquals(expected, Recursion.changePi(input));
    }

    @Test
    public void TestChangePiMultiplePi() {

        String input = "pipipi";
        String expected = "3.143.143.14";

        assertEquals(expected, Recursion.changePi(input));
    }

    @Test
    public void TestStringCleanNone() {

        String input = "abcd";
        String expected = "abcd";

        assertEquals(expected, Recursion.stringClean(input));
    }

    @Test
    public void TestStringCleanOne() {

        String input = "hello";
        String expected = "helo";

        assertEquals(expected, Recursion.stringClean(input));
    }

    @Test
    public void TestStringCleanTwo() {

        String input = "aaabcc";
        String expected = "abc";

        assertEquals(expected, Recursion.stringClean(input));
    }

    @Test
    public void TestStringCleanALot() {

        String input = "qqqqqwwwwerrrttyyyyy";
        String expected = "qwerty";

        assertEquals(expected, Recursion.stringClean(input));
    }

    @Test
    public void TestStringCleanEmpty() {

        String input = "";
        String expected = "";

        assertEquals(expected, Recursion.stringClean(input));
    }

    @Test
    public void TestStringCleanNull() {

        String input = null;
        String expected = "";

        assertEquals(expected, Recursion.stringClean(input));
    }

    //@After
    //public void afterTest(){
    //  // some steps to perform after tests are run
    //}
    
    
}
