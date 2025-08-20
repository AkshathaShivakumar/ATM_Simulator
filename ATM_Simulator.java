import java.util.Scanner;

public class ATM_Simulator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int balnace_amount=1000;
        int [] users=new int[3];
        for (int i = 0; i < users.length; i++) {
            users[i]=balnace_amount;
        }
        System.out.println("welcome");
        System.out.print("Do you want to deposit,withdraw,check balance (yes/no) :");
        String choice= in.next().toLowerCase();

        while(choice.equals("yes")){
            System.out.println("enter your pin(0,1,2) :");
            int pin= in.nextInt();
            if(pin>=0 ||pin<=2){
                int acc=pin;
            }
            else{
                System.out.println("Enter  valid pin");
            }
            System.out.println("Menu ");
            System.out.println("1.Deposit");
            System.out.println("2.Withdrawal");
            System.out.println("3.Check Balance");
            System.out.println("0.Exit");

            System.out.print("enter your option :");
            int option=in.nextInt();



            switch (option){
                case 1:

                    deposit(acc,amt,balance_amount);
            }
        }

    }
    static void deposit(int acc,double amt,double balance_amount) {
        double total_balance = balance_amount;
        if (amt < 0.0) {
            System.out.println("Balance after deposite of "+ amt+" :" + total_balance + amt);
        }
        else{
            System.out.println("negative deposits are not allowed ,please enter a valid amount");
        }
    }
    static void withdrawal(int acc,double amt,double balance_amount){
        double total_balance = balance_amount;
        double withdrawal=total_balance-amt;
        if(amt >total_balance){
            System.out.println("Withdrawal is not allowed");
        }
        System.out.println("Balance after withdrawal of "+amt+ " :"+withdrawal);
    }
    static void check_balance(int acc,double balance_amount){
        System.out.println("Balance Amount :"+balance_amount);
    }

}
