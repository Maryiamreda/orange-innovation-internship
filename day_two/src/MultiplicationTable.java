import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int c= 0;


        for (int i = 1; i <= n; i++) {
            if (x % i == 0) {
                int j = x / i;
                if (j <= n) {
                    c++;
                }
            }
        }

        System.out.println(c);

    }
}
