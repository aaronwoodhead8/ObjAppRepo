package Classes;

import javax.swing.*;
import java.awt.*;

public class List extends JPanel {

    List(){

        GridLayout layout = new GridLayout(10,1,0,5);//sets grid layout with 10 rows, 1 column and 5 pixel vertical gap
        this.setLayout(layout);// sets layout to the layout created

        this.setBackground(Color.green);
    }

    public void updateNumbers(){

        Component[] listItems = this.getComponents();
// an array of componenets, component is a super class of components like button, label, etc... listItems is the name of the array, get components gets all the components in the container
// makes array of components, gets components from container then stores them in array

        for (int i = 0;i < listItems.length; i++){

            if(listItems[i] instanceof Task){
                ((Task)listItems[i]).changeIndex(i+1); //in task, change the index of the current list item
            }
        }
    }
}
