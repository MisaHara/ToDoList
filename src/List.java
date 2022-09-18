import java.awt.*;
import javax.swing.*;
public class List extends JPanel{
    List(){
        GridLayout layout = new GridLayout(10, 1);
        layout.setVgap(5);

        this.setLayout(layout);
        this.setBackground(Color.ORANGE);
    }
    public void updateNumbers(){
        Component[] listItems = this.getComponents();

        for (int i =0; i<listItems.length; i++) {
            if (listItems[i] instanceof  Task) {
                ((Task)listItems[i]).changeIndex(i+1);
            }
        }
    }

    public void removeCompletedTasks() {
        for(Component c : getComponents())
        {
            if(c instanceof Task)
            {
                if(((Task)c).getState())
                {
                    remove(c);
                    updateNumbers();
                }
            }
        }
    }
}
