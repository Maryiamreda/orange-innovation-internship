import java.util.Scanner;
public class RoundHouse {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int n = myObj.nextInt();
        int a = myObj.nextInt();
        int b = myObj.nextInt();


        int steps = Math.abs(b);
        int[] path = new int[steps + 1];

        int current = a;
        path[0] = current;

        if (b > 0) {
            //clockwise
            for (int i = 1; i <= steps; i++) {
                current++;
                if (current > n) current = 1;
                path[i] = current;
            }
        } else {
            //counterclockwise
            for (int i = 1; i <= steps; i++) {
                current--;
                if (current < 1) current = n;
                path[i] = current;
            }
        }

        System.out.println( current);

    }
}
