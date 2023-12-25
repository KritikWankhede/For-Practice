import java.util.ArrayList;
import java.util.Scanner;
public class EndOfLife {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        while(sc.hasNext()){
            String input=sc.nextLine();
            list.add(input);
        }
        sc.close();
        for(int i=0;i<list.size();i++){
            System.out.println((i+1) + " " + list.get(i) );
        }
       
    }
}
