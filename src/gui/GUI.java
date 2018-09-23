package gui;

import javax.swing.*;
import java.awt.*;
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
    private JButton m0Button;
    private JButton m1Button;
    private JButton m2Button;
    private JButton m3Button;
    private JButton m4Button;
    private JButton m5Button;
    private JButton m6Button;
    private JButton m7Button;
    private JButton m8Button;

    // Инструменты управления
    private JButton mStart;

    public void resetValueInButtons() {
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
     * Сначала придумал, но потом по-другому, оставлю на всякий случай
     *
     * @param buttonNum - номер кнопки
     * @param value     - значение кнопки
     */
    public void setValueInButton(int buttonNum, String value) {
        switch (buttonNum) {
            case 0:
                m0Button.setText(value);
                break;
            case 1:
                m1Button.setText(value);
                break;
            case 2:
                m2Button.setText(value);
                break;
            case 3:
                m3Button.setText(value);
                break;
            case 4:
                m4Button.setText(value);
                break;
            case 5:
                m5Button.setText(value);
                break;
            case 6:
                m6Button.setText(value);
                break;
            case 7:
                m7Button.setText(value);
                break;
            case 8:
                m8Button.setText(value);
                break;
        }
    }

    GUI() {
        // Настройка окна
        mWindow = new JFrame("Крестики-Нолики");
        mWindow.setSize(1000, 600);
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

        // Инициализация и добавление кнопок на игровую панель
        m0Button = new JButton("0");
        m0Button.setSize(200, 200);
        m0Button.setLocation(0, 0);
        m0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m0Button.setText("0");
            }
        });
        mGamePanel.add(m0Button);

        m1Button = new JButton("1");
        m1Button.setSize(200, 200);
        m1Button.setLocation(200, 0);
        mGamePanel.add(m1Button);

        m2Button = new JButton("2");
        m2Button.setSize(200, 200);
        m2Button.setLocation(400, 0);
        mGamePanel.add(m2Button);

        m3Button = new JButton("3");
        m3Button.setSize(200, 200);
        m3Button.setLocation(0, 200);
        mGamePanel.add(m3Button);

        m4Button = new JButton("4");
        m4Button.setSize(200, 200);
        m4Button.setLocation(200, 200);
        mGamePanel.add(m4Button);

        m5Button = new JButton("5");
        m5Button.setSize(200, 200);
        m5Button.setLocation(400, 200);
        mGamePanel.add(m5Button);

        m6Button = new JButton("6");
        m6Button.setSize(200, 200);
        m6Button.setLocation(0, 400);
        mGamePanel.add(m6Button);

        m7Button = new JButton("7");
        m7Button.setSize(200, 200);
        m7Button.setLocation(200, 400);
        mGamePanel.add(m7Button);

        m8Button = new JButton("8");
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

        mStart = new JButton("Start");
        mStart.setSize(200, 200);
        mStart.setLocation(0, 0);
        mOptionPanel.add(mStart);
    }
}
