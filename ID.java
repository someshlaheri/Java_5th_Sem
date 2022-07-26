// To demonstrate Increment and Decrement Operators

public class ID {
    public static void main(String args []){

        /* byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b =6.54f + x;
        System.out.println(b);
        */

        //Increment and Decrement Operators
        int i = 56;
        int b = i++; //first b is assigned i (56) then i id incremented
        int j = 67;
        int c = ++j; //first j is assigned c is assigned j(68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        int y = 7;
        System.out.println(++y *8);
        char ch = 'a';
        System.out.println(++ch);
    }
}
