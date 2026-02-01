import java.util.Scanner;
class Stonepaperscissor
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
infiniteloop:
for(; ;)
{
System.out.println("\n *** Welcome ***\n");
//user implementation
System.out.println("1.STONE\n2.PAPER\n 3.SCISSOR\n");
System.out.print("Enter your response");
int dgtuser=sc.nextInt();
String user="";
if(dgtuser==1) user="STONE";
else if(dgtuser==2) user="PAPER";
else if(dgtuser==3) user="SCISSOR";
else{
System.out.println("INVALID RESPONSE\n");
continue infiniteloop;
}
//bot implementation
int dgtbot=0;
for(; ;){
dgtbot=(int)(Math.random()*10);
if(dgtbot>=1 && dgtbot<=3)
break;
}
String bot="";
if(dgtbot==1) bot="STONE";
else if(dgtbot==2) bot="PAPER";
else bot="SCISSOR";
System.out.printf("%n%10s %8s","BOT","USER");
System.out.printf("%n%10s %8s","bot","user");
//calculate winner
if(bot.equals("STONE") && user.equals("PAPER")||(bot.equals("PAPER") && user.equals("SCISSOR"))||(bot.equals("SCISSOR") && user.equals("STONE")))
{
System.out.println("\n *** USER WON ****\n");
}
else if (bot.equals("STONE")&& user.equals("SCISSOR")||(bot.equals("PAPER") && user.equals("STONE"))||(bot.equals("SCISSOR") && user.equals("PAPER")))
{
System.out.println("\n*** BOT WON ***\n");
}
else
{
System.out.println("\n **** DRAW ****\n");
}
}
}
}
