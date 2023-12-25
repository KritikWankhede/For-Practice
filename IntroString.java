import java.util.ArrayList;
import java.util.Scanner;

public class IntroString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        int sum=0;
        while(sc.hasNext()){
            String word=sc.next();
            sum+=word.length();
            list.add(word);
        }
        sc.close();
        System.out.println(sum);
        String first = Character.toUpperCase(list.get(0).charAt(0)) + list.get(0).substring(1);
        String second = Character.toUpperCase(list.get(1).charAt(0)) + list.get(1).substring(1);
        if(first.charAt(0) > second.charAt(0)){
                System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        
        System.out.println(first+" " + second);

    }
}
