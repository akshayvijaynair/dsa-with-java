package problems;

import java.util.Scanner;

/**
 * Write a function that merges two sorted arrays in descending order.
 *
 *
 *
 * Input Format:
 *
 * Size of first sorted array
 * Elements of first sorted array
 * Size of second sorted array
 * Elements of second sorted array
 * Output Format:
 *
 * Print the merged sorted array in descending order
 *
 *
 * Sample Input 1:
 *
 * 3
 *
 * 1 2 3
 *
 * 4
 *
 * 4 5 6 7
 *
 * Sample Output 1:
 *
 * 7
 *
 * 6
 *
 * 5
 *
 * 4
 *
 * 3
 *
 * 2
 *
 * 1
 *
 * Explanation 1:
 *
 * So the first input, 3, corresponds to the size of the first sorted array. The next 3 inputs i.e. 1,2 and 3 are the elements inside the first sorted array.
 *
 *
 *
 * Similarly the third line represents the size of the second array which in this case is 4 and the next 4 elements i.e. 4,5,6 and 7 correspond to the second sorted array.
 *
 *
 *
 * When we merge the two arrays to form a sorted array we get: 1 2 3 4 5 6 7
 *
 * So, the descending ordered array would be: 7 6 5 4 3 2 1
 */
public class MergeSortedArrays {
    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);
        int sizeArray2 = scanner.nextInt();
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);

        int descendingMerge[]=mergeBothInDescendingOrder(sortedArray1, sortedArray2);

        // write your code here

    }

    public static int[] getArrayInput(int sizeArray, Scanner scanner){

        int[] array = new int[sizeArray];

        for(int i = 0; i < sizeArray; i++)
        {
            array[i]=scanner.nextInt();
        }

        return array;
    }
}
