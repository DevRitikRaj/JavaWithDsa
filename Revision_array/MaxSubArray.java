package Revision_array;

public class MaxSubArray {

    public static void subarr(int n[]) {
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            int start = i;
            for (int j = i; j < n.length; j++) {
                int end = j;
                int sumcrr = 0;

                for (int k = start; k <= end; k++) {
                    sumcrr += n[k];
                }
                System.out.println(sumcrr);

                if (max < sumcrr) {
                    max = sumcrr;

                }

            }

        }
        System.out.println("Maximum Sum is "+max);
    }

    public static void main(String[] args) {
        int n[] = {2,4,6,8,10};
        subarr(n);
    }

    
}
