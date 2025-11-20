import java.util.*;
public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= a; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd);

            if (i < a) {
                System.out.print(", ");
            }
        }
    }
}
