package main;

public class State {
    /**
     * Сторона, за которую играет пк.
     */
    private String side = "0";

    /**
     * Игровое поле.
     */
    private String[] fieldMap = {"-", "-", "-", "-", "-", "-", "-", "-", "-"};

    /**
     * Переменная-счетчик ходов.
     */
    private byte turnCounter = -1;

    private boolean isEnd = false;

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

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    /**
     * Заполнить клетку поля.
     *
     * @param side сторона, занявшая клетку.
     * @param num  номер клетки.
     */
    public void setFieldInMap(String side, byte num) {
        fieldMap[num] = side;
    }

    /**
     * Метод, сбрасывающий значения игрового поля
     */
    public void resetFieldMap() {
        for (int i = 0; i < fieldMap.length; i++) {
            fieldMap[i] = "-";
        }
    }
}
