import java.util.*;

public class farCel
{
  public static int temperatureConversion(int n, String str)
  {
    int result = 0;
    if(str.equals("CF"))
    result = (n*9/5)+32;
	else
    result = (n-32)*5/9;
	return result;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value");
    int n = sc.nextInt();
    System.out.println("Enter FC or CF");
    String str = sc.nextLine();
    sc.nextLine();
    System.out.println(temperatureConversion(n, str));
  }
}
