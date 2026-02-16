/* class Search{
public static void main(String[]args){
int extract=0;
int last=7;


int num=12356;

while(num>0)
{
extract=num%10;
if(extract==last)
{
System.out.println("We got our number");
break;
}

num=num/10;
}
if(extract!=last)
{

System.out.println("We did not got our number:");
}


}
}  */


import java.util.Scanner;
class Search{
public static void main(String[]args){
int extract=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a find value:");
int find=sc.nextInt();
System.out.println("Enter a number:");
int num=sc.nextInt();


while(num>0)
{
extract=num%10;
if(extract==find)
{
System.out.println("We got our number");
break;
}

num=num/10;
}
if(extract!=find)
{

System.out.println("We did not got our number:");
}


}
}  





