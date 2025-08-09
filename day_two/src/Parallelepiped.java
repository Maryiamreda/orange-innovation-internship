import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double v1= sc.nextDouble();
        double v2= sc.nextDouble();
        double v3= sc.nextDouble();

       double H=Math.sqrt((v3*v2)/v1);
       double L=v3/H;
       double B=v2/H;
       int sumOfEdges=(int)(4*(H+L+B));
       System.out.println(sumOfEdges);


    }
}
