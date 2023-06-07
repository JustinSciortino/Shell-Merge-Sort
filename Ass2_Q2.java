package Q2;
//Justin Sciortino 40247931
import Q1.RandomIntList;
import java.util.ArrayList;
import java.util.List;

public class Ass2_Q2 {
    public static void main(String[] args){
        List<Integer> arr0_5k = RandomIntList.generateRandomIntList(500);
        List<Integer> arr1k = RandomIntList.generateRandomIntList(1000);
        List<Integer> arr2k = RandomIntList.generateRandomIntList(2000);
        List<Integer> arr4k = RandomIntList.generateRandomIntList(4000);
        List<Integer> arr8k = RandomIntList.generateRandomIntList(8000);

        System.out.println(arr8k);
        long startTime = System.currentTimeMillis();
        MergeSort.sort(arr8k);
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        System.out.println("Runtime for merge sort in milliseconds: " + runTime);
        System.out.println(arr8k);
    }
}
