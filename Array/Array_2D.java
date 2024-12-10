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
                for (int j = 0; j < colSize; j++) {
                    System.out.print(arr[i][j] + ", ");
                }
                System.out.println();
            }

            if (col > 0 && row < rowSize) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[row][j] + ", ");
                }
                System.out.println();
            }
        }
    }

    public void insertion(int num) {
        if (isFull()) {
            System.out.println("Array is Full");
        } else {
            arr[row][col] = num;
            col++;
            if (col == colSize) {
                row++;
                col = row == rowSize ? col : 0;
            }
        }
    }

    public static void main(String[] args) {
        Array_2D obj = new Array_2D(3, 3);
        obj.insertion(1);
        obj.insertion(2);
        obj.insertion(3);
        obj.insertion(4);
        obj.insertion(5);
        obj.insertion(6);
        obj.insertion(7);
        obj.insertion(8);
        obj.insertion(9);
        obj.traversal();
    }
}
