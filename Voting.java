import java.util.Scanner;
class Voting{
static int BJP,AAP,CONG,MNS,NOTA;
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the population of area:");
int population=sc.nextInt();
for(int i=1;i<=population;i++)
{
System.out.println("\n***WELCOME***");
System.out.println("Apka ek vote desh badal sakta hai");
System.out.println("1.BJP\n2.AAP\n3.CONG\n4.MNS\n5.NOTA");
System.out.print("Enter your response:");
String resp=sc.next().toUpperCase();
if(resp.equals("BJP")){
BJP++;
System.out.println("YOU HAVE VOTED FOR BJP");
System.out.println("ACCHE DIN AAYENGE\n");
}
else if(resp.equals("AAP")){
AAP++;
System.out.println("YOU HAVE VOTED FOR AAP");
System.out.println("APKA EK VOTE MUJHE AAZAD KR SAKTA HAI\n");
}
else if(resp.equals("CONG")){
CONG++;
System.out.println("YOU HAVE VOTED FOR CONG");
System.out.println("BHARAT JODO\n");
}
else if(resp.equals("MNS")){
MNS++;
System.out.println("YOU HAVE VOTED FOR MNS");
System.out.println("JAI MAHARASHTRA\n");
}
else if(resp.equals("NOTA")){
NOTA++;
System.out.println("YOU HAVE VOTED FOR NOTA");
System.out.println("YOU ARE EDUCATED\n");
}
else{
System.out.println("INVALID RESPONSE");
}
}
System.out.println("BJP"+" : " +BJP);
System.out.println("AAP" +" : " +AAP);

System.out.println("CONG" +" : " +CONG);
System.out.println("MNS" +" : " +MNS);
System.out.println("NOTA" +" : " +NOTA);






}
}