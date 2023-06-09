/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Arrays;
import java.util.Random;



public class Library {
    static int[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
    };
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {

        lowestAverageArray(weeklyMonthTemperatures);
    }

    // TODO: Method to roll six-sided dice
    public int[] roll(int n) {
        Random random = new Random();
        int[] rolls = new int[n]; // create array of size n
        for (int i = 0; i < n; i++) {
            rolls[i] = random.nextInt(6) + 1;
        }
        return rolls;
    }

    // TODO: Check if array contains duplicates
    public boolean containsDuplicates(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 1; j < array.length ; j++) {
                if (i == j) continue;
                if(array[i] == array[j])
                    return true;
            }
        }
        return false;
    }

    // Calculating Averages
    // TODO: Write a method that accepts an array of integers and calculates and returns the average of all the values in the array.
    public static int calculateAverage(int[] arrayOfValues){
        int sum = 0;
        // for loop
        for (int i = 0; i < arrayOfValues.length; i++) {
            // every iteration add the value to the sum
            sum += arrayOfValues[i];
        }
        return (sum / arrayOfValues.length);
    }

    // Array of arrays
    // TODO: Given an array of arrays calculate the average value for each array and return the array with the lowest average.
    // Input: array of arrays AKA a Matrix
    // Output: array with lowest average
    // Logic: Find the average of each array, then find the lowest average and return the array with that average

    public static int[] lowestAverageArray(int[][] weeklyMonthTemperatures){
        int[] lowestAverageArray = weeklyMonthTemperatures[0];
        int lowestAverage = calculateAverage(weeklyMonthTemperatures[0]);

        // Logic to find average - DONE -> calculateAverage()

        // loop to find average of each array
        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            // Logic: if current array average is less than the previous array average, then set the current array as the lowest average array
            // call calculateAverage() on each array
            int currentArrayAverage = calculateAverage(weeklyMonthTemperatures[i]);
            if (currentArrayAverage < lowestAverage){
                lowestAverage = currentArrayAverage;
                lowestAverageArray = weeklyMonthTemperatures[i];
            }
            System.out.println("array average is " + currentArrayAverage + " for array " + Arrays.toString(weeklyMonthTemperatures[i]));

            
        }

        return lowestAverageArray;
    }
}

/*
Daily average temperatures for Seattle, October 1-28 2017
int[][] weeklyMonthTemperatures = {
  {66, 64, 58, 65, 71, 57, 60},
  {57, 65, 65, 70, 72, 65, 51},
  {55, 54, 60, 53, 59, 57, 61},
  {65, 56, 55, 52, 55, 62, 57}
};
 */