package sorting.bubblesort;

import java.util.Arrays;

public class  BubbleSort {

    public void studentMarks(int[] arr){
        int n=arr.length;
        boolean swapped = false;

        for(int i=0;i<n-1;i++){
            for (int j = 0; j < n-1 ; j++) {
                if (arr[j]>arr[j+1]){         // condition for swap
                    int temp=arr[j];         // swaping of elements
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }if(!swapped){
                break;                     // loop breaks if no swap left to occure
            }
        }
    }
     public static void main(String[] args) {
         int [] marks= {87,73,80,13,51,76,19,40};
         BubbleSort bs=new BubbleSort();          //making an object of the class
         bs.studentMarks(marks);                 //calling the function
         System.out.println(Arrays.toString(marks));
     }
}
