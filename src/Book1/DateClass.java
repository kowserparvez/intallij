package Book1;
import java.text.*;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        int year = date.getYear()+1900;
        int month = date.getMonth()+1;
        int day = date.getDate();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

        SimpleDateFormat hmm = new SimpleDateFormat("yyyy:MM:dd");
        System.out.println(hmm.format(date));
    }
}
