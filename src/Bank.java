
import java.util.Date;
import java.util.Random;


public class Bank {
   public static double balance;
   double withdraw;
   
  

public void amountTake(){
  Random rand = new Random();
   balance = rand.nextDouble(2000);
   if(balance >= 2){
       balance++;
       System.out.println("Your total amount is "+balance);
   } else {
    System.out.println("Your total amount is "+balance);
    }
   }
public void timeCheck(){
    Date hora = new Date();
    System.out.println("Operação finalizada as "+ hora);
}

    public static void main(String[] args) throws Exception {
      Bank p1 = new Bank();
      p1.amountTake(); 
      p1.timeCheck();
      
    }
}
