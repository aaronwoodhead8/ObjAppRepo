package Classes;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {

    private JLabel taskNum;
    private JTextField taskText;
    private JButton taskBtn;
    private Boolean checked;
    Task(){
        this.setPreferredSize(new Dimension(40,20));

        this.setLayout(new BorderLayout());

        checked = false;

        taskNum = new JLabel("");
        taskNum.setPreferredSize(new Dimension(20,20));
        taskNum.setHorizontalAlignment(JLabel.CENTER);//double check


        taskText = new JTextField("Your task here");
        taskText.setBorder(BorderFactory.createEmptyBorder());// test without ot different way

        taskBtn = new JButton("Done");
        taskBtn.setPreferredSize(new Dimension(40,20));
        taskBtn.setBorder(BorderFactory.createEmptyBorder());
        taskBtn.setFocusable(false);

        this.add(taskNum,BorderLayout.WEST);
        this.add(taskText,BorderLayout.CENTER);
        this.add(taskBtn,BorderLayout.EAST);


    }
    public void changeIndex(int num){
        taskNum.setText(num+"");
    }
    public JButton getTaskBtn(){
        return taskBtn;
    }
    public Boolean getChecked(){
        return checked;
    }

    public void flipChecked(){
        checked = !checked;
        if(checked==true) {
            taskBtn.setBackground(Color.green);
        }
            else{
                taskBtn.setBackground(null);
            }
        revalidate();
        }
    }

