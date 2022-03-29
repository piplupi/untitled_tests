package test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testMultiply {
    @Test
    public void testMultiply() {
//        a App = new a();
        App a = new App();

        assertEquals("111", a.multiply(1));
        assertEquals("222", a.multiply(2));
        assertEquals("333", a.multiply(3));
        assertEquals("444", a.multiply(4));
        assertEquals("555", a.multiply(5));
        assertEquals("666", a.multiply(6));
        assertEquals("777", a.multiply(7));
        assertEquals("888", a.multiply(8));
        assertEquals("999", a.multiply(9));
        assertEquals("000", a.multiply(0));
    }

}
