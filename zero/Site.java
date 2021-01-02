import java.awt.*;
import javax.swing.*;

public class Site{
    JPanel site = new JPanel();
    JLabel siteText = new JLabel("This is a test site");
    
    Site(){
        site.setLayout(new FlowLayout());
        site.setPreferredSize(new Dimension (860,540));
        site.setVisible(false);
        site.add(siteText);
    }
}//14