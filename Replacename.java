//Input "I,am,a,software,developer." 

//Output "I-am-a-software-developer." Using Java


import java.util.*;

public class Replacename

{

public static void main(String[] args)

{

Scanner Name = new Scanner(System.in);

String Replacename = Name.nextLine();

String NameRe = Replacename.replace(",","-");


//Scanner Name2 = new Scanner(System.in);

//String Name3 = Name2.nextLine();

//String Name1 = Name3.replace("is","was");


System.out.println(NameRe);

//System.out.println(Name1);

//System.out.println(NameRe + Name1);

}

}