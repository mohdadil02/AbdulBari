public class SecondLargest {
    public static void main(String[]args) {
        int[] A = {1, 2, 2, 4, 5, 6, 7, 8, 9, 10};
        int max1 = A[0];
        int max2 = A[0];

        for (int i = 0; i < A.length; i++) {

            if (A[i] > max1) {
                max2 =max1;
                max1 = A[i];

            } else if (A[i]>max2) {
                max2=A[i];
            }
        }
        System.out.println("Second largest element is: "+max2);
    }
}
