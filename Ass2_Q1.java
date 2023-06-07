package Q1;
//Justin Sciortino 40247931
import java.util.ArrayList;

import java.util.List;

public class Ass2_Q1 {
    public static void main(String[] args){
        List<Integer> arr0_5k = RandomIntList.generateRandomIntList(500);
        List<Integer> arr1k = RandomIntList.generateRandomIntList(1000);
        List<Integer> arr2k = RandomIntList.generateRandomIntList(2000);
        List<Integer> arr4k = RandomIntList.generateRandomIntList(4000);
        List<Integer> arr8k = RandomIntList.generateRandomIntList(8000);

        List<Integer> arr0_5k_copy = new ArrayList<>(arr0_5k);
        List<Integer> arr1k_copy = new ArrayList<>(arr1k);
        List<Integer> arr2k_copy = new ArrayList<>(arr2k);
        List<Integer> arr4k_copy = new ArrayList<>(arr4k);
        List<Integer> arr8k_copy = new ArrayList<>(arr8k);

        //To observe the runtimes for each list of randomly generated integers, place the list names below
        System.out.println(arr0_5k); //prints the unsorted list
        long startTime = System.currentTimeMillis();
        ShellSort_gap1.sort(arr0_5k); //Shell sort with gap 1
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        System.out.println("Runtime for ShellSort_gap1 in milliseconds: " + runTime);
        System.out.println(arr0_5k);  //print sorted list

        System.out.println(arr0_5k_copy);
        long startTime2 = System.currentTimeMillis();
        ShellSort_gap2.sort(arr0_5k_copy);
        long endTime2 = System.currentTimeMillis();
        long runTime2 = endTime2 - startTime2;
        System.out.println("Runtime for ShellSort_gap2 in milliseconds: " + runTime2);
        System.out.println(arr0_5k_copy);
    }
}
