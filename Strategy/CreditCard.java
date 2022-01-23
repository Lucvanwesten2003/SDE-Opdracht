package Strategy;
import java.util.*;

public class CreditCard implements PaymentStrategy{
    Scanner sc= new Scanner(System.in);
    @Override
    public void executePayment(){
        System.out.println("Enter your Credit Card number:");
        sc.nextLine();
        System.out.println("Enter expiry date:");
        sc.nextLine();
        System.out.println("Enter your CVV:");
        sc.nextLine();
        System.out.println("Payment successful, your ticket will be printed");
    }
}