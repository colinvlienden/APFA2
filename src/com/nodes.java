package com;

public class nodes {
    private String name;
    private nodes node1;
    private nodes node2;

    public nodes(String name) {
        this.name = name;
    }

    public nodes(nodes node1, nodes node2) {
        this.node1 = node1;
        this.node2 = node2;
    }

    public String getName() {
        return name;
    }

    public nodes getNode1() {
        return node1;
    }

    public nodes getNode2() {
        return node2;
    }


}
