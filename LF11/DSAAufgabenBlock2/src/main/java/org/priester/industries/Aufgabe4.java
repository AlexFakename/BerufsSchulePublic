package org.priester.industries;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe4 {
    class Node {
        String value;
        Node next;
        Node prev;

        public Node(String value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(String value, Node next) {
            this(value, next, null);
        }

        public Node(String value) {
            this(value, null);
        }

        public Node() {
            this(null, null);
        }

    }

    private Node first;
    private Node last;


    public void printall() {
        Node node = first;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }
    public void printallReversed() {
        Node node = last;
        while (node != null) {
            System.out.println(node.value);
            node = node.prev;
        }
    }

    public List<String> allAsBuildInList() {
        List<String> result = new ArrayList<>();
        Node node = first;
        while (node != null) {
            result.add(node.value);
            node = node.next;
        }
        return result;
    }

    public List<String> allAsBuildInListReversed() {
        List<String> result = new ArrayList<>();
        Node node = last;
        while (node != null) {
            result.add(node.value);
            node = node.prev;
        }
        return result;
    }

    public List<String> add(String val) {
        if (first == null) {
            first = new Node(val, null, null);
            last = first;
            return allAsBuildInList();
        }

        Node node = first;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(val, null, node);
        last = node.next;

        return allAsBuildInList();
    }

    public List<String> addInFront(String val) {
        if (first == null) {
            first = new Node(val, null, null);
            last = first;
            return allAsBuildInList();
        }

        Node newNode = new Node(val, first, null);
        first.prev = newNode;
        first = newNode;

        return allAsBuildInList();
    }

}
