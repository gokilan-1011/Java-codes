abstract class payment{
    protected double amount;
    payment (double amount){
        this.amount=amount;
    }
    abstract void pay();
    void receipt(){
        System.out.println("Receipt Generated");
        System.out.println("Amount paid:" +amount);
    }
    void Showpaymentstartup(){
        System.out.println("Payment Successfull");
    }
}
class upiPayment extends payment{
    private String upiID;
    upiPayment(double amount, String upiID){
        super(amount);
        this.upiID=upiID;
    }
    void pay(){
        System.out.println("Processing UPI Payment");
        System.out.println("UPI ID:" +upiID);
    }
}
class cardpayment extends payment{
    private String cardNumber;
    cardpayment(double amount,String cardNumber){
        super(amount);
        this.cardNumber=cardNumber;
    }
    void pay(){
        System.out.println("Processing Card Payment");
        System.out.println("Card Number: ****************" +cardNumber.substring(cardNumber.length()));
    }
}
public class paymentMethod {
    public static void main(String[] args) {
        payment p1=new upiPayment(550.55,"goks@oksbi");
        payment p2=new cardpayment(1250.36,"8947582637891122");
        p1.pay();
        p1.receipt();
        p1.Showpaymentstartup();
        System.out.println();
        p2.pay();
        p2.receipt();
        p2.Showpaymentstartup();
    }
}
