package fgo.saber.letcode;

/**
 * @author zq
 * @date 2019/3/11
 */

import java.util.Arrays;

/**
 * 给定一位研究者论文被引用次数的数组（被引用次数是非负整数）。编写一个方法，计算出研究者的 h 指数。
 *
 * h 指数的定义: “h 代表“高引用次数”（high citations），一名科研人员的 h 指数是指他（她）的 （N 篇论文中）至多有 h 篇论文分别被引用了至少 h 次。（其余的 N - h 篇论文每篇被引用次数不多于 h 次。）”
 *
 * 输入: citations = [3,0,6,1,5]
 * 输出: 3
 * 解释: 给定数组表示研究者总共有 5 篇论文，每篇论文相应的被引用了 3, 0, 6, 1, 5 次。
 *      由于研究者有 3 篇论文每篇至少被引用了 3 次，其余两篇论文每篇被引用不多于 3 次，所以她的 h 指数是 3。
 *
 * 定义:H指数的计算基于其研究者的论文数量及其论文被引用的次数。赫希认为：一个人在其所有学术文章中有N篇论文分别被引用了至少N次，他的H指数就是N。
 *      [1][2]如美国耶鲁大学免疫学家理查德·弗来沃发表的900篇文章中，有107篇被引用了107次以上，他的H指数是107。
 */
public class Solution_274 {

    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        //{0,1,3,5,6}
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[citations.length - 1 - i] >= (i + 1)) {
                return i + 1;
            }
        }
        return 0;
    }

}
