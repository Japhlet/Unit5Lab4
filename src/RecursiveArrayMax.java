/**
 * Created by Dave on 1/19/17.
 */
public class RecursiveArrayMax {

    public static void main(String[] args) {

        int [] a = {5, 9, -1, 4, 7, 10, 51, 0};
        Integer [] b = {0, 1, 4, 7, -2, 10};
        String [] s = {"a", "b", "c","X", "Y", "Z"};

        System.out.println(recursiveArrayMax(a, 0, Integer.MIN_VALUE));

        System.out.println(recursiveGenericMax(b, 0, b[0]));

        System.out.println(recursiveGenericMax(s, 0, s[0]));


    }

    private static int recursiveArrayMax(int [] a, int index, int max) {

        // base case array has only 1 element
        if (index == a.length) {
            System.out.println("Current Max: " + max);
            return max;
        }

        if (a[index] > max) {
            max = a[index];
            System.out.println("Updated Max: " + max);
        }

        return recursiveArrayMax(a, index + 1, max);
    }

    // generic recursive array max
    private static <T extends Comparable<T>> T recursiveGenericMax(T[] a, int index, T max) {
        // base case
        if (index == a.length) {
            System.out.println("Generic Current Max: " + max);
            return max;
        }

        if (a[index].compareTo(max) > 0) {
            max = a[index];
            System.out.println("Updated Generic Max: " + max);
        }

        return recursiveGenericMax(a, index + 1, max);
    }
}
