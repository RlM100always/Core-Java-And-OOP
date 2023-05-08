package dateAndTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate objld =  LocalDate.now();
        System.out.println("Current Date is : "+objld);

        LocalTime lt = LocalTime.now();
        System.out.println("Current Time is : "+lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Mixed of date and Time : "+ldt);

    }
}
