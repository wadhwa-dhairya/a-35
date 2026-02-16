/* class Reverse{
public static void main(String[]args)
{
int rev=0;
int num=123456789;
while(num>0)
{
int last=num%10;
rev=rev*10+last;
num=num/10;
}
System.out.println("Reverse no is:"+rev);
}
}   */

import java.util.Scanner;
 class Reverse{
public static void main(String[]args)
{
int rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();
while(num>0)
{
int last=num%10;
rev=rev*10+last;
num=num/10;
}
System.out.println("Reverse no is:"+rev);
}
}   