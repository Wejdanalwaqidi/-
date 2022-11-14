public class BankAccount {
    private double balance;

    public BankAccount()
    {
        // this (0);
        balance=0;
    }
    public BankAccount(double initialBalance)
    {
        balance=initialBalance;
    }
    public void deposit (double balance)
    {
        this.balance=this.balance+balance;
    }
    public void withdraw(double balance)
    {
        this.balance=this.balance-balance;
    }
    public  double getBalance()
    {
        return balance;
    }
}

