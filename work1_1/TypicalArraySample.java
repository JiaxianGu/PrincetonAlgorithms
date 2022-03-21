package work1_1;

public class TypicalArraySample {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,6};
        System.out.println(findMax(a));
        System.out.println(average(a));
        int[] b = duplicate(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        b = reverse(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }



    }

    private static double findMax(int[] a) {
        double max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    private static double average(int[] a) {
        int N = a.length;
        double sum = 0;
        for (int i = 0; i < N; i ++) {
            sum += a[i];
        }
        return sum / N;
    }

    private static int[] duplicate(int[] a) {
        int N = a.length;
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = a[i];
        }
        return b;
    }

    private static int[] reverse(int[] a) {
        int N = a.length;
        for (int i = 0; i < N/2; i++) {
            int temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - 1 - i] = temp;
        }
        return a;
    }

    private static int[][] matrixMultiplication(int[][] a, int[][] b) {
        // square matrix
        int N = a.length;
        int[][] c = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    c[i][j] += a[i][k] * b[j][k];
                }
            }
        }
        return c;
    }
}
