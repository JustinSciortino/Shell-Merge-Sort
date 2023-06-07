package Q1;
//Justin Sciortino 40247931
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class RandomIntList {
    public static List<Integer> generateRandomIntList(int size){
        List<Integer> randomIntegers = new ArrayList<>();
        Random random = new Random();

        //Generate integer numbers that are between 1 and 5 digits long
        int min = 1;
        int max = 99999;

        for (int i = 0; i < size; i++) {
            int randomInt = random.nextInt(max - min +1)+min;
            randomIntegers.add(randomInt);
        }

        return randomIntegers;
    }
}
