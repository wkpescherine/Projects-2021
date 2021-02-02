import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainView implements ActionListener{
	MailView mailView = new MailView();
	ChatView chatView = new ChatView();
	Site siteView = new Site();
	Bank bankView = new Bank();
	Retail retailView = new Retail();
	Settings settingView = new Settings();
	About2 about2View = new About2();
	Home homeView = new Home();

	String itemsArray1 [] ={"item1","310","240", "item2","310","240","item3","630","200"};
	String itemsArray2 [] ={"item1","200","440", "item2","200","440","item3","200","440"};

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
		search.setHorizontalAlignment(SwingConstants.CENTER);
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
		display.add(retailView.retail);
		display.add(about2View.about2);
		display.add(settingView.setting);
		display.add(homeView.home);

		bank.addActionListener(this);

		retail.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					mailView.mail.setVisible(false);
					siteView.site.setVisible(false);
					chatView.chat.setVisible(false);
					bankView.bank.setVisible(false);
					homeView.home.setVisible(false);
					retailView.retail.setVisible(true);
					about2View.about2.setVisible(false);
					settingView.setting.setVisible(false);
				}
			}
		);

		settings.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					mailView.mail.setVisible(false);
					siteView.site.setVisible(false);
					chatView.chat.setVisible(false);
					bankView.bank.setVisible(false);
					homeView.home.setVisible(false);
					retailView.retail.setVisible(false);
					about2View.about2.setVisible(false);
					settingView.setting.setVisible(true);
				}
			}
		);

		about2.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					mailView.mail.setVisible(false);
					siteView.site.setVisible(false);
					chatView.chat.setVisible(false);
					bankView.bank.setVisible(false);
					homeView.home.setVisible(false);
					about2View.about2.setVisible(true);
					retailView.retail.setVisible(false);
					settingView.setting.setVisible(false);
				}
			}
		);

		searchBtn.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					mailView.mail.setVisible(false);
					siteView.site.setVisible(true);
					chatView.chat.setVisible(false);
					bankView.bank.setVisible(false);
					homeView.home.setVisible(false);
					about2View.about2.setVisible(false);
					retailView.retail.setVisible(false);
					settingView.setting.setVisible(false);
					String zsite = search.getText();
					if(zsite.equals("test1.zero")){
						siteView.panelBuilder(itemsArray1);						
					}
					if(zsite.equals("test2.zero")){
						siteView.panelBuilder(itemsArray2);
					}
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
		siteView.site.setVisible(false);
		chatView.chat.setVisible(false);
		homeView.home.setVisible(true);
		bankView.bank.setVisible(false);
		about2View.about2.setVisible(false);
		retailView.retail.setVisible(false);
		settingView.setting.setVisible(false);
	}

	public void actionPerformed(ActionEvent e){
		mailView.mail.setVisible(false);
		siteView.site.setVisible(false);
		chatView.chat.setVisible(false);
		homeView.home.setVisible(false);
		bankView.bank.setVisible(true);
		about2View.about2.setVisible(false);
		retailView.retail.setVisible(false);
		settingView.setting.setVisible(false);
	}
}//163