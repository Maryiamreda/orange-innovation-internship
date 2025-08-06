import java.util.Scanner;

public class Joysticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String toCharge;

        if(x < y) toCharge = "x";
        else toCharge = "y";

        int minutes = 0;

        if (x == 1 && y == 1) {
            System.out.println(0);
            sc.close();
            return;
        }

        while (x > 0 && y > 0) {
            if (x <= 2) toCharge = "x";
            else if (y <= 2) toCharge = "y";
            else if (x < y) toCharge = "x";
            else toCharge = "y";

            if (toCharge.equals("x")) {
                x++;
                y -= 2;
            } else {
                y++;
                x -= 2;
            }

            minutes++;

            if (x <= 0 || y <= 0) break;
        }

        System.out.println(minutes);
        sc.close();
    }
}
