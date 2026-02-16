import java.util.Scanner;
class Loancalculator{
public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);
for(; ;)
{
System.out.println("\n **** Welcome ****\n");
System.out.print("Amount:");
double amount=sc.nextDouble();
if(amount<1000 || amount>100000){
System.out.println("\n INVALID AMOUNT\n");
continue;
}
System.out.print("Rate of interest(PM):");
double interest=sc.nextDouble();
if(interest<1 || interest>30){
System.out.println("\n INVALID INTEREST\n");
continue;
}
System.out.println("Loan Tenure(months) :");
int tenure=sc.nextInt();
if(tenure<3 || tenure>36){
System.out.println("\n INVALID TENURE\n");
continue;
} 

double permonthint=(amount/100)*interest;
double totalinterestamount=permonthint*tenure;
double emi=(amount*totalinterestamount)*tenure;
double totalamount=amount*totalinterestamount;
System.out.println("\n Monthly emi :" +emi);
System.out.println("\n Principal AMOUNT :" +amount);
System.out.println("\n Total interest :" +totalinterestamount);
System.out.println("\n Total amount :" +totalamount);


}
}
}