import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.priester.industries.Aufgabe1;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestA1 {

    Aufgabe1 a1;
    @BeforeEach
    void init() {
        a1 = new Aufgabe1();
    }

    @Test
    void test() {
        int[] result = a1.getSmallestLargestDiff(new int[] {1,2,3,4,5,6,7,8,9});
        assertEquals(1, result[0]);
        assertEquals(9, result[1]);
        assertEquals(8, result[2]);
    }
    @Test
    void testReverse() {
        int[] result = a1.getSmallestLargestDiff(new int[] {9,8,7,6,5,4,3,2,1});
        assertEquals(1, result[0]);
        assertEquals(9, result[1]);
        assertEquals(8, result[2]);
    }


    @Test
    void testEmpty() {
        int[] result = a1.getSmallestLargestDiff(new int[5]);
        assertEquals(0, result[0]);
        assertEquals(0, result[1]);
        assertEquals(0, result[2]);
    }

    @Test
    void testOneElement() {
        int[] result = a1.getSmallestLargestDiff(new int[] {1});
        assertEquals(1, result[0]);
        assertEquals(1, result[1]);
        assertEquals(0, result[2]);
    }

    @Test
    void testNull() {
        int[] result = a1.getSmallestLargestDiff(null);
        assertEquals(0, result[0]);
        assertEquals(0, result[1]);
        assertEquals(0, result[2]);
    }
}
