import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSolution {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int nlines=sc.nextInt();
        for (int i = 0; i < nlines; i++) {
            int size=sc.nextInt();
            ArrayList<Integer> consume=new ArrayList<>();
            for (int j = 0; j < size; j++) {
                int num=sc.nextInt();
                consume.add(num);
            }
            list.add(consume);
        }
        
        int qsize=sc.nextInt();
       
        for (int i = 0; i < qsize; i++) {    
            int rows=sc.nextInt();
            int cols=sc.nextInt();
        try{
           System.out.println(list.get(rows-1).get(cols-1));
        }
        catch(Exception e){
            System.out.println("Error!");
        }
     }
     sc.close(); 
    }
}
