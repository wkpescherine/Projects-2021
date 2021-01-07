import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.tools.*;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.BufferedWriter;
//import java.io.PrintWriter;
//import java.io.IOException;

public class MainView implements ActionListener{
	MailView mailView = new MailView();
	ChatView chatView = new ChatView();
	Site siteView = new Site();
	String itemsArray [] ={"item1","310","240", "item2","310","240","item3","630","200"};

	JPanel main = new JPanel();
	JPanel display = new JPanel();
	JButton close = new JButton("Exit");
	JButton mail = new JButton("Mail");
	JButton home  = new JButton("Home");
	JButton blank  = new JButton("");
	JButton blank1  = new JButton("");
	JButton blank2  = new JButton("");
	JButton chat  = new JButton("Chat");
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
		chat.setPreferredSize(new Dimension(60,60));
		blank.setPreferredSize(new Dimension(60,60));
		blank1.setPreferredSize(new Dimension(60,60));
		blank2.setPreferredSize(new Dimension(60,60));
		display.add(mailView.mail);
		//display.add(siteView.site);
		display.add(chatView.chat);

		main.add(home);
		main.add(mail);
		main.add(chat);
		main.add(about2);
		main.add(close);
		main.add(blank);
		main.add(blank1);
		main.add(blank2);
		main.add(search);
		main.add(searchBtn);
		main.add(display);
		main.setVisible(false);

		blank.addActionListener(this);

		blank2.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					display.setLayout(new FlowLayout());
					panelBuilder(itemsArray);
				}
			}
		);
	};

	public void Home(){
		mailView.mail.setVisible(false);
		siteView.site.setVisible(false);
		chatView.chat.setVisible(false);
	}

	public void actionPerformed(ActionEvent e){
		JPanel newPanel = siteView.site;
		JPanel npan = new JPanel();
		newPanel.setLayout(new FlowLayout());
		System.out.println("Clicked on the blank");
		siteView.changeText("This si a new text to see what happens");
		npan.setPreferredSize(new Dimension(80,60));
		npan.setBackground(Color.WHITE);
		newPanel.add(npan);
		display.add(newPanel);
		display.revalidate();
	}

	public void panelBuilder(String [] array){
		display.removeAll();
		//int num = x;
		int start = array.length;
		JPanel jpanel[] = new JPanel[start];

		for(int i = 0; i <array.length; ){
			jpanel[i] = new JPanel();
			//int sizeVar = (i+1)*50;
			JPanel test = jpanel[i];
			int val1 = Integer.parseInt(array[i+1]);
			int val2 = Integer.parseInt(array[i+2]);
			test.setPreferredSize(new Dimension (val1,val2));
			test.setBackground(Color.WHITE);
			System.out.println("Clicked on the blank2");
			display.add(test);
			i += 3;
		}
		display.validate();
		display.repaint();
	}
}//117