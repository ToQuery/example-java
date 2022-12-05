package io.github.toquery.example.java.jdk7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class AppJdk7Test {

    private static final Long AAA = 10_000_000L;
    private static final Integer BBB = 10_000;

    public void tryWithResources() throws Exception {
        try (InputStream inputStream = new FileInputStream("")) {

            inputStream.read();
            //
            // xxx
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void catchMultipleCatch() throws Exception {
        try {
            new FileInputStream("");
            Thread.sleep(1);
        } catch (FileNotFoundException | InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public void typeInfer() {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<>();
    }

    public void switchString(){
        String abc = "ABC";
        switch (abc){
            case "A":{
                System.out.println("A");
                break;
            }
            case "ABC":{
                System.out.println("ABC");
                break;
            }
            default:{
                break;
            }
        }
    }
}
