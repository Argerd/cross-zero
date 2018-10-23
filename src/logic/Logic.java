package logic;

public class Logic {

    /**
     * Метод, анализирующий и выдающий правильный ход PC.
     *
     * @param side     сторона, за которую играет пк.
     * @param fieldMap игровое поле.
     * @return номер поля, куда нужно совершить ход для ПК.
     */
    public byte analysisOfTurns(String side, String[] fieldMap, byte turnCounter) {
        if (side.equals("X")) {
            switch (turnCounter) {
                case 0:
                    if (fieldMap[0].equals("0")) {
                        return 2;
                    } else {
                        if (fieldMap[1].equals("0") || fieldMap[2].equals("0")) {
                            return 0;
                        } else {
                            if (fieldMap[3].equals("0") || fieldMap[6].equals("0")) {
                                return 0;
                            } else {
                                if (fieldMap[8].equals("0")) {
                                    return 6;
                                }
                            }
                        }
                    }
                    if (fieldMap[7].equals("0")) {
                        return 6;
                    }
                    if (fieldMap[5].equals("0")) {
                        return 8;
                    }
                case 1:
                    if (fieldMap[0].equals(side) && !fieldMap[8].equals("0")) {
                        return 8;
                    }
                    if (fieldMap[2].equals(side) && !fieldMap[6].equals("0")) {
                        return 6;
                    }
                    if (fieldMap[8].equals(side) && !fieldMap[0].equals("0")) {
                        return 0;
                    }
                    if (fieldMap[6].equals(side) && !fieldMap[2].equals("0")) {
                        return 2;
                    }
                    if ((fieldMap[0].equals("0") && fieldMap[6].equals("0")) || fieldMap[1].equals("0")
                            && fieldMap[8].equals("0")) {
                        return 3;
                    }
                    if (fieldMap[2].equals("0") && fieldMap[8].equals("0")) {
                        return 5;
                    }
                    if (fieldMap[3].equals("0") && fieldMap[8].equals("0")) {
                        return 2;
                    }
                    if (fieldMap[6].equals("0") && fieldMap[8].equals("0")) {
                        return 7;
                    }
                    if (fieldMap[8].equals("0") && fieldMap[2].equals("0")) {
                        return 5;
                    }
                    if (fieldMap[7].equals("0") && fieldMap[2].equals("0")) {
                        return 3;
                    }
                    if (fieldMap[5].equals("0") && fieldMap[0].equals("0")) {
                        return 7;
                    }
                case 2:
                    if (fieldMap[2].equals(side) && fieldMap[3].equals(side) && !fieldMap[5].equals("0")) {
                        return 5;
                    }
                    if (fieldMap[0].equals(side) && fieldMap[3].equals(side) && !fieldMap[6].equals("0")) {
                        return 6;
                    }
                    if (fieldMap[5].equals(side) && !fieldMap[3].equals("0")) {
                        return 3;
                    }
                    if (fieldMap[2].equals(side) && !fieldMap[6].equals("0")) {
                        return 6;
                    }
                    if (fieldMap[7].equals(side) && !fieldMap[1].equals("0")) {
                        return 1;
                    }
                    if (fieldMap[8].equals("0") && fieldMap[2].equals("0") && fieldMap[6].equals(side)
                            && fieldMap[5].equals(side) && (fieldMap[0].equals("0") || fieldMap[1].equals("0")
                            || fieldMap[3].equals("0") || fieldMap[7].equals("0"))) {
                        if (!fieldMap[3].equals("0")) {
                            return 3;
                        } else {
                            return 7;
                        }
                    }
                    if (fieldMap[7].equals("0") && fieldMap[2].equals("0") && fieldMap[6].equals(side) &&
                            fieldMap[3].equals(side) && (fieldMap[0].equals("0") || fieldMap[1].equals("0")
                            || fieldMap[5].equals("0") || fieldMap[8].equals("0"))) {
                        if (!fieldMap[5].equals("0")) {
                            return 5;
                        } else {
                            return 0;
                        }
                    }
                    if (fieldMap[2].equals("0") && fieldMap[8].equals("0") && fieldMap[3].equals("0")) {
                        return 6;
                    }
                    if ((fieldMap[1].equals("0") && fieldMap[8].equals("0")) && (fieldMap[2].equals("0") ||
                            (fieldMap[5].equals("0") || fieldMap[6].equals("0")) || fieldMap[7].equals("0"))) {
                        if (fieldMap[5].equals("0")) {
                            return 6;
                        } else {
                            if (!fieldMap[5].equals(side)) {
                                return 5;
                            }
                        }
                    }
                    if (fieldMap[2].equals("0") && fieldMap[8].equals("0") && (fieldMap[1].equals("0")
                            || fieldMap[6].equals("0") || fieldMap[7].equals("0"))) {
                        return 3;
                    }
                    if (fieldMap[0].equals("0") && fieldMap[6].equals("0") && fieldMap[5].equals("0") &&
                            fieldMap[2].equals("0")) {
                        return 7;
                    }
                    if (fieldMap[0].equals("0") && fieldMap[6].equals("0") && fieldMap[5].equals("0") &&
                            (fieldMap[6].equals("0") || fieldMap[3].equals("0") || fieldMap[1].equals("0") ||
                                    fieldMap[2].equals("0"))) {
                        if (fieldMap[1].equals("0")) {
                            return 6;
                        } else {
                            return 1;
                        }
                    }
                    if (fieldMap[3].equals("0") && fieldMap[8].equals("0") && (fieldMap[6].equals("0")
                            || fieldMap[7].equals("0") || fieldMap[1].equals("0") || fieldMap[5].equals("0"))) {
                        if (fieldMap[5].equals("-")) {
                            return 5;
                        } else {
                            return 6;
                        }
                    }
                    if (fieldMap[5].equals("0") && fieldMap[0].equals("0") && (fieldMap[1].equals("0")
                            || fieldMap[2].equals("0") || fieldMap[3].equals("0") || fieldMap[6].equals("0"))) {
                        if (!fieldMap[1].equals("0")) {
                            return 1;
                        } else {
                            if (!fieldMap[6].equals("0")) {
                                return 6;
                            }
                        }
                    }
                case 3:
                    if (fieldMap[0].equals(side) && fieldMap[2].equals("0") && fieldMap[3].equals("0") &&
                            fieldMap[5].equals(side) && fieldMap[6].equals(side) && fieldMap[8].equals("0")
                            && (fieldMap[1].equals("0") || fieldMap[7].equals("0"))) {
                        if (fieldMap[1].equals("0")) {
                            return 7;
                        } else {
                            return 1;
                        }
                    }
                    if (fieldMap[0].equals("0") && fieldMap[1].equals(side) && fieldMap[2].equals(side)
                            && fieldMap[3].equals(side) && fieldMap[5].equals("0") && fieldMap[6].equals("0")
                            && (fieldMap[7].equals("0") || fieldMap[8].equals("0"))) {
                        if (fieldMap[7].equals("0")) {
                            return 8;
                        } else {
                            return 7;
                        }
                    }
                    if (fieldMap[8].equals("0") && fieldMap[2].equals("0") && fieldMap[3].equals("0")
                            && fieldMap[6].equals(side) && fieldMap[7].equals(side) && fieldMap[5].equals(side)
                            && (fieldMap[0].equals("0") || fieldMap[1].equals("0"))) {
                        if (!fieldMap[1].equals("0")) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                    if (fieldMap[3].equals("0") && fieldMap[8].equals("0") && fieldMap[5].equals(side)
                            && fieldMap[2].equals(side) && fieldMap[6].equals("0") && fieldMap[0].equals(side)
                            && (fieldMap[1].equals("0")
                            || fieldMap[7].equals("0"))) {
                        if (!fieldMap[1].equals("0")) {
                            return 1;
                        } else {
                            return 7;
                        }
                    }
                    if (fieldMap[6].equals("0") && fieldMap[8].equals("0") && fieldMap[1].equals("0") &&
                            fieldMap[0].equals(side) && fieldMap[5].equals(side) && fieldMap[7].equals(side)
                            && (fieldMap[3]).equals("0") || fieldMap[2].equals("0")) {
                        if (fieldMap[3].equals("0")) {
                            return 2;
                        } else {
                            return 3;
                        }
                    }
                    if (fieldMap[0].equals("0") && fieldMap[6].equals("0") && fieldMap[5].equals("0")
                            && fieldMap[1].equals("0")) {
                        return 8;
                    }
                    if (fieldMap[2].equals("0") && fieldMap[8].equals("0") && fieldMap[3].equals("0")
                            && (fieldMap[7].equals("0") || fieldMap[1].equals("0"))) {
                        if (fieldMap[1].equals("0")) {
                            return 7;
                        } else {
                            return 1;
                        }
                    }
            }
        } else {
            switch (turnCounter) {
                case -1:
                    if (!fieldMap[4].equals("X")) {
                        return 4;
                    } else {
                        return 0;
                    }
                case 0:
                    if (fieldMap[4].equals("X") && (fieldMap[1].equals("X") || fieldMap[3].equals("X")
                            || fieldMap[5].equals("X") || fieldMap[7].equals("X"))) {
                        if (fieldMap[1].equals("X")) {
                            return 7;
                        }
                        if (fieldMap[3].equals("X")) {
                            return 5;
                        }
                        if (fieldMap[5].equals("X")) {
                            return 3;
                        }
                        if (fieldMap[7].equals("X")) {
                            return 1;
                        }
                    }
                    if (fieldMap[4].equals("X") && (fieldMap[2].equals("X") || fieldMap[6].equals("X")
                            || fieldMap[8].equals("X"))) {
                        if (fieldMap[2].equals("X")) {
                            return 6;
                        }
                        if (fieldMap[6].equals("X") || fieldMap[8].equals("X")) {
                            return 2;
                        }
                    }
                    if (fieldMap[0].equals("X") && (fieldMap[6].equals("X") || fieldMap[8].equals("X"))) {
                        return 3;
                    }
                    if (fieldMap[0].equals("X") && (fieldMap[3].equals("X") || fieldMap[7].equals("X"))) {
                        return 6;
                    }
                    if (fieldMap[0].equals("X") && (fieldMap[1].equals("X")
                            || fieldMap[5].equals("X"))) {
                        return 2;
                    }
                    if (fieldMap[0].equals("X") && fieldMap[2].equals("X")) {
                        return 1;
                    }
                case 1:
                    if (fieldMap[4].equals("X") && fieldMap[5].equals("X") && fieldMap[0].equals(side)
                            && fieldMap[3].equals(side) && (fieldMap[1].equals("X") || fieldMap[2].equals("X")
                            || fieldMap[6].equals("X") || fieldMap[7].equals("X") || fieldMap[8].equals("X"))) {
                        if (fieldMap[6].equals("X")) {
                            return 2;
                        } else {
                            return 6;
                        }
                    }
                    if (fieldMap[4].equals("X") && fieldMap[3].equals("X") && fieldMap[0].equals(side)
                            && fieldMap[5].equals(side) && (fieldMap[1].equals("X") || fieldMap[2].equals("X")
                            || fieldMap[6].equals("X") || fieldMap[7].equals("X") || fieldMap[8].equals("X"))) {
                        if (fieldMap[1].equals("X")) {
                            return 7;
                        }
                        if (fieldMap[2].equals("X")) {
                            return 6;
                        }
                        if (fieldMap[6].equals("X")) {
                            return 2;
                        }
                        if (fieldMap[7].equals("X") || fieldMap[8].equals("X")) {
                            return 1;
                        }
                    }
                    if (fieldMap[4].equals("X") && fieldMap[1].equals("X") && (fieldMap[2].equals("X")
                            || fieldMap[3].equals("X") || fieldMap[5].equals("X") || fieldMap[6].equals("X")
                            || fieldMap[8].equals("X"))) {
                        if (fieldMap[2].equals("X")) {
                            return 6;
                        }
                        if (fieldMap[1].equals("X")) {
                            return 3;
                        }

                        if (fieldMap[5].equals("X")) {
                            return 3;
                        }
                        if (fieldMap[3].equals("X")) {
                            return 5;
                        } else {
                            if (fieldMap[6].equals("X")) {
                                return 2;
                            } else {
                                return 6;
                            }
                        }
                    }
                    if (fieldMap[4].equals("X") && fieldMap[8].equals("X") && (fieldMap[1].equals("X")
                            || fieldMap[3].equals("X") || fieldMap[5].equals("X") || fieldMap[6].equals("X")
                            || fieldMap[7].equals("X") || fieldMap[8].equals("X"))) {
                        if (fieldMap[1].equals("X")) {
                            return 7;
                        } else {
                            return 1;
                        }
                    }
                    if (fieldMap[4].equals("X") && fieldMap[2].equals("X") && fieldMap[6].equals(side)
                            && fieldMap[1].equals("X") || fieldMap[3].equals("X") || fieldMap[5].equals("X")
                            || fieldMap[7].equals("X") || fieldMap[8].equals("X")) {
                        if (fieldMap[3].equals("X")) {
                            return 5;
                        } else {
                            if (fieldMap[2].equals("X")) {
                                return 6;
                            } else {
                                return 3;
                            }
                        }
                    }
                    if (fieldMap[4].equals("X") && fieldMap[6].equals("X") && (fieldMap[1].equals("X")
                            || fieldMap[3].equals("X") || fieldMap[5].equals("X") || fieldMap[7].equals("X")
                            || fieldMap[8].equals("X"))) {
                        if (fieldMap[1].equals("X")) {
                            return 7;
                        } else {
                            return 1;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[8].equals("X") && fieldMap[3].equals(side)
                            && (fieldMap[1].equals("X") || fieldMap[2].equals("X") || fieldMap[5].equals("X")
                            || (fieldMap[6].equals("X") || fieldMap[7].equals("X")))) {
                        if (fieldMap[5].equals("X")) {
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[4].equals(side) && fieldMap[6].equals("X")
                            && fieldMap[3].equals(side) && (fieldMap[1].equals("X")
                            || fieldMap[2].equals("X") || fieldMap[3].equals("X") || fieldMap[5].equals("X")
                            || fieldMap[7].equals("X") || fieldMap[8].equals("X"))) {
                        if (fieldMap[5].equals("X")) {
                            return 1;
                        } else {
                            return 5;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[4].equals(side) && fieldMap[5].equals("X")
                            && fieldMap[2].equals(side) && (fieldMap[1].equals("X") || fieldMap[3].equals("X")
                            || fieldMap[6].equals("X") || fieldMap[7].equals("X") || fieldMap[8].equals("X"))) {
                        if (!fieldMap[6].equals("X")) {
                            return 6;
                        } else {
                            return 3;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[4].equals(side) && fieldMap[6].equals(side)
                            && (fieldMap[1].equals("X") || fieldMap[2].equals("X") || fieldMap[5].equals("X")
                            || fieldMap[7].equals("X") || fieldMap[8].equals("X"))) {
                        if (!fieldMap[2].equals("X")) {
                            return 2;
                        } else {
                            return 1;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[1].equals("X") && (fieldMap[3].equals("X")
                            || fieldMap[5].equals("X") || fieldMap[6].equals("X") || fieldMap[7].equals("X")
                            || fieldMap[8].equals("X"))) {
                        if (!fieldMap[6].equals("X")) {
                            return 6;
                        } else {
                            return 3;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[2].equals("X") && (fieldMap[3].equals("X")
                            || fieldMap[5].equals("X") || fieldMap[6].equals("X") || fieldMap[7].equals("X")
                            || fieldMap[8].equals("X"))) {
                        if (!fieldMap[7].equals("X")) {
                            return 7;
                        } else {
                            return 6;
                        }
                    }
                case 2:
                    if (fieldMap[4].equals("X") && fieldMap[2].equals("X") && fieldMap[7].equals("X")
                            && fieldMap[1].equals(side) && fieldMap[6].equals(side) && (fieldMap[3].equals("X")
                            || fieldMap[5].equals("X") ||fieldMap[8].equals("X"))) {
                        if (fieldMap[3].equals("X")) {
                            return 8;
                        } else {
                            return 3;
                        }
                    }
                    if (fieldMap[4].equals("X") && fieldMap[5].equals("X") && fieldMap[6].equals("X")
                            && fieldMap[0].equals(side) && fieldMap[2].equals(side) && fieldMap[3].equals(side)
                            && (fieldMap[1].equals("X") || fieldMap[7].equals("X") || fieldMap[8].equals("X"))) {
                        if (fieldMap[1].equals("X")) {
                            return 7;
                        } else {
                            return 1;
                        }
                    }

                    if (fieldMap[4].equals("X") && fieldMap[3].equals("X") && fieldMap[8].equals("X")
                            && (fieldMap[2].equals("X") || fieldMap[6].equals("X") || fieldMap[7].equals("X"))) {
                        if (fieldMap[2].equals("X")) {
                            return 6;
                        } else {
                            return 2;
                        }
                    }
                    if (fieldMap[4].equals("X") && fieldMap[3].equals("X") && fieldMap[6].equals("X")
                            && (fieldMap[1].equals("X") || fieldMap[7].equals("X") || fieldMap[8].equals("X"))) {
                        if (fieldMap[5].equals("X")) {
                            return 3;
                        }
                        if (fieldMap[3].equals("X")) {
                            return 5;
                        }
                        if (fieldMap[1].equals("X")) {
                            return 8;
                        } else {
                            return 1;
                        }
                    }
                    if (fieldMap[4].equals("X") && fieldMap[1].equals("X") && fieldMap[3].equals("X")
                            && fieldMap[0].equals(side) && fieldMap[5].equals(side) && fieldMap[7].equals(side)
                            && (fieldMap[2].equals("X") || fieldMap[6].equals("X") || fieldMap[8].equals("X"))) {
                        if (fieldMap[2].equals("X")) {
                            return 6;
                        }
                        if (fieldMap[6].equals("X") || fieldMap[8].equals("X")) {
                            return 2;
                        }
                    }
                    if (fieldMap[4].equals("X") && fieldMap[0].equals(side) && fieldMap[5].equals("X")
                            && fieldMap[1].equals("X") && fieldMap[3].equals(side) && fieldMap[7].equals(side)
                            && (fieldMap[6].equals("X") || fieldMap[2].equals("X") || fieldMap[8].equals("X"))) {
                        if (fieldMap[2].equals("X")) {
                            return 6;
                        }
                        if (fieldMap[6].equals("X") || fieldMap[8].equals("X")) {
                            return 2;
                        }
                    }
                    if (fieldMap[4].equals("X") && fieldMap[8].equals("X") && fieldMap[1].equals("X")
                            && (fieldMap[3].equals("X") || fieldMap[5].equals("X") || fieldMap[6].equals("X"))) {
                        if (fieldMap[3].equals("X")) {
                            return 5;
                        } else {
                            return 3;
                        }
                    }

                    if (fieldMap[4].equals("X") && fieldMap[6].equals("X") && fieldMap[1].equals("X")
                            && (fieldMap[3].equals("X") || fieldMap[5].equals("X") || fieldMap[8].equals("X"))) {
                        if (fieldMap[3].equals("X")) {
                            return 5;
                        } else {
                            return 3;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[1].equals("X") && fieldMap[6].equals("X")
                            && fieldMap[2].equals(side) && (fieldMap[5].equals("X") || fieldMap[7].equals("X")
                            || fieldMap[8].equals("X"))) {
                        if (!fieldMap[5].equals("X")) {
                            return 5;
                        } else {
                            return 8;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[3].equals(side) && fieldMap[5].equals("X")
                            && fieldMap[2].equals(side) && (fieldMap[1].equals("X") || fieldMap[6].equals("X")
                            || fieldMap[7].equals("X"))) {
                        if (!fieldMap[2].equals("X")) {
                            return 1;
                        } else {
                            return 7;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[6].equals("X") && fieldMap[5].equals("X")
                            && (fieldMap[2].equals("X") || fieldMap[7].equals("X") || fieldMap[8].equals("X"))) {
                        if (fieldMap[7].equals("X")) {
                            return 8;
                        } else {
                            return 7;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[1].equals(side) && fieldMap[2].equals("X")
                            && fieldMap[3].equals("X") && fieldMap[4].equals(side) && fieldMap[6].equals(side)
                            && (fieldMap[5].equals("X") || fieldMap[8].equals("X"))) {
                        return 7;
                    }
                    if (fieldMap[0].equals("X") && fieldMap[2].equals("X") && fieldMap[7].equals("X")
                            && (fieldMap[3].equals("X") || fieldMap[5].equals("X") || fieldMap[8].equals("X"))) {
                        if (fieldMap[5].equals("X")) {
                            return 8;
                        }
                        if (fieldMap[8].equals("X") || fieldMap[3].equals("X")) {
                            return 5;
                        }
                    }
                    if (fieldMap[4].equals("X") && fieldMap[3].equals("X") && fieldMap[7].equals("X")
                            && (fieldMap[2].equals("X") || fieldMap[6].equals("X") || fieldMap[8].equals("X"))) {
                        if (fieldMap[2].equals("X")) {
                            return 6;
                        } else {
                            return 2;
                        }
                    }
                    if (fieldMap[4].equals("X") && fieldMap[2].equals("X") && fieldMap[3].equals("X")
                            && (fieldMap[1].equals("X") || fieldMap[7].equals("X") || fieldMap[8].equals("X"))) {
                        if (fieldMap[5].equals("X")) {
                            return 3;
                        }
                        if (fieldMap[3].equals("X")) {
                            return 5;
                        }
                        if (fieldMap[7].equals("X")) {
                            return 1;
                        } else {
                            return 7;
                        }
                    }
                case 3:
                    for (byte i = 0; i < fieldMap.length; i++) {
                        if (fieldMap[i].equals(side)) {
                            return i;
                        }
                    }
            }
        }
        return -1;
    }

    /**
     * Метод, проверяющий наличие победы
     *
     * @param fieldMap карта поля
     * @return сторона, которая выиграла
     */
    public String getWinner(String[] fieldMap) {
        // 012
        if ((fieldMap[0].equals("X") && fieldMap[1].equals("X") && fieldMap[2].equals("X"))
                || (fieldMap[0].equals("0") && fieldMap[1].equals("0") && fieldMap[2].equals("0"))) {
            return fieldMap[0];
        }
        // 036
        if ((fieldMap[0].equals("X") && fieldMap[3].equals("X") && fieldMap[6].equals("X"))
                || (fieldMap[0].equals("0") && fieldMap[3].equals("0") && fieldMap[6].equals("0"))) {
            return fieldMap[0];
        }
        // 048
        if ((fieldMap[0].equals("X") && fieldMap[4].equals("X") && fieldMap[8].equals("X"))
                || (fieldMap[0].equals("0") && fieldMap[4].equals("0") && fieldMap[8].equals("0"))) {
            return fieldMap[0];
        }
        // 147
        if ((fieldMap[1].equals("X") && fieldMap[4].equals("X") && fieldMap[7].equals("X"))
                || (fieldMap[1].equals("0") && fieldMap[4].equals("0") && fieldMap[7].equals("0"))) {
            return fieldMap[1];
        }
        // 345
        if ((fieldMap[3].equals("X") && fieldMap[4].equals("X") && fieldMap[5].equals("X"))
                || (fieldMap[3].equals("0") && fieldMap[4].equals("0") && fieldMap[5].equals("0"))) {
            return fieldMap[3];
        }
        // 678
        if ((fieldMap[6].equals("X") && fieldMap[7].equals("X") && fieldMap[8].equals("X"))
                || (fieldMap[6].equals("0") && fieldMap[7].equals("0") && fieldMap[8].equals("0"))) {
            return fieldMap[6];
        }
        // 246
        if ((fieldMap[2].equals("X") && fieldMap[4].equals("X") && fieldMap[6].equals("X"))
                || (fieldMap[2].equals("0") && fieldMap[4].equals("0") && fieldMap[6].equals("0"))) {
            return fieldMap[2];
        }
        // 258
        if ((fieldMap[2].equals("X") && fieldMap[5].equals("X") && fieldMap[8].equals("X"))
                || fieldMap[2].equals("0") && fieldMap[5].equals("0") && fieldMap[8].equals("0")) {
            return fieldMap[2];
        }
        return "Ошибка или нет победы";
    }
}
