public class linearSearch {
    public static void main(String[] args) {

        int numbers[] ={2,4,5,9,10,20,40};

        int keys = 10;
        int index=Search(numbers,keys);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Keys at index " + index);
        }

    }
    public static int Search(int numbers[] ,int keys){
        for (int i=0; i<numbers.length; i++){
            if(numbers [i] ==keys){
                return i;
            }
        }
        return -1;

    }
}