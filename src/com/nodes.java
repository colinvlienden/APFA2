package com;

public class nodes {
    private final String name;
    private nodes node1;
    private nodes node2;

    public nodes(String name) {
        this.name = name;
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

    public void setNode1(nodes node1) {
        this.node1 = node1;
    }

    public void setNode2(nodes node2) {
        this.node2 = node2;
    }

    public nodes getNextState(String character) {
        if (character.equals("A")){
            return getNode1();
        }
        else if (character.equals("B")){
            return getNode2();
        }

        return null;
    }

}
