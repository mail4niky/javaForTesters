package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration(){
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4",
                4, four.intValue());
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5",
                5, five.intValue());
        Integer six = 6;
        assertEquals("autoboxing assignment for 6",
                6, six.intValue());

    }

    @Test
    public void integerToHexString () {

        Integer eleven = 11;
        assertEquals ("11 becomes b", "b", eleven.toHexString(11));

        Integer ten = 10;
        assertEquals ("10 becomes a", "a", ten.toHexString(10));

        Integer three = 3;
        assertEquals ("3 becomes 3", "3", three.toHexString(3));

        Integer twentyone = 21;
        assertEquals ("21 becomes 15", "15", twentyone.toHexString(21));

    }
/*Integer.MIN_VALUE equals -2147483648
Integer.MAX_VALUE equals 2147483647*/
    @Test
    public void confirmMaxAndMinInteger () {

       Integer min = -2147483648;
       assertEquals ("min equals -2147483648", -2147483648, min.MIN_VALUE );

        Integer max = 2147483647;
        assertEquals ("max equals 2147483647", 2147483647, min.MAX_VALUE );
    }

}