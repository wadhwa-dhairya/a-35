/* class Zero{
public static void main(String[]args){
int extract=0;


int num=12356;

while(num>0)
{
extract=num%10;
if(extract==0)
{
System.out.println("It is a duck number:");
break;
}

num=num/10;
}
if(extract!=0)
{

System.out.println("It is not a duck number:");
}


}
}  */


import java.util.Scanner;
 class Zero{
public static void main(String[]args){
int extract=0;


Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();

while(num>0)
{
extract=num%10;
if(extract==0)
{
System.out.println("It is a duck number:");
break;
}

num=num/10;
}
if(extract!=0)
{

System.out.println("It is not a duck number:");
}


}
}  
