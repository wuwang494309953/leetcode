package fgo.saber.letcode.other;

/**
 * @author zq
 * @date 2019/2/27
 */

/**
 * 你和另外 n-1 个人围成一个圈，按 1，2，...，n 依次编号。第一个人从 1 开始报数，数到 k 的人会被杀掉，
 * 然后下一个人重新从 1 开始报数。如此往复，直到最后只剩下一个人。
 * 问题是，你应该如何选择自己的初始位置，才能保证最后不被杀掉呢？
 */

/**
 * 思路:      1     2     3     4   5       ... k-1 k k+1 ... n-1   n
 * 移动一次后: k%n+1 k%n+2 k%n+3 k%n+4 k%n+5 ... n-2   1   ... k%n-1 k%n
 */
public class yuesefu {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(kill(arr.length, 4));
    }

    private static int kill(int n, int k) {
        if (n == 1) {
            return (k-1) % n;
        }
        return (kill(n - 1, k) + k) % n;
    }

}
