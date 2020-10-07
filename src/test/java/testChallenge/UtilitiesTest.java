package testChallenge;

import org.junit.Before;
import org.junit.Test;

import javax.rmi.CORBA.Util;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

    @Before
    public void setup(){
      util = new Utilities();
    }

    @Test
    public void everyNthChar() throws Exception {
        //fail();

        //Utilities utils = new Utilities();
        char[] output = util.everyNthChar(new char[]{'h','e','l','l','o'},2);

        assertArrayEquals(new char[] {'e','l'},output);

        char[] output2 = util.everyNthChar(new char[]{'h','e','l','l','o'},8);

        assertArrayEquals(new char[] {'h','e','l','l','o'},output2);
    }

    @Test
    public void removePairs() throws Exception {
      // fail();

       // Utilities util =  new Utilities();
       // assertEquals("ABCDEF",util.removePairs("ABCDDEEF"));
        assertEquals("ABCBDE",util.removePairs("ABCCBDEEF"));
        assertNull("did not get null ",util.removePairs(null));
        assertEquals("",util.removePairs(""));
        assertEquals("A",util.removePairs("A"));
    }

    @Test
    public void converter() throws Exception {
        //fail();
    assertEquals(300, util.converter(10,5));

    }

    @Test(expected = ArithmeticException.class)
    public void converter_aritmethicException() throws Exception{
        //Utilities util = new Utilities();  /injection la inceput
        util.converter(10,0);
    }

    @Test
    public void nullIfOddLength() throws Exception {
        //fail();


    }

}