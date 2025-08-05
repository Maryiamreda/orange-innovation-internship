import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Scanner myObj = new Scanner(System.in);


        // String input
        int number_of_friends = myObj.nextInt();

        int fence_height = myObj.nextInt();

        int[] arr = new int[number_of_friends ];

        for (int i = 0; i < number_of_friends ; i++) {
            if (myObj.hasNextInt()) {
                arr[i] = myObj.nextInt();
            }
        }
        vanyaAndFriends(number_of_friends ,fence_height,arr);

        //        vanyaAndFriends(number_of_friends,fence_height,)

    }
    private static void vanyaAndFriends(int number_of_friends ,int fence_height , int[] friends_hights){
        int initial_width=number_of_friends;
        for (int i = 0; i < number_of_friends; i++) {
            if(friends_hights[i]>fence_height)
                initial_width++;
        }
        System.out.println(initial_width);

    }
}




