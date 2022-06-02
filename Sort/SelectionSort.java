public class SelectionSort {
    public static void selectSort(int[] arr){
        int N=arr.length;
        for(int i=0;i<N;i++){
            //int minIndex=i;
            for(int j=i+1;j<N;j++){
                if(arr[j]<arr[i]){
                    int num=arr[j];
                    arr[j]=arr[i];
                    arr[i]=num;
                }
            }
        }
    }
    public static void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr={4,5,9,3,2,1,8,7,6};
        print(arr);
        selectSort(arr);
        print(arr);
    }
}
