import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MailView implements ActionListener{
    ConfigFile mailConfigFile = new ConfigFile();
    String nameOfUser = "none";
    String [] emails = new String[100];

    JPanel mail = new JPanel();
    JPanel zmail = new JPanel();
    JPanel zcompose = new JPanel();
    JPanel messageRec1 = new JPanel();
    JPanel messageRec2 = new JPanel();
    JPanel messageRec3 = new JPanel();
    JPanel messageRec4 = new JPanel();
    JButton inbox = new JButton("Inbox");
    JButton compose = new JButton("Compose");
    JButton previous = new JButton("Previous");
    JButton next = new JButton("Next");
    JButton send = new JButton("Send");
    JLabel fromRec1 = new JLabel("user1");
    JLabel titleRec1 = new JLabel("title1");
    JLabel dateSent1 = new JLabel("1/1/21");
    JLabel dateRec1 = new JLabel("1/1/21");
    JLabel fromRec2 = new JLabel("user1");
    JLabel titleRec2 = new JLabel("title1");
    JLabel dateSent2 = new JLabel("1/1/21");
    JLabel dateRec2 = new JLabel("1/1/21");
    JLabel fromRec3 = new JLabel("user1");
    JLabel titleRec3 = new JLabel("title1");
    JLabel dateSent3 = new JLabel("1/1/21");
    JLabel dateRec3 = new JLabel("1/1/21");
    JLabel fromRec4 = new JLabel("user1");
    JLabel titleRec4 = new JLabel("title1");
    JLabel dateSent4 = new JLabel("1/1/21");
    JLabel dateRec4 = new JLabel("1/1/21");
    JLabel fromText = new JLabel("From:");
    JLabel toText = new JLabel("To:");
    JLabel titleText = new JLabel("Title:");
    JTextField fromTextField = new JTextField(25);
    JTextField toTextField = new JTextField(25);
    JTextField titleTextField = new JTextField(25);
    JTextArea messageArea = new JTextArea();

    MailView(){
        send.addActionListener(this);
		inbox.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					zmail.setVisible(true);
                    zcompose.setVisible(false);
                    populateMail();
				}
			}
        );
        compose.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					zmail.setVisible(false);
                    zcompose.setVisible(true);
                    fromTextField.setText(nameOfUser);
				}
			}
        );
        
        mail.setLayout(new FlowLayout());
        mail.setPreferredSize(new Dimension (840,520));
        zmail.setLayout(null);
        zmail.setPreferredSize(new Dimension (820,480));
        messageRec1.setBounds(50,25,700,25);
        messageRec1.setBackground(Color.WHITE);
        messageRec1.setLayout(new FlowLayout());
        messageRec1.setPreferredSize(new Dimension(600,50));
        messageRec1.setVisible(false);
        messageRec2.setBounds(50,60,700,25);
        messageRec2.setLayout(new FlowLayout());
        messageRec2.setBackground(Color.WHITE);
        messageRec2.setPreferredSize(new Dimension(600,50));
        messageRec2.setVisible(false);
        messageRec3.setBounds(50,95,700,25);
        messageRec3.setLayout(new FlowLayout());
        messageRec3.setBackground(Color.WHITE);
        messageRec3.setPreferredSize(new Dimension(600,50));
        messageRec3.setVisible(false);
        messageRec4.setBounds(50,130,700,25);
        messageRec4.setLayout(new FlowLayout());
        messageRec4.setBackground(Color.WHITE);
        messageRec4.setPreferredSize(new Dimension(600,50));
        messageRec4.setVisible(false);
        messageRec1.add(fromRec1);
        messageRec1.add(titleRec1);
        messageRec1.add(dateSent1);
        messageRec1.add(dateRec1);
        messageRec2.add(fromRec2);
        messageRec2.add(titleRec2);
        messageRec2.add(dateSent2);
        messageRec2.add(dateRec2);
        messageRec3.add(fromRec3);
        messageRec3.add(titleRec3);
        messageRec3.add(dateSent3);
        messageRec3.add(dateRec3);
        messageRec4.add(fromRec4);
        messageRec4.add(titleRec4);
        messageRec4.add(dateSent4);
        messageRec4.add(dateRec4);
        previous.setBounds(250,350,100,25);
        next.setBounds(450,350,100,25);
        zmail.add(messageRec1);
        zmail.add(messageRec2);
        zmail.add(messageRec3);
        zmail.add(messageRec4);
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
    public void actionPerformed(ActionEvent e){
        String sender = fromTextField.getText();
        String receiver = toTextField.getText();
        String msgTitle = titleTextField.getText();
        String msgSent = messageArea.getText();
        try{
            FileWriter myWriter = new FileWriter("emailDB.txt", true);
            BufferedWriter bWriter = new BufferedWriter(myWriter);
            PrintWriter pWriter = new PrintWriter(bWriter);
            pWriter.write(sender+","+receiver+","+msgTitle+","+msgSent+"\r");
            pWriter.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }  
        fromTextField.setText(nameOfUser);
        toTextField.setText("");
        titleTextField.setText("");
        messageArea.setText("");
    }

    public void populateMail(){
		try{
            int emailNum = 0;
            File myFile = new File("emailDB.txt");
			Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                emails[emailNum] = (data);
				String [] message = data.split(","); 
				if(message[0].equals(nameOfUser)){
                    emailNum += 1;
				}
			}
            myReader.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        
        System.out.println(emails[0]);

        for(int i = 0; i < emails.length-1; i++){
            String subMsg = emails[i];
            String [] subMsgSplit = subMsg.split(",");
            if(i == 0){
                messageRec1.setVisible(true); 
                fromRec1.setText(subMsgSplit[1]);
                titleRec1.setText(subMsgSplit[2]);
            }
            if(i == 1){
                messageRec2.setVisible(true); 
                fromRec2.setText(subMsgSplit[1]);
                titleRec2.setText(subMsgSplit[2]);
            }
            if(i == 3){
                messageRec2.setVisible(true); 
                fromRec2.setText(subMsgSplit[1]);
                titleRec2.setText(subMsgSplit[2]);
            }
            if(i == 4){
                messageRec3.setVisible(true); 
                fromRec3.setText(subMsgSplit[1]);
                titleRec4.setText(subMsgSplit[2]);
            }
        }
    }
}//214