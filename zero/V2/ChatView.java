import java.awt.*;
import javax.swing.*;

public class ChatView{
    String chatMessage = "You are in the chat section";

    JPanel chat = new JPanel();
    JLabel chatmessage = new JLabel(chatMessage);

    ChatView(){
        chat.setLayout(new FlowLayout());
        chat.setPreferredSize(new Dimension (840,520));
        chat.add(chatmessage);
        chat.setVisible(false);
    }
}//0