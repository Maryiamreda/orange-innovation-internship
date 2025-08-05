import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number_of_problems = myObj.nextInt();
        int[][] arr = new int[number_of_problems][3];
        for (int i = 0; i < number_of_problems; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]=myObj.nextInt();
            }
        }
        NoOfProblemsImplemented(number_of_problems, arr);

    }

    private static void NoOfProblemsImplemented(int number_of_problems , int[][] solutions) {
        int NoOfProblemsImplemented=0;
        for(int i=0;i<number_of_problems;i++){
int sum=solutions[i][0]+solutions[i][1]+solutions[i][2];
 if(sum>=2) NoOfProblemsImplemented++;

        }
        System.out.println(NoOfProblemsImplemented);
    }
    }
