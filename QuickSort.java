public class QuickSort {
    static void quickSort(int arr[], int start, int end){
        if(start<end)
        {
            int p=Partation(arr,start,end);
            quickSort(arr,start,p-1);
            quickSort(arr,p+1,end);
        }
    }
    static int Partation(int arr[], int start, int end){
        int i,j;
        int pivot=arr[end-1];
        i=start-1;
        for(j=start;j<arr.length-1;j++){
            if(arr[j]<=pivot){
                i=i+1;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=pivot;
        arr[end-1]=temp;
        return (i+1);
    }
    public static void main(String[] args) {
        int arr[]={5,4,8,6,7};
        quickSort(arr, 0, arr.length);
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
