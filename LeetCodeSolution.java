import java.util.ArrayList;

public class LeetCodeSolution {
        public static void main(String[] args) {
            LeetCodeSolution solution = new LeetCodeSolution();
            String s=" Hello moon ";
            
            int ans = solution.lengthOfLastWord(s); 
            System.out.println(ans);
        }

        public int lengthOfLastWord(String s) {
            String[] words = s.split(" ");
            ArrayList<String> ans=new ArrayList<>();
            for (int i = 0; i < words.length; i++) {
                if (words[i].trim() != "")
                {
                    ans.add(words[i]);
                }
                //System.out.println(words[i]);
            }
            //System.out.println(ans.toString());
            return ans.get(ans.size()-1).length(); 
        }
}
