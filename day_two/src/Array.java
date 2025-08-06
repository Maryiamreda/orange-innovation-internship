import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> zeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0) {
                negatives.add(numbers[i]);
            } else if (numbers[i] > 0) {
                positives.add(numbers[i]);
            } else {
                zeros.add(numbers[i]);
            }
        }

        ArrayList<Integer> firstSet = new ArrayList<>();
        ArrayList<Integer> secondSet = new ArrayList<>();
        ArrayList<Integer> thirdSet = new ArrayList<>();

        firstSet.add(negatives.get(0));
        negatives.remove(0);

        if (positives.size() > 0) {
            secondSet.addAll(positives);
        } else {
            secondSet.add(negatives.get(0));
            secondSet.add(negatives.get(1));
            negatives.remove(0);
            negatives.remove(0);
        }


        thirdSet.addAll(negatives);
        thirdSet.addAll(zeros);


        print(firstSet);
        print(secondSet);
        print(thirdSet);
    }

    public static void print(ArrayList<Integer> set) {
        System.out.print(set.size());
        for (int num : set) {
            System.out.print(" " + num);
        }
        System.out.println();
    }
}
