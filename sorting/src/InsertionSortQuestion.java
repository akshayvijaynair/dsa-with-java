import java.util.Scanner;

class InsertionSortQuestion {

    public static void insertSort(String[] arr, boolean sortInAscendingOrder){

        for( int i =1 ;i<arr.length;i++){
            String v = arr[i];
            int  j= i;

            if(sortInAscendingOrder){
                while(j>=1 && arr[j-1].compareTo(v)>0){
                    arr[j]=arr[j-1];
                    j--;
                }
            }else {
                while(j>=1 && arr[j-1].compareTo(v)<0){
                    arr[j]=arr[j-1];
                    j--;
                }
            }

            arr[j]=v;
        }
    }
    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String firstNames[] = new String[size];
        String lastNames[] = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }

        insertSort(firstNames, true);
        insertSort(lastNames, false);
        //Write your code here
        for (int i = 0; i < size; i++) {
            System.out.println(firstNames[i]);
        }
        for (int i = 0; i < size; i++) {
            System.out.println(lastNames[i]);
        }
    }
}
