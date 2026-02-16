/* class Countevenodd{
public static void main(String[]args){
int evencount=0;
int oddcount=0;
int num=123456789;
while(num>0)
{
int last=num%10;
if(last%2==0)
{
evencount++;
}
else
{
oddcount++;
}
num=num/10;
}
System.out.println("Even numbers are:"+evencount);
System.out.println("Odd numbers are:"+oddcount);
}
}   */


import java.util.Scanner;
class Countevenodd{
public static void main(String[]args){
int evencount=0;
int oddcount=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();
while(num>0)
{
int last=num%10;
if(last%2==0)
{
evencount++;
}
else
{
oddcount++;
}
num=num/10;
}
System.out.println("Even numbers are:"+evencount);
System.out.println("Odd numbers are:"+oddcount);
}
}