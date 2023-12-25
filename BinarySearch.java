public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={0,1,5,6,7,8,9,10,11,12,13};
        //sortArr(arr);
        insertSort(arr);
        int ans=search(arr, 11);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        if(ans!= -1) {
            System.out.println("The number is at "+ans+" position in array");
        }
        else {
            System.out.println("The number is not present \n Please check again");
        }
    }
    static int search(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid=(end-start)/2 + start;
            //target == arr[mid] ? return mid : (target>arr[mid] ? start=mid+1 : end=mid+1);
            if(target ==arr[mid]) {
                return mid;
            }
            else if(target > arr[mid]) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }

    static void sortArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j]>=arr[i]){
                    int temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            }
        }
    

    static void insertSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for (int j = i+1; j >0; j--) {
               if(arr[j]<=arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
            }
            else{
                break;
            }
            }
        }
    }
 
}


