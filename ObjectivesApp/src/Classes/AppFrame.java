package Classes;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    private TitleBar title;
    private List list;
    private ButtonPanel btnpanel;
    AppFrame(){

        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());


        title = new TitleBar();
        list = new List();
        btnpanel = new ButtonPanel();

        this.add(title,BorderLayout.NORTH);
        this.add(btnpanel,BorderLayout.SOUTH);
        this.add(list,BorderLayout.CENTER);
        this.setVisible(true);
    }
}
