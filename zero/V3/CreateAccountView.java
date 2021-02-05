import java.awt.*;
import javax.swing.*;
import java.lang.String;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreateAccountView {
	JPanel create = new JPanel();
    JButton logIn = new JButton("Log In");
    JButton back = new JButton("Back");
    JButton newAccount = new JButton("Create Account");
    JLabel username = new JLabel("Username");
	JLabel password = new JLabel("Password");
	JTextField username3 = new JTextField(20);
	JTextField password3 = new JTextField(20);
	JLabel createResult = new JLabel("");
	int checkValue = 0;

    CreateAccountView(){

        create.setLayout(new FlowLayout());
		create.setBackground(Color.BLACK);
		username.setForeground(Color.WHITE);
		password.setForeground(Color.WHITE);
		createResult.setForeground(Color.WHITE);
		create.setPreferredSize(new Dimension(300,560));
		newAccount.setPreferredSize(new Dimension(150,40));
		back.setPreferredSize(new Dimension(150,40));
		username3.setHorizontalAlignment(SwingConstants.CENTER);
		password3.setHorizontalAlignment(SwingConstants.CENTER);
		newAccount.setHorizontalAlignment(SwingConstants.CENTER);		
		back.setHorizontalAlignment(SwingConstants.CENTER);		
        create.add(username);
		create.add(username3);
		create.add(password);
		create.add(password3);
		create.add(newAccount);
		create.add(back);
		create.add(createResult);
		create.setVisible(false);
	}

	public void checkStatus(){
		checkValue = 0;
		String newUser = username3.getText();
		String newPass = password3.getText();
		String [] usercheck;

		try{
            File myFile = new File("accountDB.txt");
			Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
				String data = myReader.nextLine();
				usercheck = data.split(","); 
				if(usercheck[0].equals(newUser)){
					createResult.setText("This Username already exist");
					checkValue += 1;
				}
			}
            myReader.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
		}
		
		if(checkValue < 1){
			System.out.println(checkValue);
			try{
				FileWriter myWriter = new FileWriter("accountDB.txt", true);
				BufferedWriter bWriter = new BufferedWriter(myWriter);
				PrintWriter pWriter = new PrintWriter(bWriter);
				pWriter.write(newUser+","+newPass+"\r");
				pWriter.close();
				create.setVisible(false);
			}catch(IOException ioe){
				ioe.printStackTrace();
			}  
		} else {
			createResult.setText("Failed to create account");
		}
	}
}//83