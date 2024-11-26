public class Array_2D {
    private int[][] arr;
    private int row;
    private int col;
    private int rowSize;
    private int colSize;

    public Array_2D(int rowCapacity, int colCapacity) {
        arr = new int[rowCapacity][colCapacity];
        row = 0;
        col = 0;
        rowSize = rowCapacity;
        colSize = colCapacity;
    }

    public boolean isEmpty() {
        return (row == 0 && col == 0);
    }

    public boolean isFull() {
        return (row == rowSize && col == colSize);
    }

    public void traversal() {
        if (isEmpty()) {
            System.out.println("Array is Empty");
        } else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Array_2D obj = new Array_2D(5, 3);
        obj.traversal();
    }
}
