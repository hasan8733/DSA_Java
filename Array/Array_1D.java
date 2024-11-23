public class Array_1D {
    public static void traversal(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,8,9,11};
        traversal(arr);
    }
}
