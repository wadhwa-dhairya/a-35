/* class Main{
public static void main(String[]args){
for(char ch='A'; ch<='Z' ; ch++)
{
System.out.print(ch+ " ");
}
System.out.println();
for(char ch='a';ch<='z';ch++)
{
System.out.print(ch+ " ");
}
}
}  */

/* class Main{
public static void main(String[]args){
for(int i=1; i<=100; i++)
{
System.out.print(i+ " ");
}
}
}  */

class Main{
public static void main(String[]args){
for(int i=1; i<=10; i++)
{
for(int j=1; j<=10; j++)
{
System.out.print(i + "*" + j + "=" + (i*j) + " ");
} 
System.out.println();
}
}
}