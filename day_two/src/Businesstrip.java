import java.util.Scanner;

public class Businesstrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int[] growth= new int[12];

        for (int i = 0; i < 12; i++) {
            growth[i] = scanner.nextInt();
        }

        // Sort array descending
        for (int i = 0; i < 11; i++) {
            for (int j = i + 1; j < 12; j++) {
                if (growth[i] < growth[j]) {
                    int temp = growth[i];
                    growth[i] = growth[j];
                    growth[j] = temp;
                }
            }
        }

        int total = 0;
        int months = 0;

        for (int i = 0; i < 12; i++) {
            if (total >= k) {
                break;
            }
            total += growth[i];
            months++;
        }

        if (total >= k) {
            System.out.println(months);
        } else {
            System.out.println(-1);
        }


    }


}
