package org.priester.industries;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestA4 {

    Aufgabe4 a4;



    @BeforeEach
    void init() {
        a4 = new Aufgabe4();
    }

    void buildBasicList() {
        a4.add("Eins");
        a4.add("Zwei");
        a4.add("Drei");
        a4.add("Vier");
        a4.add("Fünf");
    }

    void buildBasicListFrontInsertion() {
        a4.addInFront("Fünf");
        a4.addInFront("Vier");
        a4.addInFront("Drei");
        a4.addInFront("Zwei");
        a4.addInFront("Eins");
    }

    @Test
    void testAdding_AndBuild_And_well_I_Guess_printing_names() {
        buildBasicList();
        List<String> expected = Arrays.asList("Eins","Zwei","Drei","Vier","Fünf");
        assertEquals(expected, a4.allAsBuildInList());
        a4.printall();
    }

    @Test
    void testReversePrint() {
        buildBasicList();
        List<String> expected = Arrays.asList("Fünf","Vier","Drei","Zwei","Eins");
        assertEquals(expected, a4.allAsBuildInListReversed());
        a4.printallReversed();
    }

    @Test
    void testAddingFirst() {
        buildBasicListFrontInsertion();
        List<String> expected = Arrays.asList("Eins","Zwei","Drei","Vier","Fünf");
        assertEquals(expected, a4.allAsBuildInList());
        a4.printall();
        System.out.println("-".repeat(20));
        a4.printallReversed();

        System.out.println("-".repeat(20));
        buildBasicList();
        a4.printall();
    }
}
