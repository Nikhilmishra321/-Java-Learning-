public class ArraysExample {
    public static void main(String[] args) {
        //decleare arrays
        int [] arr = new int[5];
        arr[0]=30;
        arr[1]=40;
        arr[2]=50;
        arr[3]=60;
        arr[4]=80;

        //acess element of specifed arrays

        for(int i=0 ; i<arr.length; i++){
            System.out.println("Element at index " + i
               + ":" + arr[i]);
        }

    }
    
}
