package io.github.toquery.example.java.guava;

import com.google.common.collect.*;
import io.github.toquery.example.java.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * <table>
 * <caption>Range Types</caption>
 * <tr><th>Notation        <th>Definition               <th>Factory method
 * <tr><td>{@code (a..b)}  <td>{@code {x | a < x < b}}  <td>{@link Range#open open}
 * <tr><td>{@code [a..b]}  <td>{@code {x | a <= x <= b}}<td>{@link Range#closed closed}
 * <tr><td>{@code (a..b]}  <td>{@code {x | a < x <= b}} <td>{@link Range#openClosed openClosed}
 * <tr><td>{@code [a..b)}  <td>{@code {x | a <= x < b}} <td>{@link Range#closedOpen closedOpen}
 * <tr><td>{@code (a..+∞)} <td>{@code {x | x > a}}      <td>{@link Range#greaterThan greaterThan}
 * <tr><td>{@code [a..+∞)} <td>{@code {x | x >= a}}     <td>{@link Range#atLeast atLeast}
 * <tr><td>{@code (-∞..b)} <td>{@code {x | x < b}}      <td>{@link Range#lessThan lessThan}
 * <tr><td>{@code (-∞..b]} <td>{@code {x | x <= b}}     <td>{@link Range#atMost atMost}
 * <tr><td>{@code (-∞..+∞)}<td>{@code {x}}              <td>{@link Range#all all}
 * </table>
 */
public class JavaGuavaRangeTests extends BaseTest{

    @Test
    public void rangeMapTests(){
        // 注意与 RangeMap 的区别
        // 0<=x && x<=60 不及格, 60<x && x<=70 及格, 70<x && x<80 良好, 80<=x && x<100 优秀
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        rangeMap.put(Range.closedOpen(0, 60), "不及格");
        rangeMap.put(Range.openClosed(60, 70), "及格");
        rangeMap.put(Range.closed(70, 80), "良好");
        rangeMap.put(Range.closedOpen(80, 100), "优秀");

        log.info("rangeMap = {}", rangeMap);


        log.info("rangeMap.get 59 = {}", rangeMap.get(59));
        log.info("rangeMap.get 60 = {}", rangeMap.get(60));
        log.info("rangeMap.get 90 = {}", rangeMap.get(90));
        log.info("rangeMap.get 91 = {}", rangeMap.get(91));

        rangeMap.remove(Range.closed(70, 75));
        log.info("rangeMap = {}", rangeMap);
        log.info(rangeMap.get(75));
    }

    @Test
    public void rangeSetTests(){
        // 注意与 RangeMap 的区别
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.closed(1, 10));
        log.info("rangeSet = {}", rangeSet);
        rangeSet.add(Range.closedOpen(11, 15));
        log.info("rangeSet = {}", rangeSet);
        rangeSet.add(Range.open(15, 20));
        log.info("rangeSet = {}", rangeSet);
        rangeSet.add(Range.openClosed(0, 0));
        log.info("rangeSet = {}", rangeSet);
        rangeSet.remove(Range.open(5, 10));
        log.info("rangeSet = {}", rangeSet);



//        List scores;
//        Iterable belowMedian = Iterables.filter(scores,Range.lessThan(median));
//        Range<Integer> validGrades = Range.closed(1, 12);
//        for(int grade : ContiguousSet.create(validGrades, DiscreteDomain.integers())) {
//        }
    }


    @Test
    public void rangeSetOverlapTests(){
        // 第一个例子，没有重叠区间
        RangeSet<Integer> rangeSet1 = TreeRangeSet.create();
        rangeSet1.add(Range.closed(1, 10));
        rangeSet1.add(Range.closed(25, 45));
        System.out.println("第一个例子是否有重叠区间: " + hasOverlap(rangeSet1));

        // 第二个例子，包含重叠区间
        RangeSet<Integer> rangeSet2 = TreeRangeSet.create();
        rangeSet2.add(Range.closed(1, 10));
        rangeSet2.add(Range.closed(5, 45));
        System.out.println("第二个例子是否有重叠区间: " + hasOverlap(rangeSet2));

    }

    // 检查是否存在重叠区间的方法
    private static boolean hasOverlap(RangeSet<Integer> rangeSet) {
        for (Range<Integer> range : rangeSet.asRanges()) {
            // 检查 rangeSet 中是否有任何与当前 range 重叠的区间
            if (!rangeSet.subRangeSet(range).isEmpty()) {
                return true; // 存在重叠
            }
        }
        return false; // 不存在重叠
    }

    // 检查是否存在重叠区间的方法
//    private static boolean hasOverlap(RangeSet<Integer> rangeSet) {
//        for (Range<Integer> range : rangeSet.asRanges()) {
//            for (Range<Integer> otherRange : rangeSet.asRanges()) {
//                if (range != otherRange && range.isConnected(otherRange)) {
//                    return true; // 存在重叠
//                }
//            }
//        }
//        return false; // 不存在重叠
//    }
}
