import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={15,2,3,4,5,6,8};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("\n"+Arrays.toString(arr));

    }
    static void sort(int[] arr){
       // int count=0;
        for (int i = 0; i < arr.length; i++) {
            boolean swap=false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap=true;
                    //System.out.print(swap+" ");
                    //System.out.print(" "+ count++);
                }
            }
            if(!swap) break;
        }

    }
    
}
