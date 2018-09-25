package logic;

public class Logic {
    /**
     * Очистка игрового поля для начала новой игры.
     *
     * @param fieldMap      - игровое поле
     * @param turnCounter   - счетчик ходов
     */
    public void cleanFieldMap(String[] fieldMap, byte turnCounter) {
        for (int i = 0; i < fieldMap.length; i++) {
            fieldMap[i] = "";
            turnCounter = -1;
        }
    }

    /**
     * Метод, анализирующий правильный ход для победы.
     *
     * @param side      - сторона, за которую играет пк.
     * @param fieldMap  - игровое поле
     * @return          - номер поля, куда нужно совершить ход для ПК
     */
    private int analysisOfVictory(String side, String[] fieldMap) {
        int num = -1;

        if (side == "X") {

        } else {

        }
        return num;
    }

    /**
     * Ход пк.
     * @param fieldMap      - игровое поле.
     * @param turnCounter   - счетчик ходов.
     * @param side          - сторона, за которую играет пк.
     */
    public void turn(String[] fieldMap, byte turnCounter, String side) {
        switch (turnCounter) {
            case -1:
                fieldMap[4] = side;
                turnCounter++;
                break;
            case 0:

        }
    }
}
