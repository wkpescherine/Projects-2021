import java.awt.*;
import javax.swing.*;

public class Settings{
    JPanel setting = new JPanel();
    JLabel settingText = new JLabel("In setting section");
    JLabel tempIdNum = new JLabel("none1");
    Config config;

    Settings(){
        //System.out.println(config.tempId+" from the settings view 1st");

        setting.setLayout(new FlowLayout());
        setting.setPreferredSize(new Dimension (840,520));
        setting.add(settingText);
        setting.add(tempIdNum);
        setting.setVisible(false);
    }

    void passConfig(Config config, int a){
        this.config = config;
		System.out.println(config.tempId+" from the settings view " + a);
    }
}//14