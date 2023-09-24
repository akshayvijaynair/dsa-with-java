package problems;

import java.util.Scanner;

/**
 * Make the Unsorted Array Sorted
 * Description
 * You will be given two arrays of integers, array1 and array2. The array1 will be almost sorted in ascending order with just one element in the wrong position making the array unsorted. You need to find a maximum possible element from the array2 which makes the array1 sorted after replacing the wrongly positioned element of the array1 with this element.
 *
 *
 * Note:
 * The wrongly placed element in the array1 will not be at the 0th index of the array or at the (n-1)th index of the array.
 * If there is no element in array2[] which can make array1[] sorted, then print ‘Not Possible’
 * array1 might contain duplicates. A sorted array can contain duplicates.
 * If array1[i] is less than array1[i-1], then index i is the wrong index.
 *
 * Input Format:
 * The first line will be an integer ‘n1’ representing the size of the array1.
 * The next line will be n1 space separated integers representing the elements of the array1.
 * The next line will be an integer ‘n2’ representing the size of the array2.
 * The next line will be n2 space separated integers representing the elements of the array2.
 *
 * Output Format:
 * Print the maximum possible element from the array2 which makes the array1 sorted after replacing the wrongly positioned element of the array1 with this element from array2.
 *
 * Sample Input 00:
 * 5
 * 2 7 8 6 13
 * 4
 * 15 11 9 5
 *
 * Sample Output 00:
 * 11
 *
 * Explanation 00:
 *
 * Element 6 in array1 can be replaced by element 11 (maximum possible) in array2.
 */
public class MakeUnsortedArraySorted {

    public static int findUnsortedNumber(int[] arr){
        int unsortedValue = arr[1];

        for( int i =1 ;i<arr.length;i++){
           if(arr[i] < arr[i-1]){
               unsortedValue = arr[i];
           }
        }
        return unsortedValue;
    }

    private static int findClosestNumber(int[] arr, int unsortedNumber) {
        int n = arr.length;

        // Corner cases
        if (unsortedNumber <= arr[0])
            return arr[0];
        if (unsortedNumber >= arr[n - 1])
            return arr[n - 1];

        // Doing binary search
        int i = 0, j = n, mid = 0;
        while (i < j) {
            mid = (i + j) / 2;

            if (arr[mid] == unsortedNumber)
                return arr[mid];

            /* If target is less than array element,
               then search in left */
            if (unsortedNumber > arr[mid]) {

                // If target is greater than previous
                // to mid, return closest of two
                if (mid > 0 && unsortedNumber > arr[mid - 1])
                    return getClosest(arr[mid - 1], arr[mid], unsortedNumber);

                /* Repeat for left half */
                j = mid;
            }

            // If target is greater than mid
            else {
                if (mid < n-1 && unsortedNumber < arr[mid + 1])
                    return getClosest(arr[mid], arr[mid + 1], unsortedNumber);
                i = mid + 1; // update i
            }
        }

        // Only single element left after search
        return arr[mid];
    }

    public static int getClosest(int val1, int val2,
                                 int target)
    {
        if (target - val1 <= val2 - target)
            return val2;
        else
            return val1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = s.nextInt();
        }
        int unsortedNumber = findUnsortedNumber(array1);

        int n2 = s.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = s.nextInt();
        }

        System.out.println(findClosestNumber(array2, unsortedNumber));

        // Write your code here

    }
}
