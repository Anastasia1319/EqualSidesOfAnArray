import java.util.Arrays;

public class EqualSides {
    public static int findEvenIndex(int[] arr) {
        int right = Arrays.stream(arr).sum() - arr[0];
        int left = 0;
        if (left == right) return 0;

        for (int i = 1; i < arr.length; i++) {
            left = left + arr[i - 1];
            right = right - arr[i];
            if (left == right) return i;
        }
        return -1;
    }
}
