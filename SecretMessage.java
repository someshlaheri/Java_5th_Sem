// To read a message and a secret key from the user for crypting the message using a Caesar Cipher shifting each letter

import java.util.*;

public class SecretMessage {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        System.out.print("Your secret message: ");
        String message = console.nextLine();
        message = message.toLowerCase();
        System.out.println("Your secret key: ");
        int key = console.nextInt();
        encode(message, key);
    }
        //The method encodes the given text string using a Caesar
        //cipher, shifting each letter by the given number of places.
        public static void encode(String text, int shift){
            System.out.print("The encoded message: ");
            for (int i = 0; i < text.length(); i++){
                char letter = text.charAt(i);
                //Shift only letters(leave other characters alone)
                if (letter >= 'a' && letter <= 'z'){
                    letter = (char) (letter + shift);
                    //may need to wrap around
                    if (letter > 'z'){
                        letter = (char) (letter - 26);
                    }
                    else if (letter < 'a'){
                        letter = (char) (letter + 26);
                    }
                }
                System.out.print(letter);
            }
            System.out.println();
            
        }
}

