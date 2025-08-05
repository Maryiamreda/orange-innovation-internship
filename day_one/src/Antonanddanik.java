import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class Antonanddanik {
    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);


        int number_of_games  = myObj.nextInt();
        myObj.nextLine();
        String outcome_of_games = myObj.nextLine();


        getwinner( number_of_games , outcome_of_games);
    }private static void getwinner(int number_of_games ,String outcome_of_games){

int Anton=0;
int danik=0;


        for (int i = 0; i < number_of_games ; i++) {
            char outcome=outcome_of_games.charAt(i);
            if(outcome=='A') Anton++;
           else if(outcome=='D') danik++;


        }
        if(Anton==danik)  System.out.println("Friendship");
        if(Anton>danik)  System.out.println("Anton");
        if(Anton<danik)  System.out.println("Danik");

    }
}









