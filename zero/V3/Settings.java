import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Settings implements ActionListener{
    JPanel setting = new JPanel();
    JLabel settingText = new JLabel("");
    JLabel tempId = new JLabel("");
    JLabel settingDate = new JLabel("");
    JLabel settingVersion = new JLabel("");
    JButton configure = new JButton("Configure");
    //ConfigFile settingConfigFile = new ConfigFile();
    //Config settingConfig = new Config();

    private Config configSetting ;

    //String settingUserName = "none";
    //String settingsTempId = "none";

    Settings(Config setConfig){
        configSetting = setConfig;
        configure.addActionListener(this);

        setting.setLayout(new FlowLayout());
        setting.setPreferredSize(new Dimension (840,520));
        settingText.setPreferredSize(new Dimension (640,30));
        settingDate.setPreferredSize(new Dimension (640,30));
        settingVersion.setPreferredSize(new Dimension (640,30));
        tempId.setPreferredSize(new Dimension (640,30));
        configure.setPreferredSize(new Dimension (640,50));
        setting.add(settingText);
        setting.add(settingDate);
        setting.add(settingVersion);
        setting.add(tempId);
        setting.add(configure);
        setting.setVisible(false);
    }

    public void actionPerformed(ActionEvent e){
        System.out.println(configSetting.username);
        //System.out.println(config.tempId);
        //settingDate.setText(settingConfigFile.date);
        settingText.setText(configSetting.username);
        //settingText.setText(config.username);
        tempId.setText(configSetting.tempId);
        //settingVersion.setText(settingConfigFile.version);
    }
}//47