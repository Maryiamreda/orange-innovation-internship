import java.util.Scanner;
public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[]  poles = new String[n];
        for(int i=0;i<n;i++){
            poles[i] = sc.next();
        }
        int groups=1;
        for(int i=1;i<n;i++){
            if (!poles[i].equals(poles[i - 1])) {
                groups++;
            }
        }
        System.out.println(groups);
    }
}
