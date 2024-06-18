package se.lexicon;

import java.util.Arrays;

public class ArrayExampel {

    public static void main(String[] args) {

        int[] arr = {11, 23, 39};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        ex7();
    }

    public static void ex1() {
        String[] cities = {"Paris", "London", "New York", "Stockholm"};
        System.out.println("String array: " + Arrays.toString(cities));

        Arrays.sort(cities);
        System.out.println("Sorted string array: " + Arrays.toString(cities));
    }


    public static void ex2() {
        int[] firstArray = {1, 15, 20};
        int[] secondArray = new int[firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }

        System.out.print("Elements from first array: ");
        for (int number : firstArray) {
            System.out.print(number + " ");
        }

        System.out.print("\nElements from second array: ");
        for (int number : secondArray) {
            System.out.print(number + " ");
        }
    }

    public static void ex5() {
        String[][] countriesAndCities = {
                {"France", "Paris"},
                {"Sweden", "Stockholm"}
        };

        for (int i = 0; i < countriesAndCities.length; i++) {
            for (int j = 0; j < countriesAndCities[i].length; j++) {
                System.out.print(countriesAndCities[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void ex6() {
        int[] numbers = {43, 5, 23, 17, 2, 14};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Average is: " + average);
    }

    public static void ex7() {
        int[] numbers = {1, 2, 4, 7, 9, 12};

        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.print("\nOdd Array: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }

        }
    }

    public static void ex8() {
        int[][] table = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}





