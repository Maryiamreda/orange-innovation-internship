import java.util.Scanner;

public class VasyaandDigitalRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int k=input.nextInt();
int d=input.nextInt();

        if (d == 0 && k > 1) {
            System.out.println("No solution");
        }
        else if (k == 1 && d == 0) {
            System.out.println(0);
        }
else{
            String output = Integer.toString(d);
            for (int i = 1; i < k; i++) {
                output += "0";
            }
            System.out.println(output);
        }
    }
}
