import java.util.Scanner;

public class LinearSearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target num: ");
        int targetNum = sc.nextInt();
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        boolean checker = false;
        
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        // for(int i = 0; i < size; i++){
        //     if(arr[i] == targetNum){
        //         System.out.println(checker);
        //         break;
        //     }
        //     else if(i == size-1){
        //         checker = false;
        //         System.out.println(checker);
        //     }
        // }
        for(int i : arr){
            if(i == targetNum){
                checker = true;
                break;
            }
        }
        if(checker){
            System.out.println("Element is found.");
        }
        else{
            System.out.println("Element NOT found");
        }
    }
}
