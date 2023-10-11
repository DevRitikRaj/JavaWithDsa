package Arrays;

public class MaxSumArray_BruteForce {

    public static void Max_SumArray(int num[]) {

        int maxsum = Integer.MIN_VALUE;
        
        for (int i = 0; i < num.length; i++) {
            // int start = i;

            for (int j = i; j < num.length; j++) {
                // int end = j;
                int sum = 0;
                

                for (int k = i; k <= j; k++) {

                    sum = sum + num[k];
                    if (sum > maxsum) {
                        maxsum = sum;
                    }
                }
                System.out.println(sum);
                
            }
        }
        System.out.println("maxsum is = " + maxsum);

    }

    public static void main(String args[]) {
        int num[] = { 1, -2, 6, -1, 3 };
        Max_SumArray(num);

    }

}
