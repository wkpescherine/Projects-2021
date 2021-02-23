import java.awt.*;
import javax.swing.*;

public class History{
    JPanel history = new JPanel();
    JLabel historyText = new JLabel("In history section");

    History(){
        history.setLayout(new FlowLayout());
        history.setPreferredSize(new Dimension (840,520));
        history.add(historyText);
        history.setVisible(false);
    }
}//14