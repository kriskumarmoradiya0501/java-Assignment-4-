import java.util.Scanner;

class employee1{
    double salary;
    float hours;
    public void getinfo(double salary,float hours){
        this.salary=salary;
        this.hours=hours;
    }
    public void addsal(){
        if(salary<500){
            salary=salary+10;
            System.out.println("New salary of Employee is "+salary);
        }
    }
    public void addwork(){
        if(hours>6){
            salary=salary+5;
            System.out.println("Added Salary is "+salary);
        }
    }
}

public class Q_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Employee Salary : ");
        double salary = s.nextDouble();
        System.out.println("Enter Working hours of Employee : ");
        float hours = s.nextFloat();

        employee1 e = new employee1();

        e.getinfo(salary,hours);
        e.addsal();
        e.addwork();

    }
}
