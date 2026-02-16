/* class Count{
public static void main(String[]args){
int extract=0;
int count=0;

int num=123456;
while(num>0)
{
extract=num%10;
count++;

num=num/10;
}
System.out.println("The numbers are:"+count);

}
}  */



import java.util.Scanner;
class Count{
public static void main(String[]args){
int extract=0;
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no");
int num=sc.nextInt();

while(num>0)
{
extract=num%10;
count++;

num=num/10;
}
System.out.println("The numbers are:"+count);

}
}  