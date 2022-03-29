package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class testOpdracht02 {
    @Test
    public void testOpdracht02() {
        App app = new App();
        assertTrue(app.Opdracht02(-5));
        assertTrue(app.Opdracht02(-4));
        assertTrue(app.Opdracht02(-3));
        assertTrue(app.Opdracht02(-2));
        assertTrue(app.Opdracht02(-1));
        assertTrue(app.Opdracht02(0));
        assertFalse(app.Opdracht02(1));
        assertFalse(app.Opdracht02(2));
        assertFalse(app.Opdracht02(3));
        assertFalse(app.Opdracht02(4));
    }
}
