package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Integer value;
    private Integer charPosition = 0;
    private Node leftNode;
    private Node rightNode;


    public Node(String name) {
        this.name = name;
        value = Character.getNumericValue(name.charAt(charPosition));
        leftNode = null;
        rightNode = null;
    }

    public Boolean compareNodes(Node newNode, Node secondNode) {
        Boolean sideValue;
        if (newNode.value == this.value) {
            System.out.println(newNode.name + " and " + this.name + " are equal. Moving to next letter. ");
            newNode.value = Character.getNumericValue(name.charAt(charPosition++));
            this.value = Character.getNumericValue(name.charAt(charPosition++));
            sideValue = compareNodes(newNode, this);
        } else if (newNode.value > this.value) {
            System.out.println(newNode.name + " is greater than " + this.name);
            sideValue = true;
        } else {
            System.out.println(newNode.name + " is less than " + this.name);
            sideValue = false;
        }
        return sideValue;
    }

    public void setChild(Node newNode) {
        if (compareNodes(newNode, this) && this.leftNode == null) {
            System.out.println("Comparing leftnode " + newNode.name + " with " + this.name);
            this.leftNode = newNode;
        }
        else if (compareNodes(newNode, this) && this.leftNode != null) {
            System.out.println("Left node is not null... ");
            System.out.println("Comparing newNode " + newNode.name + " with " + this.leftNode.name);
            compareNodes(newNode, this.leftNode);
        }
        else if (!compareNodes(newNode, this) && this.rightNode == null) {
            System.out.println("Comparing rightnode " + newNode.name + " with " + this.name);
            this.rightNode = newNode;
        }
        else {
            System.out.println("Right node is not null... ");
            System.out.println("Comparing newNode " + newNode.name + " with " + this.rightNode.name);
            compareNodes(newNode, this.rightNode);
        }
    }
    public void add(String nameOfNewNode) {
        Node newNode = new Node(nameOfNewNode);
        setChild(newNode);
    }

    public List<String> names() {
        ArrayList<String> names = new ArrayList<>();
        names.add(this.name);
        return names;
    }
}
