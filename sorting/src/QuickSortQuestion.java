import java.util.Scanner;

public class QuickSortQuestion {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int arraySize = scanner.nextInt();

        String[] ar = new String[arraySize];
        for(int i = 0; i < arraySize; i++){
            ar[i]= scanner.next();
        }

        quickSort(ar, 0, ar.length - 1);
        printArray(ar);
    }

    public static void quickSort(String[] ar, int start, int end) {
        if (start < end) {
            int p = partition(ar, start, end);
            quickSort(ar, 0, p - 1);
            quickSort(ar, p + 1, end);
        }
    }

    public static int partition(String[] ar, int start, int end) {
        String pivot = ar[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (ar[j].length() <= pivot.length()) {
                String temp1 = ar[j];
                ar[j] = ar[i];
                ar[i] = temp1;
                i++;
            }
        }
        String temp2 = ar[i];
        ar[i] = ar[end];
        ar[end] = temp2;

        return i;
    }

    static void printArray(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]);
        System.out.println();
    }
}