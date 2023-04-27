package Classes;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private JButton addTaskButton;
    private JButton deleteTasksButton;
    private Border emptyBorder = BorderFactory.createEmptyBorder();
    ButtonPanel(){

        this.setBackground( Color.decode("#FDFD96") ); // set background color

        Font btnFont = new Font("Sans-serif", Font.PLAIN, 20);
        this.setSize(400,60);

        addTaskButton = new JButton("Add Task");
        addTaskButton.setFont(btnFont);
        addTaskButton.setSize(100,60);
        addTaskButton.setFocusable(false);

        deleteTasksButton = new JButton("Delete Completed Tasks");
        deleteTasksButton.setFont(btnFont);
        deleteTasksButton.setSize(200,60);
        deleteTasksButton.setFocusable(false);

//        this.setBackground(Color.red);//change design at end to two big buttons that fill panel

        this.add(addTaskButton);
//        this.add(Box.createHorizontalStrut(20)); // adds box between buttons to add a gap, added in middle of buttons
        this.add(deleteTasksButton);


        this.setVisible(true);
    }

    public JButton getAddBtn(){
        return addTaskButton;
    }

    public JButton getDeleteTasksButton(){
        return deleteTasksButton;
    }
}
