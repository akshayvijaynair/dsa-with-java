public class BinarySearch {

    /**
     * Expectation : Array should be sorted
     *
     * if the num is found then print the index
     * else print that the number is not found
     *
     * @param arr for the input array
     * @param left for low point index of array
     * @param right for high point index of array
     * @param num for number to search
     *
     * TC : O(logn)
     *
     */
    public static void search(int[] arr, int left, int right, int num){

        //Base condition
        if(left > right){
            System.out.println("Number : "+ num +" can't be found in the array");
            return ;
        }

        int mid = left + (right - left)/2 ; // (left+right)/2

        if(arr[mid] == num){
            System.out.println(num + " is found at the index "+ mid);
        }
        else if ( arr[mid] > num){
            search(arr, left, mid-1, num);
        }else{
            search(arr, mid+1, right, num);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        search(arr, 0, arr.length-1 , 7);
    }
}