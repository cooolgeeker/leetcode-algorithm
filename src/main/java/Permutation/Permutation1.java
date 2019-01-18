package Permutation;

import java.util.ArrayList;
import java.util.List;

/**
 *   取 1 到 n  个元素中 长度为 key 的子串
 */
public class Permutation1 {

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
