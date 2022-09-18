import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel {
    private JButton addTask;
    private JButton clear;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    //Construction
    ButtonPanel() {
        this.setPreferredSize(new Dimension(400, 60));
//        this.setBackground(Color.red);

        addTask = new JButton("Дабавить новые");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        addTask.setBackground(Color.CYAN);

        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));
        clear = new JButton("Стереть выполненные");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        clear.setBackground(Color.CYAN);
        this.add(clear);
    }
    public JButton getAddTask() {
        return  addTask;
    }
    public JButton getClear() {
        return clear;
    }
}
