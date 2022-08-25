public class MergedPreDefinedArr {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {4,16,1,2,3,22};
        int size = arr1.length + arr2.length;
        int mergedArray[] = new int[size];
        //int count = 0;
        for(int i = 0; i < arr1.length; i++){
            mergedArray[i] = arr1[i];
        }
        for(int j = arr1.length, i = 0; j < size; j++, i++){
            mergedArray[j] = arr2[i];
        }
        for(int i : mergedArray){
            System.out.print(i + " ");
        }
    }
}

