package com;

public class nodes {
    private final String name;
    private nodes node1;
    private nodes node2;
    private nodes node3;


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

    public nodes getNode3() {
        return node3;
    }

    public void setNode1(nodes node1) {
        this.node1 = node1;
    }

    public void setNode2(nodes node2) {
        this.node2 = node2;
    }

    public void setNode3(nodes node3) {
        this.node3 = node3;
    }

    public nodes nextState(String character) {
        return switch (character) {
            case "A" -> getNode1();
            case "B" -> getNode2();
            case "C" -> getNode3();
            default -> null;
        };
    }


}
