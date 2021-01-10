import java.util.Date;
import java.text.SimpleDateFormat;

public class Config{
    String date = "None"; 
    double version = 2.0;
    String adId = "none";

    Config(){
        getDate();
    }

    public void getDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date newDate = new Date();
        date = formatter.format(newDate);
        System.out.println(date);
    }
}//19