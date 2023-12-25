
import java.util.Scanner;

public class Genere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] a = { 1, 2, 3};
        String[] b = new String[] {"Hello", "World"};   
        
        printArray(a);
        printArray(b);
        scanner.close();
    }
    public static   <T> void  printArray(T[] array) {
        for (int i = 0; i < array.length;i++) {
            System.out.println(array[i]);
        }
    }
}
