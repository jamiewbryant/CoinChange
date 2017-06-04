/**
 *
 * @author jamiebryant
 */
import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

class Programming_4_Activity {
  //Decimal Formatting  
  private static DecimalFormat df2 = new DecimalFormat(".##");
  //Restart Function
  private static void restart(String[] strArr)
    {
        System.out.println("YOU RESTARTED");
        main(strArr);
    }
  //Main Function
  public static void main(String[] args) {
      
      //Scan for user input    
      Scanner scandue = new Scanner(System.in);
      Scanner scanpaid = new Scanner(System.in);

      //Change total
      double paid,due,change;
      //Currency amount
      double quarter=.25, dime=.1, nickel=.05;
      //Control variable
      double changeD, changeQ, changeN, d1, n1, p1, q1, penny;
      //Print values
      int dollar, q2, d2, n2, p2;

      //Tell user how much is due.  
      System.out.println("Enter Amount Due in Dollars and Cents: *.**");
      while(true){

        if (scandue.hasNextDouble()) {
        due = scandue.nextDouble();          

            //Receive payment.
            System.out.println("Amount Paid: " );
            paid = scanpaid.nextDouble();
            
            //Tell user change.  
            change = paid - due;
            System.out.println("Change: " +df2.format(change));
            
            //Dollar Breakdown  
            dollar = (int)change;
            System.out.println("Dollars: " +dollar);
            //Quarter Breakdown  
            changeQ = change - (long) change;
            q1 = changeQ/quarter;
            q2 = (int) q1;
            System.out.println("Quartes: " +q2);
            //Dime Breakdown
            changeD = changeQ-(q2*quarter);
            d1=changeD/dime;
            d2=(int) d1;
            System.out.println("Dimes: " +d2);
            //Nickel Breakdown
            changeN = changeD-(d2*dime);
            n1=changeN/nickel;
            n2=(int) n1;
            System.out.println("Nickels: " +n2);
            //Penny Breakdown
            penny = changeN-(n2*nickel);
            p1 = penny*100;
            p2 = (int) (p1 +.5);
            System.out.println("Pennies: " +p2);
            System.exit(0);
            
            //Restart Function
              }else{
              System.out.println("Please enter numbers");
              restart(args);
  }
    
  }
  }
  
}

    

                



      
  

    
   



    
    

