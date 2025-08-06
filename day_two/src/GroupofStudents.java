import java.util.Scanner;

public class GroupofStudents {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int m = myObj.nextInt();
        int[] c = new int[m + 1];

        for (int i = 1; i <= m; i++) {
            c[i] = myObj.nextInt();
        }

        int x = myObj.nextInt();
        int y = myObj.nextInt();

        int total = 0;
        for (int i = 1; i <= m; i++) {
            total += c[i];
        }

        for (int k = 1; k <= m; k++) {
            int beginner = 0;
            for (int i = 1; i < k; i++) {
                beginner += c[i];
            }

            int intermediate = total - beginner;

            if (beginner >=x && beginner <= y &&
                    intermediate >=x && intermediate <= y) {
                System.out.println(k);
                myObj.close();
                return;
            }
        }


        System.out.println(0);

    }
}