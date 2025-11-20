import java.util.*;
public class Program_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if (a <= 0) 
        {
            System.out.println("Invalid input");
            return;
        }
        int count = (a % 2 == 0) ? a - 1 : a;
        for (int i = 1; i <= count; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd);
            if (i < count) {
                System.out.print(", ");
            }
        }
    }
}
