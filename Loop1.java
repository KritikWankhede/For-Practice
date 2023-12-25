import java.util.Scanner;

public class Loop1 {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[][] num=new int[size][3];
        
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<num.length;i++){
             int sum=num[i][0];
            for(int j=0;j<num[i][2];j++){
                sum+=(int) (Math.pow(2, j) * num[i][1]);
                System.out.print(sum+ " ");
            }
            System.out.println();
            sc.close();
        } 
    }
}
