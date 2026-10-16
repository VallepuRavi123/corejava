package patterns;
import java.util.Scanner;

public class MatrixReverse {
	int q;
	char ch;
    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //char ch;
        System.out.println(ch);
        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();
        System.out.println(q);

        int[][] a = new int[n][n];

     //   System.out.println("Enter Matrix:");
        int x=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = x;
                x++;
            }
        }

        // Step 1: Reverse every row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = a[i][left];
                a[i][left] = a[i][right];
                a[i][right] = temp;

                left++;
                right--;
            }
        }

        // Step 2: Square the main diagonal
        for (int i = 0; i < n; i++) {
            a[i][i] = a[i][i] * a[i][i];
        }

        // Step 3: Double only non-diagonal elements of even rows
        for (int i = 1; i < n; i += 2) {
            for (int j = 0; j < n; j++) {

                if (i != j) {
                    a[i][j] = a[i][j] * 2;
                }

            }
        }

        // Print Result
        System.out.println("Output:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }

        sc.close();
    }
}