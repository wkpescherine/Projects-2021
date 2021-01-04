import java.awt.*;
import javax.swing.*;

public class MailView{
    String [] values = {"test 1", "user 1", "message 1"};
    JPanel mail = new JPanel();
    JPanel zmail = new JPanel();
    JPanel zcompose = new JPanel();
    JPanel messageRec1 = new JPanel();
    JButton inbox = new JButton("Inbox");
    JButton compose = new JButton("Compose");
    JButton previous = new JButton("Previous");
    JButton next = new JButton("Next");
    JButton send = new JButton("Send");
    JLabel fromRec1 = new JLabel("user1");
    JLabel titleRec1 = new JLabel("title1");
    JLabel dateSent1 = new JLabel("1/1/21");
    JLabel dateRec1 = new JLabel("1/1/21");
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
        zmail.setLayout(null);
        zmail.setPreferredSize(new Dimension (820,480));
        messageRec1.setBounds(50,25,700,25);
        messageRec1.setLayout(new FlowLayout());
        messageRec1.setPreferredSize(new Dimension(600,50));
        messageRec1.add(fromRec1);
        messageRec1.add(titleRec1);
        messageRec1.add(dateSent1);
        messageRec1.add(dateRec1);
        messageRec1.setBackground(Color.WHITE);
        previous.setBounds(250,350,100,25);
        next.setBounds(450,350,100,25);
        zmail.add(messageRec1);
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
}//57