package ArrayList;
import java.util.*;
public class ArrayList_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ans=new ArrayList<>();
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            ans.add(sc.nextInt());
        }
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }

        //to sort ArrayList
        Collections.sort(ans);
    }
}
