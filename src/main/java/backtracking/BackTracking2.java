package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *   计算一个数组中有 ， 通过求和 得到 T 的值， 这个也不对
 */
public class BackTracking2 {

    //public static  List<List<Integer>> ret  = new ArrayList<>();
//    public static final List<Integer> input = new ArrayList<>();
//
//    static {
//        input.add(1);
//        input.add(2);
//        input.add(3);
//        input.add(4);
//        input.add(5);
//        input.add(6);
//    }


    public static  void main(String[] args) {

        Integer a[] = {1,2,3,4,5,6,7,8,9};
        List<Integer>  input = Arrays.asList(a);
        List<List<Integer>> result = getTarget(input , 10);
        result.forEach(b->{
            System.out.println(b);
        });
    }

    public static List<List<Integer>> getTarget( List<Integer> input , int target)
    {
        List<List<Integer>> ret  = new ArrayList<>();
        Collections.sort(input);
        List<Integer> curr = new ArrayList<>();
        DFS(ret, input ,curr , 0 , 10);
        return ret;
    }


    /**
     * @param ret 收集最后的结果
     * @param curr  收集入参
     * @param level  level
     * @param target target
     */
    public static  void  DFS(List<List<Integer>> ret , List<Integer> input,   List<Integer> curr,  int level, int target)
    {
        if(isOK(target))
        {
            List<Integer> s = new ArrayList<>(curr);
            ret.add(s);
            return;
        }
        if(isOver(target))
        {
            return;
        }
        for(int i = level ; i< input.size() ; i++)
        {
            target = target - input.get(i);
            curr.add(input.get(i));
            DFS(ret ,input ,curr, i , target);
            curr.remove(curr.size() -1);
            target = target + input.get(i);
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
