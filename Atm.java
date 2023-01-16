import java.util.*;
public class Atm {
    public static void main(String[] args) {
        int balance = 100000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.println("Choose the operation you want to perform");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter a money you want to withdrawn");
                    withdraw = sc.nextInt();
                    if (balance>=withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("please collect your money");
                        System.out.println("Remainning money "+balance);
                    }
                    else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter money you want to deposited");
                    deposit = sc.nextInt();
                    balance = balance+deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println("Current Balance="+balance);
                    break;

                case 3:
                    System.out.println("Balance "+balance);
            }
        }
    }
}
