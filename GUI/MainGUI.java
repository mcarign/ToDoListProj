package GUI;

import com.sun.source.tree.UsesTree;

import javax.swing.*;
import java.awt.*;

public class MainGUI {
    public static JFrame frame;
    public static JPanel mainPanel;
    public static JPanel aesPanel;
    public static JPanel listPanel;
    public static JButton addEvent;
    public static JButton editEvent;
    public static JButton saveEvent;
    public static JButton[] eventList;
    
    public static void main(String[] args) {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setBounds(600, 300, 620, 650);

        aesPanel = new JPanel();
        aesPanel.setBounds(0, 0, 90, frame.getHeight() - 38);
        aesPanel.setBackground(Color.gray);
        aesPanel.setLayout(new GridLayout(3, 1));

        listPanel = new JPanel();
        listPanel.setBounds(aesPanel.getWidth(), 0, 530, frame.getHeight() - 38);

        addEvent = new JButton("Add Event");
        addEvent.setBackground(Color.PINK);
        addEvent.setBorder(BorderFactory.createLineBorder(Color.darkGray, 3));

        editEvent = new JButton("Edit Event");
        editEvent.setBackground(Color.PINK);
        editEvent.setBorder(BorderFactory.createLineBorder(Color.darkGray, 3));

        saveEvent = new JButton("Save Event");
        saveEvent.setBackground(Color.PINK);
        saveEvent.setBorder(BorderFactory.createLineBorder(Color.darkGray, 3));

        aesPanel.add(addEvent);
        aesPanel.add(editEvent);
        aesPanel.add(saveEvent);

        frame.add(aesPanel);
        frame.add(listPanel);
        frame.setVisible(true);
    }
}
