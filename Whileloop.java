/* class Main{
public static void main(String[]args){
char ch='A';
while(ch<='Z'){
System.out.print(ch+ " ");
ch++;
}

System.out.println();

ch='a';
while(ch<='z'){
System.out.print(ch+ " ");
ch++;
}
}
}  */

/* class Main{
public static void main(String[]args){
int i=1;
while(i<=100){
System.out.print(i+ " ");
i++;
}
}
}  */

class Main{
public static void main(String[]args){
int i=1;
while(i<=10){
 int j=1;
while(j<=10){
System.out.print( i + "*"  +  j  +   "="   +   (i*j) + "  ");
j++;
}
System.out.println();
i++;
}
}
}
