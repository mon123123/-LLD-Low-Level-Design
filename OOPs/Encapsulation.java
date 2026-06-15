package OOPs;

public class Encapsulation {
    public static void main(String[] args){
        Bank b = new Bank(12345);
        b.diposite(500);
        b.withdrow(400);
        b.withdrow(500);
    }

}
class Bank{
   private int accountNumber;
    private int balance=0;
    Bank(int accountNumber){
        this.accountNumber=accountNumber;

    }
    void diposite(int amount)
    {
        balance+=amount;
        System.out.println("diposite successfully Total balance is: "+balance);
    }
    void withdrow(int amount){
        if (balance==0 || balance<amount){
            System.out.println("not sufficient amount");
            return;
        }
        balance-=amount;
        System.out.println("withdrow successful Total amount available in the account is : "+balance);
    }
}