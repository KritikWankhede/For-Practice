import java.util.Scanner;

public class FormattedString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] list=new String[3];
        int[] num=new int[3];
        for(int i=0;i<list.length;i++){
            list[i]=sc.next();
            num[i]=sc.nextInt();
        }
        System.out.println("================================");
        for(int i=0;i<list.length;i++){
            String formattedScore = String.format("%03d", num[i]);
            // Format the table row
            String row = String.format("%-14s %s", list[i], formattedScore);
            System.out.println(row);
        }
       System.out.println("================================"); 
       sc.close();
    }
    
}
