import java.awt.*;
import javax.swing.*;

public class Home{
    JPanel home = new JPanel();
    JLabel homeText = new JLabel("In home section");

    Home(){
        home.setLayout(new FlowLayout());
        home.setPreferredSize(new Dimension (840,520));
        home.add(homeText);
        home.setVisible(false);
    }
}//14