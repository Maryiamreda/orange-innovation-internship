import java.util.Scanner;

public class AlenaSchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pairs = new int[n];

        for (int i = 0; i < n; i++) {
            pairs[i] = sc.nextInt();
        }

        int j = 0;
        int noOfPairs = 0;


        while (j < n && pairs[j] == 0) {
            j++;
        }

        int i = j;
        int count = 0;

        for (; i < n; i++) {
            //1 0 1 0 0 1 0
            if (pairs[i] == 1) {
                noOfPairs++;
                if (count == 1) {
                    noOfPairs++;
                }
                count = 0;
            } else {
                count++;
            }
        }

        System.out.println(noOfPairs);
    }
}
