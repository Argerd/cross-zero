package logic;

public class Logic {
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
     * Метод, анализирующий и выдающий правильный ход PC.
     *
     * @param side     сторона, за которую играет пк.
     * @param fieldMap игровое поле.
     * @return номер поля, куда нужно совершить ход для ПК.
     */
    public byte analysisOfTurns(String side, String[] fieldMap, byte turnCounter) {
        byte fieldForNextTurn = -1;
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
                    // Обработка ходов, где пользователь начинает идти к победе или блокировать победные ходы пк,
                    // но ему нельзя этого позволить.
                    if ((fieldMap[0] == "0" && fieldMap[6] == "0") || fieldMap[1] == "0" && fieldMap[8] == "0") {
                        return fieldForNextTurn = 3;
                    }
                    if (fieldMap[2] == "0" && fieldMap[8] == "0") {
                        return fieldForNextTurn = 5;
                    }
                    if (fieldMap[3].equals("0") && fieldMap[8].equals("0")) {
                        return fieldForNextTurn = 2;
                    }
                    if (fieldMap[6].equals("0") && fieldMap[8].equals("0")) {
                        return fieldForNextTurn = 7;
                    }
                    if (fieldMap[8].equals("0") && fieldMap[2].equals("0")) {
                        return fieldForNextTurn = 5;
                    }
                    if (fieldMap[7].equals("0") && fieldMap[2].equals("0")) {
                        return 3;
                    }
                    if (fieldMap[5].equals("0") && fieldMap[0].equals("0")) {
                        return 7;
                    }

                    // Обработка ходов, где игрок проигрывает (возможно он еще не полный).
                    if (fieldMap[0] == "0" && (fieldMap[1] == "0" || fieldMap[3] == "0" || fieldMap[5] == "0"
                            || fieldMap[7] == "0" || fieldMap[8] == "0")) {
                        return fieldForNextTurn = 6;
                    }
                    // это исправить
                    if ((fieldMap[1] == "0" || fieldMap[2] == "0" || fieldMap[3] == "0" || fieldMap[6] == "0") &&
                        fieldMap[8] != "0") {
                        return fieldForNextTurn = 8;
                    }
                    if (fieldMap[8] == "0") {
                        return fieldForNextTurn = 3;
                    }
            }
        } else {

        }
        return fieldForNextTurn;
    }

    /**
     * Метод, проверяющий наличие победы
     *
     * @param fieldMap карта поля
     * @return сторона, которая выиграла
     */
    public String getWinner(String[] fieldMap) {
        // 012
        if (fieldMap[0] == "X" && fieldMap[1] == "X" && fieldMap[2] == "X") {
            return fieldMap[0];
        } else {
            if (fieldMap[0] == "0" && fieldMap[0] == "X" && fieldMap[0] == "X") {
                return fieldMap[0];
            }
        }
        // 036
        if (fieldMap[0] == "X" && fieldMap[3] == "X" && fieldMap[6] == "X") {
            return fieldMap[0];
        } else {
            if (fieldMap[0] == "0" && fieldMap[3] == "0" && fieldMap[6] == "0") {
                return fieldMap[0];
            }
        }
        // 048
        if (fieldMap[0] == "X" && fieldMap[4] == "X" && fieldMap[8] == "X") {
            return fieldMap[0];
        } else {
            if (fieldMap[0] == "0" && fieldMap[4] == "0" && fieldMap[8] == "0") {
                return fieldMap[0];
            }
        }
        // 147
        if (fieldMap[1] == "X" && fieldMap[4] == "X" && fieldMap[7] == "X") {
            return fieldMap[1];
        } else {
            if (fieldMap[1] == "0" && fieldMap[4] == "0" && fieldMap[7] == "0") {
                return fieldMap[1];
            }
        }
        // 345
        if (fieldMap[3] == "X" && fieldMap[4] == "X" && fieldMap[5] == "X") {
            return fieldMap[3];
        } else {
            if (fieldMap[3] == "X" && fieldMap[4] == "0" && fieldMap[5] == "0") {
                return fieldMap[3];
            }
        }
        // 678
        if (fieldMap[6] == "X" && fieldMap[7] == "X" && fieldMap[8] == "X") {
            return fieldMap[6];
        } else {
            if (fieldMap[6] == "0" && fieldMap[7] == "0" && fieldMap[8] == "0") {
                return fieldMap[6];
            }
        }
        // 246
        if (fieldMap[2] == "X" && fieldMap[4] == "X" && fieldMap[6] == "X") {
            return fieldMap[2];
        } else {
            if (fieldMap[2] == "0" && fieldMap[4] == "0" && fieldMap[6] == "0") {
                return fieldMap[2];
            }
        }
        // 258
        if (fieldMap[2] == "X" && fieldMap[5] == "X" && fieldMap[8] == "X") {
            return fieldMap[2];
        } else {
            if (fieldMap[2] == "0" && fieldMap[5] == "0" && fieldMap[8] == "0") {
                return fieldMap[2];
            }
        }
        return "Ошибка или нет победы";
    }
}
