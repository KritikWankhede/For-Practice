import java.util.Scanner;
public class SumOfNumbers{
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("Sum of numbers:-"+(num1+num2));
        sc.close();
    }
    
}