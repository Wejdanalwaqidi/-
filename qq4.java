public class qq4 {
    private double balance,rate;

    public qq4()
    {
        balance=0;
    }
    public qq4 (double initialBalance)
    {
        balance  =initialBalance;
    }

    public qq4(int i) {
    }

    public  void addInsert(double rate)
    {
        balance=balance+balance*(rate/100);
    }
    public  double getBalance()
    {
        return balance;
    }
}
