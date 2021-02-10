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

public class ChatView implements ActionListener{
    String personToMessage = "";
    String chatUserName = "";
    String [] friendsList = new String[100];
    String [] invites = new String[100];

    JPanel chat = new JPanel();
    JPanel sideBar = new JPanel();
    JPanel chatPanel = new JPanel();
    JPanel friendsPanel = new JPanel();
    JPanel messagePanel = new JPanel();
    JLabel messagePerson = new JLabel("Send To :"+personToMessage);
    JTextField messageArea = new JTextField();
    JTextField findPersonArea = new JTextField(10);
    JButton invitePersonBtn = new JButton("Invite");
    JButton sendMessage = new JButton("Message");

    ChatView(){
        buildFriendsSection();
        invitePersonBtn.addActionListener(this);

        chat.setLayout(new FlowLayout());
        chat.setPreferredSize(new Dimension (640,440));
        sideBar.setLayout(new FlowLayout());
        sideBar.setPreferredSize(new Dimension (200,420));
        sideBar.setBackground(Color.WHITE);
        sideBar.add(findPersonArea);
        sideBar.add(invitePersonBtn);
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
            pWriter.write(chatUserName+"," +invitePerson+"," +"INVITE"+"\r");
            pWriter.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        } 
        findPersonArea.setText("");
        System.out.println("Invited a person");
    }

    public void buildFriendsSection(){
        try{
            int invitesNum = 0;
            File myFile = new File("friendsListDB.txt");
			Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                invites[invitesNum] = (data);
				String [] invite = data.split(","); 
				if(invite[1].equals(chatUserName)){
                    invitesNum += 1;
				}
			}
            myReader.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println(invites[0]);
        
        /*for(int i = 0; i < invites.length-1; i++){
            friendsPanel.removeAll();
            String subInvite = invites[i];
            String [] subInviteSplit = subInvite.split(",");
            if(subInviteSplit[1].equals(chatUserName)){
                friendsPanel.removeAll();
                int start = invites.length;
                JPanel jpanel[] = new JPanel[start];
                JLabel jlabel[] = new JLabel[start];
                for(int x = 0; x <invites.length; ){
                    jpanel[x] = new JPanel();
                    jlabel[x] = new JLabel();
                    JPanel test = jpanel[x];
                    JLabel testLabel = jlabel[x];
                    test.setPreferredSize(new Dimension (100,20));
                    test.setBackground(Color.RED);
                    test.add(testLabel);
                    System.out.println("Clicked on the blank2");
                    friendsPanel.add(test);
                }
                friendsPanel.validate();
                friendsPanel.repaint();
            }
        }*/
    }
}//114