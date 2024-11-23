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

    public void insertion(int num){
        if(isFull()){
            System.out.println("Array is Full");
        } else{
            arr[size] = num;
            size++;
        }
    }

    public void deletion(int index){
        if(isEmpty()){
            System.out.println("Array is Empty");
        } else if(size <= index){
            System.out.println("Invalid Index");
        } else{
            for(int i = index;i<size-1;i++){
                arr[i] = arr[i+1];
            }
            size--;
        }
    }

    public static void main(String[] args) {
        Array_1D obj = new Array_1D(10);
        obj.insertion(1);
        obj.insertion(2);
        obj.insertion(3);
        obj.deletion(1);
        obj.traversal();
    }
}
