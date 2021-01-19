import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
//import javax.tools.*;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.BufferedWriter;
//import java.io.PrintWriter;
//import java.io.IOException;

public class Config{
    ConfigFile configFile = new ConfigFile();

    String date = "None"; 
    double version = 0.0;
    String tempId = "none";

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
        tempId = createId;
    }

    public void updateVersion(){
        if(configFile.version < version){
            version = 2.0;
        }
    }

    public void updateConfigFile(){
        
    }
}//53