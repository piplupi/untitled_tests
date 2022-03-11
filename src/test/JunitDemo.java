package test;

import main.Calculator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Assertions.assertEquals()
 * Assertions.assertNotEquals()
 * Assertions.assertArrayEquals()
 * Assertions.assertIterableEquals()
 * Assertions.assertNotNull()
 * Assertions.assertTrue()
 * Assertions.assertFalse()
 * Assertions.assertThrows()
 * Assertions.assertAll()
 * Assert.fail()
 * */

class JunitDemo {

    Calculator calc = new Calculator();


    @Test
    @DisplayName("Assert Equal Test Case")
    public void assertEqualTest(){
        // Assertions.assertEquals(4, calc.add(2,2), () -> "Assert Equal Test Failed");
        Assertions.assertNotEquals(3, calc.add(2,2));
    }

    @Test
    @DisplayName("Assert Array Equal Test Case")
    public void assertArrayEqualTest(){
        Assertions.assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
    }

    @Test
    @DisplayName("Assert Iterable Equal Test Case")
    public void assertIterableEqual(){
        Iterable<Integer> listOne = new ArrayList<>(Arrays.asList(1,2,3));
        Iterable<Integer> listTwo = new ArrayList<>(Arrays.asList(1,2,3));

        Assertions.assertIterableEquals(listOne, listTwo);
    }

    @Test
    @DisplayName("Assert Not Null Test")
    public void assertNotNullTest(){
        String nullString = null;
        String notNullString = "ABC";
        Assertions.assertNotNull(notNullString);
    }

    @Test
    @DisplayName("Assert True Test")
    public void assertTrueTest(){
        boolean trueBoolean = true;
        boolean falseBoolean = false;

        Assertions.assertTrue(trueBoolean, "Assert True Test Failed");
    }

    @Test
    @DisplayName("Assert False Test")
    public void assertFalseTest(){
        boolean trueBoolean = true;
        boolean falseBoolean = false;
        Assertions.assertFalse(falseBoolean, "Assert False Test Failed");
    }

    @Test
    @DisplayName("Assert Exception Test")
    public void assertExceptionTest(){
        Assertions.assertThrows(ArithmeticException.class, () -> calc.divide(1,0), "Assert Exception Test Case Failed");

    }

    @Test
    @DisplayName("Assert All Test")
    public void assertAllTest(){
        Assertions.assertAll(
                () -> Assertions.assertEquals(4, calc.add(1,3)),
                () -> Assertions.assertEquals(2, calc.add(-1,3)),
                () -> Assertions.assertEquals(-4, calc.add(-1,-3)),
                () -> Assertions.assertEquals(3,  calc.add(0,3))
        );
    }

//    @Test
//    @DisplayName("Assert Fail Test Case")
//    public void assertFailTest(){
//        Assertions.fail("This test cases will fail every time");
//    }



}
