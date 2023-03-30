import java.util.Scanner;
import java.util.Stack;

public class Diamantes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        in.nextLine();

        for (int index = 0; index < times; index++) {
            Stack<String> openDiamonds = new Stack<String>();
            int countDiamonds = 0;
            String mine = in.nextLine();
            String[] arrayItemsInMine = mine.split("");
        
            for (String currentChar : arrayItemsInMine) {
                if(currentChar.equals("<")){
                    openDiamonds.push(currentChar);
                }
                else{
                    if(currentChar.equals(">") && !openDiamonds.empty()){
                        openDiamonds.pop();
                        countDiamonds++;
                    }
                }
            }

            System.out.println(countDiamonds);
        }
    }
}