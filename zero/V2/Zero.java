import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.String;

public class Zero implements ActionListener{
	AboutView aboutView = new AboutView();
	StartView startView = new StartView();
	MainView mainView = new MainView();
	CreateAccountView accountView = new CreateAccountView();

    JFrame window = new JFrame("Zero v2");

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
					accountView.create.setVisible(false);
					mainView.main.setVisible(true);
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
		
		mainView.searchBtn.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.out.println("Go home");
				    mainView.Home();
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
		startView.start.setVisible(false);
		accountView.create.setVisible(false);
		mainView.main.setVisible(true);
	}

	public void exit(){
		mainView.main.setVisible(false);
		startView.start.setVisible(true);
	}

}//104