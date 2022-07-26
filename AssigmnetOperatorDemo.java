// To demonstrate Operator Assignment

//import java.lang.*;
import java.util.*;
public class AssigmnetOperatorDemo{
    public AssigmnetOperatorDemo(){
        int j, k;
        j = 10; // j gets the value 10
        j = 5; // j  gets value 5, previous value is over written

        k = j; // k gets value 5
        System.out.println("j is :" +j);
        System.out.println("k is :" +k);
        //              Assigning Reference
        Integer i1 = new Integer("1");
        Integer i2 = new Integer("2");
        System.out.println("i1 is : " +i1);
        System.out.println("i2 is : " +i2);
        i1 = i2;

        System.out.println("i1 is: " +i1);
        System.out.println("i2 is: " +i2);
        // Multiple assignments
        k = j = 10; // (k = (j = 10))
        System.out.println("j is: " +j);
        System.out.println("k is: " +k);
    }
    public static void main(String[] args) {
        new AssigmnetOperatorDemo();
    }
}