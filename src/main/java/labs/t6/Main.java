package labs.t6;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 4, 3, 2, 1},
                {4, 0, 4, 3, 2},
                {3, 4, 0, 4, 3},
                {2, 3, 4, 0, 4},
                {1, 2, 3, 4, 0},
        };
        double[][] matrix1 = {
                {0.0, 4.0, 3.0, 2.0, 1.0},
                {4.0, 0.0, 4.0, 3.0, 2.0},
                {3.0, 4.0, 0.0, 4.0, 3.0},
                {2.0, 3.0, 4.0, 0.0, 4.0},
                {1.0, 2.0, 3.0, 4.0, 0.0},
        };
        task1(matrix);
        task2(matrix1);
    }

    private static void task1(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j){
                    continue;
                }

                if(matrix[i][j] != matrix[j][i]){
                    System.out.println("Матрица не симметрична");
                    return;
                }
            }
        }
        System.out.println("Матрица семмитрична");
    }

    private static void task2(double [][] matrix){
        double max = 0;
        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                if (aDouble > max) {
                    max = aDouble;
                }
            }
        }
        matrix[0][0] = max;
        System.out.println(matrix[0][0]);
    }

}