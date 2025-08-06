import java.util.*;

public class LaLaLand {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] tress = new int[n][2];

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            tress[i][0] = sc.nextInt();
            tress[i][1] = sc.nextInt();


//            -2 2
//            1 4
//                    -1 3
            if (tress[i][0] < 0) {
//                [-1,-2]
                left.add(tress[i][0]);
            } else {
                right.add(tress[i][0]);
//                [1]
            }
        }

        Collections.sort(left, Collections.reverseOrder());
        Collections.sort(right);

        int apples = 0;
        int i = 0;

        while (i < left.size() && i < right.size()) {
            int leftPos = left.get(i);
            int rightPos = right.get(i);

            for (int j = 0; j < n; j++) {
                if (tress[j][0] == leftPos) {
                    apples += tress[j][1];
                    break;
                }
            }

            for (int j = 0; j < n; j++) {
                if (tress[j][0] == rightPos) {
                    apples += tress[j][1];
                    break;
                }
            }

            i++;
        }


        System.out.println(apples);
    }
}
