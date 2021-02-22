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

        for(int a = 0; a < country.length; a++){
            jpanel[a] = new JPanel();
            jbutton[a] = new JButton("Purchase");
            jlabelcountry[a] = new JLabel(country[a]);
            jlabelrate[a] = new JLabel(country[a]+"");
            jtextfield[a] = new JTextField(20);
            JPanel countryList = jpanel[a];
            JButton purchase = jbutton[a];
            JLabel countryName = jlabelcountry[a];
            JLabel countryRate = jlabelrate[a];
            JTextField  countryValue = jtextfield[a];
            purchase.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.out.println("Test");
                    }
                }
            );
            countryList.setPreferredSize(new Dimension(400,30));
            countryList.setLayout(new FlowLayout());
            countryList.add(countryName);
            countryList.add(countryValue);
            countryList.add(countryRate);
            countryList.add(purchase);
            countryToZ.add(countryList);
        }

        countryToZ.validate();
        countryToZ.repaint();
    }

    public void convertToZcoin(){}

    public void cenvertToCountry(){}
}//92