
class Population{
public static void main(String[] args){
long currpop=312032486;
long seconds=(365*24*60*60)*5;
final long BIRTH=seconds/7;
final long DEATH=seconds/13;
final long IMMIGRANTS=seconds/45;
long newpop=currpop+BIRTH-DEATH+IMMIGRANTS;
System.out.println("Previous pop:"+currpop);
System.out.println("New pop:"+newpop);

}
}