 //import java.util.Scanner;

import java.util.ArrayList;

public class SubString {
   
    public static String getSmallestAndLargest(String s, int k) {
        String smallest =s.substring(0,k);
        String largest =s.substring(s.length()-k);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i+k<=s.length(); i++) {
            String sub=s.substring(i,i+k);
            if(sub.compareTo(smallest) < 0){
                smallest = sub;
            }
            if(sub.compareTo(largest) > 0){
                largest = sub;
            }
            list.add(sub);
        }
        // for (String strings : list){
        //     System.out.print(strings+" ");
        // }
        // System.out.println();
        return smallest+ "\n" + largest;
    }
    public static void main(String[] args) {
        String ques="fsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";
        int k=100;
        System.out.println(getSmallestAndLargest(ques, k));
    }
}
