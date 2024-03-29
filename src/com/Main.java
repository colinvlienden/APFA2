package com;

public class Main {
    public static void main(String[] args) {

        nodes S0 = new nodes("S0");
        nodes S1 = new nodes("S1");
        nodes S2 = new nodes("S2");
        nodes S3 = new nodes("S3");

        S0.setNode1(S2);
        S0.setNode2(S1);

        S1.setNode1(S1);
        S1.setNode2(S2);

        S2.setNode2(S3);

        S3.setNode1(S3);
        S3.setNode2(S0);

        String input = "BAAB";
        fsm fsm = new fsm(S0, input);

        System.out.println(fsm);

        nodes S4 = new nodes("S4");
        S4.setNode1(S0);

        S0.setNode3(S3);
        S1.setNode3(S0);
        S2.setNode1(S3);
        S2.setNode3(S3);
        S3.setNode3(S4);

        String input2 = "BCBBACA";
        fsm fsm2 = new fsm(S0, input2);
        System.out.println(fsm2);
    }
}
