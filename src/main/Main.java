package main;

import gui.GUI;
import logic.Logic;

public class Main {

    public static String getSideForButton(String side) {
        if (side == "X") {
            return "0";
        } else {
            return "X";
        }
    }

    public static void main(String[] args) {
        new GUI();
        State state = new State();
        Logic logic = new Logic();

        state.setFieldInMap(state.getSide(), (byte) 4);



        state.setFieldInMap(getSideForButton(state.getSide()), (byte) 0);



        state.incTurnCounter();
        state.incTurnCounter();

        System.out.println(state.getTurnCounter());

        byte numberOfField = logic.analysisOfVictory(state.getSide(), state.getFieldMap(),
                state.getTurnCounter());

        System.out.println("итог " + numberOfField);


    }
}
