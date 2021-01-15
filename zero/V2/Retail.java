import java.awt.*;
import javax.swing.*;

public class Retail{
    JPanel retail = new JPanel();
    JLabel retailText = new JLabel("In retail section");

    Retail(){
        retail.setLayout(new FlowLayout());
        retail.setPreferredSize(new Dimension (840,520));
        retail.add(retailText);
        retail.setVisible(false);
    }
}//14