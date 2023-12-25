import java.util.Scanner;

public class Token {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();
        line=line.trim();
        scanner.close();
        if(line.length()==0){
            System.out.println(0);  
        }
        else{
            String[] set=line.split("[!,?._'@\\s]+");
            System.out.println(set.length);
            for (String sets : set) {
                System.out.println(sets);
            }
        }
    }
}
