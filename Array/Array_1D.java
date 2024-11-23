public class Array_1D {
    private int arr[];
    private int size;

    public Array_1D(int capacity){
        arr = new int[capacity];
        size = 0;
    }

    public boolean isFull(){
        return size == arr.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void traversal(){
        if(isEmpty()){
            System.out.println("Array is Empty");
        } else{
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Array_1D obj = new Array_1D(10);
        obj.traversal();
    }
}
