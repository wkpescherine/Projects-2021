import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;

public class ChatView implements ActionListener{
    String personToMessage = "";

    JPanel chat = new JPanel();
    JPanel sideBar = new JPanel();
    JPanel chatPanel = new JPanel();
    JPanel personInvites = new JPanel();
    JPanel messagePanel = new JPanel();
    JLabel messagePerson = new JLabel("Send To :"+personToMessage);
    JTextField messageArea = new JTextField();
    JTextField findPersonArea = new JTextField(10);
    JButton findPersonBtn = new JButton("Find");
    JButton sendMessage = new JButton("Message");

    ChatView(){
        findPersonBtn.addActionListener(this);

        chat.setLayout(new FlowLayout());
        chat.setPreferredSize(new Dimension (640,440));
        sideBar.setLayout(new FlowLayout());
        sideBar.setPreferredSize(new Dimension (200,420));
        sideBar.setBackground(Color.WHITE);
        sideBar.add(findPersonArea);
        sideBar.add(findPersonBtn);
        chatPanel.setLayout(new FlowLayout());
        chatPanel.setPreferredSize(new Dimension (400,420));
        chatPanel.setBackground(Color.WHITE);
        messagePanel.setLayout(null);
        messagePanel.setPreferredSize(new Dimension (380,90));
        messagePerson.setBounds(10, 10, 100, 20);
        sendMessage.setBounds(200, 10, 100, 20);
        messageArea.setBounds(10, 40, 350, 50);
        messagePanel.add(messagePerson);
        messagePanel.add(sendMessage);
        messagePanel.add(messageArea);
        chatPanel.add(messagePanel);
        chat.add(sideBar);
        chat.add(chatPanel);
        chat.setVisible(false);
    }
    public void actionPerformed(ActionEvent e){
        String invitePerson = findPersonArea.getText();
        try{
            FileWriter myWriter = new FileWriter("friendsListDB.txt", true);
            BufferedWriter bWriter = new BufferedWriter(myWriter);
            PrintWriter pWriter = new PrintWriter(bWriter);
            pWriter.write(invitePerson+"\r");
            pWriter.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        } 
        findPersonArea.setText("");
        System.out.println("Invited a person");
    }
}//66