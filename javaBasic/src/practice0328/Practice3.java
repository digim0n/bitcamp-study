package practice0328;

public class Practice3 {
  public static void main(String[] args) {
    Clock c1 = new Clock(10, 15, 30);
    c1.showData();
    System.out.println();

    AlarmClock c2 = new AlarmClock(15, 45, 20, 6, 30);
    c2.showData();
  }
}

class Clock{
  private int hour;             //c2   15
  private int minute;           //c2   45
  private int second;           //c2   20

  public Clock(int hour, int minute, int second){
    //              15        45          20
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public void showData() {
    System.out.println("현재 시간:" + hour + "시" + minute + "분" + second + "초");
  }
}

class AlarmClock extends Clock{
  private int alarmHour;            //c2   6
  private int alarmMinute;          //c2   30

  public AlarmClock(int hour, int minute, int second, int alarmHour, int alarmMinute){
    //                   15         45           20          6              30
    super(hour, minute, second);
    //     15     45      20
    this.alarmHour = alarmHour;
    this.alarmMinute = alarmMinute;
  }

  @Override
  public void showData(){
    super.showData();
    System.out.println("알람 설정 시간: " + alarmHour + "시 " + alarmMinute + "분");
  }
}

//10시 15분 30초
//15시 45분 20초 6시간 30




