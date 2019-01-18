package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *   求所有的子串
 */
public class BackTracking3 {

    public static  void main(String[] args) {

        Integer a[] = {1,2,3};
        List<Integer>  input = Arrays.asList(a);
        List<List<Integer>> result = getTarget(input );
        result.forEach(b->{
            System.out.println(b);
        });
    }

    public static List<List<Integer>> getTarget( List<Integer> input )
    {
        List<List<Integer>> ret  = new ArrayList<>();
        Collections.sort(input);
        List<Integer> curr = new ArrayList<>();
        List<Integer> visitor = new ArrayList<>(input.size());
        //这个地方初始化用用list
        for(int i = 0 ; i < input.size() ;i++){
            visitor.add(0);
        }

        DFS(input ,ret ,curr , visitor );
        return ret;
    }



    public static  void  DFS(List<Integer> input,  List<List<Integer>> ret ,   List<Integer> curr,   List<Integer> visitor)
    {
        //这个地方拷贝不用操心
        List<Integer> s = new ArrayList<>(curr);
        ret.add(s);

        if(curr.size() == input.size())
            return;
        for(int i = 0 ; i< input.size() ; i++)
        {
            Integer flag = visitor.get(i);
            if(flag == 0)
            {
                visitor.set(i , 1);
                curr.add(input.get(i));
                DFS(input,   ret ,    curr,   visitor);
                //这个地方恢复
                visitor.set(i , 0);
                curr.remove(curr.size() -1);
            }
        }
    }

    public static boolean isOK(int target)
    {
        if(target == 0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isOver(int target)
    {
        return  target < 0;
    }

}
