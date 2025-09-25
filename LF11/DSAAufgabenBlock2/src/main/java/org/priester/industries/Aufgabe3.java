package org.priester.industries;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Aufgabe3 {


    class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this(value, null);
        }

        public Node() {
            this(0, null);
        }

    }

    private Node nodes;

    public Aufgabe3() {
        this.nodes = null;
    }

    public void printall() {
        Node node = nodes;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public List<Integer> allAsBuildInList() {
        List<Integer> result = new ArrayList<>();
        Node node = nodes;
        while (node != null) {
            result.add(node.value);
            node = node.next;
        }
        return result;
    }

    public List<Integer> printEvenNumbers() {
        List<Integer> result = new ArrayList<>();
        Node node = nodes;
        while (node != null) {
            if (node.value % 2 == 0) {
                System.out.println(node.value);
                result.add(node.value);
            }
            node = node.next;
        }


        return result;
    }

    public List<Integer> add(int val) {
        if (nodes == null) {
            nodes = new Node(val, null);
            return allAsBuildInList();
        }

        Node node = nodes;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(val, null);

        return allAsBuildInList();
    }

    public void reverseWithStack() {
        Stack<Node> stack = new Stack<>();
        Node node = nodes;
        while (node != null) {
            stack.add(node);
            node = node.next;
        }

        node = stack.pop();
        nodes = node;
        while (!stack.isEmpty()) {
            node.next = stack.pop();
            node = node.next;
        }
        node.next = null;
    }

    public void reverseWithPointer() {
        Node current = nodes;
        Node prev = null;
        Node temp;
        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;

            current = temp;


        }
        nodes = prev;
    }
}

