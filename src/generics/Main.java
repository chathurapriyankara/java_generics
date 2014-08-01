
package generics;

/**
 *
 * @author hp
 */
public class Main {

    public static void main(String[] args) {
        String[] arr1 = {"str 1", "str 2", "str 3", "str 4", "str 5"};
        Integer[] arr2 = {10, 24, 15, 32, 6};

        GenericMethodDemo.<Integer>print(arr2);
        GenericMethodDemo.<String>print(arr1);
    }
}
