
import java.util.Scanner;


class student2{
    String id;
    String name;
    String add;
    double marks1;
    double marks2;
    double marks3;
    student2(String id,String name,String add,double marks1,double marks2,double marks3){
        this.id = id;
        this.name=name;
        this.add = add;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }
    public void result(){
        System.out.println("Student Id : "+id);
        System.out.println("Student Name : "+name);
        System.out.println("Student Address : "+add);
        System.out.println("Student Marks1 : "+marks1);
        System.out.println("Student Marks2 : "+marks2);
        System.out.println("Student Marks3 : "+marks3);
        System.out.println("Student Total Marks =  : "+(marks1+marks2+marks3));
        System.out.println("Student Avarage Marks : "+(marks1+marks2+marks3)/3);
        System.out.println("Student result : "+(marks1+marks2+marks3)/3);
    }
}


public class Q_4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Student Id : ");
        String id = s.nextLine();
        System.out.println("Enter Student Name : ");
        String name = s.nextLine();
        System.out.println("Enter Student Address : ");
        String add = s.nextLine();
        System.out.println("Enter Student Marks1 : ");
        double marks1 = s.nextDouble();
        System.out.println("Enter Student Marks2 : ");
        double marks2 = s.nextDouble();
        System.out.println("Enter Student Marks3 : ");
        double marks3 = s.nextDouble();

        student2 s1 = new student2(id, name, add, marks1, marks2, marks3);
        s1.result();

    }
}
