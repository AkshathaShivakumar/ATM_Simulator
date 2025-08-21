import java.util.Arrays;
import java.util.Scanner;

public class ATM_Simulator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int balance_amount=1000;
        double  [] users=new double[3];
        Arrays.fill(users, balance_amount);
        System.out.println("welcome");
        System.out.print("Do you want to deposit,withdraw,check balance (yes/no) :");
        String choice= in.next().toLowerCase();

        while(choice.equals("yes")){

            System.out.println("enter your pin(0,1,2) :");
            int acc= in.nextInt();
            if(acc>=0 && acc<=2){
                System.out.println("Menu ");
                System.out.println("1.Deposit");
                System.out.println("2.Withdrawal");
                System.out.println("3.Check Balance");
                System.out.println("0.Exit");

                System.out.print("enter your option :");
                int option=in.nextInt();
                double amt;

                switch (option){
                    case 0:
                        System.out.println("Exiting to main menu...");
                        break;
                    case 1:
                        System.out.println("Enter the amount to deposit :");
                        amt=in.nextDouble();
                        users[acc]=deposit(amt,users[acc]);
                        break;
                    case 2:
                        System.out.println("Enter the amount to withdraw :");
                        amt=in.nextDouble();
                        users[acc]=withdrawal(amt,users[acc]);
                        break;
                    case 3:
                        System.out.println("Checking balance ....");
                        check_balance(users[acc]);
                        break;
                }
            }
            else{
                System.out.println("Enter  valid pin");
            }
            System.out.println("Do you want perform more actions :");
            choice=in.next().toLowerCase();
        }

    }
    static double deposit(double amt,double balance_amount) {
        if (amt < 0.0) {
            System.out.println("negative deposits are not allowed ,please enter a valid amount");
            return balance_amount;
        }
        double total_balance = balance_amount+amt;
        System.out.println("Balance after deposite of "+ amt+" :" + total_balance);
        return total_balance;
    }
    static double withdrawal(double amt,double balance_amount){
        if(amt > balance_amount){
            System.out.println("Withdrawal is not allowed");
            return balance_amount;
        }
        double total_balance = balance_amount-amt;
        System.out.println("Balance after withdrawal of "+amt+ " :"+ total_balance );
        return total_balance;
    }
    static void check_balance(double balance_amount){
        System.out.println("Balance Amount :"+balance_amount);
    }

}

