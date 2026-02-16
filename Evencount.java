/* class Evencount{
public static void main(String[]args){
int extract=0;
int evencount=0;

int num=123456;
while(num>0)
{
extract=num%10;
if(extract%2==0)
evencount++;

num=num/10;
}
System.out.println("The numbers are:"+evencount);

}
}    */


import java.util.Scanner;
class Evencount{
public static void main(String[]args){
int extract=0;
int evencount=0;

Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
while(num>0)
{
extract=num%10;
if(extract%2==0)
evencount++;

num=num/10;
}
System.out.println("The numbers are:"+evencount);

}
}    


