package gui;

import logic.Logic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    // Окно
    private JFrame mWindow;

    // Панель, содержащее поле игры (кнопки)
    private JPanel mGamePanel;

    // Панель, содержащая кнопки управления
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

    // Инструменты управления
    private JButton mStartButton;

    /**
     * Метод, очищающий надписи на кнопках
     */
    private void resetValueInButtons() {
        m0Button.setText("");
        m1Button.setText("");
        m2Button.setText("");
        m3Button.setText("");
        m4Button.setText("");
        m5Button.setText("");
        m6Button.setText("");
        m7Button.setText("");
        m8Button.setText("");
    }

    /**
     * Метод, заполняющий поля игрового поля (возможен более лучший способ, но пока так оставлю)
     *
     * @param fieldMap  - игровое поле
     * @param buttons   - массив кнопок
     */
    private void setValueInButtons(String[] fieldMap, JButton[] buttons) {
        for (int i = 0; i < fieldMap.length; i++) {
            if (fieldMap[i] != "") {
                buttons[i].setText(fieldMap[i]);
                buttons[i].setEnabled(false);
            }
        }
    }

    /**
     *
     * @param field
     * @param button
     */
    private void setValueForButton(String field, JButton button) {
        button.setText(field);
        button.setEnabled(false);
    }

    public GUI() {
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

        // добавление и поридание свойст кнопок на игровую панель
        //m0Button = new JButton("0");
        m0Button.setSize(200, 200);
        m0Button.setLocation(0, 0);
        m0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m0Button.setText(logic.getSide());
            }
        });
        mGamePanel.add(m0Button);

        m1Button.setSize(200, 200);
        m1Button.setLocation(200, 0);
        mGamePanel.add(m1Button);

        m2Button.setSize(200, 200);
        m2Button.setLocation(400, 0);
        mGamePanel.add(m2Button);

        m3Button.setSize(200, 200);
        m3Button.setLocation(0, 200);
        mGamePanel.add(m3Button);

        m4Button.setSize(200, 200);
        m4Button.setLocation(200, 200);
        mGamePanel.add(m4Button);

        m5Button.setSize(200, 200);
        m5Button.setLocation(400, 200);
        mGamePanel.add(m5Button);

        m6Button.setSize(200, 200);
        m6Button.setLocation(0, 400);
        mGamePanel.add(m6Button);

        m7Button.setSize(200, 200);
        m7Button.setLocation(200, 400);
        mGamePanel.add(m7Button);

        m8Button.setSize(200, 200);
        m8Button.setLocation(400, 400);
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
                logic.cleanFieldMap();
                if (logic.getSide() == "X") {
                    logic.turn();
                    setValueInButton(logic.getFieldMap()[4], m4Button);
                }
            }
        });
        mOptionPanel.add(mStartButton);
    }

}
