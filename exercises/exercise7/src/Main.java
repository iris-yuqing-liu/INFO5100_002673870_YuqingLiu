import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static <T> int countElements(Collection<T> collection, Predicate<T> predicate) {
        int count = 0;
        for (T element : collection) {
            if (predicate.test(element)) {
                count++;
            }
        }
        return count;
    }

    public static <T> void exchangeElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static <T extends Comparable<T>> T findMax(List<T> list, int begin, int end) {
        T max = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            T element = list.get(i);
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // count odd numbers in a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int count = countElements(numbers, n -> n % 2 != 0);
        System.out.println("Number of odd numbers: " + count);

        // exchange elements in an array
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Before: " + Arrays.toString(array));
        exchangeElements(array, 2, 4);
        System.out.println("After: " + Arrays.toString(array));

        // find the maximum element in a range of a list
        List<Double> doubles = Arrays.asList(2.5, 1.2, 9.7, 4.1, 5.8, 6.3);
        double max = findMax(doubles, 1, 4);
        System.out.println("Maximum element: " + max);
    }
}
