/* class Sum{
public static void main(String[]args){
int sum=0;
int num=123456;

while(num>0)
{
 int last=num%10;
sum=sum+last;
num=num/10;
}
System.out.println("Sum is "+sum);
}
}  */


import java.util.Scanner;
class Sum{
public static void main(String[]args){
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
while(num>0)
{
 int last=num%10;
sum=sum+last;
num=num/10;
}
System.out.println("Sum is "+sum);
}
}  
