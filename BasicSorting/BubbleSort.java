package BasicSorting;

public class BubbleSort {

    public static void BubbleSorting(int arr[]){
        for(int turns=0; turns<arr.length-1; turns++){
            for(int j=0; j<arr.length-1-turns; j++){
                if(arr[j] >arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i] +"");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos=i;
            for(int j=j+1; j<arr.length-1;j++){
                if(arr[minPos] > arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp =arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }

    }
    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2};
        BubbleSorting(arr);
        selectionSort(arr);
    }
    
}
