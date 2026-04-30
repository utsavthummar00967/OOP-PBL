import java.util.*;

public class practical_29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks: ");
            marks.add(sc.nextInt());
        }

        System.out.println("Marks: " + marks);
        System.out.println("Highest: " + Collections.max(marks));
        System.out.println("Lowest: " + Collections.min(marks));

        sc.close();
    }
}
