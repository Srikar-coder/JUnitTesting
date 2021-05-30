import java.util.*;

public class vendingMachine
{

  public static void main (String[]args)
  {
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter the amount");
   int n = sc.nextInt();
   int thousands=n/1000;
   int fiveHundreds=(n-(thousands*1000))/500;
   int hundreds = (n-(thousands*1000)-(fiveHundreds*500))/100;
   int fifties = (n-(thousands*1000)-(fiveHundreds*500)-(hundreds*100))/50;
   int tens = (n-(thousands*1000)-(fiveHundreds*500)-(hundreds*100)-(fifties*50))/10;
   int fives = (n-(thousands*1000)-(fiveHundreds*500)-(hundreds*100)-(fifties*50)-(tens*10))/5;
   int twos= (n-(thousands*1000)-(fiveHundreds*500)-(hundreds*100)-(fifties*50)-(tens*10)-(fives*5))/2;
   int ones = (n-(thousands*1000)-(fiveHundreds*500)-(hundreds*100)-(fifties*50)-(tens*10)-(fives*5)-(twos*2))/1;
   System.out.println("\nThe minimum number of notes required are "+(thousands+fiveHundreds+hundreds+fifties+tens+fives+twos+ones));
   System.out.println("\n1000\t 500\t 100\t 50\t 10\t 5\t 2\t 1");
   System.out.println(thousands+"\t"+fiveHundreds+"\t"+hundreds+"\t"+fifties+"\t"+tens+"\t"+fives+"\t"+twos+"\t"+ones);
   
  }
}
