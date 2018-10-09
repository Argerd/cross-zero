package main;

public class State {
    /** Сторона, за которую играет пк. */
    private String side = "X";

    /** Игровое поле. */
    private String[] fieldMap = {"-", "-", "-", "-", "-", "-", "-", "-", "-"};

    /** Переменная-счетчик ходов. */
    private byte turnCounter = -1;

    /** Условие: закончились ли варианты ходов */
    private boolean fieldMapIsFull = false;

    public boolean isFieldMapIsFull() {
        return fieldMapIsFull;
    }

    public void setFieldMapIsFull(boolean fieldMapIsFull) {
        this.fieldMapIsFull = fieldMapIsFull;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String[] getFieldMap() {
        return fieldMap;
    }

    public byte getTurnCounter() {
        return turnCounter;
    }

    public void setTurnCounter(byte turnCounter) {
        this.turnCounter = turnCounter;
    }

    public void incTurnCounter() {
        turnCounter++;
    }

    /**
     * Заполнить клетку поля.
     *
     * @param side  сторона, занявшая клетку.
     * @param num   номер клетки.
     */
    public void setFieldInMap(String side, byte num) {
        fieldMap[num] = side;
    }

    /** Метод, сбрасывающий значения игрового поля */
    public void resetFieldMap() {
        for (int i = 0; i < fieldMap.length; i++) {
            fieldMap[i] = "-";
        }
    }
}
