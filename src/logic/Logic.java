package logic;

public class Logic {
    // Сторона, за которую играет ПК
    private String side = "X";

    // Поле игры
    private String[] fieldMap = new String[9];

    /** Счетчик ходов. */
    private int turnCounter = -1;

    public String getSide() {
        return side;
    }

    public String[] getFieldMap() {
        return fieldMap;
    }

    /** Очистка игрового поля для начала новой игры. */
    public void cleanFieldMap() {
        for (int i = 0; i < fieldMap.length; i++) {
            fieldMap[i] = "";
            turnCounter = -1;
        }
    }

    /**
     * Метод, анализирующий правильный ход для победы
     *
     * @return  - номер поля, куда нужно совершить ход для ПК
     */
    private int analysisOfVictory() {
        int num = -1;

        if (side == "X") {

        } else {

        }
        return num;
    }

    /** Ход ПК. */
    public void turn() {
        switch (turnCounter) {
            case -1:
                fieldMap[4] = side;
                turnCounter++;
                break;
            case 0:

        }
    }

}
