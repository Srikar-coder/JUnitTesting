import java.util.*;
public class squareRoot {
 static double sqrt(double n)
    {
        double x = n;
        double y = 1;
 
        double e = 1e-15;
        while (Math.abs(x-y) > e) {
            x = (x + y) / 2;
            y = n / x;
        }
        return x;
    }
 
    
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();
    
    System.out.printf("Square root of "+ n + " is " + sqrt(n));
                          
    }
}
