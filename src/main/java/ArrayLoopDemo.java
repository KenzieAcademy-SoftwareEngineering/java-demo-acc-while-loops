public class ArrayLoopDemo {
    public static void main(String[] args) {
        //declare variables
        int[] numArray = { 51, 2, 10, 100, 50, 3, -50};
        int index = 0;

        //loop through array
        while(index < numArray.length){

            //check for values greater than 50
            if(numArray[index]>50){
                System.out.print(numArray[index]);
                System.out.print(" "); //adds space after each number
            }

            //update index
            index+=1;
        }

    }
}
