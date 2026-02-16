import java.util.Scanner;
class Currencyconverter{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
//infiniteloop
for(; ;)
{
System.out.println("\n Welcome ");
System.out.println("***** CURRENCY CONVERTER *****\n");
System.out.print("Enter an amount (INR)");
double amount=sc.nextDouble();
System.out.println("1.USD \n2.EUR \n3.KMD \n4.GBP \n5.Caddolar\n6.AED\n7.JPY\n8.CAD\n9.AUD\n10.CHF\n11.SGD");
System.out.print("Enter your response");
String resp=sc.next().toUpperCase();
boolean assump=true;
double convertedAmount=0;
if(resp.equals("USD")){
convertedAmount=amount/90.21;
}
else if(resp.equals("EUR")){
convertedAmount=amount/106.53;
}
else if(resp.equals("KWD")){
convertedAmount=amount/293.61;
}
else if(resp.equals("GBP")){
convertedAmount=amount/105.30;
}
else if(resp.equals("AED")){
convertedAmount=amount/22.65;
}
else if(resp.equals("JPY")){
convertedAmount=amount/0.56;
}
else if(resp.equals("CAD")){
convertedAmount=amount/61.80;
}
else if(resp.equals("AUD")){
convertedAmount=amount/55.40;
}
else if(resp.equals("CHF")){
convertedAmount=amount/94.70;
}
else if(resp.equals("SGD")){
convertedAmount=amount/61.30;
}
else{
assump=false;
System.out.println("\nINVALID CURR\n");
} if(assump)
System.out.printf("%n%20.2f INR=%.2f %s%n",amount,convertedAmount,resp);

}
}
}