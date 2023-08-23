package main.java.com.macheight.pairstest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//O(n log n) N * Log N which is lower than O(n^2)
public class MachEightPairsSumSolution {

    public static List<String> printPairsSumEqualsGivenValue(int inputArray[], int sum) {
        int low = 0;
        int high = inputArray.length - 1;
        List<String> pairs = new ArrayList<>();

        while (low < high) {
            if (inputArray[low] + inputArray[high] == sum) {
                var pair = inputArray[high] + "," + inputArray[low];
                System.out.println(pair);
                pairs.add(pair);
            }
            if (inputArray[low] + inputArray[high] > sum) {
                high--;
            } else {
                low++;
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        // Default information in case no arguments defined in run configuration
        int inputGivenValue = 12;
        int[] inputArray = {1, 9, 5, 0, 20, -4, 12, 16, 7, -89};

        if(args.length>1){
            inputGivenValue =  Integer.parseInt(args[1]);
            inputArray = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }

        Arrays.sort(inputArray);

        List<String> resultList = printPairsSumEqualsGivenValue(inputArray, inputGivenValue);
    }
}