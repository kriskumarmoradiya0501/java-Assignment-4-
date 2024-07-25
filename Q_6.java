
import java.util.Scanner;


class computer{
    String name;
    computer(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Computer name is "+name);
    }
}


class laptop{
    String name;
    laptop(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Laptop name is "+name);
    }
}



public class Q_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter name of  computer : ");
        String name = s.nextLine();
        System.out.println("Enter name of  Laptop : ");
        String name1 = s.nextLine();

        computer c = new computer(name);
        laptop l = new laptop(name1);

        c.display();
        l.display();

    }
}
