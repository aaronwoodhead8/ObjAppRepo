package Classes;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {

    private JLabel title;

    TitleBar(){

        this.setSize(400,80);

        title = new JLabel("To Do Tasks");
        Font font1 = new Font("Sans-serif", Font.PLAIN, 20);
        title.setFont(font1);
        title.setHorizontalAlignment(JLabel.CENTER);


        this.add(title);
        this.setVisible(true);

    }
}
