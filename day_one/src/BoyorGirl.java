import java.util.Scanner;
public class BoyorGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        int noOfdistinct=0;
for(int i=0;i<userName.length();i++){
    boolean isNew = true;
    for(int j=i+1;j<userName.length();j++){
if(userName.charAt(i)==userName.charAt(j)){
    isNew = false;
    break;
}
    }
    if (isNew) {
        noOfdistinct++;
    }
}
        if (noOfdistinct % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
