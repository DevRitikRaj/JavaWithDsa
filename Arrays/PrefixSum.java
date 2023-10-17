package Arrays;

public class PrefixSum {

    public static void ArraySubMax(int n[]) {
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[n.length];

        prefix[0] = n[0];

        for (int i = 1; i < n.length; i++) {
            prefix[i] = prefix[i - 1] + n[i];
        }

        for (int i = 0; i < n.length; i++) {
            int start = i;

            for (int j = i; j < n.length; j++) {
                int end = j;
                currsum = start == 0 ? prefix[end]:prefix[end]-prefix[start - 1];
                if (max < currsum) {
                    max = currsum;
                }
            }
        }

        System.out.println("The maximum subarray is "+max);

    }

    public static void main(String[] args) {
        int n[] = { 1,-2,6,-1,3};
        ArraySubMax(n);

    }

}
