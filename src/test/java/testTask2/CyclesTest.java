package testTask2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CyclesTest {
    Cycles cycles = new Cycles();

    @Test
    void whileCheck() {
        int[] array = {3, 1, 5, 7, 9};
        int expected = 25;
        int actual = cycles.cycleWhile(array);
        assertEquals(expected, actual);
        System.out.println("Array Sum with 'while' cycle = " + actual);
    }

    @Test
    void forCheck() {
        int[] arrays = {3, 1, 5, 7, 9};
        int expected = 25;
        int actual = cycles.cycleFor(arrays);
        assertEquals(expected, actual);
        System.out.println("Array Sum with 'for' cycle = " + actual);
    }

    @Test
    void recursionCheck() {
        int[] array = {3, 1, 5, 7, 9};
        int expected = 25;
        int actual = cycles.recursion(array);
        assertEquals(expected, actual);
    }
}