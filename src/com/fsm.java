package com;
import java.util.HashMap;
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
        //basic hash
        //HashMap<String, String> nodeMap = new Hashmap();

        List<String> nodes = new ArrayList();
        nodes Stage = run;
        nodes.add(Stage.getName());

        for (char character: input.toCharArray()) {
            nodes newNode = Stage.nextState("" + character + "");
            nodes.add(newNode.getName());
            Stage = newNode;
            //hash
            //nodeMap.put(newNode.getName(), String.valueOf(character));
        }
        //System.out.println(nodeMap.keySet());
        return nodes;
    }

    @Override
    public String toString() {
        return  "RUN FSM {" +
                "\ninput: " + input +
                "\noutput: " + runFsm() +
                "\n}";
    }

    private class Hashmap extends HashMap<String, String> {
    }
}
