class Matrix {
    int[][] mat;

    Matrix(int[][] m) {
        mat = m;
    }

    void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

    void transpose() {
        System.out.println("Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print(mat[j][i] + " ");
            System.out.println();
        }
    }

    void sumRows() {
        System.out.println("Sum of rows:");
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) sum += mat[i][j];
            System.out.println(sum);
        }
    }

    void sumColumns() {
        System.out.println("Sum of columns:");
        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++) sum += mat[i][j];
            System.out.println(sum);
        }
    }

    void sumDiagonals() {
        int main = 0, sec = 0;
        for (int i = 0; i < 3; i++) {
            main += mat[i][i];
            sec += mat[i][2-i];
        }
        System.out.println("Main diagonal: " + main);
        System.out.println("Secondary diagonal: " + sec);
    }
}

// Main class
public class MatrixOperations {
    public static void main(String[] args) {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        Matrix mat = new Matrix(m);

        System.out.println("Matrix:");
        mat.display();

        mat.transpose();
        mat.sumRows();
        mat.sumColumns();
        mat.sumDiagonals();
    }
}
