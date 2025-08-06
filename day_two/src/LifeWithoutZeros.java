import java.util.Scanner;

public class LifeWithoutZeros {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String x = myObj.nextLine();
        String y = myObj.nextLine();
        int sum = Integer.parseInt(x) + Integer.parseInt(y);
        String newSum = String.valueOf(sum).replace("0", "");

        x = x.replace("0", "");
        y = y.replace("0", "");
        int sumAfter = Integer.parseInt(x) + Integer.parseInt(y);
        if (sumAfter == Integer.parseInt(newSum)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
