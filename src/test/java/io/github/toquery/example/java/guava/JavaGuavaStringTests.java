package io.github.toquery.example.java.guava;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.google.common.base.Strings;
import io.github.toquery.example.java.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

public class JavaGuavaStringTests extends BaseTest {

    @Test
    public void stringTests() {
        String str1 = null;
        String str2 = "";
        String str3 = "    ";

        LOG.info("Strings.emptyToNull [{}] = [{}]", str1, Strings.emptyToNull(str1));
        LOG.info("Strings.emptyToNull [{}] = [{}]", str2, Strings.emptyToNull(str2));
        LOG.info("Strings.emptyToNull [{}] = [{}]\n\n", str3, Strings.emptyToNull(str3));


        LOG.info("Strings.nullToEmpty [{}] = [{}]", str1, Strings.nullToEmpty(str1));
        LOG.info("Strings.nullToEmpty [{}] = [{}]", str2, Strings.nullToEmpty(str2));
        LOG.info("Strings.nullToEmpty [{}] = [{}]\n\n", str3, Strings.nullToEmpty(str3));


        // 判断字符串是否为空或null
        LOG.info("Strings.isNullOrEmpty [{}] = [{}]", str1, Strings.isNullOrEmpty(str1));
        LOG.info("Strings.isNullOrEmpty [{}] = [{}]", str2, Strings.isNullOrEmpty(str2));
        LOG.info("Strings.isNullOrEmpty [{}] = [{}]\n\n", str3, Strings.isNullOrEmpty(str3));


        // 在字符串末尾填充指定字符，直到字符串达到指定长度
        String str4 = "abc";
        String paddedStr1 = Strings.padEnd(str4, 6, '*');
        LOG.info("Strings.padEnd = {}", paddedStr1);

        // 在字符串开头填充指定字符，直到字符串达到指定长度
        String str5 = "abc";
        String paddedStr2 = Strings.padStart(str5, 6, '*');
        LOG.info("Strings.padStart = {}", paddedStr2);

        // 重复指定字符串指定次数
        String str6 = "abc";
        String repeatedStr = Strings.repeat(str6, 3);
        LOG.info("Strings.repeat = {}", repeatedStr);

        // 获取两个字符串的最长公共前缀
        String str7 = "abcdefg";
        String str8 = "abcdxyz";
        String commonPrefix = Strings.commonPrefix(str7, str8);
        LOG.info("Strings.commonPrefix = {}", commonPrefix);

        // 获取两个字符串的最长公共后缀
        String str9 = "abcdefg";
        String str10 = "xyzdefg";
        String commonSuffix = Strings.commonSuffix(str9, str10);
        LOG.info("Strings.commonSuffix = {}", commonSuffix);


        String lenientFormat = Strings.lenientFormat("%s-%s", "Strings","lenientFormat");
        LOG.info("Strings.lenientFormat = {}", lenientFormat);
    }


}
