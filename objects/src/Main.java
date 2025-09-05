import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//date
        Date currentDate = new Date();
        Date anotherDate = new Date();
        String anotherDateString = anotherDate.toString();
        anotherDate.setTime(123478);
        boolean isBefore = currentDate.before(anotherDate);
        System.out.println(isBefore);

//scanner

        Scanner myScanner = new Scanner(System.in);
        String resString = myScanner.nextLine();
        System.out.println(resString);
        resString = myScanner.next();
        System.out.println(resString);

    }



}