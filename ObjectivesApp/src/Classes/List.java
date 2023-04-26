package Classes;

import javax.swing.*;
import java.awt.*;

public class List extends JPanel {

    List(){

        GridLayout layout = new GridLayout(10,1,0,5);//sets grid layout with 10 rows, 1 column and 5 pixel vertical gap
        this.setLayout(layout);// sets layout to the layout created

        this.setBackground(Color.green);
    }
}
