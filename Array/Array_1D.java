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

    public void insertAtIndex(int num,int index){
        if(index > size){
            System.out.println("Invalid Index");
        } else if(isFull()){
            System.out.println("Array is Full");
        } else{
            for(int i=size;i>index;i--){
                arr[i] = arr[i-1];
            }
            arr[index] = num;
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

    public int linearSearch(int num){
        for(int i=0;i<size;i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Array_1D obj = new Array_1D(10);
        int num = 6;
        obj.insertion(1);
        obj.insertion(2);
        obj.insertion(3);
        obj.insertion(4);
        obj.insertion(5);
        obj.insertion(6);
        obj.insertion(7);
        int search = obj.linearSearch(num);
        if(search == -1){
            System.out.println("Element not found");
        } else{
            System.out.println("Element "+num+" is found at "+search+" index");
        }
        obj.insertAtIndex(10, 4);
        obj.deletion(2);
        obj.traversal();
    }
}
