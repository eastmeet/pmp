import javax.swing.plaf.BorderUIResource;
import java.util.*;

public class Main {
    public static final Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        int hour = kb.nextInt();
        int minute = kb.nextInt();
        int cookingTime = kb.nextInt();
        int diff = (minute + cookingTime) / 60;
        hour = hour + diff;
        if (hour == 24) {
            hour = 0;
        } else if (hour > 24) {
            hour -= 24;
        }
        minute = minute + cookingTime - 60 * diff;
        System.out.println(hour +" " + minute);
    }
}