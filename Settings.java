import java.awt.*;
import javax.swing.*;

public class Settings{
    JPanel setting = new JPanel();
    JLabel settingText = new JLabel("In setting section");
    JLabel tempId = new JLabel("Temp Id");
    ConfigFile settingConfigFile = new ConfigFile();

    String settingUserName = "none";
    String settingsTempId = "none";

    Settings(){
        setting.setLayout(new FlowLayout());
        setting.setPreferredSize(new Dimension (840,520));
        settingText.setPreferredSize(new Dimension (640,50));
        settingText.setText(settingUserName);
        tempId.setPreferredSize(new Dimension (640,50));
        tempId.setText(settingsTempId);
        setting.add(settingText);
        setting.add(tempId);
        setting.setVisible(false);
    }
}//14