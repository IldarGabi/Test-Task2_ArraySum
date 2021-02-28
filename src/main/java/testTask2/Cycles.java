package testTask2;

import java.util.Arrays;

public class Cycles {
    public int cycleWhile(int[] array) {
        int i = 0;
        while (i < Arrays.stream(array).sum()) {
            i++;
        }
        return i;
    }

    public int cycleFor(int[] arrays) {
        int i = 0;
        for (int array : arrays) {
            i += array;
        }
        return i;
    }

    public int recursion(int[] array) {
        System.out.println("Array Sum with recursion = " + sum(array, array.length - 1));
        return sum(array, array.length - 1);
    }
    private static int sum(int[] array, int index) {
        if (index == 0) {
            return array[index];
        }
        return array[index] + sum(array, index - 1);
    }
}