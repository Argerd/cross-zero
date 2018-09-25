package main;

public class State {
    /** Сторона, за которую играет пк. */
    private String side = "X";

    /** Игровое поле. */
    private String[] fieldMap = new String[9];

    /** Переменная-счетчик ходов. */
    private byte turnCounter = -1;

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

    public void setFieldInMap(String field, byte num) {
        fieldMap[num] = field;
    }
}
