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

        Collections.sort(items);

        System.out.println("Sorted Items: " + items);

        if (items.contains(searchItem))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
