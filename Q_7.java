
import java.util.Scanner;

class employee{
    String name;
    byte age;
    String des;
    float salary;

    employee(String name,byte age,String des,float salary) {
        this.name = name;
        this.age = age;
        this.des = des;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Age : "+age);
        System.out.println("Employee Designation : "+des);
        System.out.println("Employee Salary : "+salary);
    }

}

public class Q_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Employee Name : ");
        String name = s.nextLine();
        System.out.println("Enter Employee Age : ");
        byte age = s.nextByte();
        s.nextLine();
        System.out.println("Enter Employee Designation : ");
        String des = s.nextLine();
        System.out.println("Enter Employee Salary : ");
        float salary = s.nextFloat();

        employee e = new employee(name, age, des, salary);
        e.display();
    }
}
