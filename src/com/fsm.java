package com;
import java.util.List;
import java.util.ArrayList;


public class fsm {
    private final nodes run;
    private final String input;


    public fsm(nodes run, String input) {
        this.run = run;
        this.input = input;
    }

    public List runFsm() {


        List<String> nodes = new ArrayList();
        nodes Stage = run;
        nodes.add(Stage.getName());

        for (char character: input.toCharArray()) {
            nodes newNode = Stage.nextState("" + character + "");
            nodes.add(newNode.getName());
            Stage = newNode;
        }

        return nodes;
    }

    @Override
    public String toString() {
        return  "RUN FSM {" +
                "\ninput: " + input +
                "\noutput: " + runFsm() +
                "\n}";
    }
}
