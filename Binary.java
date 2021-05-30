import java.util.*;
public class Binary
{
public static String toBinary(int n)
{
StringBuilder str=new StringBuilder("");
while(n>0)
{
str=str.append(n%2);
n/=2;
}
int res=Integer.valueOf(str.reverse().toString());
return String.format("%08d",res);

}
public static String toDecimal(String binaryForm)
{
String newStr = binaryForm.substring(4,8)+binaryForm.substring(0,4);
int decimal = Integer.parseInt(newStr,2);
return Integer.toString(decimal);
}
public static boolean powerOfTwo(int n)
 {
 while(n%2==0)
 {
 n=n/2;
 }
 if(n==1)
 {
 return true;
 }
 else
 {
 return false;
 }
 }
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n =sc.nextInt();
String binaryForm=toBinary(n);
System.out.println("binary format of "+ n +" is: "+binaryForm);
String nibble = toDecimal(binaryForm);
System.out.println("\nAfter swapping the nibbles decimal number is : "+nibble);
if(powerOfTwo(Integer.parseInt(nibble)))
System.out.println("/nYes it is a power of two\n");
else
System.out.println("\nNo it is a power of two");

}
}
