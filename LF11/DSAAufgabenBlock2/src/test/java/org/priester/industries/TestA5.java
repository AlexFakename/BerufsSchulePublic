package org.priester.industries;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestA5 {

    Aufgabe5 a5;

    @BeforeEach
    void init() {
        a5 = new Aufgabe5();
    }

    void buildTree() {
        a5.add(10);
        a5.add(8);
        a5.add(11);
        a5.add(13);
        a5.add(12);
        a5.add(9);
        a5.add(2);
        a5.add(1);
        a5.add(1);
        a5.add(13);
    }

    @Test
    void test_Build_And_Print() {
        buildTree();
        List<Integer> expected = Arrays.asList(1,1,2,8,9,10,11,12,13,13);
        assertEquals(expected, a5.printAllInOrder());
    }

    @Test
    void test_getLargest() {
        buildTree();
        assertEquals(13, a5.getLargestValue());
    }
    @Test
    void test_getLargest2() {
        buildTree();
        a5.add(125);
        assertEquals(125, a5.getLargestValue());
    }
    @Test
    void test_getLargest3() {
        a5.add(125);
        assertEquals(125, a5.getLargestValue());
    }

    @Test
    void test_getSum() {
        buildTree();
        assertEquals(80, a5.calcSumRecursiveDFS());
    }
    @Test
    void test_getSum_Empty() {
        assertEquals(0, a5.calcSumRecursiveDFS());
    }
    @Test
    void test_getSum_AdditionalValues() {
        buildTree();
        a5.add(125);
        a5.add(5);

        assertEquals(210, a5.calcSumRecursiveDFS());
    }
    @Test
    void test_getSum_Additional_Negativ() {
        buildTree();
        a5.add(-13);
        assertEquals(67, a5.calcSumRecursiveDFS());
    }
    @Test
    void test_getSum_Additional_Negativ_And_Positiv() {
        buildTree();
        a5.add(-13);
        a5.add(1);
        a5.add(0);
        assertEquals(68, a5.calcSumRecursiveDFS());
    }

}
