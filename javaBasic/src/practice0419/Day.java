package practice0419;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Day {
    private LocalDate date;

    public Day (){
        this.date = LocalDate.now();
    }

    public Day(int year, int month, int day) throws DateTimeException{
        if(month < 1){
            month = 1;
        }else if (month > 12) {
            month = 12;
        }
        this.date = LocalDate.of(year, month, day);
    }

    //윤년인지 판단하는 매서드
    public void isLeap(){
        if(date.isLeapYear() == true){
            System.out.println("윤년입니다.");
        }else{
            System.out.println("윤년이 아닙니다.");
        }
    }

    //올해 몇일이 지났는지 계산하는 매서드
    public void howManyDaysPassed(){
        LocalDate firstDay = LocalDate.of(date.getYear(), 1, 1);
        firstDay = firstDay.minusDays(1);
        System.out.println("년도 내 경과일수: "+ChronoUnit.DAYS.between(firstDay, date));
    }

    //올해 몇일이 남았는지 계산하는 매서드
    public void howManyDaysLeft(){
        LocalDate lastDay = LocalDate.of(date.getYear(), 12, 31);
        lastDay = lastDay.plusDays(1);
        System.out.println("년도 내 남은일수: "+ChronoUnit.DAYS.between(date, lastDay));
    }

    //주어진 날짜보다 전인지 후인지 계산하는 매서드
    public void isBeforeAfter(LocalDate date2){
        if(date.compareTo(date2) < 0){
            System.out.println(date+"이 전날입니다.");
        } else if (date.compareTo(date2) == 0) {
            System.out.println("같은 날입니다.");
        } else {
            System.out.println(date+"이 다음 날 입니다.");
        }
    }

    //현재 날짜를 리턴하는 메서드
    public LocalDate getDate() {
        return date;
    }

    //날짜에 하루 더하는 매서드
    public void addDayByOne(){
        date = date.plusDays(1);
    }

    //날짜에 하루 더한 날을 리턴하는 매서드
    public LocalDate returnNextDay(){
        return date.plusDays(1);
    }

    //날짜를 하루 앞으로 변경하는 매서드
    public void subDayByOne(){
        date = date.minusDays(1);
    }

    //하루 전날을 리턴하는 매서드
    public LocalDate returnDayBefore(){
        return date.minusDays(1);
    }

    //n일만큼 뒤로 변경하는 매서드
    public void addDays(int n){
        date = date.plusDays(n);
    }

    public LocalDate addDaysReturn(int n){
        return date.plusDays(n);
    }

    public void subDays(int n){
        date = date.minusDays(n);
    }

    public LocalDate subDaysReturn(int n){
        return date.minusDays(n);
    }
}
