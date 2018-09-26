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
    }
}
