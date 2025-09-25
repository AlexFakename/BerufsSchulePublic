package org.priester.industries;

import java.util.ArrayList;

public class Aufgabe2 {

    public void printReverse(ArrayList<String> list) {
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
