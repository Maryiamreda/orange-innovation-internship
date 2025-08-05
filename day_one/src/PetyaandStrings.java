import java.util.Scanner;
public class PetyaandStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N1 = sc.nextLine();
        String N2= sc.nextLine();
        N1 = N1.toLowerCase();
        N2 = N2.toLowerCase();

int result=0;
        for (int i = 0; i < N1.length(); i++) {
            if(N1.charAt(i)>N2.charAt(i)) {
                result = 1;
                break;
            }
            else if(N1.charAt(i)<N2.charAt(i)) {
                result = -1;
                break;
            }

        }
        System.out.println(result);
    }
}
