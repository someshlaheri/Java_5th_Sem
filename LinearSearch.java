public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {8,2,6,4,1,3};
        int tagetNum = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == tagetNum){
                System.out.println("Index: "+i);
                break;
            }
            else if(i == arr.length-1){
                System.out.println("Not found");
            }
        }
    }
}
