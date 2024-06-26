package GUI;

import com.sun.source.tree.UsesTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.util.LinkedList;

public class MainGUI implements ActionListener {
    public static JFrame frame;
    public static JPanel aesPanel;
    public static JPanel listPanel;
    public static JButton addEvent;
    public static JButton editEvent;
    public static JButton saveEvent;
    public static ButtonGroup bg;
    public static LinkedList<JToggleButton> eventList;
    
    public static void main(String[] args) {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocation(600, 300);
        frame.setMinimumSize(new Dimension(600, 700));

        aesPanel = new JPanel();
        aesPanel.setLayout(new GridLayout(3, 1));

        listPanel = new JPanel();
        listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));
        listPanel.setBackground(Color.gray);

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

        bg = new ButtonGroup();
        // Add a reader to see if user has saved activities for the day
        eventList = new LinkedList<>();
        JToggleButton toggle = new JToggleButton("hi");
        toggle.setAlignmentX(Component.CENTER_ALIGNMENT);
        toggle.setPreferredSize(new Dimension(500, 70));
        toggle.setPreferredSize(new Dimension(500, 70));
        eventList.push(toggle);
        for(JToggleButton tg : eventList){
            bg.add(tg);
            listPanel.add(tg);
        }

        frame.add(aesPanel, BorderLayout.WEST);
        frame.add(listPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
