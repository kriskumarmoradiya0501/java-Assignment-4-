import java.util.Scanner;

class Salary{
    String empno;
    String empname;
    float basic;
    Salary(String empno,String empname,float basic){
        this.empno=empno;
        this.empname=empname;
        this.basic=basic;
    }
    public void process(){
        double DA = 0.50 * basic;
        double HRA = 0.25 * basic;
        double CCA = 240;
        double PF = 0.10 * basic;
        double PT = 100;

        double grosssalary = basic + DA + HRA + CCA;
        double netsalary = grosssalary - (PF + PT);

        System.out.println("\nEmployee Details:");
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + empname);
        System.out.println("Basic Salary: " + basic);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("CCA: " + CCA);
        System.out.println("PF: " + PF);
        System.out.println("PT: " + PT);
        System.out.println("Gross Salary: " + grosssalary);
        System.out.println("Net Salary: " + netsalary);
    }
}

public class Q_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Employee Number: ");
        String empno = s.nextLine();
        System.out.println("Enter Employee Name : ");
        String empname = s.nextLine();
        System.out.println("Enter Employee Basic Salary : ");
        float basic = s.nextFloat();

        Salary s1 = new Salary(empno,empname,basic);
        s1.process();

    }
}
