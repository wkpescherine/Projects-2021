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
	Bank bankView = new Bank();
	Settings settingView = new Settings();
	String itemsArray [] ={"item1","310","240", "item2","310","240","item3","630","200"};

	JPanel main = new JPanel();
	JPanel display = new JPanel();
	JButton close = new JButton("Exit");
	JButton mail = new JButton("Mail");
	JButton home  = new JButton("Home");
	JButton bank  = new JButton("Bank");
	JButton retail  = new JButton("Retail");
	JButton settings  = new JButton("Settings");
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
		bank.setPreferredSize(new Dimension(60,60));
		settings.setPreferredSize(new Dimension(60,60));
		retail.setPreferredSize(new Dimension(60,60));
		display.add(mailView.mail);
		display.add(siteView.site);
		display.add(chatView.chat);
		display.add(bankView.bank);
		display.add(settingView.setting);

		bank.addActionListener(this);

		settings.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					mailView.mail.setVisible(false);
					siteView.site.setVisible(false);
					chatView.chat.setVisible(false);
					bankView.bank.setVisible(false);
					settingView.setting.setVisible(true);
				}
			}
		);

		main.add(home);
		main.add(mail);
		main.add(chat);
		main.add(bank);
		main.add(retail);
		main.add(about2);
		main.add(settings);
		main.add(close);
		main.add(search);
		main.add(searchBtn);
		main.add(display);
		main.setVisible(false);
	}

	public void Home(){
		mailView.mail.setVisible(false);
		siteView.site.setVisible(true);
		chatView.chat.setVisible(false);
	}

	public void actionPerformed(ActionEvent e){
		mailView.mail.setVisible(false);
		siteView.site.setVisible(false);
		chatView.chat.setVisible(false);
		bankView.bank.setVisible(true);
		settingView.setting.setVisible(false);
		//siteView.panelBuilder(itemsArray);
	}
}//80