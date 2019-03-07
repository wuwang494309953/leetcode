package fgo.saber.letcode;

/**
 * @author zq
 * @date 2019/3/7
 */

/**
 * 给定一个 Weather 表，编写一个 SQL 查询，来查找与之前（昨天的）日期相比温度更高的所有日期的 Id。
 *
 * +---------+------------------+------------------+
 * | Id(INT) | RecordDate(DATE) | Temperature(INT) |
 * +---------+------------------+------------------+
 * |       1 |       2015-01-01 |               10 |
 * |       2 |       2015-01-02 |               25 |
 * |       3 |       2015-01-03 |               20 |
 * |       4 |       2015-01-04 |               30 |
 * +---------+------------------+------------------+
 * 例如，根据上述给定的 Weather 表格，返回如下 Id:
 *
 * +----+
 * | Id |
 * +----+
 * |  2 |
 * |  4 |
 * +----+
 */
public class Solution_197 {

    public static void main(String[] args) {
        String sql = "select w1.id " +
                "from Weather w1 " +
                "inner join Weather w2 on w1.RecordDate = date_sub(w2.RecordDate,interval -1 day) " +
                "where w1.Temperature > w2.Temperature";
    }

}
