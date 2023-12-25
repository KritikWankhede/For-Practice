import java.util.Scanner;

public class ConverterStringtoInt{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numString = scanner.next();
        try{
                Integer.parseInt(numString);
                System.out.println("Good Job");
        }
        catch (Exception e){
            System.out.println("Wrong Job");
        }
        scanner.close();
     }
}