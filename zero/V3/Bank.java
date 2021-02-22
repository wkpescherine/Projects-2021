import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bank implements ActionListener{
    JPanel bank = new JPanel();
    JPanel countryToZ = new JPanel();
    JPanel zToCountry = new JPanel();
    JButton purchaseZ = new JButton("Purchase Zcoins");
    JButton sellZ = new JButton("Sell Zcoins");
    JLabel bankText = new JLabel("Zero Financials");

    String [] country = {};
    Float [] conversionRate = {};

    Bank(){
        purchaseZ.addActionListener(this);
        sellZ.addActionListener(
            new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    countryToZ.setVisible(false);
                    zToCountry.setVisible(true);
				}
			}
        );

        bank.setLayout(new FlowLayout());
        bank.setPreferredSize(new Dimension (840,520));
        purchaseZ.setPreferredSize(new Dimension (400,30));
        countryToZ.setBackground(Color.WHITE);
        sellZ.setPreferredSize(new Dimension (400,30));
        zToCountry.setBackground(Color.WHITE);
        bankText.setPreferredSize(new Dimension (600,30));
        countryToZ.setPreferredSize(new Dimension(600,300));
        zToCountry.setPreferredSize(new Dimension(600,300));
        countryToZ.setVisible(false);
        zToCountry.setVisible(false);
        bank.add(bankText);
        bank.add(purchaseZ);
        bank.add(sellZ);
        bank.add(countryToZ);
        bank.add(zToCountry);
        bank.setVisible(false);
    }

	public void actionPerformed(ActionEvent e){
        countryToZ.setVisible(true);
        zToCountry.setVisible(false);
        conversionPanelZ();
    }

    public void conversionPanelZ(){
        countryToZ.removeAll();
        int start = country.length;
        JPanel jpanel[] = new JPanel[start];
        JButton jbutton[] = new JButton[start];
        JTextField jtextfield[] = new JTextField[start];
        JLabel jlabelrate[] = new JLabel[start];
        JLabel jlabelcountry[] = new JLabel[start];
    }

    public void convertToZcoin(){}

    public void cenvertToCountry(){}
}//65

for(int a = 0; a < emails.length-1; a++){
jpanel[a] = new JPanel();
jbutton[a] = new JButton("View");
jlabel[a] = new JLabel();
JPanel mailSub = jpanel[a];
JButton mailSubButton = jbutton[a];
JLabel mailSubLabel = jlabel[a];
mailSubButton.addActionListener(
    new ActionListener(){
        public void actionPerformed(ActionEvent e){
            displayMessage(subMsgSplit[3]);
            zmail.setVisible(false);
            messagePanel.setVisible(true);
        }
    }
);
mailSubLabel.setText(subMsgSplit[1]+" "+ subMsgSplit[2]);
mailSub.setLayout(new FlowLayout());
mailSub.setPreferredSize(new Dimension (600,50));
mailSub.add(mailSubLabel);
mailSub.add(mailSubButton);
zmail.add(mailSub);