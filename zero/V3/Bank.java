import java.awt.*;
import javax.swing.*;

public class Bank{
    JPanel bank = new JPanel();
    JPanel countryToZ = new JPanel();
    JPanel zToCountry = new JPanel();
    JLabel bankText = new JLabel("In bank section");

    String [] country = {};
    Float [] conversionRate = {};

    Bank(){
        bank.setLayout(new FlowLayout());
        bank.setPreferredSize(new Dimension (840,520));
        bank.add(bankText);
        bank.setVisible(false);
    }
}//19