package io.github.toquery.example.java.guava;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import io.github.toquery.example.java.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JavaGuavaPreconditionsTests extends BaseTest {

    @Test
    public void preconditionsTests() {

        // 检查参数是否符合预期，并抛出IllegalArgumentException异常，可以包含错误信息模板和占位符
        String str1 = "abc";
        Preconditions.checkArgument(str1.length() < 3, "字符串长度必须小于3");

        // 检查参数是否为null，并抛出NullPointerException异常，可以包含错误信息模板和占位符
        String str2 = null;
        Preconditions.checkNotNull(str2, "字符串不能为空");

        // 检查对象状态是否符合预期，并抛出IllegalStateException异常，可以包含错误信息模板和占位符
        boolean flag1 = false;
        Preconditions.checkState(flag1, "状态不正确");

        // 检查下标是否在集合的范围内，并抛出IndexOutOfBoundsException异常，可以包含错误信息模板和占位符
        List<Integer> list1 = Lists.newArrayList(1, 2, 3, 4, 5);
        Preconditions.checkElementIndex(6, list1.size(), "下标越界");

        // 检查下标是否在集合的范围内，可以等于集合的大小，并抛出IndexOutOfBoundsException异常，可以包含错误信息模板和占位符
        List<Integer> list2 = Lists.newArrayList(1, 2, 3, 4, 5);
        Preconditions.checkPositionIndex(5, list2.size(), "下标越界");

        // 检查开始下标和结束下标是否在集合的范围内，并抛出IndexOutOfBoundsException异常
        List<Integer> list3 = Lists.newArrayList(1, 2, 3, 4, 5);
        Preconditions.checkPositionIndexes(2, 6, list3.size());

        // 可以在错误信息中使用占位符
        int value1 = 101;
        Preconditions.checkArgument(value1 <= 100, "值必须小于等于 %s", 100);

        // 可以使用Supplier来避免计算开销
//        int value2 = 101;
//        Preconditions.checkArgument(value2 <= 100, () -> "值必须小于等于 " + 100);
    }


}
