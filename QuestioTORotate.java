import java.util.Scanner;

public class QuestioTORotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int testcases=sc.nextInt();
       for(int i=0;i<testcases;i++){
          int size=sc.nextInt();
          int rot=sc.nextInt();
          int[] arr=new int[size];
            for(int j=0; j<size;j++){
                arr[j]=sc.nextInt();
            }
            array(arr, rot);
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]+" ");
            }
       }
       sc.close();
    }
    static void array(int[] arr,int rot){
        rot=(rot % arr.length)+1;
        if(rot<0){
            rot=rot+arr.length;
        }

        int[] temp=new int[arr.length];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr[((i+rot)%arr.length)];
        }
        // for(int i=0;i<temp.length;i++){
        //     System.out.print(temp[i]+ " ");
        // }
        // System.out.println();
        for (int i = 0; i < temp.length; i++) {
            arr[i]=temp[i];
        }
       
    }
}
