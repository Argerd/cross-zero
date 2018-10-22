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
                    System.out.println(turnCounter);
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
                    System.out.println(turnCounter);
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
                        System.out.println("59");
                        return 3;
                    }
                    if (fieldMap[2].equals("0") && fieldMap[8].equals("0")) {
                        System.out.println("63");
                        return 5;
                    }
                    if (fieldMap[3].equals("0") && fieldMap[8].equals("0")) {
                        System.out.println("67");
                        return 2;
                    }
                    if (fieldMap[6].equals("0") && fieldMap[8].equals("0")) {
                        System.out.println("71");
                        return 7;
                    }
                    if (fieldMap[8].equals("0") && fieldMap[2].equals("0")) {
                        System.out.println("75");
                        return 5;
                    }
                    if (fieldMap[7].equals("0") && fieldMap[2].equals("0")) {
                        System.out.println("79");
                        return 3;
                    }
                    if (fieldMap[5].equals("0") && fieldMap[0].equals("0")) {
                        System.out.println("83");
                        return 7;
                    }
                case 2:
                    System.out.println(turnCounter);
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
                        System.out.println("80");
                        return 6;
                    }
                    if ((fieldMap[1].equals("0") && fieldMap[8].equals("0")) && (fieldMap[2].equals("0") ||
                            (fieldMap[5].equals("0") || fieldMap[6].equals("0")) || fieldMap[7].equals("0"))) {
                        System.out.println("85");
                        if (fieldMap[5].equals("0")) {
                            System.out.println("6");
                            return 6;
                        } else {
                            if (!fieldMap[5].equals(side)) {
                                System.out.println("5");
                                return 5;
                            }
                        }
                    }
                    if (fieldMap[2].equals("0") && fieldMap[8].equals("0") && (fieldMap[1].equals("0")
                            || fieldMap[6].equals("0") || fieldMap[7].equals("0"))) {
                        System.out.println("94");
                        System.out.println("2" + fieldMap[2]);
                        return 3;
                    }
                    if (fieldMap[0].equals("0") && fieldMap[6].equals("0") && fieldMap[5].equals("0") &&
                            fieldMap[2].equals("0")) {
                        System.out.println("99");
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
                        System.out.println("104");
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
                    System.out.println(turnCounter);
                    if (fieldMap[0].equals(side) && fieldMap[2].equals("0") && fieldMap[3].equals("0") &&
                            fieldMap[5].equals(side) && fieldMap[6].equals(side) && fieldMap[8].equals("0")
                            && (fieldMap[1].equals("0") || fieldMap[7].equals("0"))) {
                        System.out.println("177");
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
                        System.out.println("163");
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
                        System.out.println("128");
                        if (!fieldMap[1].equals("0")) {
                            return 1;
                        } else {
                            return 7;
                        }
                    }
                    if (fieldMap[6].equals("0") && fieldMap[8].equals("0") && fieldMap[1].equals("0") &&
                            fieldMap[0].equals(side) && fieldMap[5].equals(side) && fieldMap[7].equals(side)
                            && (fieldMap[3]).equals("0") || fieldMap[2].equals("0")) {
                        System.out.println("172");
                        if (fieldMap[3].equals("0")) {
                            return 2;
                        } else {
                            return 3;
                        }
                    }
                    if (fieldMap[0].equals("0") && fieldMap[6].equals("0") && fieldMap[5].equals("0")
                            && fieldMap[1].equals("0")) {
                        System.out.println("114");
                        return 8;
                    }
                    if (fieldMap[2].equals("0") && fieldMap[8].equals("0") && fieldMap[3].equals("0")
                            && (fieldMap[7].equals("0") || fieldMap[1].equals("0"))) {
                        System.out.println("119");
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
                    System.out.println(turnCounter);
                    if (!fieldMap[4].equals("X")) {
                        return 4;
                    } else {
                        return 0;
                    }
                case 0:
                    System.out.println(turnCounter);
                    if (fieldMap[0].equals("X") && (fieldMap[6].equals("X") || fieldMap[8].equals("X"))) {
                        System.out.println("251");
                        return 3;
                    }
                    if (fieldMap[0].equals("X") && (fieldMap[3].equals("X") || fieldMap[7].equals("X"))) {
                        System.out.println("255");
                        return 6;
                    }
                    if (fieldMap[0].equals("X") && (fieldMap[1].equals("X")
                            || fieldMap[5].equals("X"))) {
                        System.out.println("260");
                        return 2;
                    }
                    if (fieldMap[0].equals("X") && fieldMap[2].equals("X")) {
                        System.out.println("264");
                        return 1;
                    }
                case 1:
                    System.out.println(turnCounter);

                    if (fieldMap[0].equals("X") && fieldMap[4].equals(side) && fieldMap[6].equals("X")
                            && fieldMap[3].equals(side) && (fieldMap[1].equals("X")
                            || fieldMap[2].equals("X") || fieldMap[3].equals("X") || fieldMap[5].equals("X")
                            || fieldMap[7].equals("X") || fieldMap[8].equals("X"))) {
                        System.out.println("270");
                        if (fieldMap[5].equals("X")) {
                            return 1;
                        } else {
                            return 5;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[4].equals(side) && fieldMap[5].equals("X")
                            && fieldMap[2].equals(side) && (fieldMap[1].equals("X") || fieldMap[3].equals("X")
                            || fieldMap[6].equals("X") || fieldMap[7].equals("X") || fieldMap[8].equals("X"))) {
                        System.out.println("271");
                        if (!fieldMap[6].equals("X")) {
                            return 6;
                        } else {
                            return 3;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[4].equals(side) && fieldMap[6].equals(side)
                            && (fieldMap[1].equals("X") || fieldMap[2].equals("X") || fieldMap[5].equals("X")
                            || fieldMap[7].equals("X") || fieldMap[8].equals("X"))) {
                        System.out.println("272");
                        if (!fieldMap[2].equals("X")) {
                            return 2;
                        } else {
                            return 1;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[1].equals("X") && (fieldMap[3].equals("X")
                            || fieldMap[5].equals("X") || fieldMap[6].equals("X") || fieldMap[7].equals("X")
                            || fieldMap[8].equals("X"))) {
                        System.out.println("273");
                        if (!fieldMap[6].equals("X")) {
                            return 6;
                        } else {
                            return 3;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[2].equals("X") && (fieldMap[3].equals("X")
                            || fieldMap[5].equals("X") || fieldMap[6].equals("X") || fieldMap[7].equals("X")
                            || fieldMap[8].equals("X"))) {
                        System.out.println("282");
                        if (!fieldMap[7].equals("X")) {
                            return 7;
                        } else {
                            return 6;
                        }
                    }
                case 2:
                    System.out.println(turnCounter);
                    if (fieldMap[0].equals("X") && fieldMap[6].equals("X") && fieldMap[5].equals("X")
                            && (fieldMap[2].equals("X") || fieldMap[7].equals("X") || fieldMap[8].equals("X"))) {
                        System.out.println("DD");
                        if (fieldMap[7].equals("X")) {
                            return 8;
                        } else {
                            return 7;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[1].equals(side) && fieldMap[2].equals("X")
                            && fieldMap[3].equals("X") && fieldMap[4].equals(side) && fieldMap[6].equals(side)
                            && (fieldMap[5].equals("X") || fieldMap[8].equals("X"))) {
                        System.out.println("304");
                        return 7;
                    }
                    if (fieldMap[0].equals("X") && fieldMap[1].equals("X") && fieldMap[6].equals("X")
                            && (fieldMap[5].equals("X") || fieldMap[7].equals("X") || fieldMap[8].equals("X"))) {
                        System.out.println("283");
                        if (!fieldMap[5].equals("X")) {
                            return 5;
                        } else {
                            return 8;
                        }
                    }
                    if (fieldMap[0].equals("X") && fieldMap[2].equals("X") && fieldMap[7].equals("X")
                            && (fieldMap[3].equals("X") || fieldMap[5].equals("X") || fieldMap[8].equals("X"))) {
                        System.out.println("302");
                        if (fieldMap[5].equals("X")) {
                            return 8;
                        }
                        if (fieldMap[8].equals("X") || fieldMap[3].equals("X")) {
                            return 5;
                        }
                    }
                case 3:
                    // Здесь уже ничья 100%
                    System.out.println(turnCounter);
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
