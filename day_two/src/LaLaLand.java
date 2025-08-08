import java.util.*;

class MyPair {
    private final int position;
    private final int apples;

    public MyPair(int position, int apples) {
        this.position = position;
        this.apples = apples;
    }
    public int getPosition() {
        return position;
    }
    public int getApples() {
        return apples;
    }
}

public class LaLaLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<MyPair> left = new ArrayList<>();
        List<MyPair> right = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int a = sc.nextInt();
            if (p < 0) left.add(new MyPair(p, a));
            else right.add(new MyPair(p, a));
        }

        int apples = 0;
        int i = 0;


        while (i < left.size() && i < right.size()) {
            apples += left.get(i).getApples();
            apples += right.get(i).getApples();
            i++;
        }


        if (i < left.size()) apples += left.get(i).getApples();
        if (i < right.size()) apples += right.get(i).getApples();

        System.out.println(apples);
    }
}
