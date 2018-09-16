package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public void add(String nameOfNewNode) {
        int compare = name.compareTo(nameOfNewNode);
        if (compare >= 0) {
            if (left != null){
                left.add(nameOfNewNode);
            } else left = new Node(nameOfNewNode);
        } else {
            if (right != null) {
                right.add(nameOfNewNode);
            } else right = new Node(nameOfNewNode);
        }
    }

    public List<String> names() {
        List<String> list = new ArrayList<String>();
        if (left != null){
            list.addAll(left.names());
        }
        list.add(name);
        if (right != null) {
            list.addAll(right.names());
        }
        return list;
    }
}
