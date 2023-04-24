import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int[] tester = {1, 2, 3, 120};
        readKote("kote.txt");
        mySumr(tester);


    }

    public static void readKote(String fileName){
        int[] arr;
        try {
            arr = ArrayOperations.reader(fileName);
            for(int each : arr){
                System.out.println(each);
            }
        }catch (InvalidNumberException e2){
            System.err.println(e2.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void mySumr(int[] arr){

        try {
            int sum = ArrayOperations.sumer(arr);
            System.out.println("The sum = " + sum);
        }catch (ArithmeticException e3){
            System.err.println(e3.getMessage());
        }
    }
}