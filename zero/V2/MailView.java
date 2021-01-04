import java.awt.*;
import javax.swing.*;

public class MailView{
    JPanel mail = new JPanel();
    JPanel zmail = new JPanel();
    JPanel zcompose = new JPanel();
    JButton inbox = new JButton("Inbox");
    JButton compose = new JButton("Compose");
    JButton previous = new JButton("Previous");
    JButton next = new JButton("Next");
    JButton send = new JButton("Send");
    JLabel fromText = new JLabel("From:");
    JLabel toText = new JLabel("To:");
    JLabel titleText = new JLabel("Title:");
    JTextField fromTextField = new JTextField(25);
    JTextField toTextField = new JTextField(25);
    JTextField titleTextField = new JTextField(25);
    JTextArea messageArea = new JTextArea();

    MailView(){
        mail.setLayout(new FlowLayout());
        mail.setPreferredSize(new Dimension (840,520));
        zmail.setLayout(new FlowLayout());
        zmail.setPreferredSize(new Dimension (820,480));
        //previous.setBounds(200,300,100,25);
        //next.setBounds(300,300,100,25);
        zmail.setVisible(false);
        zmail.add(previous);
        zmail.add(next);
        zcompose.setLayout(null);
        zcompose.setPreferredSize(new Dimension (820,480));
        fromText.setBounds(50,25,50,25);
        fromTextField.setBounds(175,25,300,25);
        toText.setBounds(50,50,50,25);
        toTextField.setBounds(175,50,300,25);
        titleText.setBounds(50,75,50,25);
        titleTextField.setBounds(175,75,300,25);
        messageArea.setBounds(175,100,500,200);
        messageArea.setLineWrap(true);
        send.setBounds(200,300,100,25);
        zcompose.add(fromText);
        zcompose.add(fromTextField);
        zcompose.add(toText);
        zcompose.add(toTextField);
        zcompose.add(titleText);
        zcompose.add(titleTextField);
        zcompose.add(messageArea);
        zcompose.add(send);
        zcompose.setVisible(false);
        mail.add(inbox);
        mail.add(compose);
        mail.add(zmail);
        mail.add(zcompose);
        mail.setVisible(false);
    }
}//17