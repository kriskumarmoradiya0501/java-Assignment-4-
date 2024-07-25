import java.util.Scanner;

class account{

    int acc_no;
    String acc_type;
    String cus_name;
    double balance;

    account(int acc_no,String acc_type,String cus_name,double balance){
        this.acc_no=acc_no;
        this.acc_type=acc_type;
        this.cus_name=cus_name;
        this.balance=balance;
    }

    public void deposit(){
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your deposit Amount : ");
        Double dep = s.nextDouble();
        System.out.println("Your deposit amount : "+dep);
        balance = balance+dep;
        System.out.println("Your Total Bank Balance = "+balance);
    }

    public void withdraw(){
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your withdraw Amount : ");
        Double wit = s.nextDouble();
        if (wit > balance){
            System.out.println("Not enough balance.");
        }
        else {
            System.out.println("Your deposit amount : " + wit);
            balance = balance - wit;
            System.out.println("Your Total Bank Balance = " + balance);
        }
    }

    public void show_balance(){
        System.out.println();
        System.out.println("Name : "+cus_name);
        System.out.println("Account Number : "+acc_no);
        System.out.println("Account Type : "+acc_type);
        System.out.println("Account Balance : "+balance);
    }

}

public class Q_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Account number : ");
        int acc_no = s.nextInt();
        s.nextLine();
        System.out.print("Enter Account Type: ");
        String acc_type = s.nextLine();
        System.out.print("Enter Account Holder name : ");
        String cus_name = s.nextLine();
        System.out.print("Enter Account Balance : ");
        double balance = s.nextDouble();

        account a = new account(acc_no,acc_type,cus_name,balance);
        int n=1;
        while (n<=4){
            System.out.println();
            System.out.println("Enter 1 for Diposit.\nEnter 2 for withdraw.\nEnter 3 for details.\nEnter 4 End the program");
            System.out.print("Enter Your choice : ");
            n = s.nextInt();
            switch (n){
                case 1:
                    a.deposit();
                    break;
                case 2:
                    a.withdraw();
                    break;
                case 3:
                    a.show_balance();
                    break;
                case 4:
                    n=5;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

    }
}
