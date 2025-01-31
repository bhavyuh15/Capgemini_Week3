package sorting.insertionsort;
import java.util.Arrays;
public class InsertionSort {

    public static void company(int[] arr){
        int n=arr.length;

        for (int i = 1; i <n ; i++) {
            int key=arr[i];                  // making the ith index as key
            int j=i-1;
            while (j >= 0 && arr[j]>key) {   //comparing and moving one element ahead
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;                  // updating the key
        }
    }
    public static void main(String[] args) {
        int [] employeeID={13,54,37,82,49};
        company(employeeID);
        System.out.println(Arrays.toString(employeeID));
    }
}
