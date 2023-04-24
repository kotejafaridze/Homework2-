import java.io.*;
import java.util.Scanner;

public class ArrayOperations {

    private ArrayOperations(){}


    public static int[] reader(String fileName) throws FileNotFoundException, InvalidNumberException {
        int[] arr = new int[10];
        int inx = 0;
        int per;
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            try{
                per = Integer.parseInt(scanner.nextLine());
                if(per < 0){
                    throw new InvalidNumberException("Negative Number!");
                }
                arr[inx] = per;
                inx++;
            }catch (NumberFormatException e ){
                System.out.println(e.getMessage());
            }

        }
        scanner.close();
        return arr;
    }

    public static int sumer(int[] arr){
        int sum = 0;
        for(int each : arr){
            try {
                sum += each;
                if(sum < 0){
                    throw new ArithmeticException("Sum is Negative!");
                }
            }catch (NumberFormatException e ){
                System.out.println(e.getMessage());
            }
        }
        return sum;
    }

}
