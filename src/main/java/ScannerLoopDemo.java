import java.util.Scanner;

public class ScannerLoopDemo {
    public static void main(String[] args) {
        //declare variables
        Scanner scanner = new Scanner(System.in);
        String tempString;
        String finalString = "";
        boolean endInput = false;

        //Added this prompt after the demo to make it more user-friendly
        System.out.println("Enter string and hit enter after each string\n. To exit, type \"X + ENTER\"");

        //loop until X is entered
        while(endInput != true){
            //read input
            tempString = scanner.nextLine();

            //check for X
            if(!tempString.equalsIgnoreCase("X")){
                //what if it's the first one? <--
                if(finalString.equals("")) {
                    finalString = finalString + tempString;
                }
                else {
                    finalString = finalString + "," + tempString;
                }

            }
            else {
                endInput = true;
                // break;  /// hard break out of loop -- frowned upon
            }
        }
        //print out final string
        System.out.println(finalString);

    }
}
