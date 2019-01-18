package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 *  1 到 N ，
 *  选择 key 个元素的子串
 *
 */
public class BackTracking1 {

    public static final int key = 2;
    public static  List<List<Integer>> ret  = new ArrayList<>();
    public static final int n =3;

    public static  void main(String[] args) {

        List<Integer> curr = new ArrayList<>();
        DFS(curr , 1);

        ret.forEach(a->{
            System.out.println(a);
        });
    }


    public static  void  DFS( List<Integer> curr,  int level)
    {
        if(curr.size() == key)
        {
            List<Integer> s = new ArrayList<>(curr);
            ret.add(s);
            return;
        }
        if(curr.size() > key)
        {
            return;
        }
        for(int i = level ; i<= n ; i++)
        {
            curr.add(i);
            DFS(curr, i+1);
            curr.remove(curr.size() -1);
        }
    }

}
