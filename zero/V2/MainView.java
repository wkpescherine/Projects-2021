import java.awt.*;
import javax.swing.*;
//import javax.tools.*;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.BufferedWriter;
//import java.io.PrintWriter;
//import java.io.IOException;

public class MainView {
	MailView mailView = new MailView();

	JPanel main = new JPanel();
	JPanel display = new JPanel();
	JButton close = new JButton("Exit");
	JButton mail = new JButton("Mail");
	JButton home  = new JButton("Home");
	JButton blank  = new JButton("");
	JButton blank1  = new JButton("");
	JButton blank2  = new JButton("");
	JButton blank3  = new JButton("");
	JButton about2 = new JButton("About");
	JButton searchBtn = new JButton("search");
	JTextField search = new JTextField(50);
	
	MainView(){
		main.setLayout(new FlowLayout());
		main.setBackground(Color.BLACK);
		main.setPreferredSize(new Dimension (860,540));
		display.setPreferredSize(new Dimension (750,520));
		close.setPreferredSize(new Dimension(60,60));
		close.setFont(new Font("Serif", Font.PLAIN,12));
		mail.setPreferredSize(new Dimension(60,60));
		mail.setFont(new Font("Serif", Font.PLAIN, 12));
		about2.setPreferredSize(new Dimension(80,60));
		about2.setFont(new Font("Serif", Font.PLAIN,12));
		searchBtn.setPreferredSize(new Dimension(90,20));
		searchBtn.setFont(new Font("Serif", Font.PLAIN, 12));
		home.setPreferredSize(new Dimension(60,60));
		blank.setPreferredSize(new Dimension(60,60));
		blank1.setPreferredSize(new Dimension(60,60));
		blank2.setPreferredSize(new Dimension(60,60));
		blank3.setPreferredSize(new Dimension(60,60));
		display.add(mailView.mail);
		main.add(home);
		main.add(mail);
		main.add(close);
		main.add(about2);
		main.add(blank);
		main.add(blank1);
		main.add(blank2);
		main.add(blank3);
		main.add(search);
		main.add(searchBtn);
		main.add(display);
		main.setVisible(false);
	};

	public void Home(){
		mailView.mail.setVisible(false);
	}
}//62