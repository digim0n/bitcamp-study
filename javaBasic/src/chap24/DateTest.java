package chap24;

import java.time.*;

public class DateTest {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2018, 7, 12));

        ZoneOffset offset = ZoneOffset.ofHours(9);
        System.out.println(offset);

        System.out.println(OffsetDateTime.of(2018, 8, 11, 13, 30, 45, 250, offset));

        System.out.println(LocalDate.now());
    }
}
