
import java.util.Scanner;


class square{
    double side;
    square(double side){
        this.side = side;
    }
    public double area(){
        return side*side;
    }
    public double perimeter(){
        return 4*side;
    }
}

public class Q_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Side of  square : ");
        double side = s.nextDouble();

        square s1 = new square(side);

        System.out.println("Area of Square is "+s1.area());
        System.out.println("Perimeter of Square is "+s1.perimeter());
    }
}
