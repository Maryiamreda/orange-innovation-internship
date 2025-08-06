import java.util.Scanner;
import java.util.ArrayList;

public class Autocomplete {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prefix = sc.nextLine();
        ArrayList<String> tokens = new ArrayList<String>();

        int n  =sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            tokens.add(sc.nextLine());
        }
        int prefixLength = prefix.length();
        String result = null;

        for (int i = 0; i < n; i++) {
            String token = tokens.get(i);
            if (token.startsWith(prefix)) {
                if (result == null || token.compareTo(result) < 0)
                {
                       result = token;
                   }
               }

        }
        if (result == null) {
            System.out.println(prefix);
        } else {
            System.out.println(result);
        }
    }
}