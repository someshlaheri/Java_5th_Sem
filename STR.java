//To demonstrate String declarations and printing

import java.util.Scanner;
public class STR {
    public static void main (String args[]){
        String name = new String("PCC-CS593");
        System.out.println("The paper code is: "+name);
        String a = "Odd Semester";
        System.out.print(a+"\n");
        String b = "AIML & IOT \n";
        System.out.format("OOP Lab for: "); //In older version, it will print the format. i.e; String
        System.out.print(b+"\n");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        //String st = sc.nextLine();
        System.out.println(st);
    }
}

