public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int N=arr.length;
        for(int end=N-1;end>=0;end--){
            for(int start=1;start<=end;start++){
                if(arr[start-1]>arr[start]){
                    swap(arr,start-1,start);
                }
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={3,8,1,2,7,4,5,9,6};
        print(arr);
        bubbleSort(arr);
        print(arr);
    }
}
