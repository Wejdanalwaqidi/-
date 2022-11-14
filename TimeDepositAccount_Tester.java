import java.util.Scanner;

public class TimeDepositAccount_Tester {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double balance;
        System.out.println("input balance :");
        balance=in.nextDouble();
        TimeDepositAccount abeer=new TimeDepositAccount(balance,5);
        System.out.println("the balance is " + abeer.getbalance());
        abeer.addInsert();
        System.out.println("the balance after adding is "+ abeer.getbalance());

        abeer.withdraw();
        System.out.println("the balance after withdrawal is "+ abeer.getbalance());
    }
}

