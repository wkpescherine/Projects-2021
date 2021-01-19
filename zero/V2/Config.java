import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.tools.*;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Config{
    ConfigFile configFile = new ConfigFile();

    String date = "None"; 
    double version = 0.0;
    String tempId = "none";

    String [] assets ={
        "public class ConfigFile{",
        "\tString date = ",
        "\tdouble version = ",
        "\tString tempId = ",
		"\tint width = 640",
		"\tint height = 480", 
		"}"
	};

    Config(){
        getDate();
        getTempId();
        updateVersion();
        updateConfigFile();
    }

    public void getDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date newDate = new Date();
        date = formatter.format(newDate);
        assets[1] = assets[1]+ date +"\";";
        System.out.println(date);
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
        assets[3] = assets[3]+ createId +"\";";
        tempId = createId;
    }

    public void updateVersion(){
        if(configFile.version < version){
            version = 2.0;
            assets[2] = assets[2]+ date +"\";";
        }
    }

    public void updateConfigFile(){
		File f = new File("ConfigFile.java");
        try{
            FileWriter myWriter = new FileWriter("ConfigFile.java", false);
            BufferedWriter bWriter = new BufferedWriter(myWriter);
            PrintWriter pWriter = new PrintWriter(bWriter);
            for(int a = 0; a< assets.length; a++){
                pWriter.write(assets[a]+"\r");    
            }
            pWriter.close();
            System.out.println("File updated");
        }catch(IOException e){
            e.printStackTrace();  
		}
    }
}//53