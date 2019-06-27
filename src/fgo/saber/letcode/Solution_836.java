package fgo.saber.letcode;

/**
 * 矩形以列表 [x1, y1, x2, y2] 的形式表示，其中 (x1, y1) 为左下角的坐标，(x2, y2) 是右上角的坐标
 *
 * 如果相交的面积为正，则称两矩形重叠。需要明确的是，只在角或边接触的两个矩形不构成重叠
 *
 * 给出两个矩形，判断它们是否重叠并返回结果。
 *
 * 示例 1：
 *
 * 输入：rec1 = [0,0,2,2], rec2 = [1,1,3,3]
 * 输出：true
 * 示例 2：
 *
 * 输入：rec1 = [0,0,1,1], rec2 = [1,0,2,1]
 * 输出：false
 * 说明：
 *
 * 两个矩形 rec1 和 rec2 都以含有四个整数的列表的形式给出。
 * 矩形中的所有坐标都处于 -10^9 和 10^9 之间。
 */
public class Solution_836 {

    public static void main(String[] args) {
        int[] rec1 = stringToIntegerArray("[0,0,2,2]");
        int[] rec2 = stringToIntegerArray("[1,1,3,3]");

        boolean ret = new Solution_836().isRectangleOverlap(rec1, rec2);

        String out = booleanToString(ret);

        System.out.print(out);
    }

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int[] rec = new int[4];
        rec[0] = Math.max(rec1[0],rec2[0]);
        rec[1] = Math.max(rec1[1],rec2[1]);
        rec[2] = Math.min(rec1[2],rec2[2]);
        rec[3] = Math.min(rec1[3],rec2[3]);
        //判断rec是否是有效的矩形
        int a = rec[0];
        int b = rec[1];
        int c = rec[2];
        int d = rec[3];
        return a < c && b < d;
    }

    /*
    ===========分割线===============
     */

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
}
