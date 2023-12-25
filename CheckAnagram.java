import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word1=sc.next();
        String word2=sc.next();
        word1=word1.replaceAll("\\s", " ").toLowerCase();
        word2=word2.replaceAll("\\s", " ").toLowerCase();
        sc.close();
        if(word1.length() != word2.length()) {
            System.out.println("Not Anagrams");
            return ;
        }
        Map<Character,Integer> first = new HashMap<Character,Integer>();
        Map<Character,Integer> second =new HashMap<Character,Integer>();
        for (char c : word1.toCharArray()) {
            first.put(c, first.getOrDefault(c, 0)+1);
        }
        for (char c : word2.toCharArray()) {
            second.put(c, second.getOrDefault(c, 0)+1);
        }

        if(first.equals(second)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
        
    }
    
}
