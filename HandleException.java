import java.util.Scanner;

public class HandleException {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter two number");
            int num1=scanner.nextInt();
            int num2=scanner.nextInt();
            System.out.println(num1/num2);
            scanner.close();
        }
        catch (Exception e) {
            System.out.println("You cannot divide by zero");
                e.printStackTrace();
        }
    }
    
}
