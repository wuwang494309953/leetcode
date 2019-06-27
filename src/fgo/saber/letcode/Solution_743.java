package fgo.saber.letcode;

/**
 * @author zq
 * @date 2019/3/7
 */

/**
 * 有 N 个网络节点，标记为 1 到 N。
 *
 * 给定一个列表 times，表示信号经过有向边的传递时间。 times[i] = (u, v, w)，其中 u 是源节点，v 是目标节点， w 是一个信号从源节点传递到目标节点的时间。
 *
 * 现在，我们向当前的节点 K 发送了一个信号。需要多久才能使所有节点都收到信号？如果不能使所有节点收到信号，返回 -1。
 *
 * 注意:
 *
 * N 的范围在 [1, 100] 之间。
 * K 的范围在 [1, N] 之间。
 * times 的长度在 [1, 6000] 之间。
 * 所有的边 times[i] = (u, v, w) 都有 1 <= u, v <= N 且 0 <= w <= 100。
 */
public class Solution_743 {

    public static void main(String[] args) {
        int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
        networkDelayTime(times, 4, 2);
    }

    public static int networkDelayTime(int[][] times, int N, int K) {
        //初始化dis数组
        int[] dis = new int[N + 1];

        for (int i = 1; i <= N; i++ ) {
            dis[i] = -1;
            for (int[] time : times) {
                if (time[0] == K && time[1] == i) {
                    dis[i] = time[2];
                }
            }
            dis[K] = 0;
        }

        return 1;
    }

    private static void change(int[] dis, int[][] times, int K) {
        for (int[] time : times) {
            if (time[0] == K) {

            }
        }
    }

}
