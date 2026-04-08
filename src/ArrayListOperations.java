import java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<String> items = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            items.add(sc.next());
        }

        String searchItem = sc.next();

        // Sort alphabetically
        Collections.sort(items);

        // Check if item exists
        boolean found = items.contains(searchItem);

        // Output
        System.out.println("Sorted Items: " + items);
        if (found)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
