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
        symmetricMatrix(matrix);
    }

    private static void symmetricMatrix(int[][] matrix){
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

}