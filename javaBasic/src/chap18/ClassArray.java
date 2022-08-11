package chap18;

public class ClassArray {
    public static void main(String[] args) {
        // 클래스형 배열 선언
        Computer1[] coms = new Computer1[3];

        // 반복을 이용하여 배열요소에 객체를 전달함
        for(int i=0;i<coms.length;i++){
            coms[i] = new Computer1();
        }

        //각 배열요소의 객체에서 메소드 호출
        coms[0].setComputer("Windows11", 32);
        coms[1].setComputer("Windows10", 16);
        coms[2].setComputer("WindowsXP", 8);

        //반복을 이용하여 각 겍체 정보를 표시
        for(int i=0;i<coms.length;i++){
            coms[i].show();
        }
    }
}
