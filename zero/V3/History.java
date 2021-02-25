import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class History implements ActionListener{
    JPanel history = new JPanel();
    JLabel historyText = new JLabel("In history section");
    JButton historyUpdate = new JButton("Update History");

    String [] historyArray = new String[5];
    int historyCount =0;

    Site historySite = new Site();

    History(){
        historyUpdate.addActionListener(this);

        history.setLayout(new FlowLayout());
        history.setPreferredSize(new Dimension (840,520));
        history.add(historyText);
        history.add(historyUpdate);
        history.setVisible(false);
    }
    public void actionPerformed(ActionEvent e){
        buildHistory();
    }

    public void buildHistory(){
        history.removeAll();
        System.out.println(historyArray[0]);
        int start = historyArray.length;
        JLabel jlabel[] = new JLabel[start];

        //Array is counting it as 5 times....
        for(int a = 0; a< historyArray.length; a++){
            jlabel[a] = new JLabel(historyArray[a]+"");
            JLabel historyLabel = jlabel[a];
            String siteparam = historyArray[a];
            historyLabel.setPreferredSize(new Dimension (640,50));
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
}//54