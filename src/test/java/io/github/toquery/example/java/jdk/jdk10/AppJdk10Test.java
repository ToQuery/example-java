package io.github.toquery.example.java.jdk.jdk10;

import java.util.ArrayList;

/**
 *
 */
public class AppJdk10Test {

    public void var(){
        var str = "ABC"; //根据推断为 字符串类型
        var l = 10L;//根据10L 推断long 类型
        var flag = true;//根据 true推断 boolean 类型
        var flag1 = 1;//这里会推断boolean类型。0表示false 非0表示true
        var list = new ArrayList<String>();  // 推断 ArrayList<String>
        var stream = list.stream();          // 推断 Stream<String>

    }
}
