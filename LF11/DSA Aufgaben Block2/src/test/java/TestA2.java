import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.priester.industries.Aufgabe2;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestA2 {

    Aufgabe2 a2;

    @BeforeEach
    void init() {
        a2 = new Aufgabe2();
    }

    @Test
    void test1() {
        List<String> expected = new ArrayList<>();
        expected.add("Eins");
        expected.add("Zwei");
        expected.add("Drei");
        ArrayList<String> input = new ArrayList<>();
        input.add("Drei");
        input.add("Zwei");
        input.add("Eins");

        assertEquals(expected, a2.printReverse(input));
    }

    @Test
    void testNull() {
        List<String> expected = new ArrayList<>();


        assertEquals(expected, a2.printReverse(null));
    }

    @Test
    void testEmpty() {
        List<String> expected = new ArrayList<>();

        ArrayList<String> input = new ArrayList<>();


        assertEquals(expected, a2.printReverse(input));
    }
    @Test
    void testEmpty_String() {
        List<String> expected = new ArrayList<>();
        expected.add("");

        ArrayList<String> input = new ArrayList<>();
        input.add("");

        assertEquals(expected, a2.printReverse(input));
    }

    @Test
    void testBlank_String() {
        List<String> expected = new ArrayList<>();
        expected.add(" ");

        ArrayList<String> input = new ArrayList<>();
        input.add(" ");

        assertEquals(expected, a2.printReverse(input));
    }

}
