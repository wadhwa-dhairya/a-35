/* class Power{
public static void main(String[]args){
int originalnum=1;
int base=2;
int raise=5;
for(int i=0;i<5;i++)
{
originalnum=originalnum*base;
}
System.out.println(originalnum);
}
}  */

/* class Power{
public static void main(String[]args){
int originalnum=1;
int base=2;
int raise=5;
while(raise>0)
{
originalnum=originalnum*base;
raise--;
}
System.out.println(originalnum);
}
}  */


/* import java.util.Scanner;
class Power{
public static void main(String[]args){
int originalnum=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base");
int base=sc.nextInt();
System.out.println("Enter the raise");

int raise=sc.nextInt();

for(int i=0; i<raise; i++)
{
originalnum=originalnum*base;
}
System.out.println(originalnum);
}
}   */

import java.util.Scanner;
class Power{
public static void main(String[]args){
int originalnum=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base");
int base=sc.nextInt();
System.out.println("Enter the raise");
int raise=sc.nextInt();
while(raise>0)
{
originalnum=originalnum*base;
raise--;
}
System.out.println(originalnum);
}
}


