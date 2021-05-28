import java.util.*;

public class weekDay
{
  public static int dayOfWeek (int m, int d, int y)
  {
     int y0 = y-(14-m)/12;
     int x  = y0+y0/4-y0/100+y0/400;
     int m0 = m+12*((14-m)/12)-2;
     int d0 = (d+x+31*m0/12)%7;
     return d0;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter month day year");
    int m = sc.nextInt();
    int d = sc.nextInt();
    int y = sc.nextInt();
    int c = dayOfWeek(m,d,y);
    switch(c)
    {
        case 0:
            System.out.println("Sunday");
            break;
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
            
    }
  }
}
