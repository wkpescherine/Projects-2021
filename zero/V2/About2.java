import java.awt.*;
import javax.swing.*;

public class About2 {
    JPanel about2 = new JPanel();
    JLabel about2Text = new JLabel("In the About Section");

    About2(){
        about2.setLayout(new FlowLayout());
        about2.setPreferredSize(new Dimension(300,560));
        about2.add(about2Text);
        about2.setVisible(false);    
    }
}//14