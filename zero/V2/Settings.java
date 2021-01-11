import java.awt.*;
import javax.swing.*;

public class Settings{
    JPanel setting = new JPanel();
    JLabel settingText = new JLabel("In setting section");

    Settings(){
        setting.setLayout(new FlowLayout());
        setting.setPreferredSize(new Dimension (840,520));
        setting.add(settingText);
        setting.setVisible(false);
    }
}//0