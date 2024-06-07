package page12_Backtracking;

import java.util.ArrayList;

public class sum {
    private static ArrayList<ArrayList<Integer>> result;
    private static int n;
    private static void backtrack(int sum, ArrayList<Integer> seletedNums, int start) {
        if (sum == 50) {
            result.add(seletedNums);
            return;
        }

        for (int i = start; i <= n; i++) {
            if (sum + i <= 50) {
                ArrayList<Integer> list = new ArrayList<>(seletedNums);
                list.add(i);
                backtrack(sum + i, list, i + 1);
            }
        }
    }

    private static ArrayList<ArrayList<Integer>> solution(int N) {
        result = new ArrayList<>();
        n = N;
        backtrack(0, new ArrayList<>(), 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(100));
    }
}
