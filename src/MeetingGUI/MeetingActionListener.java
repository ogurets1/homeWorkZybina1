package MeetingGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class  MeetingActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() instanceof JButton) {
            JButton sourceButton = (JButton) e.getSource();
            if(sourceButton.getText().equals("Submit")) {
                // Обработка события для первой кнопки

                String dialog = area2.getText();
                label.setText(dialog);
            }
            else if (sourceButton.getText().equals("Button2")) {
                // Обработка события для второй кнопки
                System.out.println("Событие для второй кнопки");
            }
        }
    }



}