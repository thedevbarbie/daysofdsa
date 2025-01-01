public class MaxMin {
    public static int setMin(int[] A, int N) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<N; i++) {
            if(A[i] < min) {
                min = A[i];
            }
        }
        return min;
    }

    public static int setMax(int[] A, int N) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++) {
            if(A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = {4, 6, 7, 2, 3, 1};
        int N = A.length;
        System.out.println("Minimum element is: " + setMin(A, N));
        System.out.println("Maximum element is: " + setMax(A, N));
    }
}