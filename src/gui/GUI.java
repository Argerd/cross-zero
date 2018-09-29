package gui;

import logic.Logic;
import main.State;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    /**
     * Окно.
     */
    private JFrame mWindow;

    /**
     * Панель, на которой отображаются игровые элементы.
     */
    private JPanel mGamePanel;

    /**
     * Панель, содержащая кнопки управления.
     */
    private JPanel mOptionPanel;

    // Игровые кнопки
    private JButton m0Button = new JButton("0");
    private JButton m1Button = new JButton("1");
    private JButton m2Button = new JButton("2");
    private JButton m3Button = new JButton("3");
    private JButton m4Button = new JButton("4");
    private JButton m5Button = new JButton("5");
    private JButton m6Button = new JButton("6");
    private JButton m7Button = new JButton("7");
    private JButton m8Button = new JButton("8");

    private JButton[] mButtons = {m0Button, m1Button, m2Button, m3Button, m4Button,
            m5Button, m6Button, m7Button, m8Button};

    /**
     * Кнопка "Start".
     */
    private JButton mStartButton;

    /**
     * Метод, очищающий надписи на кнопках
     */
    private void resetValueInButtons() {
        m0Button.setText("");
        m0Button.setEnabled(true);
        m1Button.setText("");
        m1Button.setEnabled(true);
        m2Button.setText("");
        m2Button.setEnabled(true);
        m3Button.setText("");
        m3Button.setEnabled(true);
        m4Button.setText("");
        m4Button.setEnabled(true);
        m5Button.setText("");
        m5Button.setEnabled(true);
        m6Button.setText("");
        m6Button.setEnabled(true);
        m7Button.setText("");
        m7Button.setEnabled(true);
        m8Button.setText("");
        m8Button.setEnabled(true);
    }

    /**
     * Метод, возвращающий сторону игрока в зависимости от стороны ПК, для отображения на кнопке.
     *
     * @param side сторона пк.
     * @return строка-сторона игрока, отоброжаемая на кнопке
     */
    public static String getSideForButton(String side) {
        if (side == "X") {
            return "0";
        } else {
            return "X";
        }
    }

    /**
     * Метод, устанавливающий значение стороны играющего на кнопку
     *
     * @param buttonNumber  номер кнопки
     * @param side          сторона
     */
    private void setValueInButton(byte buttonNumber, String side) {
        switch (buttonNumber) {
            case 0:
                m0Button.setText(side);
                m0Button.setEnabled(false);
                break;
            case 1:
                m1Button.setText(side);
                m1Button.setEnabled(false);
                break;
            case 2:
                m2Button.setText(side);
                m2Button.setEnabled(false);
                break;
            case 3:
                m3Button.setText(side);
                m3Button.setEnabled(false);
                break;
            case 4:
                m4Button.setText(side);
                m4Button.setEnabled(false);
                break;
            case 5:
                m5Button.setText(side);
                m5Button.setEnabled(false);
                break;
            case 6:
                m6Button.setText(side);
                m6Button.setEnabled(false);
                break;
            case 7:
                m7Button.setText(side);
                m7Button.setEnabled(false);
                break;
            case 8:
                m8Button.setText(side);
                m8Button.setEnabled(false);
                break;
        }
    }

    /**
     * Метод, изменяющий игровое поле и кнопку при нажатии на неё
     *
     * @param state     объект State (состояния)
     * @param button    объект кнопки
     */
    public byte clickOnButton(State state, Logic logic, JButton button, byte buttonNumber) {
        state.setFieldInMap(GUI.getSideForButton(state.getSide()), buttonNumber);
        button.setText(GUI.getSideForButton(state.getSide()));
        button.setEnabled(false);
        byte numberOfFieldInMap = logic.analysisOfTurns(state.getSide(), state.getFieldMap(), state.getTurnCounter());
        state.setFieldInMap(state.getSide(), numberOfFieldInMap);
        state.incTurnCounter();
        return numberOfFieldInMap;
    }

    /**
     * Создание окна приложения.
     */
    public GUI() {
        State state = new State();
        Logic logic = new Logic();

        // Настройка окна
        mWindow = new JFrame("Крестики-Нолики");
        mWindow.setSize(1000, 800);
        mWindow.setResizable(false);
        mWindow.setVisible(true);
        mWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mWindow.setLayout(null);

        // Инициализация и добавление игровой панели
        mGamePanel = new JPanel();
        mGamePanel.setSize(600, 600);
        mGamePanel.setLocation(0, 0);
        mGamePanel.setVisible(true);
        mGamePanel.setLayout(null);
        mWindow.add(mGamePanel);

        // добавление и придание свойст кнопок на игровую панель
        m0Button.setSize(200, 200);
        m0Button.setLocation(0, 0);
        m0Button.setEnabled(false);
        m0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setValueInButton(clickOnButton(state, logic, m0Button, (byte) 0), state.getSide());
            }
        });
        mGamePanel.add(m0Button);

        m1Button.setSize(200, 200);
        m1Button.setLocation(200, 0);
        m1Button.setEnabled(false);
        m1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setValueInButton(clickOnButton(state, logic,  m1Button, (byte) 1), state.getSide());
            }
        });
        mGamePanel.add(m1Button);

        m2Button.setSize(200, 200);
        m2Button.setLocation(400, 0);
        m2Button.setEnabled(false);
        m2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setValueInButton(clickOnButton(state, logic, m2Button, (byte) 2), state.getSide());
            }
        });
        mGamePanel.add(m2Button);

        m3Button.setSize(200, 200);
        m3Button.setLocation(0, 200);
        m3Button.setEnabled(false);
        m3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setValueInButton(clickOnButton(state, logic, m3Button, (byte) 3), state.getSide());
            }
        });
        mGamePanel.add(m3Button);

        m4Button.setSize(200, 200);
        m4Button.setLocation(200, 200);
        m4Button.setEnabled(false);
        m4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        mGamePanel.add(m4Button);

        m5Button.setSize(200, 200);
        m5Button.setLocation(400, 200);
        m5Button.setEnabled(false);
        m5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setValueInButton(clickOnButton(state, logic, m5Button, (byte) 5), state.getSide());
            }
        });
        mGamePanel.add(m5Button);

        m6Button.setSize(200, 200);
        m6Button.setLocation(0, 400);
        m6Button.setEnabled(false);
        m6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setValueInButton(clickOnButton(state, logic, m6Button, (byte) 6), state.getSide());
            }
        });
        mGamePanel.add(m6Button);

        m7Button.setSize(200, 200);
        m7Button.setLocation(200, 400);
        m7Button.setEnabled(false);
        m7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setValueInButton(clickOnButton(state, logic, m7Button, (byte) 7), state.getSide());
            }
        });
        mGamePanel.add(m7Button);

        m8Button.setSize(200, 200);
        m8Button.setLocation(400, 400);
        m8Button.setEnabled(false);
        m8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setValueInButton(clickOnButton(state, logic, m8Button, (byte) 8), state.getSide());
                System.out.println(state.getTurnCounter());
            }
        });
        mGamePanel.add(m8Button);


        // Инициализация и добавление панели управления
        mOptionPanel = new JPanel();
        mOptionPanel.setSize(200, 600);
        mOptionPanel.setLocation(700, 0);
        mOptionPanel.setVisible(true);
        mOptionPanel.setLayout(null);
        mWindow.add(mOptionPanel);

        mStartButton = new JButton("Start");
        mStartButton.setSize(200, 200);
        mStartButton.setLocation(0, 0);
        mStartButton.setFocusPainted(false);
        mStartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetValueInButtons();
                state.resetFieldMap();
                state.setStarted(true);
                if (state.getSide() == "X") {
                    m4Button.setText(state.getSide());
                    m4Button.setEnabled(false);
                    state.setFieldInMap(state.getSide(), (byte) 4);
                    state.incTurnCounter();
                }
            }
        });
        mOptionPanel.add(mStartButton);
    }
}