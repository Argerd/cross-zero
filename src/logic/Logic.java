package logic;

import gui.GUI;
import main.State;

import javax.swing.*;

public class Logic {
    /** Вариант выигрыша при заполнении клеток 0-1-2. */
    String[] var012 = {"", "", ""};
    /** Вариант выигрыша при заполнении клеток 0-3-6. */
    String[] var036 = {"", "", ""};
    /** Вариант выигрыша при заполнении клеток 0-4-8. */
    String[] var048 = {"", "", ""};
    /** Вариант выигрыша при заполнении клеток 1-4-7. */
    String[] var147 = {"", "", ""};
    /** Вариант выигрыша при заполнении клеток 2-5-8. */
    String[] var258 = {"", "", ""};
    /** Вариант выигрыша при заполнении клеток 3-4-5. */
    String[] var345 = {"", "", ""};
    /** Вариант выигрыша при заполнении клеток 6-7-8. */
    String[] var678 = {"", "", ""};
    /** Вариант выигрыша при заполнении клеток 6-4-3. */
    String[] var642 = {"", "", ""};

    /**
     * Метод, заполняющий вариант выигрыша значениями, которые уже имеются на игровом поле
     *
     * @param fiedlMap  игровое поле
     * @param fields    клетки варианта выигрыша
     * @param nums      массив номеров клеток поля
     * @return          вариант выигрыша с заполненными полями на данный момент
     */
    private String[] variantFromCompare(String[] fiedlMap, String[] fields, byte[] nums) {
        for (int i = 0; i < fields.length; i++) {
            fields[i] = fiedlMap[nums[i]];
        }
        return fields;
    }

    /**
     * Проверка комбинации: записаны ли в нее значения
     *
     * @param variant   комбинация
     * @return  true, если комбинация не учавствовала в игре
     */
    private boolean checkVarIsEmpty(String[] variant) {
        for (int i = 0; i < variant.length; i++) {
            if (variant[i] != "") {
                return false;
            }
        }
        return true;
    }

    /**
     * Метод, изменяющий игровое поле и кнопку при нажатии на неё
     *
     * @param state     объект State (состояния)
     * @param button    объект кнопки
     */
    public byte clickOnButton(State state, JButton button) {
        state.setFieldInMap(GUI.getSideForButton(state.getSide()), (byte) 0);
        button.setText(GUI.getSideForButton(state.getSide()));
        button.setEnabled(false);
        byte numberOfFieldInMap = analysisOfVictory(state.getSide(), state.getFieldMap(), state.getTurnCounter());
        state.setFieldInMap(state.getSide(), numberOfFieldInMap);
        state.incTurnCounter();
        return numberOfFieldInMap;
    }

    /**
     * Метод, анализирующий и выдающий правильный ход для победы.
     *
     * @param side      сторона, за которую играет пк.
     * @param fieldMap  игровое поле
     * @return          номер поля, куда нужно совершить ход для ПК
     */
    private byte analysisOfVictory(String side, String[] fieldMap, byte turnCounter) {
        byte fieldForNextTurn = -1;
        if (side == "X") {
            switch (turnCounter) {
                case 0:
                    var012 = variantFromCompare(fieldMap, var012, new byte[] {0, 1, 2});
                    var036 = variantFromCompare(fieldMap, var036, new byte[] {0, 3, 6});
                    var048 = variantFromCompare(fieldMap, var048, new byte[] {0, 4, 8});
                    var147 = variantFromCompare(fieldMap, var147, new byte[] {1, 4, 7});
                    var258 = variantFromCompare(fieldMap, var258, new byte[] {2, 5, 8});
                    var345 = variantFromCompare(fieldMap, var345, new byte[] {3, 4, 5});
                    var678 = variantFromCompare(fieldMap, var678, new byte[] {6, 7, 8});
                    var642 = variantFromCompare(fieldMap, var642, new byte[] {6, 4, 2});

                    if (checkVarIsEmpty(var012) == false) {
                        System.out.println("false");
                        if (var012[0] == "0") {
                            System.out.println("kek1");
                            fieldForNextTurn = 2;
                        } else {
                            if (var012[1] == "0" || var012[2] == "0") {
                                System.out.println("kek2");
                                fieldForNextTurn = 0;
                            }
                        }
                    }
                    return fieldForNextTurn;
            }
        } else {

        }
        return fieldForNextTurn;
    }

    /**
     * Ход пк.
     *
     * @param fieildForNextTurn - номер поля, сходит ПК.
     */
    public void turn(byte fieildForNextTurn) {

    }
}
