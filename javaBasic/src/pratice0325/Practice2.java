package pratice0325;

public class Practice2{
    public static void main(String[] args) {
        Pet pet1 = new Pet();

        pet1.setType("개");
        pet1.setName("해피");
        pet1.setAge((byte)4);
        pet1.setGender(false);

        System.out.println(pet1.getIntroduction());

        Pet pet2 = new Pet();

        pet2.setType("고양이");
        pet2.setName("야옹이");
        pet2.setAge((byte)2);
        pet2.setGender(true);

        System.out.println(pet2.getIntroduction());
    }
}

class Pet{
    //Field Variable
    private String type;
    private String name;
    private byte age;
    private boolean gender;

    public void setType(String type){
        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(byte age){
        this.age = age;
    }

    public void setGender(boolean gender){
        this.gender = gender;
    }

    public String getIntroduction(){
        String temp;

        temp = this.type + " " + this.name + "는 ";
        if(this.gender){
            temp += "암컷이고 ";
        }else{
            temp += "수컷으로 ";
        }
        temp += (int)this.age + "살입니다.";

        return temp;
    }
}
