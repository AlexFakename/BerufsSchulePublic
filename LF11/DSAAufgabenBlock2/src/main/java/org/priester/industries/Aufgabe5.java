package org.priester.industries;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Aufgabe5 {

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public void add(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new Node(value);
                } else {
                    left.add(value);
                }

            } else {
                if (right == null) {
                    right = new Node(value);
                } else {
                    right.add(value);
                }
            }
        }

        public int dfsForSum() {
            int result = value;
            if (left == null && right == null) {
                return result;
            }

            if (left != null) {
                result += left.dfsForSum();
            }
            if (right != null) {
                result += right.dfsForSum();
            }

            return result;

        }
    }

    private Node root;

    public Aufgabe5() {
        this.root = null;
    }

    /**
     *
     * @return LNR (left nodes, Neutral Nodes, Right Nodes);
     */
    public List<Integer> printAllInOrder() {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        HashSet<Node> visited = new HashSet<>();
        stack.add(root);
        Node node;
        while (!stack.isEmpty()) {
            node = stack.pop();
            while (node.left != null && !visited.contains(node.left)) {
                stack.add(node);
                node = node.left;
            }
            System.out.println(node.value);
            result.add(node.value);
            visited.add(node);
            if (node.right != null) {
                stack.add(node.right);
            }

        }

        return result;
    }

    public int getLargestValue() {
        if (root == null) {
            return 0;
        }
        Node node = root;
        while (true) {
            if (node.right == null) {
                return node.value;
            }
            node = node.right;
        }
    }

    public int calcSumRecursiveDFS() {
        if (root == null) {
            return 0;
        }
        return root.dfsForSum();
    }


    public void add(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        root.add(value);
    }
}
