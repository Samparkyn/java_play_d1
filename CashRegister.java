public class CashRegister
{
   private double purchase;
   private double payment;

   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   public void recordPurchase(double amount)
   {
      double total = purchase + amount;
      purchase = total;
   }

   public void enterPayment(double amount)
   {
      payment = amount;
   }

   public double calculateChange()
   {
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }

 public double giveChange()
     {
        double changeToGive = calculateChange();

       double pound = 0;
       double fiftyp = 0;
       double tenp = 0;
       double twentyp = 0;
       double fivep = 0;
       double twop = 0;
         if(changeToGive >= 1)
          {pound = changeToGive/1;}

       changeToGive = changeToGive - pound;

       if(changeToGive >=.50)
         {fiftyp=changeToGive/.50;}

      changeToGive = changeToGive - (fiftyp*.50);

      if(changeToGive >=.20)
         {twentyp = changeToGive/.20;}
      changeToGive = changeToGive - (twentyp*.20);

      if(changeToGive >=.10)
       {tenp = changeToGive/.10; }
    changeToGive = changeToGive - (tenp*.10);

    if(changeToGive >=.05)
       {fivep = changeToGive/.05; }
    changeToGive = changeToGive - (fivep*.05);

    if(changeToGive >=.02)
       {twop = changeToGive/.02; }
    changeToGive = changeToGive - (twop*.02);

    return pound + fiftyp + tenp + twentyp + fivep + twop;
 }

}


// £1 coins : 4
// 50p coins: 1
// 20p coins: 1
// 10p coins: 1
// 5p coins: 1
// 2p coins: 2

// Refactor your CashRegister.java program so that it can print out the coins that make up a person's changeToGive.

// Rename method giveChange() to calculateChange()

// Add a new method giveChange() which calls calculateChange() method and stores the result in a double variable then determines how many of each coin to return and prints the results in the console.
