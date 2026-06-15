package OOPs;

class Inheritance {
    public static void main(String[] args){
        Notification n = new SMSNotification("7355756925");
        Notification n2 = new EmailNotification("monali@gmail.com");
        n.send();
        n2.send();
    }
}
class Notification{
    String recipient;
    Notification(String recipient){
        this.recipient=recipient;
    }
    void send(){
        System.out.println("Sending OOPs.Notification");
    }
}
class EmailNotification extends Notification{

    EmailNotification(String recipient) {
        super(recipient);
    }
    @Override
    void send(){
        System.out.println("email send to: "+recipient);
    }
}
class SMSNotification extends Notification{
    SMSNotification(String recipient){
        super(recipient);
    }

    @Override
    void send() {

            System.out.println("SMS send to: "+recipient);
        }
    }
