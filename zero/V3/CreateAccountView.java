import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.String;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class CreateAccountView implements ActionListener{
    JPanel create = new JPanel();
    JButton logIn = new JButton("Log In");
    JButton back = new JButton("Back");
    JButton newAccount = new JButton("Create Account");
    JLabel username = new JLabel("Username");
	JLabel password = new JLabel("Password");
	JTextField username3 = new JTextField(20);
	JTextField password3 = new JTextField(20);

	MainView mainView = new MainView();

    CreateAccountView(){
		newAccount.addActionListener(this);

        create.setLayout(new FlowLayout());
		create.setBackground(Color.BLACK);
		username.setForeground(Color.WHITE);
		password.setForeground(Color.WHITE);
		create.setPreferredSize(new Dimension(100,560));
		back.setPreferredSize(new Dimension(80,60));
		username3.setHorizontalAlignment(SwingConstants.CENTER);
		password3.setHorizontalAlignment(SwingConstants.CENTER);		
        create.add(username);
		create.add(username3);
		create.add(password);
		create.add(password3);
		create.add(newAccount);
		create.add(back);
		create.setVisible(false);
	}
	
	public void actionPerformed(ActionEvent e){
		String newUser = username3.getText();
		String newPass = password3.getText();
		int checkValue = 0;
		searchForDupAccount(newUser);
		if(checkValue == 1){
			try{
				FileWriter myWriter = new FileWriter("accountDB.txt", true);
				BufferedWriter bWriter = new BufferedWriter(myWriter);
				PrintWriter pWriter = new PrintWriter(bWriter);
				pWriter.write(newUser+"|"+newPass+"\r");
				pWriter.close();
				create.setVisible(false);
				mainView.main.setVisible(true);
				System.out.print("new Account Created");
			}catch(IOException ioe){
				ioe.printStackTrace();
			}  
		} else {
			System.out.print("Failed to create account");
		}
	}

	public void searchForDupAccount(String findUser){
		System.out.print("Searched for " + findUser);
	}
}//68