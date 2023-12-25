import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); 
        scanner.nextLine();// consumes the next line
        Map<String, String> phoneBook = new HashMap<>();
        
        // Populate the phone book
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            phoneBook.put(name, phoneNumber);
        }
        System.out.println(phoneBook.toString());
        ArrayList<String> queries=new ArrayList<>();
        // Look up phone numbers
        while (scanner.hasNext()) {
            String query = scanner.nextLine();
            queries.add(query);
        }
        System.out.println(queries.toString());
        scanner.close();
        for (int i = 0; i < queries.size(); i++) {
            if(phoneBook.containsKey(queries.get(i))){
                String phoneNumber = phoneBook.get(queries.get(i));
                System.out.println(queries.get(i) + "=" + phoneNumber);
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
