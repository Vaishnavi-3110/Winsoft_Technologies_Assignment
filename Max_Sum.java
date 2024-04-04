import java.util.Scanner;

public class Max_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int[] X = new int[m];
        for (int i = 0; i < m; i++) {
            X[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int[] Y = new int[n];
        for (int i = 0; i < n; i++) {
            Y[i] = scanner.nextInt();
        }

        int maxSum = findMaxSumPath(X, Y);
        System.out.println(maxSum);
    }

    private static int findMaxSumPath(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int i = 0, j = 0;
        int sumX = 0, sumY = 0;
        int result = 0;

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sumX += X[i++];
            } 
            else if (X[i] > Y[j]) {
                sumY += Y[j++];
            } 
            else {
                result += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }

        while (i < m) {
            sumX += X[i++];
        }

        while (j < n) {
            sumY += Y[j++];
        }

        result += Math.max(sumX, sumY);

        return result;
    }
}
