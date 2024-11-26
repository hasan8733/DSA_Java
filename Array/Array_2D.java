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

    }

    public static void main(String[] args) {
        Array_2D obj = new Array_2D(5, 3);
    }
}
