import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);


        int Limak_weight = myObj.nextInt();
        int Bob_weight = myObj.nextInt();


        getYear(Limak_weight, Bob_weight);
    }

    private static void getYear(int Limak_weight, int Bob_weight) {
        int i = 0;
        while (Limak_weight <= Bob_weight) {
            Limak_weight = Limak_weight*3;
            Bob_weight = Bob_weight*2;
//            System.out.println(Limak_weight);System.out.println(Bob_weight);
            i++;
        }
        System.out.println(i);
    }
}
