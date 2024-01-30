package MeetingGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeetingGUI extends JFrame  {
    // Создаем переменные компонентов
    protected JLabel label;
    protected JTextArea textArea;
    protected JButton button;
    protected JPanel panel;
    protected JTextArea area2;
    protected   MeetingActionListener listenerr;

    public MeetingGUI() {
        // Настройка формы
        setTitle("Meeting");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        // Создаем компоненты
        panel =new JPanel();

        listenerr = new MeetingActionListener();
        label = new JLabel();
        //textArea = new JTextArea();
        area2 = new JTextArea(15, 10);
        area2.setText("");
        // Параметры переноса слов
        area2.setLineWrap(true);
        area2.setWrapStyleWord(true);
        button = new JButton("Submit");

        // Добавляем компоненты на форму
        panel.add(label);
        //panel.add(textArea);
        panel.add(area2);
        panel.add(button);

        // Назначаем слушателя для кнопки
        button.addActionListener(listenerr);


        // Задаем расположение компонентов на форме, например, используя LayoutManager
        setContentPane(panel);
        // Поправляем свойство видимости формы
        setVisible(true);
    }
}
