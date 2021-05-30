import java.util.*;
public class BinaryConversion
{
public static StringBuilder toBinary(int n)
{
StringBuilder str=new StringBuilder("");
while(n>0)
{
str=str.append(n%2);
n/=2;
}
int res=Integer.valueOf(str.toString());
//return String.format("%04d",res);
return str.reverse();
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println(toBinary(sc.nextInt()));
}
}
