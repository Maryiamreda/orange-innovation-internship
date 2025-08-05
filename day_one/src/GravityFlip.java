import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        for (int i = 0; i < n ; i++) {
            for (int j= i+1; j < n ; j++) {

                if(arr[i]>arr[j]){
                    int a =arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
        }
        for (int i = 0; i < n ; i++) {
        System.out.print(arr[i]+" ");}
    }
}
