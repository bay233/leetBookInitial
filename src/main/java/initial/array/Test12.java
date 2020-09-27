package initial.array;

public class Test12 {
    public static void rotate(int[][] matrix) {
        int len = matrix.length / 2;
        int length = matrix.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0 + i, k = 0, tail = length - i - 1; j < tail; j++, k++) {

                int tmp = matrix[j][tail];
                matrix[j][tail] = matrix[i][j];

                int tmp2 = matrix[tail][tail - k];
                matrix[tail][tail - k] = tmp;
                tmp = tmp2;

                tmp2 = matrix[tail - k][i];
                matrix[tail - k][i] = tmp;
                tmp = tmp2;

                matrix[i][j] = tmp;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };


        rotate(matrix2);
        for (int[] i : matrix2) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
