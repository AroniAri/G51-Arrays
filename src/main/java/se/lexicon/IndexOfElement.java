package se.lexicon;

public class IndexOfElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 7, 9};
        int target = 5;
        int index = indexOf(numbers, target);

        if (index != -1) {
            System.out.println("Index position of number " + target + " is: " + index);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
    }

    public static int indexOf(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
