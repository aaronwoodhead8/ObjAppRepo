package Classes;

import javax.swing.*;
import java.awt.*;
import java.util.HexFormat;

public class TitleBar extends JPanel {

    private JLabel title;

    TitleBar(){

        this.setSize(400,80);

        title = new JLabel("To Do List");
        Font font1 = new Font("Sans-serif", Font.PLAIN, 40);
        title.setFont(font1);
        this.setBackground( Color.decode("#FDFD96") ); // set background color

        this.add(title);
        this.setVisible(true);

    }
}
