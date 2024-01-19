public class paramer {
    public static void main(String[] args) {
        int Marks[]={90,44,50};
        update(Marks, 0);

        //print for marks
        for(int i=0; i<Marks.length; i++){
            System.out.println(Marks[i] + "");
        }

    }
    static void update(int Marks[] ,int nonChangable ){
        nonChangable =10;
        for (int i=0; i<Marks.length; i++){
            Marks[i] =Marks[i] +1;
        }
    }
    
}
