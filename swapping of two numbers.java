import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, temp;

        System.out.print("Enter value for a: ");
        a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);

        scanner.close();
    }
}