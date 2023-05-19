import java.util.Arrays;

public class app {
    public static void main(String[] args) throws Exception {
        

        question1 mQuestion1 = new question1();
        String text= mQuestion1.findMaxProfit();
        System.out.println(text);

        

        question2 mQuestion2 = new question2();
        mQuestion2.mergeLinkedLists();
        int answer= mQuestion2.mergeLinkedLists();
        System.out.println(answer);
        
    }



}