import java.util.Scanner;

class student{
    int id;
    String name;
    String course;
    int fees;
    student(int id,String name,String course,int fees){
        this.id = id;
        this.name=name;
        this.course=course;
        this.fees=fees;
    }
    public void display(){
        System.out.println("Student Roll number = "+id);
        System.out.println("Student Name : "+name);
        System.out.println("Student Course : "+course);
        System.out.println("Student Fees : "+fees);
    }
}

public class Q_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Student Roll number : ");
        int id = s.nextInt();
        s.nextLine();
        System.out.print("Enter Student Name : ");
        String name1 = s.nextLine();

        System.out.print("Enter Student Course : ");
        String course = s.nextLine();
        System.out.print("Enter Student Fees : ");
        int fees = s.nextInt();
        student s1 = new student(id,name1,course,fees);

        s1.display();
    }
}
