package practice0419;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DayTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("날짜를 입력하세요.");
        System.out.print("년도: ");
        int year = sc.nextInt();
        System.out.print("월: ");
        int month = sc.nextInt();
        System.out.print("일: ");
        int day = sc.nextInt();

        try {
            Day date = new Day(year, month, day);
            LocalDate currDate = date.getDate();

            System.out.print("[1]날짜관련정보 표시 [2]날짜변경 [3]다른 날짜와의 비교 [4]전후 날짜 [5]종료: ");
            int option = sc.nextInt();

            switch(option){
                case 1:
                    System.out.println(currDate.getYear()+"년 "+currDate.getMonthValue()+"월 "
                            +currDate.getDayOfMonth()+"일 ("+currDate.getDayOfWeek()
                            .getDisplayName(TextStyle.SHORT, Locale.KOREAN)+") 에 관한 정보");
                    date.isLeap();
                    date.howManyDaysPassed();
                    date.howManyDaysLeft();
                    break;
                case 2:
                    System.out.print("더하거나 뺼 날짜:");
                    int diff = sc.nextInt();
                    if(diff < 0){
                        diff = Math.abs(diff);
                        date.subDays(diff);
                        System.out.println(diff+"일 만큼 뺀 날짜는: "+date.getDate());
                    }else{
                        date.addDays(diff);
                        System.out.println(diff+"일 만큼 더한 날짜는: "+date.getDate());
                    }
                    break;
                case 3:
                    System.out.println("비교하고 싶은 날짜를 입력하시오.");
                    System.out.print("년도: ");
                    year = sc.nextInt();
                    System.out.print("월: ");
                    month = sc.nextInt();
                    System.out.print("일: ");
                    day = sc.nextInt();
                    Day date2 = new Day(year, month, day);
                    date.isBeforeAfter(date2.getDate());
                    break;
                case 4:
                    System.out.println("전 날짜는: "+date.returnDayBefore());
                    System.out.println("다음 날짜는: "+date.returnNextDay());
                    break;
                case 5:
                    System.out.println("종료되었습니다.");
                    break;
                default:
                    System.out.println("없는 옵션입니다.");
                    break;
            }
        }catch(DateTimeException e){
            System.out.println(e);
        }
    }
}
