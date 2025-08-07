import java.util.Scanner;

public class ApplemanandEasyTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int c = 0;

                if (i > 0 && arr[i -1][j]=='o') c++;

             if (i < n-1 && arr[i +1][j] =='o') c++;
                if (j > 0 && arr[i][j -1] =='o') c++;
                if (j < n-1 && arr[i][j+ 1]== 'o') c++;

                if (c % 2 != 0) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }
}
