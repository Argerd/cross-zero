package logic;

public class Logic {
    /**
     * Вариант выигрыша при заполнении клеток 0-1-2.
     */
    String[] var012 = {"", "", ""};
    /**
     * Вариант выигрыша при заполнении клеток 0-3-6.
     */
    String[] var036 = {"", "", ""};
    /**
     * Вариант выигрыша при заполнении клеток 0-4-8.
     */
    String[] var048 = {"", "", ""};
    /**
     * Вариант выигрыша при заполнении клеток 1-4-7.
     */
    String[] var147 = {"", "", ""};
    /**
     * Вариант выигрыша при заполнении клеток 2-5-8.
     */
    String[] var258 = {"", "", ""};
    /**
     * Вариант выигрыша при заполнении клеток 3-4-5.
     */
    String[] var345 = {"", "", ""};
    /**
     * Вариант выигрыша при заполнении клеток 6-7-8.
     */
    String[] var678 = {"", "", ""};
    /**
     * Вариант выигрыша при заполнении клеток 6-4-3.
     */
    String[] var642 = {"", "", ""};

    /**
     * Метод, заполняющий вариант выигрыша значениями, которые уже имеются на игровом поле
     *
     * @param fiedlMap игровое поле
     * @param fields   клетки варианта выигрыша
     * @param nums     массив номеров клеток поля
     * @return вариант выигрыша с заполненными полями на данный момент
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
     * @param variant комбинация
     * @return true, если комбинация не учавствовала в игре
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
     * Метод, анализирующий и выдающий правильный ход.
     *
     * @param side     сторона, за которую играет пк.
     * @param fieldMap игровое поле.
     * @return номер поля, куда нужно совершить ход для ПК.
     */
    public byte analysisOfTurns(String side, String[] fieldMap, byte turnCounter) {
        byte fieldForNextTurn = -1;
        var012 = variantFromCompare(fieldMap, var012, new byte[]{0, 1, 2});
        var036 = variantFromCompare(fieldMap, var036, new byte[]{0, 3, 6});
        var048 = variantFromCompare(fieldMap, var048, new byte[]{0, 4, 8});
        var147 = variantFromCompare(fieldMap, var147, new byte[]{1, 4, 7});
        var258 = variantFromCompare(fieldMap, var258, new byte[]{2, 5, 8});
        var345 = variantFromCompare(fieldMap, var345, new byte[]{3, 4, 5});
        var678 = variantFromCompare(fieldMap, var678, new byte[]{6, 7, 8});
        var642 = variantFromCompare(fieldMap, var642, new byte[]{6, 4, 2});
        if (side == "X") {
            switch (turnCounter) {
                case 0:
                    if (fieldMap[0] == "0") {
                        return fieldForNextTurn = 2;
                    } else {
                        if (fieldMap[1] == "0" || fieldMap[2] == "0") {
                            return fieldForNextTurn = 0;
                        } else {
                            if (fieldMap[3] == "0" || fieldMap[6] == "0") {
                                return fieldForNextTurn = 0;
                            } else {
                                if (fieldMap[8] == "0") {
                                    return fieldForNextTurn = 6;
                                }
                            }
                        }
                    }
                    if (fieldMap[7] == "0") {
                        return fieldForNextTurn = 6;
                    }
                    if (fieldMap[5] == "0") {
                        return fieldForNextTurn = 8;
                    }
                    break;

                case 1:
                    
            }
        } else {

        }
        return fieldForNextTurn;
    }

    /**
     * Метод, проверяющий заполнены ли поля варианта одной стороной.
     *
     * @param var - проверяемый вариант.
     * @return 0, если поля варианта заполнены стороной "0"; 1, если поля варианта заполенены стороной "Х";
     * -1, если возникла непредвиденная ошибка.
     */
    private byte varIsFull(String[] var) {
        if (var[0] == "0" && var[1] == "0" && var[2] == "0") {
            return 0;
        } else {
            if (var[0] == "X" && var[1] == "X" && var[2] == "X") {
                return 1;
            }
        }
        return -1;
    }

    /**
     * Метод, проверяющий победила ли какая-то из сторон.
     *
     * @return 0, если победила сторона "0"; 1, если победила сторона "Х"; -1, если возникла какая-то ошибка.
     */
    public byte isFinish() {
        if (varIsFull(var012) == 0) {
            return 0;
        } else {
            if (varIsFull(var012) == 1) {
                return 1;
            }
        }

        if (varIsFull(var036) == 0) {
            return 0;
        } else {
            if (varIsFull(var036) == 1) {
                return 1;
            }
        }

        if (varIsFull(var048) == 0) {
            return 0;
        } else {
            if (varIsFull(var048) == 1) {
                return 1;
            }
        }

        if (varIsFull(var147) == 0) {
            return 0;
        } else {
            if (varIsFull(var147) == 1) {
                return 1;
            }
        }

        if (varIsFull(var258) == 0) {
            return 0;
        } else {
            if (varIsFull(var258) == 1) {
                return 1;
            }
        }

        if (varIsFull(var345) == 0) {
            return 0;
        } else {
            if (varIsFull(var345) == 1) {
                return 1;
            }
        }

        if (varIsFull(var678) == 0) {
            return 0;
        } else {
            if (varIsFull(var678) == 1) {
                return 1;
            }
        }

        if (varIsFull(var642) == 0) {
            return 0;
        } else {
            if (varIsFull(var642) == 1) {
                return 1;
            }
        }
        return -1;
    }
}
