import java.util.Arrays;
import java.util.Random;


public class Main {
    private static int[] sortIntegers(int Array[]){
        
    }

    public static void main(String[] args) {
        int unsortedArray[] = randomArray(5);
        System.out.println(Arrays.toString(unsortedArray));
        Arrays.sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));

    }
    public static int[] randomArray(int len){
        Random rand = new Random();
        int [] RandomArray = new int[len];
        for(int i = 0;i<len;i++){
            RandomArray[i] = rand.nextInt(1000);
        }

        return RandomArray;
    }

}