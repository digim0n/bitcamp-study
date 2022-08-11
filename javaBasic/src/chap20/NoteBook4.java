package chap20;

public class NoteBook4 extends Computer2{
    private String useType; // 용도유형

    // 생성자(인수없음)
    public NoteBook4() {
        this.useType = null;
        System.out.println("노트북을 만들었습니다.");
    }
    // 생성자(인수있음)
    public NoteBook4(String os, int memory, String useType){
        //슈퍼클래스의 생성자 호출
        super(os, memory);
        this.useType = useType;
        System.out.println("유형은 " + this.useType + "에 대한 노트북을 만들었습니다.");
    }

    public void setUseType(String useType){
        this.useType = useType;
        System.out.println("유형은 " + this.useType + "을 사용했습니다.");
    }

    public void showInfo(){
        System.out.println("이 노트북의 OS는 " + super.os + "입니다.");
        System.out.println("메모리 크기는 " + super.memory + "GB입니다.");
        System.out.println("유형은 " + this.useType + "입니다.");
    }
}
