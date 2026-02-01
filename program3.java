import java.util.Scanner;
class Number{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter a no");
int num=sc.nextInt();
String op=(num>=0 && num<=9)?(num+ "is a digit"):(num+ "is not a digit");
System.out.println(op);
}
}