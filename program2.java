import java.util.Scanner;
class Alphabet{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character:");
char ch=sc.next().charAt(0);
String op=
((ch>=65 && ch<=90)||(ch>=97 && ch<=122))?
((ch>=65 && ch<=90) ?
(ch+" is Upper case alphabet"):
(ch+"is lower case alphabet")):
((ch>=48 && ch<=57) ?
(ch+"is a digit"):
(ch+"is a special character"));
System.out.println(op);
}
}