import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.String;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zero implements ActionListener{
	AboutView aboutView = new AboutView();
	StartView startView = new StartView();
	MainView mainView = new MainView();
	CreateAccountView accountView = new CreateAccountView();
	Config config = new Config();

    JFrame window = new JFrame("Zero v3");

    Zero(){
		startView.createAcct.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					startView.start.setVisible(false);
					accountView.create.setVisible(true);
				}
			}
		);

		startView.startAbout.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					startView.start.setVisible(false);
					accountView.create.setVisible(false);
					aboutView.aboutSec.setVisible(true);
				}
			}
		);

		startView.updateSys.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					update();
				}
			}
		);

		startView.logIn.addActionListener(this);

		accountView.back.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					exit();
				}
			}
		);

		accountView.newAccount.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					accountView.checkStatus();
					if(accountView.checkValue < 1){
						mainView.main.setVisible(true);
					}
				}
			}
		);

		aboutView.aboutBack.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					aboutView.aboutSec.setVisible(false);
					startView.start.setVisible(true);
				}
			}
		);

		mainView.home.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
				    mainView.Home();
				}
			}
		);

		mainView.searchBtn.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					mainView.siteView.site.setVisible(true);
					mainView.mailView.mail.setVisible(false);
					mainView.chatView.chat.setVisible(false);
				}
			}
		);

		mainView.close.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					exit();
				}
			}
		);

		mainView.mail.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					mainView.mailView.mail.setVisible(true);
					mainView.chatView.chat.setVisible(false);
					mainView.siteView.site.setVisible(false);
				}
			}
		);

		mainView.mailView.inbox.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					mainView.mailView.zmail.setVisible(true);
					mainView.mailView.zcompose.setVisible(false);
				}
			}
		);

		mainView.mailView.compose.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					mainView.mailView.zmail.setVisible(false);
					mainView.mailView.zcompose.setVisible(true);
				}
			}
		);

		mainView.chat.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					mainView.chatView.chat.setVisible(true);
					mainView.siteView.site.setVisible(false);
					mainView.mailView.mail.setVisible(false);
				}
			}
		);

		window.add(startView.start);
		window.add(mainView.main);
		window.add(accountView.create);
		window.add(aboutView.aboutSec);
		window.setLayout(new FlowLayout());
        window.getContentPane().setBackground(Color.BLACK);
		window.setSize(900,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setResizable(false);
    }

    public static void main(String args[]){
		Zero zero = new Zero();
	}
	
	public void actionPerformed(ActionEvent e){
		String usernameEntered = startView.startEditUsername.getText();
		String passwordEntered = startView.startEditPassword.getText();
		String [] checklogin;

		try{
            File myFile = new File("accountDB.txt");
			Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
				String data = myReader.nextLine();
				checklogin = data.split(",");
				if(passwordEntered.equals(checklogin[1]) && usernameEntered.equals(checklogin[0])){
					startView.startEditPassword.setText("");
					startView.startEditUsername.setText("");
					startView.errorMessage.setText("");
					startView.start.setVisible(false);
					accountView.create.setVisible(false);
					mainView.main.setVisible(true);
				}else{
					startView.startEditPassword.setText("");
					startView.startEditUsername.setText("");
					startView.errorMessage.setText("You have entered incorrect information");
				} 
			}
            myReader.close();
        } catch (FileNotFoundException ioe){
            ioe.printStackTrace();
		}
	}

	public void exit(){
		mainView.main.setVisible(false);
		startView.start.setVisible(true);
	}

	public void update(){
		System.out.println("This is where we will have system updates");
		System.out.println("Eventually will add in the logic to update");
		System.out.println("At moment this is just placeholder");
	}
}//197