package timeapi;

import java.time.*;
import java.util.*;

public class TimePractice {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.getMonth()+"/"+localDateTime.getDayOfMonth()+"/"
        +localDateTime.getYear());

        System.out.println(localDateTime);

        System.out.println(localDateTime.getMonthValue());

        String stringDateTime = localDateTime.toString();

        String s1 = String.format("%t", stringDateTime);
        System.out.println(s1);
    }
}
