package pratice0325;

public class Practice1 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setData(1234, "홍길동");

        System.out.println("직원번호: " + employee.getId());

        System.out.println("사원명: " + employee.getName());
    }
}

class Employee {
    private int employeeNum;
    private String employeeName;

    public void setData(int employeeNum, String employeeName){
        this.employeeNum = employeeNum;
        this.employeeName = employeeName;
    }

    public int getId(){
        return this.employeeNum;
    }

    public String getName(){
        return this.employeeName;
    }
}
