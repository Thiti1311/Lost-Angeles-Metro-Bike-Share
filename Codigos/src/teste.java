
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class teste {

    public static void main(String[] args) {
        String data = "05/10/2020";
        String data1 = "07/07/2020";
        try {
            SimpleDateFormat sdformat = new 
                SimpleDateFormat("dd/MM/yyyy");
            Date date1 = sdformat.parse(data);
            Date date2 = sdformat.parse(data1);
            System.out.println(
                "Date-1: " + sdformat.format(date1));
            System.out.println(
                "Date-2: " + sdformat.format(date2));
                if(date1.compareTo(date2) < 0) {
                System.out.println(
                    date1.compareTo(date2));
            } else if(date1.compareTo(date2) > 0) {
                System.out.println(
                    "Date-1 is before Date-2");
            } else if(date1.compareTo(date2) == 0) {
                System.out.println(
                    "Date-1 is same as Date-2");
            } 
        } catch (ParseException ex) {
        }
    }
}