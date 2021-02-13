import java.awt.*;
import javax.swing.*;

public class Home{
    JPanel home = new JPanel();
    JPanel news = new JPanel();
    JPanel newsSub = new JPanel();
    JPanel updates = new JPanel();
    JPanel updatesSub = new JPanel();
    JLabel homeText = new JLabel("Welcome to the Zero browser");

    Home(){
        updateNews();

        home.setLayout(null);
        //home.setBackground(Color.RED);
        home.setPreferredSize(new Dimension (700,420));
        homeText.setBounds(250,10,200,20);
        news.setPreferredSize(new Dimension (200,360));
        news.setBounds(25,50,200,360);
        newsSub.setPreferredSize(new Dimension (180,80));
        //newsSub.setVisible(false);
        news.add(newsSub);
        news.setBackground(Color.WHITE);
        updates.setPreferredSize(new Dimension (440,360));
        updates.setBounds(250,50,440,360);
        updates.setBackground(Color.WHITE);
        home.add(homeText);
        home.add(news);
        home.add(updates);
        home.setVisible(true);
    }
    public void updateNews(){

    }
}//14