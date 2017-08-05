package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node leftChildNode;
    private Node rightChildNode;

    public Node(String name) {

        this.name = name;
        leftChildNode = null;
        rightChildNode = null;
    }


    public void add(String nameOfNewNode) {
        if (this.name.compareTo(nameOfNewNode) <= 0) {
            if (rightChildNode == null) {
                rightChildNode = new Node(nameOfNewNode);
            } else {
                rightChildNode.add(nameOfNewNode);
            }
        }
        else {
                if (leftChildNode == null) {
                    leftChildNode = new Node(nameOfNewNode);
                } else {
                    leftChildNode.add(nameOfNewNode);
                }
            }
        }

    public List<String> names() {
        List<String> names = new ArrayList<>();
        if (leftChildNode != null) {
            names = leftChildNode.names();
        }
        names.add(name);
        if (rightChildNode != null) {
            names.addAll(rightChildNode.names());
        }
        return names;
    }
}
