import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class History{
    JPanel history = new JPanel();
    JLabel historyText = new JLabel("In history section");

    String [] historyArray = new String[100];

    Site historySite = new Site();

    History(){
        buildHistory();

        history.setLayout(new FlowLayout());
        history.setPreferredSize(new Dimension (840,520));
        history.add(historyText);
        history.setVisible(false);
    }

    public void buildHistory(){
        history.removeAll();
        int start = historyArray.length;
        JLabel jlabel[] = new JLabel[start];

        for(int a = 1; a< historyArray.length; a++){
            jlabel[a] = new JLabel("");
            JLabel historyLabel = jlabel[a];
            String siteparam = historyArray[a];
            historyLabel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                        historySite.site.setVisible(true);
                        history.setVisible(false);
                        historySite.panelBuilder3(siteparam);
                    }	
                }
            );
            history.add(historyLabel);
        }

        history.validate();
        history.repaint();
    }
}//45