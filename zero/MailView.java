import java.awt.*;
import javax.swing.*;

public class MailView{
    JPanel mail = new JPanel();

    String mailMessage1 = "Mail Message";

    JLabel message1 = new JLabel(mailMessage1);

    MailView(){
        mail.setLayout(new FlowLayout());
        mail.setPreferredSize(new Dimension (840,520));
        mail.add(message1);
        mail.setVisible(false);
    }
}//17