package OOPs;

public class Polymorphism {
    public static void processPayment(PaymentMethod p, double amount){// jvm desides which method will call in runtime
        p.pay(amount);
    }
    public static void main(String[] args){
       processPayment(new UpiPayment(),500);
       processPayment(new CardPayment(),1000);
    }
}
interface PaymentMethod{
    void pay(double amount);
}
class UpiPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paid $ "+amount+"using upi");
    }
}
class CardPayment implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Paid $ "+amount+"using upi");
    }
}
