import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ParenthesisBalance {
    public static void main(String[] args) {
        ArrayList<String> inputList = new ArrayList<String>();
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            inputList.add(in.nextLine());
        }

        for (int index = 0; index < inputList.size(); index++) {
            Stack<String> openParenthesis = new Stack<String>();
            boolean wasWrong = false;
            String currentInputString = inputList.get(index);
            if (currentInputString != null) {
                String[] currentInputSplited = currentInputString.split("");
                for (String currentChar : currentInputSplited) {
                    if(currentChar.equals("(")){
                        openParenthesis.add(currentChar);
                    }else{
                        if(currentChar.equals(")")){
                            if(!openParenthesis.isEmpty()){
                                openParenthesis.pop();
                            }else{
                                System.out.println("incorrect");
                                wasWrong = true;
                            }
                        }
                    }
                }
            }

            if (!wasWrong) {
                if(openParenthesis.isEmpty()){
                    System.out.println("correct");
                }else{
                    System.out.println("incorrect");
                }
            }
        }

    }
}
