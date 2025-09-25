package org.priester.industries;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe2 {

    public List<String> printReverse(ArrayList<String> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList<>();
        }
        if (list.size() == 1) {
            System.out.println(list.getFirst() + " länge: " + list.getFirst().length());
            return new ArrayList<>(list);
        }

        List<String> result = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i) + " länge: " + list.get(i).length());
            result.add(list.get(i));
        }

        return result;
    }
}
