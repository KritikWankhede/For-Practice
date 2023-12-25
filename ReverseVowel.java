public class ReverseVowel {
    public static void main(String[] args) {
        String ques="leetcode";
        System.out.println(reverseVowel(ques));
    }
    public static String reverseVowel(String ques) {
        ReverseVowel rev= new ReverseVowel();
        int start=0;
        int end=ques.length()-1;
        char[] list = ques.toCharArray();
         while (start <= end){
            if(rev.isVowel(list[start]) && rev.isVowel(list[end])){
                 char next = list[start];
                 list[start]=list[end];
                 list[end]=next;
                 start++;
                 end--;
            }
            else if(!rev.isVowel(list[start])){
                start++;
            }
            else {
                end--;
            }
         }
        return new String(list);
    }
    public boolean isVowel(char ch) {
        ch=Character.toLowerCase(ch);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='u' || ch=='o'){
            return true;
        }
        return false;
    }    

}
