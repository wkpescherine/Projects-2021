import java.awt.*;
import javax.swing.*;
import java.lang.String;

public class Site{
    JPanel site = new JPanel();
    JLabel siteText = new JLabel("This is a test site");
    
    Site(){
        site.setLayout(new FlowLayout());
        site.setPreferredSize(new Dimension (860,540));
        site.setVisible(true);
        site.add(siteText);
    }
    
    public void changeText(String words){
            siteText.setText(words);
        }
    
}//14