import java.util.*;

public class DigitalCounter {
    static String[] arr = {
            "012456",
            "25",
            "02346",
            "02356",
            "1235",
            "01356",
            "013456",
            "025",
            "0123456",
            "012356"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        String first = arr[n.charAt(0) - '0'];
        String second = arr[n.charAt(1) - '0'];

      int goodInt = 0;

        for (int i = 0; i < first.length(); i++) {
            StringBuilder newStr = new StringBuilder(first);
            newStr.deleteCharAt(i);

            for (int d = 0; d <= 9; d++) {
                if (arr[d].equals(newStr.toString())) {
                   goodInt++;
                }
            }
        }

        // Try removing each stick from the second digit
        for (int i = 0; i < second.length(); i++) {
            StringBuilder newStr = new StringBuilder(second);
            newStr.deleteCharAt(i);

            for (int d = 0; d <= 9; d++) {
                if (arr[d].equals(newStr.toString())) {
                    goodInt++;                }
            }
        }


        System.out.println(goodInt);

    }
}
