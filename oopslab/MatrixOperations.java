import java.util.Scanner;
public class MatrixOperations {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        // Input matrix dimensions
        System.out.println ("Enter the dimensions of the first matrix (rows columns) :");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        System.out.println ("Enter the dimensions of the second matrix (rows columns) :");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        // Check if matrices are compatible for addition and multiplication
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Matrices are not compatible for addition and multiplication.");
            return;
        }
        // Input elements of the first matrix
        System.out.println("Enter the elements of the first matrix:");
        int [] [] matrix1 = inputMatrix(scanner, rows1, cols1);
        // Input elements of the second matrix
        System.out.println("Enter the elements of the second matrix:");
        int [] [] matrix2 = inputMatrix(scanner, rows2, cols2);
        // Perform matrix addition
        int [] [] sum = addMatrices(matrix1, matrix2);
        // Perform matrix multiplication
        int [] [] product = multiplyMatrices(matrix1, matrix2);

        // Display the results
        System.out.println("Sum of the matrices:");
        printMatrix(sum);
        System.out.println("Product of the matrices:");
        printMatrix(product);
        scanner.close();
    }
    // Method to input matrix elements
    public static int [] [] inputMatrix(Scanner scanner, int rows, int cols) {
        int [] [] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    // Method to add two matrices
    public static int [] [] addMatrices(int [][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int [] [] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }
    // Method to multiply two matrices
    public static int [] [] multiplyMatrices(int [][] matrix1, int [][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int [] [] product = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }
    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

