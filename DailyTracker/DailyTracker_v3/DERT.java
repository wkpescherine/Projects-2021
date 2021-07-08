import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class DERT {
    JFrame window = new JFrame("DeRT");
    DERT(){
        window.setLayout(new FlowLayout());
		window.setSize(500, 750);
		window.getContentPane().setBackground(Color.BLACK);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setResizable(false);
    }

    public static void main(String args[]){
        DERT dert = new DERT();
    }
}