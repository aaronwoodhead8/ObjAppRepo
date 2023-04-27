package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {

    private TitleBar title;
    private List list;
    private ButtonPanel btnpanel;
    private JButton addTaskButton;
    private JButton deleteTasksButton;
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


        addTaskButton = btnpanel.getAddBtn();
        deleteTasksButton = btnpanel.getDeleteTasksButton();


        addMouseListener();
    }

    private void addMouseListener() {
        addTaskButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Task task = new Task();
                list.add(task);
                list.updateNumbers();
                revalidate();
                repaint();

                task.getTaskBtn().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        task.flipChecked();
                        revalidate();
                        repaint();
                    }
                });

                deleteTasksButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {


                        list.deleteCompletedTasks();
                    }
                });
                revalidate();
            }


        });
    }
}
