package org.priester.industries;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestA3 {

    Aufgabe3 a3;

    @BeforeEach
    void init() {
        a3 = new Aufgabe3();
    }

    void buildBasicList() {
        a3.add(2);
        a3.add(4);
        a3.add(5);
        a3.add(6);
        a3.add(8);
    }

    @Test
    void testTestBuilding() { // this is getting ridiculous
        buildBasicList();
        List<Integer> expected = Arrays.asList(2,4,5,6,8);
        assertEquals(expected, a3.allAsBuildInList());
    }

    @Test
    void test1() {
        buildBasicList();
        a3.printall();
        System.out.println("-".repeat(20));
        List<Integer> expected = Arrays.asList(2,4,6,8);
        assertEquals(expected, a3.printEvenNumbers());
    }

    @Test
    void testAdding() {
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        assertEquals(expected, a3.add(3));
        expected.add(4);
        assertEquals(expected, a3.add(4));
        expected.add(5);
        assertEquals(expected, a3.add(5));
    }

    @Test
    void testReverseWithStack() {
        buildBasicList();
        List<Integer> expected = Arrays.asList(8,6,5,4,2);
        a3.reverseWithStack();
        assertEquals(expected, a3.allAsBuildInList());
    }

    @Test
    void testReverseWithPointer() {
        buildBasicList();
        List<Integer> expected = Arrays.asList(8,6,5,4,2);
        a3.reverseWithPointer();
        assertEquals(expected, a3.allAsBuildInList());
    }

}
