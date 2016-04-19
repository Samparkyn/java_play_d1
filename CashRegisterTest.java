import java.util.Scanner;
public class CashRegisterTest
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();
      // register.recordPurchase(13.50);
      Scanner in = new Scanner(System.in);
      System.out.println("Price for first item: ");
      double price1 = in.nextDouble();

      System.out.println("Price for second item: ");
      double price2 = in.nextDouble();

      System.out.println("Payment amount: ");
      double amount = in.nextDouble();
      register.recordPurchase(price1);
      register.recordPurchase(price2);
      // register.recordPurchase(2.25);
      // register.enterPayment(20);
      register.enterPayment(amount);

      changeDue = giveChange();
      System.out.println("Change due : " + changeDue);
   }

}
