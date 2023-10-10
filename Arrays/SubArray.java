package Arrays;

public class SubArray {

    public static void AR(int n[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n.length; i++) {
            int start = i;
            

            for (int j = i; j < n.length; j++) {
                int end = j;
                int sum = 0;

                for (int k = start; k <= end; k++) {
                    System.out.print(n[k] + " |");
                    sum = sum + n[k];
                    if(max<=sum){
                        max=sum;
                    }
                    else if(min>=sum){
                        min=sum;
                    }

                }
                System.out.print("The Sum is = " + sum);

                System.out.println();

            }

            System.out.println();

        }
        System.out.println("The maximum value is ="+max);
        System.out.println("The maximum value is ="+min);


    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5 };
        AR(num);
    }

}
