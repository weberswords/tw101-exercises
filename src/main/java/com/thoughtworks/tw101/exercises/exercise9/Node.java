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

    public void checkNode(Node existingNode, Node addingNode) {

        if (existingNode == null) {
            existingNode = addingNode;
            System.out.println("Added " + existingNode.name);
        } else if (existingNode.value > addingNode.value){
            checkNode(existingNode.leftNode, addingNode);
        } else if (existingNode.value < addingNode.value){
            checkNode(existingNode.rightNode, addingNode);
        } else {
            System.out.println("Bark bark");
        }
    }

    public void add(String nameOfNewNode) {
        Node newNode = new Node(nameOfNewNode);
        checkNode(this, newNode);
    }

    public String addNames(Node node) {
        String returnName;
        if (node.leftNode != null) {
            returnName = addNames(node.leftNode);
        } else if (node.rightNode != null) {
            returnName = addNames(node.rightNode);
        } else {
            returnName = node.name;
        }
        return returnName;
    }

    public List<String> names() {
        ArrayList<String> names = new ArrayList<>();
        names.add(addNames(this));
        return names;
    }
}
