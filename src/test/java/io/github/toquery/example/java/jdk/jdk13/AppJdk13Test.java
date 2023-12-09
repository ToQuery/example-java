package io.github.toquery.example.java.jdk.jdk13;

/**
 *
 */
public class AppJdk13Test {
    public static final String text = """
            {
                'name': 'zhangsan',
                'age': 23
             }
            """;
    public void switchEnhance(){

        int number = 1;
        String str = switch (number) {
            case 1, 2:
                yield "one or two";
            case 3:
                yield "three";
            case 4, 5, 6:
                yield "four or five or six";
            default:
                yield "unknown";
        };
    }
}
