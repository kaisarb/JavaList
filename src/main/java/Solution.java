import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // Initial number of elements in the list
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            L.add(scanner.nextInt());  // Elements of the list
        }

        int Q = scanner.nextInt(); // Number of queries

        for (int i = 0; i < Q; i++) {

            String queryType = scanner.next();
            if (queryType.equals("Insert")) {

                int x = scanner.nextInt();
                int y = scanner.nextInt();
                L.add(x,y);    // Inserting element y at index x
            }
            else if (queryType.equals("Delete")) {
                int x = scanner.nextInt();
                L.remove(x);    // Deleting element at index x
            }

        }

        scanner.close();
        for (int num : L) {
            System.out.print(num + " ");
        }
    }
}
