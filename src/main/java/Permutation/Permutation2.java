package Permutation;

import java.util.ArrayList;
import java.util.List;

/**
 * 取 1 到 n  个元素中 全部子串
 */
public class Permutation2 {

    public static final int key = 2;
    public static List<List<Integer>> ret = new ArrayList<>();
    public static final int n = 3;

    public static void main(String[] args) {

        List<Integer> curr = new ArrayList<>();
        DFS(curr, 1);

        ret.forEach(a -> {
            System.out.println(a);
        });
    }


    public static void DFS(List<Integer> curr, int level) {

        List<Integer> s = new ArrayList<>(curr);
        ret.add(s);


        if (curr.size() > key) {
            return;
        }
        for (int i = level; i <= n; i++) {
            curr.add(i);
            DFS(curr, i + 1);
            curr.remove(curr.size() - 1);
        }
    }

}
