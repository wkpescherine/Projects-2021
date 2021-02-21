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
        sellZ.setPreferredSize(new Dimension (400,30));
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
    }

    public void convertToZcoin(){}

    public void cenvertToCountry(){}
}//52