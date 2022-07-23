import java.util.Scanner;
 
public class TransposeMatrix {
 
    public static void main(String[] args) {
        int i, j;
        int input[][] = new int[4][4];
        int transpose[][] = new int[4][4];
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Elements of a 4X4 Matrix");
 
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                input[i][j] = scanner.nextInt();
            }
        }
 
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                transpose[j][i] = input[i][j];
            }
        }
 
        System.out.println("Transpose Matrix");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}