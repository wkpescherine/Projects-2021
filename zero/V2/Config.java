import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Config{
    String date = "None"; 
    double version = 2.0;
    String tempId = "none";

    Config(){
        getDate();
        getTempId();
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
        System.out.println(createId);
    }
}//33