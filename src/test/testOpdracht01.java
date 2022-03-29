package test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testOpdracht01 {
    @Test
    public void testOpdracht01() {
//        Opdracht01 Opdracht01 = new Opdracht01();

        assertEquals(0, App.Opdracht01(""));
        assertEquals(3, App.Opdracht01("Zes"));
        assertEquals(4, App.Opdracht01("Acht"));
        assertEquals(6, App.Opdracht01("Twaalf"));
        assertEquals(3, App.Opdracht01("Six"));
        assertEquals(6, App.Opdracht01("Twelve"));
        assertEquals(4, App.Opdracht01("Tien"));
        assertEquals(9, App.Opdracht01("-Achttien"));
        assertEquals(5, App.Opdracht01("-Tien"));
        assertEquals(9, App.Opdracht01("-Achttien"));
    }

}
