//import java.util.Scanner;
public class VideoGame {
   
    public static int minSegmentsToWin(int[] segments) {
        int player2Score = segments.length - 1;
        int minSegmentsToWin = 0;

        for (int i = 0; i < segments.length; i++) {
            if(segments[i] ==1){
                player2Score--;
            }
            else{
                player2Score++;
            }
        } 
            if(player2Score>=segments.length || player2Score<minSegmentsToWin){
                return minSegmentsToWin;
            }
            minSegmentsToWin = player2Score+1;
            return minSegmentsToWin;
        }
    
        public static void main(String[] args) {
            int[] segments = {1, 0, 0, 0, 1};
            int minSegments = minSegmentsToWin(segments);
            System.out.println("Minimum segments for Player 1 to win: " + minSegments);
        }
    
    
}
    

