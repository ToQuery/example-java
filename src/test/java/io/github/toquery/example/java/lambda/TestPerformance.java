package io.github.toquery.example.java.lambda;

import io.github.toquery.example.java.BaseTest;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class TestPerformance extends BaseTest {

    public void testPeek01() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10000_0000; i++) {
            User user = new User();
            user.setId(i);
            user.setUserName("un" + i);
            user.setPassword("password" + i);
            userList.add(user);
        }
        // 通过Lambda取出User里面id的值
        long t1 = System.currentTimeMillis();
        List<Integer> idList_LB = userList.stream().map(User::getId).collect(Collectors.toList());
        //System.out.println(idList_LB);
        System.out.println(System.currentTimeMillis() - t1);
        // 普通方法
        long t2 = System.currentTimeMillis();
        List<Integer> idList_PT = new ArrayList<>();
        for (User user : userList) {
            idList_PT.add(user.getId());
        }
        System.out.println(System.currentTimeMillis() - t2);
        // System.out.println(idList_PT);
    }

    @Setter
    @Getter
    class User {
        Integer id;
        String userName;
        String password;

    }
}
