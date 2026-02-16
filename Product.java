/* class Product{
public static void main(String[]args){
int product=1;
int num=123;

while(num>0)
{
 int last=num%10;
product=product*last;
num=num/10;
}
System.out.println("Product is "+product);
}
}    */


import java.util.Scanner;
class Product{
public static void main(String[]args){
int product=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
while(num>0)
{
 int last=num%10;
product=product*last;
num=num/10;
}
System.out.println("Product is "+product);
}
}  