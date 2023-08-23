package test.java.com.macheight.pairstest;

import main.java.com.macheight.pairstest.MachEightPairsSumSolution;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MachEightPairSumSolutionTest {

    @Test
    public void pairsSumSuccessful() {
        int[] inputArray = new int[]{1, 9, 5, 0, 20, -4, 12, 16, 7, -89};
        Arrays.sort(inputArray);
        int inputGivenValue = 12;
        List<String> pairsList = MachEightPairsSumSolution.printPairsSumEqualsGivenValue(inputArray, inputGivenValue);
        List<String> pairsListSuccess = Arrays.asList("16,-4", "12,0", "7,5");
        Assert.assertEquals(pairsList, pairsListSuccess);
    }

    @Test
    public void pairsSumDuplicatedValuesSuccessful() {
        int[] inputArray = new int[]{1, 9, 5, 0, 20, -4, 12, 16, 7, -89, 1, 9, 12};
        Arrays.sort(inputArray);
        int inputGivenValue = 12;
        List<String> pairsList = MachEightPairsSumSolution.printPairsSumEqualsGivenValue(inputArray, inputGivenValue);
        List<String> pairsListSuccess = Arrays.asList("16,-4", "12,0", "7,5");
        Assert.assertEquals(pairsList, pairsListSuccess);
    }

    @Test
    public void pairsSumEmptyArraySuccessful() {
        int[] inputArray = new int[]{};
        Arrays.sort(inputArray);
        int inputGivenValue = 12;
        List<String> pairsList = MachEightPairsSumSolution.printPairsSumEqualsGivenValue(inputArray, inputGivenValue);
        Assert.assertEquals(pairsList.size(), 0);
    }

    @Test
    public void pairsSumNegativeValuesSuccessful() {
        int[] inputArray = new int[]{-1, -9, -5, 0, -20, -4, -12, -16, -7, -89};
        Arrays.sort(inputArray);
        int inputGivenValue = -12;
        List<String> pairsList = MachEightPairsSumSolution.printPairsSumEqualsGivenValue(inputArray, inputGivenValue);
        List<String> pairsListSuccess = Arrays.asList("0,-12", "-5,-7");
        Assert.assertEquals(pairsList, pairsListSuccess);
    }

    @Test
    public void pairsSumNegativeValuesEmptyResultSuccessful() {
        int[] inputArray = new int[]{-1, -9, -5, 0, -20, -4, -12, -16, -7, -89};
        Arrays.sort(inputArray);
        int inputGivenValue = 12;
        List<String> pairsList = MachEightPairsSumSolution.printPairsSumEqualsGivenValue(inputArray, inputGivenValue);
        Assert.assertEquals(pairsList.size(), 0);
    }

    @Test
    public void pairsSumSingleValueResultSuccessful() {
        int[] inputArray = new int[]{1};
        Arrays.sort(inputArray);
        int inputGivenValue = 12;
        List<String> pairsList = MachEightPairsSumSolution.printPairsSumEqualsGivenValue(inputArray, inputGivenValue);
        Assert.assertEquals(pairsList.size(), 0);
    }
}
