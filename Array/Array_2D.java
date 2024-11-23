public class Array_2D {
    private int[][] arr;
    private int row;
    private int col;

    public Array_2D(int rowCapacity, int colCapacity){
        arr = new int[rowCapacity][colCapacity];
        row = 0;
        col = 0;
    }
    public static void main(String[] args) {
        Array_2D obj = new Array_2D(5, 5);
    }
}
