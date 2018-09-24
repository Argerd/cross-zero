package logic;

public class Logic {
    // Сторона, за которую играет ПК
    private String mSide = "X";

    // Поле игры
    private String[] mFieldMap = new String[9];

    /** Счетчик ходов. */
    private int mTurnCounter = -1;

    public String getSide() {
        return mSide;
    }

    public String[] getFieldMap() {
        return mFieldMap;
    }

    /** Очистка игрового поля для начала новой игры. */
    public void cleanFieldMap() {
        for (int i = 0; i < mFieldMap.length; i++) {
            mFieldMap[i] = "";
            mTurnCounter = -1;
        }
    }

    /**
     * Метод, анализирующий правильный ход для победы
     *
     * @return  - номер поля, куда нужно совершить ход для ПК
     */
    private int analysisOfVictory() {
        int num = -1;

        if (mSide == "X") {

        } else {

        }
        return num;
    }

    /** Ход ПК. */
    public void turn() {
        switch (mTurnCounter) {
            case -1:
                mFieldMap[4] = mSide;
                mTurnCounter++;
                break;
            case 0:

        }
    }

}
