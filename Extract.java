/* class Extract{
public static void main(String[]args){
int extract=0;

int num=123456;
while(num>0)
{
extract=num%10;
System.out.println(extract);
num=num/10;
}

}
}  */


import java.util.Scanner;
class Extract{
public static void main(String[]args){
int extract=0;

Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
while(num>0)
{
extract=num%10;
System.out.println(extract);
num=num/10;
}

}
}