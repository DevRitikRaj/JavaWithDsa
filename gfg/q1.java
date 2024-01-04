package gfg;

import java.util.*;

public class q1 {

    public static int greek(int arr[], int n, int k) {
        if (n == 1) {
            return 0;
        }
        Arrays.sort(arr);

        int diff = arr[n - 1] - arr[0];

        int max, min;

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) {
                continue;
            }

            else {
                max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                min = Math.min(arr[0] + k, arr[i] - k);
                diff = Math.min(diff, max - min);

            }
        }
        return diff;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 15, 10 };
        int k = 6;
        int n = 3;
        System.out.println(greek(arr, n, k));

    }

}
