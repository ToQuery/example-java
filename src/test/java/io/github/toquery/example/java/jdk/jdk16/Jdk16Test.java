package io.github.toquery.example.java.jdk.jdk16;

import io.github.toquery.example.java.BaseTest; /**
 *
 */
public class Jdk16Test extends BaseTest{

    public void switchEnhance(){
        Object obj = "test";
        if (obj instanceof String string) {
            log.info("string = {}", string);
        }else if(obj instanceof Integer integer) {
            log.info("integer = {}", integer);
        }
    }
}
