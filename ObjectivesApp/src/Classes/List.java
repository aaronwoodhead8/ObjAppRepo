package Classes;

import javax.swing.*;
import java.awt.*;

public class List extends JPanel {

    List(){

        GridLayout layout = new GridLayout(10,1,0,5);//sets grid layout with 10 rows, 1 column and 5 pixel vertical gap
        this.setLayout(layout);// sets layout to the layout created
        this.setBackground( Color.decode("#FDFD96") ); // set background color


//        this.setBackground(Color.green);
    }

    public void updateNumbers(){

        Component[] listTasks = this.getComponents();
// makes array of components, gets components from container then stores them in array

        for (int i = 0;i < listTasks.length; i++){

            if(listTasks[i] instanceof Task){
                ((Task)listTasks[i]).changeIndex(i+1); //in task, change the index of the current list item
            }
        }
    }
    public void deleteCompletedTasks(){
        Component[] listTasks = this.getComponents();

        for (Component i : listTasks){
            if(i instanceof Task && ((Task) i).getChecked()==true){
                remove(i);
                revalidate();
                repaint();
            }
        }
    }
}
