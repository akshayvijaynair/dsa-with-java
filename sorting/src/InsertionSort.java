import java.util.Scanner;

public class InsertionSort {

    public static void insertSort(int[] arr){

        for( int i =1 ;i<arr.length;i++){
            int v = arr[i];
            int  j= i;

            while(j>=1 && arr[j-1]>v){
                arr[j]=arr[j-1];
                j--;
            }

            arr[j]=v;
        }
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int arraySize = scanner.nextInt();

        int[] arr = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            arr[i]= scanner.nextInt();
        }

        insertSort(arr);
        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}