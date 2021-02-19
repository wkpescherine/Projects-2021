import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Settings implements ActionListener{
    JPanel setting = new JPanel();
    JLabel settingText = new JLabel("");
    JLabel tempId = new JLabel("");
    JButton configure = new JButton("Configure");
    ConfigFile settingConfigFile = new ConfigFile();

    String settingUserName = "none";
    String settingsTempId = "none";

    Settings(){
        configure.addActionListener(this);

        setting.setLayout(new FlowLayout());
        setting.setPreferredSize(new Dimension (840,520));
        settingText.setPreferredSize(new Dimension (640,30));
        tempId.setPreferredSize(new Dimension (640,30));
        configure.setPreferredSize(new Dimension (640,50));
        setting.add(settingText);
        setting.add(tempId);
        setting.add(configure);
        setting.setVisible(false);
    }

    public void actionPerformed(ActionEvent e){
        settingText.setText(settingConfigFile.username);
        tempId.setText(settingsTempId);
    }
}//33