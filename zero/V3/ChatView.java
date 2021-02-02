import java.awt.*;
import javax.swing.*;

public class ChatView{
    String chatmessage = "You are in the chat section";

    JPanel chat = new JPanel();
    JPanel sideBar = new JPanel();
    JPanel chatPanel = new JPanel();
    JLabel chatMessage = new JLabel(chatmessage);

    ChatView(){
        chat.setLayout(new FlowLayout());
        sideBar.setLayout(new FlowLayout());
        chatPanel.setLayout(new FlowLayout());
        chat.setPreferredSize(new Dimension (840,520));
        sideBar.setPreferredSize(new Dimension (300,520));
        chatPanel.setPreferredSize(new Dimension (520,520));
        sideBar.setBackground(Color.WHITE);
        chatPanel.setBackground(Color.WHITE);
        chatPanel.add(chatMessage);
        chat.add(sideBar);
        chat.add(chatPanel);
        chat.setVisible(false);
    }
}//26