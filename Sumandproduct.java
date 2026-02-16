/* class Sumandproduct{
public static void main(String[]args){
int sum=0;
int num=123;
int product=1;

while(num>0)
{
 int last=num%10;
sum=sum+last;
product=product*last;
num=num/10;
}
System.out.println("Sum is"+sum);
System.out.println("Product is"+product);

if(sum==product)
{
System.out.println("It is same");
}
else
{
System.out.println("It is not same");
}
}
}    */

import java.util.Scanner;
 class Sumandproduct{
public static void main(String[]args){
int sum=0;

int product=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();

while(num>0)
{
 int last=num%10;
sum=sum+last;
product=product*last;
num=num/10;
}
System.out.println("Sum is"+sum);
System.out.println("Product is"+product);

if(sum==product)
{
System.out.println("It is same");
}
else
{
System.out.println("It is not same");
}
}
}  