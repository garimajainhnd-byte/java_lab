import java.util.Scanner;

// Class containing all operations
class Operations {

    // Factorial
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    // Fibonacci series up to n terms
    void fibonacci(int n) {
        System.out.print("Fibonacci series: ");
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Check palindrome
    boolean isPalindrome(int n) {
        int temp = n, rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n;
    }

    // Check Armstrong number
    boolean isArmstrong(int n) {
        int sum = 0, temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit; // for 3-digit number
            temp /= 10;
        }
        return sum == n;
    }

    // Pattern printing (simple triangle)
    void pattern(int n) {
        System.out.println("Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}

// Main class
public class AllOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations op = new Operations();

        System.out.print("Enter a number for factorial, palindrome and Armstrong: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " = " + op.factorial(num));

        op.fibonacci(10); // Fibonacci series of 10 terms

        if (op.isPalindrome(num))
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is not a Palindrome");

        if (op.isArmstrong(num))
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");

        System.out.print("Enter number of rows for pattern: ");
        int rows = sc.nextInt();
        op.pattern(rows);

        sc.close();
    }
}
