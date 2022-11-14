public class TimeDepositAccount {
    private  double balance,rate;

    public TimeDepositAccount(double initialbalance,double rate){
        balance=initialbalance;
        this.rate=rate;
    }
    public TimeDepositAccount(){
        this(0,0);
    }
    public void  withdraw(){
        balance=balance-balance;
    }
    public double  getbalance(){
        return balance;
    }
    public  void addInsert()
    {
        balance=balance+balance*(rate/100);
    }
}

