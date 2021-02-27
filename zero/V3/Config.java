import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
//import javax.tools.*;
//import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Config{
    String date ;
	Double version = 3.0;
	String tempId ;
	int width = 640;
	int height = 480;
	String username ;

    Config(){
     /*   getDate();
        getTempId();
        updateVersion();
        updateConfigFile();*/
    }

    public void getDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date newDate = new Date();
        date = formatter.format(newDate);
    }

    public void getTempId(){
        String createId = "";
        for(int a = 0; a< 25; a++){
            String val = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            Random rand = new Random();
            int num = val.length();
            String randomVal = Character.toString(val.charAt(rand.nextInt(num)));
            createId += randomVal;
        }
        tempId = createId;
    }

    public void updateVersion(){
        if(version!= 3){
            version = 3.0;
        }
    }

    public void updateConfigFile(){
		//File f = new File("ConfigFile.java");
        try{
            FileWriter myWriter = new FileWriter("ConfigFile.java", true);
            BufferedWriter bWriter = new BufferedWriter(myWriter);
            PrintWriter pWriter = new PrintWriter(bWriter);
            for(int a = 0; a< 2; a++){
                pWriter.write("Delete this \r");    
            }
            pWriter.close();
            System.out.println("File updated");
        }catch(IOException e){
            e.printStackTrace();  
		}
    }
}//65