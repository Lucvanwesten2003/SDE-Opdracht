package Strategy;
import java.util.*;

public class Cash implements PaymentStrategy{
    Scanner sc= new Scanner(System.in);
    @Override
    public void executePayment(){
        System.out.println("Enter cash amount");
        sc.nextLine();
        System.out.println("Payment successful, your ticket will be printed");
    }
}
