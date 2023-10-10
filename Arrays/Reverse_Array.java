package Arrays;

public class Reverse_Array {

    public static void arrays(int num[]) {
        int start = 0, end = num.length - 1;
        while (start <end) {

            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;

        }

    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);

        }
        System.out.println();
        arrays(num);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
        System.out.println();

    }

}
