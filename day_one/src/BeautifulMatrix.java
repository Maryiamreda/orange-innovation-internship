import java.util.Scanner;
public class BeautifulMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] myMatrix=new int[5][5];
        int myNumberow=-1;
        int myNumbercol=-1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                myMatrix[i][j]=sc.nextInt();
                if(myMatrix[i][j] ==1){
                    myNumberow=i;
                    myNumbercol=j;
                }
            }
        }

        int number_of_moves=0;


            number_of_moves=Math.abs(myNumbercol-2)+Math.abs(myNumberow-2);
            System.out.println( number_of_moves);


    }
}
