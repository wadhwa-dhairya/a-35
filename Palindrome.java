/* class Palindrome{
public static void main(String[]args)
{
int rev=0;
int num=1001;
int temp=num;
while(num>0)
{
int last=num%10;
rev=rev*10+last;
num=num/10;
}
if(temp==rev)
{
System.out.println("It is a palindrome number");
}
else
{
System.out.println("Not a palindrome number:");
}

}
}     */


import java.util.Scanner;
class Palindrome{
public static void main(String[]args)
{
int rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();
int temp=num;
while(num>0)
{
int last=num%10;
rev=rev*10+last;
num=num/10;
}
if(temp==rev)
{
System.out.println("It is a palindrome number");
}
else
{
System.out.println("Not a palindrome number:");
}

}
}   