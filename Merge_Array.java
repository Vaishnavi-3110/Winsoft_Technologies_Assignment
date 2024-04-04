import java.util.Scanner;

public class Merge_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int[] X = new int[m];
        for(int i=0; i<m; i++) {
            X[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int[] Y = new int[n];
        for(int i=0; i<n; i++) {
            Y[i] = scanner.nextInt();
        }

        merge(X, Y, m, n);

        for(int i=0; i<m; i++) {
            System.out.print(X[i] + " ");
        }
    }

    private static void merge(int[] X, int[] Y, int m, int n) {
        int k = m - 1; 
        for(int i=m-1; i>=0; i--) {
            if(X[i] != 0) {
                X[k] = X[i];
                k--;
            }
        }
    
        int i = k + 1;
        int j = 0; 
        k = 0;
        while(k < m) {
            if((i < m && X[i] <= Y[j]) || j >= n) {
                X[k] = X[i];
                i++;
            }
            else {
                X[k] = Y[j];
                j++;
            }
            k++;
        }
    }
}
